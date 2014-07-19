package battleship.Frames;
import battleship.menu.views.HelpMenuView;

/* @author Kam Kam
 */
public class HelpFrame extends javax.swing.JFrame {
    HelpMenuView helpCommands = new HelpMenuView();
    
    public HelpFrame() {
        initComponents();
    }
    
    public HelpMenuView getHelpCommands() {
        return helpCommands;
    }

    // The displayHelpText() won't work just yet
     private void displayHelpText(String helptype) {
        /*try {
            String helpText = this.helpCommands.getInput(command);
            this.jtHelpMenu.setText(helpText);
        } catch (BattleshipException ex) {
            this.jtHelpMenu.setText(ex.getMessage());
        }*/
        
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        Main = new javax.swing.JButton();
        locationsbutton = new javax.swing.JButton();
        instructionbutton = new javax.swing.JButton();
        compplayerbutton = new javax.swing.JButton();
        objectivesbutton = new javax.swing.JButton();
        markerbutton = new javax.swing.JButton();
        playersbutton = new javax.swing.JButton();
        quithelpbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHelpMenu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battleship");

        jpBody.setBackground(new java.awt.Color(0, 51, 204));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpTitle.setBackground(new java.awt.Color(0, 51, 204));

        jlTitle.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Help Menu");

        Main.setText("Main Menu");
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });

        locationsbutton.setText("Locations");
        locationsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationsbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(jpTitleLayout.createSequentialGroup()
                        .addComponent(Main)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(locationsbutton)))
                .addContainerGap())
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Main)
                    .addComponent(locationsbutton)))
        );

        instructionbutton.setText("Instructions");
        instructionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionbuttonActionPerformed(evt);
            }
        });

        compplayerbutton.setText("Computer");
        compplayerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compplayerbuttonActionPerformed(evt);
            }
        });

        objectivesbutton.setText("Objectives");
        objectivesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objectivesbuttonActionPerformed(evt);
            }
        });

        markerbutton.setText("Marker");
        markerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markerbuttonActionPerformed(evt);
            }
        });

        playersbutton.setText("Players");
        playersbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playersbuttonActionPerformed(evt);
            }
        });

        quithelpbutton.setText("Quit Help");
        quithelpbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quithelpbuttonActionPerformed(evt);
            }
        });

        jtHelpMenu.setEditable(false);
        jtHelpMenu.setColumns(20);
        jtHelpMenu.setLineWrap(true);
        jtHelpMenu.setRows(5);
        jtHelpMenu.setText("Select an option from the menu...");
        jtHelpMenu.setWrapStyleWord(true);
        jtHelpMenu.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtHelpMenu);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionbutton)
                    .addComponent(objectivesbutton)
                    .addComponent(compplayerbutton))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markerbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quithelpbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playersbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructionbutton)
                            .addComponent(markerbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compplayerbutton)
                            .addComponent(playersbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(objectivesbutton)
                            .addComponent(quithelpbutton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_MainActionPerformed

    private void instructionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionbuttonActionPerformed
        displayHelpText(HelpMenuView.INSTRUCTIONS);
    }//GEN-LAST:event_instructionbuttonActionPerformed

    private void compplayerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compplayerbuttonActionPerformed
        displayHelpText(HelpMenuView.COMPUTER_PLAYER);
    }//GEN-LAST:event_compplayerbuttonActionPerformed

    private void objectivesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objectivesbuttonActionPerformed
        displayHelpText(HelpMenuView.GAME_OBJECTIVES);
    }//GEN-LAST:event_objectivesbuttonActionPerformed

    private void locationsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationsbuttonActionPerformed
        displayHelpText(HelpMenuView.LOCATION);
    }//GEN-LAST:event_locationsbuttonActionPerformed

    private void markerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markerbuttonActionPerformed
        displayHelpText(HelpMenuView.MARKER);
    }//GEN-LAST:event_markerbuttonActionPerformed

    private void playersbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playersbuttonActionPerformed
        displayHelpText(HelpMenuView.PEOPLE_PLAYER);
    }//GEN-LAST:event_playersbuttonActionPerformed

    private void quithelpbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quithelpbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_quithelpbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Main;
    private javax.swing.JButton compplayerbutton;
    private javax.swing.JButton instructionbutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtHelpMenu;
    private javax.swing.JButton locationsbutton;
    private javax.swing.JButton markerbutton;
    private javax.swing.JButton objectivesbutton;
    private javax.swing.JButton playersbutton;
    private javax.swing.JButton quithelpbutton;
    // End of variables declaration//GEN-END:variables
}
