package trabalhadoresempresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AVLTree2 {
    private Node root;

    public String displayTree() {
        StringBuilder sb = new StringBuilder();
        displayTreeHelper(root, sb);
        return sb.toString();
    }

    private void displayTreeHelper(Node node, StringBuilder sb) {
        if (node != null) {
            displayTreeHelper(node.left, sb);
            sb.append(node.trabalhador.toString()).append("\n"); // Supondo que 'trabalhador' seja o objeto armazenado
            displayTreeHelper(node.right, sb);
        }
    }


    // Classe interna para o nó da árvore
    private class Node {
        Trabalhador trabalhador;
        Node left, right;
        int height;

        Node(Trabalhador trabalhador) {
            this.trabalhador = trabalhador;
            this.height = 1;
        }
    }

    // Método de inserção padrão na AVL
    public void insert(Trabalhador trabalhador) {
        root = insert(root, trabalhador);
    }

    // Inserção com balanceamento da AVL
    private Node insert(Node node, Trabalhador trabalhador) {
        if (node == null) return new Node(trabalhador);

        int compare = trabalhador.getNome().compareTo(node.trabalhador.getNome());
        if (compare < 0) {
            node.left = insert(node.left, trabalhador);
        } else if (compare > 0) {
            node.right = insert(node.right, trabalhador);
        } else {
            return node; // Valor duplicado, ignore
        }

        // Atualiza altura e balanceia
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return balance(node);
    }

    // Método para obter a altura de um nó
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Método para balancear a árvore
    private Node balance(Node node) {
        int balanceFactor = getBalanceFactor(node);

        // Se o nó estiver desbalanceado, existem quatro casos

        // Caso 1: Rotação à direita
        if (balanceFactor > 1) {
            if (getBalanceFactor(node.left) < 0) {
                node.left = rotateLeft(node.left); // Rotação esquerda no filho esquerdo
            }
            return rotateRight(node); // Rotação à direita no nó
        }

        // Caso 2: Rotação à esquerda
        if (balanceFactor < -1) {
            if (getBalanceFactor(node.right) > 0) {
                node.right = rotateRight(node.right); // Rotação direita no filho direito
            }
            return rotateLeft(node); // Rotação à esquerda no nó
        }

        // Retorna o nó (já balanceado)
        return node;
    }

    // Método para obter o fator de balanceamento de um nó
    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Rotação à direita
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Realiza a rotação
        x.right = y;
        y.left = T2;

        // Atualiza as alturas
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Retorna o novo nó raiz
        return x;
    }

    // Rotação à esquerda
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Realiza a rotação
        y.left = x;
        x.right = T2;

        // Atualiza as alturas
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Retorna o novo nó raiz
        return y;
    }

    // Métodos para obter trabalhadores em ordem crescente e decrescente
    public List<Trabalhador> getTrabalhadoresEmOrdemCrescente() {
        List<Trabalhador> trabalhadores = new ArrayList<>();
        inOrder(root, trabalhadores);
        return trabalhadores;
    }

    public List<Trabalhador> getTrabalhadoresEmOrdemDecrescente() {
        List<Trabalhador> trabalhadores = new ArrayList<>();
        inOrder(root, trabalhadores);
        Collections.reverse(trabalhadores); // Inverte para a ordem decrescente
        return trabalhadores;
    }

    // Traversal em ordem (crescente)
    private void inOrder(Node node, List<Trabalhador> trabalhadores) {
        if (node != null) {
            inOrder(node.left, trabalhadores);
            trabalhadores.add(node.trabalhador);
            inOrder(node.right, trabalhadores);
        }
    }
}
