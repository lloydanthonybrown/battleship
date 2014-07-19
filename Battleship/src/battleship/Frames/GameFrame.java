/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship.Frames;

import java.awt.Color;
import javax.swing.JTable;

/**
 *
 * @author Kam Kam
 */
public class GameFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBoardBody = new javax.swing.JPanel();
        jpBoardTitle = new javax.swing.JPanel();
        jlBoardTitle = new javax.swing.JLabel();
        jlBoard2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBoard1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBoard2 = new javax.swing.JTable();
        ljBoard1 = new javax.swing.JLabel();
        jbBoardHelp = new javax.swing.JButton();
        jbBoardMainMenu = new javax.swing.JButton();
        jbBoardQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battleship");

        jpBoardBody.setBackground(new java.awt.Color(0, 51, 204));

        jpBoardTitle.setBackground(new java.awt.Color(0, 51, 204));

        jlBoardTitle.setBackground(new java.awt.Color(0, 51, 204));
        jlBoardTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlBoardTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlBoardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBoardTitle.setText("Battleship");

        jlBoard2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlBoard2.setForeground(new java.awt.Color(255, 255, 255));
        jlBoard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBoard2.setText("Opponent guesses show here");

        javax.swing.GroupLayout jpBoardTitleLayout = new javax.swing.GroupLayout(jpBoardTitle);
        jpBoardTitle.setLayout(jpBoardTitleLayout);
        jpBoardTitleLayout.setHorizontalGroup(
            jpBoardTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBoardTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlBoard2))
            .addGroup(jpBoardTitleLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jlBoardTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBoardTitleLayout.setVerticalGroup(
            jpBoardTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBoardTitleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlBoardTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jlBoard2))
        );

        jtBoard1.setBackground(new java.awt.Color(0, 153, 255));
        jtBoard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtBoard1.setForeground(new java.awt.Color(255, 255, 255));
        jtBoard1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null, null, null, null, null, null},
                {"2", null, null, null, null, null, null, null, null, null, null},
                {"3", null, null, null, null, null, null, null, null, null, null},
                {"4", null, null, null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null, null, null},
                {"7", null, null, null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBoard1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jtBoard1.setRowHeight(30);
        jtBoard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBoard1);

        jtBoard2.setBackground(new java.awt.Color(0, 153, 255));
        jtBoard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtBoard2.setForeground(new java.awt.Color(255, 255, 255));
        jtBoard2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null, null, null, null, null, null},
                {"2", null, null, null, null, null, null, null, null, null, null},
                {"3", null, null, null, null, null, null, null, null, null, null},
                {"4", null, null, null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null, null, null},
                {"7", null, null, null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBoard2.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jtBoard2.setRowHeight(30);
        jScrollPane2.setViewportView(jtBoard2);

        ljBoard1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ljBoard1.setForeground(new java.awt.Color(255, 255, 255));
        ljBoard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ljBoard1.setText("Place your boats here");

        jbBoardHelp.setText("Help Menu");
        jbBoardHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoardHelpActionPerformed(evt);
            }
        });

        jbBoardMainMenu.setText("Main Menu");
        jbBoardMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoardMainMenuActionPerformed(evt);
            }
        });

        jbBoardQuit.setText("Quit");
        jbBoardQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoardQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBoardBodyLayout = new javax.swing.GroupLayout(jpBoardBody);
        jpBoardBody.setLayout(jpBoardBodyLayout);
        jpBoardBodyLayout.setHorizontalGroup(
            jpBoardBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBoardBodyLayout.createSequentialGroup()
                .addComponent(ljBoard1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBoardTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBoardBodyLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpBoardBodyLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbBoardHelp)
                .addGap(172, 172, 172)
                .addComponent(jbBoardMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBoardQuit)
                .addGap(112, 112, 112))
        );
        jpBoardBodyLayout.setVerticalGroup(
            jpBoardBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBoardBodyLayout.createSequentialGroup()
                .addGroup(jpBoardBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpBoardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ljBoard1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBoardBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jpBoardBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBoardHelp)
                    .addComponent(jbBoardMainMenu)
                    .addComponent(jbBoardQuit))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBoardBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBoardBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBoardHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoardHelpActionPerformed
        HelpFrame helpFrame = new HelpFrame();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_jbBoardHelpActionPerformed

    private void jbBoardMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoardMainMenuActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jbBoardMainMenuActionPerformed

    private void jbBoardQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoardQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbBoardQuitActionPerformed

    private void cellClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellClicked
        JTable jTable = (JTable) evt.getComponent();
        this.jtBoard1.setBackground(Color.red);
    }//GEN-LAST:event_cellClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBoardHelp;
    private javax.swing.JButton jbBoardMainMenu;
    private javax.swing.JButton jbBoardQuit;
    private javax.swing.JLabel jlBoard2;
    private javax.swing.JLabel jlBoardTitle;
    private javax.swing.JPanel jpBoardBody;
    private javax.swing.JPanel jpBoardTitle;
    private javax.swing.JTable jtBoard1;
    private javax.swing.JTable jtBoard2;
    private javax.swing.JLabel ljBoard1;
    // End of variables declaration//GEN-END:variables
}
