package trabalhadoresempresa;

class AVLNode {
    Trabalhador data;
    AVLNode left, right;
    int height;

    public AVLNode(Trabalhador d) {
        data = d;
        height = 1;
    }
}

class AVLTree {
    private AVLNode root;

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

    private int height(AVLNode N) {
        return (N == null) ? 0 : N.height;
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    private int getBalance(AVLNode N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    public void insert(Trabalhador t) {
        root = insert(root, t);
    }

    private AVLNode insert(AVLNode node, Trabalhador key) {
        if (node == null) return new AVLNode(key);
        if (key.getNome().compareTo(node.data.getNome()) < 0)
            node.left = insert(node.left, key);
        else if (key.getNome().compareTo(node.data.getNome()) > 0)
            node.right = insert(node.right, key);
        else return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);
        if (balance > 1 && key.getNome().compareTo(node.left.data.getNome()) < 0)
            return rightRotate(node);
        if (balance < -1 && key.getNome().compareTo(node.right.data.getNome()) > 0)
            return leftRotate(node);
        if (balance > 1 && key.getNome().compareTo(node.left.data.getNome()) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key.getNome().compareTo(node.right.data.getNome()) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Método para exibir os elementos (opcional, para fins de teste)
    public void inOrderTraversal(AVLNode node, StringBuilder builder) {
        if (node != null) {
            inOrderTraversal(node.left, builder);
            builder.append(node.data.toString()).append("\n");
            inOrderTraversal(node.right, builder);
        }
    }

    public String displayTree() {
        StringBuilder builder = new StringBuilder();
        inOrderTraversal(root, builder);
        return builder.toString();
    }
}
