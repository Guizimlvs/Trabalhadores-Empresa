package trabalhadoresempresa;

import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.*;
import java.awt.*;

public class Principal extends javax.swing.JFrame {
    //rivate ArrayList trab = new ArrayList();
    private Object avlTree;
    private AVLTree2 avlTree2;
    private ArrayList<Trabalhador> trab;

    public Principal() {
        initComponents();
        trab = new ArrayList<>();  // Inicializando o ArrayList
        avlTree2 = new AVLTree2();  // Inicializando AVLTree2

        getContentPane().setBackground(Color.BLACK);  // Fundo preto para a janela principal
        estilizarComponentes();  // Método para aplicar estilo aos componentes

        jButton1.setFont(new Font("Arial", Font.BOLD, 12));
        jButton1.setBackground(new Color(51, 153, 255));
        jButton1.setForeground(Color.WHITE);

        jTextArea1.setBackground(new Color(240, 240, 240));
        jTextArea1.setForeground(Color.DARK_GRAY);
        jTextArea1.setFont(new Font("SansSerif", Font.PLAIN, 12)); jButton1.setFont(new Font("Arial", Font.BOLD, 12));

        jButton4.setBackground(new Color(51, 153, 255));
        jButton4.setForeground(Color.WHITE);

        jButton6.setBackground(new Color(51, 153, 255));
        jButton6.setForeground(Color.WHITE);

        jButton5.setBackground(new Color(51, 153, 255));
        jButton5.setForeground(Color.WHITE);

        jButton7.setBackground(new Color(51, 153, 255));
        jButton7.setForeground(Color.WHITE);

        jButton8.setBackground(new Color(51, 153, 255));
        jButton8.setForeground(Color.WHITE);

    }

    private void estilizarComponentes() {
        jTextArea1.setBackground(Color.BLACK);
        jTextArea1.setForeground(Color.WHITE);  // Texto branco para contraste

        jTextArea2.setBackground(Color.BLACK);
        jTextArea2.setForeground(Color.WHITE);

        jToolBar1.setBackground(Color.DARK_GRAY);  // Barra de ferramentas com cor mais escura

        jButton1.setBackground(Color.DARK_GRAY);
        jButton1.setForeground(Color.WHITE);

        jButton2.setBackground(Color.DARK_GRAY);
        jButton2.setForeground(Color.WHITE);

        jButton3.setBackground(Color.DARK_GRAY);
        jButton3.setForeground(Color.WHITE);

        jButton4.setBackground(Color.DARK_GRAY);
        jButton4.setForeground(Color.WHITE);

        jButton5.setBackground(Color.DARK_GRAY);
        jButton5.setForeground(Color.WHITE);

        jButton6.setBackground(Color.DARK_GRAY);
        jButton6.setForeground(Color.WHITE);

        jButton7.setBackground(Color.DARK_GRAY);
        jButton7.setForeground(Color.WHITE);

        jButton8.setBackground(Color.DARK_GRAY);
        jButton8.setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto - ED-II");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("<html>Mostrar os trabalhadores</html>");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setText("Ao clicar no botão ao lado serão carregados no ArrayList 'trab' os dados de vários objetos da classe Trabalhador, que se encontram no arquivo trabs.dat (deve estar em C:\\temp) e mostrados na área de texto.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setEnabled(false);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhadoresempresa/about.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhadoresempresa/exit.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);


        jButton4.setText("Processar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                System.out.println("Número de trabalhadores no heap após processamento: " + minHeap.size());
            }
        });

        jButton5.setText("Crescente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Decrescente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Autores");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });


        jButton8.setText("Capacitação");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton6)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8)))
                                .addContainerGap(174, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(898, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregar("C:\\Windows\\Temp\\trabs.dat", trab);
        mostraTrabalhadoresCadastrados();
    }//GEN-LAST:event_jButton1ActionPerformed
    //PriorityQueue<Trabalhador> minHeap = new PriorityQueue<>((t1, t2) -> Integer.compare(t1.getIdade(), t2.getIdade()));


    public boolean carregar (String filename, ArrayList arr) {
        //Este método carrega no vetor 'arr' ('trab') os objetos serializados,
        //que estão gravados em filename (C:/temp/trabs.dat). Copie
        //este arquivo na pasta C:/temp/ de seu computador.
        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            arr.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {
                    Object info = in.readObject(); // lê um objeto do arquivo
                    arr.add(info); // adiciona na lista o objeto lido; supondo memória suficiente
                }
                catch (EOFException normalEof) {
                    sair=true;  // EOF (end of file), é uma situação normal => acabaram os objetos
                }
            } while (!sair);
            in.close();  fis.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
            return false;
        }
        return true;
    }

    public void mostraTrabalhadoresCadastrados () {
        //Mostra na tela os trabalhadores cadastrados no ArrayList 'trab'.
        String cad = "";
        for (int i=0; i<trab.size(); i++) {
            cad +=  trab.get(i).toString()+ "\n";
        }
        jTextArea2.setText(cad);
        jTextArea2.setCaretPosition(0);
    }

    // autores

    public class AutoresDialog extends JDialog {
        public AutoresDialog(JFrame parent) {
            super(parent, "Autores", true);

            // Painel principal que contém todos os painéis de autores
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Alinhamento vertical para melhor espaçamento

            // Dados dos autores
            String[][] autores = {
                    {"35655453", "Guilherme Silva Dos Reis", "/imagens/gui.jpg"},
                    {"34250522", "João Vitor Cardoso Miranda", "/imagens/jaum.jpg"},
                    {"35088052", "Igor Rocha Gomes de Brito", "/imagens/igor.jpg"},
                    {"35942002", "Paulo Henrique Monteiro de Araujo", "/imagens/paulinho.jpg"}
            };

            for (String[] autor : autores) {
                JPanel panel = new JPanel(new BorderLayout(10, 10)); // Espaçamento interno entre componentes
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margem ao redor do painel
                panel.setBackground(Color.LIGHT_GRAY); // Cor de fundo do painel

                // Adiciona a imagem com verificação
                JLabel labelImagem;
                java.net.URL imgUrl = getClass().getResource(autor[2]);
                if (imgUrl != null) {
                    labelImagem = new JLabel(new ImageIcon(imgUrl));
                } else {
                    labelImagem = new JLabel("Imagem não encontrada");
                }
                panel.add(labelImagem, BorderLayout.WEST);

                // Adiciona os dados do autor
                JPanel infoPanel = new JPanel(new GridLayout(2, 1));
                infoPanel.setBackground(Color.LIGHT_GRAY); // Cor de fundo do painel de informações

                JLabel rgmLabel = new JLabel("RGM: " + autor[0]);
                rgmLabel.setForeground(Color.BLACK); // Cor do texto do RGM
                JLabel nomeLabel = new JLabel("Nome: " + autor[1]);
                nomeLabel.setForeground(Color.BLACK); // Cor do texto do nome

                infoPanel.add(rgmLabel);
                infoPanel.add(nomeLabel);
                panel.add(infoPanel, BorderLayout.CENTER);

                mainPanel.add(panel);
            }

            // Envolve o painel principal em um JScrollPane para adicionar rolagem
            JScrollPane scrollPane = new JScrollPane(mainPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            add(scrollPane); // Adiciona o JScrollPane ao JDialog

            setSize(800, 600);
            setLocationRelativeTo(parent);
        }

    }



    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }



    private PriorityQueue<Trabalhador> minHeap = new PriorityQueue<>((t1, t2) -> Integer.compare(t1.getIdade(), t2.getIdade()));
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        AVLTree avlTree = new AVLTree();  // Criação da árvore AVL


        for (Object obj : trab) {
            if (obj instanceof Trabalhador) {
                Trabalhador trabalhador = (Trabalhador) obj;
                minHeap.add(trabalhador);  // Insere todos os trabalhadores na fila de prioridade

                if (trabalhador.getSexo() == 'F') {
                    avlTree.insert(trabalhador);  // Insere na árvore AVL se for trabalhadora
                    avlTree2.insert(trabalhador);
                }
            }
        }




        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


        // Exibir a árvore AVL (opcional, caso queira mostrar os resultados na interface)
        String trabalhadorasAVL = avlTree.displayTree();
        jTextArea2.setText("Trabalhadoras (AVL):\n" + trabalhadorasAVL);
        String trabalhadorasAVL2 = avlTree2.displayTree();
        jTextArea2.setText("Trabalhadoras (AVL):\n" + trabalhadorasAVL2);

        // Exibir a fila de prioridade (opcional, caso queira mostrar os resultados na interface)
        StringBuilder sb = new StringBuilder();
        for (Trabalhador trabalhador : minHeap) {  // Alteração: usar `minHeap` sem esvaziá-lo
            sb.append(trabalhador.toString()).append("\n");
        }
        jTextArea2.append("\nTrabalhadores (Min-Heap):\n" + sb.toString());
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        AutoresDialog dialog = new AutoresDialog(this);
        dialog.setVisible(true);
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        avlTree2 = new AVLTree2(); // Reinicialize a árvore, se necessário
        for (Object obj : trab) {
            if (obj instanceof Trabalhador) {
                Trabalhador trabalhador = (Trabalhador) obj;
                if (trabalhador.getSexo() == 'F') {
                    avlTree2.insert(trabalhador);  // Inserção apenas das trabalhadoras
                }
            }
        }

        List<Trabalhador> trabalhadoresCrescente = avlTree2.getTrabalhadoresEmOrdemCrescente();
        StringBuilder sb = new StringBuilder("Trabalhadoras em Ordem Crescente:\n");
        for (Trabalhador trabalhador : trabalhadoresCrescente) {
            sb.append(trabalhador.toString()).append("\n");
        }
        jTextArea2.setText(sb.toString()); // Exibe a lista na área de texto
    }

    // Ordem Descrescente

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // Preencher a árvore AVL com trabalhadores
        for (Object obj : trab) {
            if (obj instanceof Trabalhador) {
                Trabalhador trabalhador = (Trabalhador) obj;
                if (trabalhador.getSexo() == 'F') {
                    avlTree2.insert(trabalhador);  // Inserção apenas das trabalhadoras
                }
            }
        }

        List<Trabalhador> trabalhadoresDecrescente = avlTree2.getTrabalhadoresEmOrdemDecrescente();
        StringBuilder sb = new StringBuilder("Trabalhadoras em Ordem Decrescente:\n");
        for (Trabalhador trabalhador : trabalhadoresDecrescente) {
            sb.append(trabalhador.toString()).append("\n");
        }
        jTextArea2.setText(sb.toString()); // Exibe a lista na área de texto


    }

    // Capacitação

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (minHeap.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há trabalhadores no heap para capacitação.");
            return;
        }

        // Remove o trabalhador com a menor idade
        Trabalhador trabalhadorCapacitado = minHeap.poll();

        // Exibe as informações do trabalhador na área de texto
        String mensagem = "Trabalhador proposto para capacitação:\n" + trabalhadorCapacitado.toString();
        jTextArea2.setText(mensagem);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Exibe uma caixa de diálogo para confirmar a saída
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja sair?",
                "Confirmação de Saída",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0); // Encerra a aplicação
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
