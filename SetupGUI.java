import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetupGUI extends javax.swing.JFrame {
    
    //variables
    public static String shipName = "";
    public static boolean rotate = false;
    public static boolean done = false;
    public static boolean doneButton = false;
    public static ShipSorter shipSorter = new ShipSorter();
    
    public void color(JButton button){
      button.setBackground(Color.BLACK);}
      
    public void antiColor(JButton button){
      button.setBackground(Color.BLUE);}

    public static void text(String text){
      jTextArea1.append(text+"\n");}
    
    public SetupGUI(){  
        PlayerPanel = new javax.swing.JPanel();
        jButtonA1 = new javax.swing.JButton();
        jButtonA2 = new javax.swing.JButton();
        jButtonA3 = new javax.swing.JButton();
        jButtonA4 = new javax.swing.JButton();
        jButtonA5 = new javax.swing.JButton();
        jButtonA6 = new javax.swing.JButton();
        jButtonA7 = new javax.swing.JButton();
        jButtonA8 = new javax.swing.JButton();
        jButtonB8 = new javax.swing.JButton();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jButtonB5 = new javax.swing.JButton();
        jButtonB6 = new javax.swing.JButton();
        jButtonB7 = new javax.swing.JButton();
        jButtonC8 = new javax.swing.JButton();
        jButtonC1 = new javax.swing.JButton();
        jButtonC2 = new javax.swing.JButton();
        jButtonC3 = new javax.swing.JButton();
        jButtonC4 = new javax.swing.JButton();
        jButtonC5 = new javax.swing.JButton();
        jButtonC6 = new javax.swing.JButton();
        jButtonC7 = new javax.swing.JButton();
        jButtonD8 = new javax.swing.JButton();
        jButtonD1 = new javax.swing.JButton();
        jButtonD2 = new javax.swing.JButton();
        jButtonD3 = new javax.swing.JButton();
        jButtonD4 = new javax.swing.JButton();
        jButtonD5 = new javax.swing.JButton();
        jButtonD6 = new javax.swing.JButton();
        jButtonD7 = new javax.swing.JButton();
        jButtonE8 = new javax.swing.JButton();
        jButtonE1 = new javax.swing.JButton();
        jButtonE2 = new javax.swing.JButton();
        jButtonE3 = new javax.swing.JButton();
        jButtonE4 = new javax.swing.JButton();
        jButtonE5 = new javax.swing.JButton();
        jButtonE6 = new javax.swing.JButton();
        jButtonE7 = new javax.swing.JButton();
        jButtonF8 = new javax.swing.JButton();
        jButtonF1 = new javax.swing.JButton();
        jButtonF2 = new javax.swing.JButton();
        jButtonF3 = new javax.swing.JButton();
        jButtonF4 = new javax.swing.JButton();
        jButtonF5 = new javax.swing.JButton();
        jButtonF6 = new javax.swing.JButton();
        jButtonF7 = new javax.swing.JButton();
        jButtonG8 = new javax.swing.JButton();
        jButtonG1 = new javax.swing.JButton();
        jButtonG2 = new javax.swing.JButton();
        jButtonG3 = new javax.swing.JButton();
        jButtonG4 = new javax.swing.JButton();
        jButtonG5 = new javax.swing.JButton();
        jButtonG6 = new javax.swing.JButton();
        jButtonG7 = new javax.swing.JButton();
        jButtonH8 = new javax.swing.JButton();
        jButtonH1 = new javax.swing.JButton();
        jButtonH2 = new javax.swing.JButton();
        jButtonH3 = new javax.swing.JButton();
        jButtonH4 = new javax.swing.JButton();
        jButtonH5 = new javax.swing.JButton();
        jButtonH6 = new javax.swing.JButton();
        jButtonH7 = new javax.swing.JButton();
        PlacingPanel = new javax.swing.JPanel();
        SubmarineButton = new javax.swing.JButton();
        DestroyerButton = new javax.swing.JButton();
        AircraftButton = new javax.swing.JButton();
        RotateShipButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // -------------------------------------------------------
        
        jButtonA1.setBackground(Color.BLUE);
        jButtonA2.setBackground(Color.BLUE);
        jButtonA3.setBackground(Color.BLUE);
        jButtonA4.setBackground(Color.BLUE);
        jButtonA5.setBackground(Color.BLUE);
        jButtonA6.setBackground(Color.BLUE);
        jButtonA7.setBackground(Color.BLUE);
        jButtonA8.setBackground(Color.BLUE);
        jButtonB8.setBackground(Color.BLUE);
        jButtonB1.setBackground(Color.BLUE);
        jButtonB2.setBackground(Color.BLUE);
        jButtonB3.setBackground(Color.BLUE);
        jButtonB4.setBackground(Color.BLUE);
        jButtonB5.setBackground(Color.BLUE);
        jButtonB6.setBackground(Color.BLUE);
        jButtonB7.setBackground(Color.BLUE);
        jButtonC8.setBackground(Color.BLUE);
        jButtonC1.setBackground(Color.BLUE);
        jButtonC2.setBackground(Color.BLUE);
        jButtonC3.setBackground(Color.BLUE);
        jButtonC4.setBackground(Color.BLUE);
        jButtonC5.setBackground(Color.BLUE);
        jButtonC6.setBackground(Color.BLUE);
        jButtonC7.setBackground(Color.BLUE);
        jButtonD8.setBackground(Color.BLUE);
        jButtonD1.setBackground(Color.BLUE);
        jButtonD2.setBackground(Color.BLUE);
        jButtonD3.setBackground(Color.BLUE);
        jButtonD4.setBackground(Color.BLUE);
        jButtonD5.setBackground(Color.BLUE);
        jButtonD6.setBackground(Color.BLUE);
        jButtonD7.setBackground(Color.BLUE);
        jButtonE8.setBackground(Color.BLUE);
        jButtonE1.setBackground(Color.BLUE);
        jButtonE2.setBackground(Color.BLUE);
        jButtonE3.setBackground(Color.BLUE);
        jButtonE4.setBackground(Color.BLUE);
        jButtonE5.setBackground(Color.BLUE);
        jButtonE6.setBackground(Color.BLUE);
        jButtonE7.setBackground(Color.BLUE);
        jButtonF8.setBackground(Color.BLUE);
        jButtonF1.setBackground(Color.BLUE);
        jButtonF2.setBackground(Color.BLUE);
        jButtonF3.setBackground(Color.BLUE);
        jButtonF4.setBackground(Color.BLUE);
        jButtonF5.setBackground(Color.BLUE);
        jButtonF6.setBackground(Color.BLUE);
        jButtonF7.setBackground(Color.BLUE);
        jButtonG8.setBackground(Color.BLUE);
        jButtonG1.setBackground(Color.BLUE);
        jButtonG2.setBackground(Color.BLUE);
        jButtonG3.setBackground(Color.BLUE);
        jButtonG4.setBackground(Color.BLUE);
        jButtonG5.setBackground(Color.BLUE);
        jButtonG6.setBackground(Color.BLUE);
        jButtonG7.setBackground(Color.BLUE);
        jButtonH8.setBackground(Color.BLUE);
        jButtonH1.setBackground(Color.BLUE);
        jButtonH2.setBackground(Color.BLUE);
        jButtonH3.setBackground(Color.BLUE);
        jButtonH4.setBackground(Color.BLUE);
        jButtonH5.setBackground(Color.BLUE);
        jButtonH6.setBackground(Color.BLUE);
        jButtonH7.setBackground(Color.BLUE);
        
        // -------------------------------------------------------

        jButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA1ActionPerformed();
            }
        });

        jButtonA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA2ActionPerformed();
            }
        });
 
        jButtonA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA3ActionPerformed();
            }
        });
 
        jButtonA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA4ActionPerformed();
            }
        });
 
        jButtonA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA5ActionPerformed();
            }
        });
 
        jButtonA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA6ActionPerformed();
            }
        });
 
        jButtonA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA7ActionPerformed();
            }
        });
 
        jButtonA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA8ActionPerformed();
            }
        });
 
        jButtonB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB8ActionPerformed();
            }
        });
 
        jButtonB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB1ActionPerformed();
            }
        });
 
        jButtonB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB2ActionPerformed();
            }
        });
 
        jButtonB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB3ActionPerformed();
            }
        });
 
        jButtonB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB4ActionPerformed();
            }
        });
 
        jButtonB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB5ActionPerformed();
            }
        });
 
        jButtonB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB6ActionPerformed();
            }
        });
 
        jButtonB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB7ActionPerformed();
            }
        });
 
        jButtonC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC8ActionPerformed();
            }
        });
 
        jButtonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC1ActionPerformed();
            }
        });
 
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed();
            }
        });
 
        jButtonC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC3ActionPerformed();
            }
        });
 
        jButtonC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC4ActionPerformed();
            }
        });
 
        jButtonC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC5ActionPerformed();
            }
        });
 
        jButtonC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC6ActionPerformed();
            }
        });
 
        jButtonC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC7ActionPerformed();
            }
        });
 
        jButtonD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD8ActionPerformed();
            }
        });
 
        jButtonD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD1ActionPerformed();
            }
        });
 
        jButtonD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD2ActionPerformed();
            }
        });
 
        jButtonD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD3ActionPerformed();
            }
        });
 
        jButtonD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD4ActionPerformed();
            }
        });
 
        jButtonD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD5ActionPerformed();
            }
        });
 
        jButtonD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD6ActionPerformed();
            }
        });
 
        jButtonD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD7ActionPerformed();
            }
        });
 
        jButtonE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE8ActionPerformed();
            }
        });
 
        jButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE1ActionPerformed();
            }
        });
 
        jButtonE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE2ActionPerformed();
            }
        });
 
        jButtonE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE3ActionPerformed();
            }
        });
 
        jButtonE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE4ActionPerformed();
            }
        });
 
        jButtonE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE5ActionPerformed();
            }
        });
 
        jButtonE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE6ActionPerformed();
            }
        });
 
        jButtonE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE7ActionPerformed();
            }
        });
 
        jButtonF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF8ActionPerformed();
            }
        });
 
        jButtonF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF1ActionPerformed();
            }
        });
 
        jButtonF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF2ActionPerformed();
            }
        });
 
        jButtonF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF3ActionPerformed();
            }
        });
 
        jButtonF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF4ActionPerformed();
            }
        });
 
        jButtonF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF5ActionPerformed();
            }
        });
 
        jButtonF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF6ActionPerformed();
            }
        });
 
        jButtonF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF7ActionPerformed();
            }
        });
 
        jButtonG8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG8ActionPerformed();
            }
        });
 
        jButtonG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG1ActionPerformed();
            }
        });
 
        jButtonG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG2ActionPerformed();
            }
        });
 
        jButtonG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG3ActionPerformed();
            }
        });
 
        jButtonG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG4ActionPerformed();
            }
        });
 
        jButtonG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG5ActionPerformed();
            }
        });
 
        jButtonG6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG6ActionPerformed();
            }
        });
 
        jButtonG7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonG7ActionPerformed();
            }
        });
 
        jButtonH8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH8ActionPerformed();
            }
        });
 
        jButtonH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH1ActionPerformed();
            }
        });
 
        jButtonH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH2ActionPerformed();
            }
        });
 
        jButtonH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH3ActionPerformed();
            }
        });
 
        jButtonH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH4ActionPerformed();
            }
        });
 
        jButtonH5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH5ActionPerformed();
            }
        });
 
        jButtonH6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH6ActionPerformed();
            }
        });
 
        jButtonH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH7ActionPerformed();
            }
        });

        // -------------------------------------------------------

        javax.swing.GroupLayout PlayerPanelLayout = new javax.swing.GroupLayout(PlayerPanel);
        PlayerPanel.setLayout(PlayerPanelLayout);
        PlayerPanelLayout.setHorizontalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlayerPanelLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonD1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonD8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonE1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonG1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonG8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonH8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonB8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PlayerPanelLayout.createSequentialGroup()
                            .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonA8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PlayerPanelLayout.setVerticalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlayerPanelLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonA8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonB8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonD8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonD1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonE8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonG8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonG1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonH8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
         
        // -------------------------------------------------------
         
        SubmarineButton.setText("Submarine");
        SubmarineButton.setToolTipText("");
        SubmarineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmarineButtonActionPerformed();
            }
        });

        DestroyerButton.setText("Destroyer");
        DestroyerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestroyerButtonActionPerformed();
            }
        });

        AircraftButton.setText("Aircraft");
        AircraftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AircraftButtonActionPerformed();
            }
        });
                  
        RotateShipButton.setText("Rotate Ship");
        RotateShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateShipButtonActionPerformed();
            }
        });

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24));
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed();
            }
        });

        // -------------------------------------------------------

        javax.swing.GroupLayout PlacingPanelLayout = new javax.swing.GroupLayout(PlacingPanel);
        PlacingPanel.setLayout(PlacingPanelLayout);
        PlacingPanelLayout.setHorizontalGroup(
            PlacingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlacingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RotateShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AircraftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DestroyerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmarineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(DoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(138, 138, 138))
        );
        PlacingPanelLayout.setVerticalGroup(
            PlacingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubmarineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlacingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlacingPanelLayout.createSequentialGroup()
                        .addComponent(DestroyerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AircraftButton))
                    .addComponent(DoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RotateShipButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 255, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlacingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlacingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
     }                  
    // -------------------------------------------------------
    
    public void AircraftButtonActionPerformed() {
        shipN("AircraftCarrier"); doneButton = false;
    }                                              
 
    public void jButtonA1ActionPerformed() {
        Button("A1"); doneButton = false;
    }                                        
 
    public void jButtonA2ActionPerformed() {                                        
        Button("A2"); doneButton = false;
    }                                        
 
    public void jButtonA3ActionPerformed() {                                        
       Button("A3"); doneButton = false;
    }                                        
 
    public void jButtonA4ActionPerformed() {                                        
        Button("A4"); doneButton = false;
    }                                        
 
    public void jButtonA5ActionPerformed() {                                        
        Button("A5"); doneButton = false;
    }                                        
 
    public void jButtonA6ActionPerformed() {                                        
        Button("A6"); doneButton = false;
    }                                        
 
    public void jButtonA7ActionPerformed() {                                        
        Button("A7"); doneButton = false;
    }                                        
 
    public void jButtonA8ActionPerformed() {                                        
        Button("A8"); doneButton = false;
    }                                        
 
    public void jButtonB1ActionPerformed() {                                          
         Button("B1"); doneButton = false;
    }                                        
 
    public void jButtonB2ActionPerformed() {                                          
        Button("B2"); doneButton = false;
    }                                        
 
    public void jButtonB3ActionPerformed() {                                          
        Button("B3"); doneButton = false;  
    }                                        
 
    public void jButtonB4ActionPerformed() {                                          
        Button("B4"); doneButton = false;  
    }                                        
 
    public void jButtonB5ActionPerformed() {                                          
        Button("B5"); doneButton = false;  
    }                                        
 
    public void jButtonB6ActionPerformed() {                                          
        Button("B6"); doneButton = false;  
    }                                        
 
    public void jButtonB7ActionPerformed() {                                          
        Button("B7"); doneButton = false;  
    }                                        
 
    public void jButtonB8ActionPerformed() {                                          
        Button("B8"); doneButton = false;  
    }                                        
 
    public void DestroyerButtonActionPerformed() {                                                
       shipN("Destroyer"); doneButton = false;
    }                                              
 
    public void SubmarineButtonActionPerformed() {                                                
        shipN("Submarine"); doneButton = false;
    }                                              
 
    public void jButtonD5ActionPerformed() {                                          
        Button("D5"); doneButton = false;
    }  
   
    public void jButtonC8ActionPerformed() {                                          
        Button("C8"); doneButton = false;
    }                                        
 
    public void jButtonC1ActionPerformed() {                                          
        Button("C1"); doneButton = false;
    }                                        
 
    public void jButtonC2ActionPerformed() {                                          
        Button("C2"); doneButton = false;
    }                                        
 
    public void jButtonC3ActionPerformed() {                                          
        Button("C3"); doneButton = false;
    }                                        
 
    public void jButtonC4ActionPerformed() {                                          
        Button("C4"); doneButton = false;
    }                                        
 
    public void jButtonC5ActionPerformed() {                                          
        Button("C5"); doneButton = false;
    }                                        
 
    public void jButtonC6ActionPerformed() {                                          
        Button("C6"); doneButton = false;
    }                                        
 
    public void jButtonC7ActionPerformed() {                                          
        Button("C7"); doneButton = false;
    }          
   
    public void jButtonD8ActionPerformed() {                                          
        Button("D8"); doneButton = false;
    }                                                                  
 
    public void jButtonD1ActionPerformed() {                                          
        Button("D1"); doneButton = false;
    }                                        
 
    public void jButtonD2ActionPerformed() {                                          
        Button("D2"); doneButton = false;
    }                                        
 
    public void jButtonD3ActionPerformed() {                                          
        Button("D3"); doneButton = false;
    }                                        
 
    public void jButtonD4ActionPerformed() {                                          
        Button("D4"); doneButton = false;
    }  
                                   
    public void jButtonD6ActionPerformed() {                                          
        Button("D6"); doneButton = false;
    }                                        
 
    public void jButtonD7ActionPerformed() {                                          
        Button("D7"); doneButton = false;
    }        
     
     public void jButtonE8ActionPerformed() {                                          
        Button("E8"); doneButton = false;
    }                            
 
    public void jButtonE1ActionPerformed() {                                          
        Button("E1"); doneButton = false;
    }                                        
 
    public void jButtonE2ActionPerformed() {                                          
        Button("E2"); doneButton = false;
    }                                        
 
    public void jButtonE3ActionPerformed() {                                          
        Button("E3"); doneButton = false;
    }                                        
 
    public void jButtonE4ActionPerformed() {                                          
        Button("E4"); doneButton = false;
    }                                        
 
    public void jButtonE5ActionPerformed() {                                          
        Button("E5"); doneButton = false;
    }                                        
 
    public void jButtonE6ActionPerformed() {                                          
        Button("E6"); doneButton = false;
    }                                        
 
    public void jButtonE7ActionPerformed() {                                          
        Button("E7"); doneButton = false;
    }    
   
    public void jButtonF8ActionPerformed() {                                          
        Button("F8"); doneButton = false;
    }                                                                          
 
    public void jButtonF1ActionPerformed() {                                          
        Button("F1"); doneButton = false;
    }                                        
 
    public void jButtonF2ActionPerformed() {                                          
        Button("F2"); doneButton = false;
    }                                        
 
    public void jButtonF3ActionPerformed() {                                          
        Button("F3"); doneButton = false;
    }                                        
 
    public void jButtonF4ActionPerformed() {                                          
        Button("F4"); doneButton = false;
    }                                        
 
    public void jButtonF5ActionPerformed() {                                          
         Button("F5"); doneButton = false;
    }                                        
 
    public void jButtonF6ActionPerformed() {                                          
         Button("F6"); doneButton = false;
    }                                        
 
    public void jButtonF7ActionPerformed() {                                          
         Button("F7"); doneButton = false;
    }                                        
   
     public void jButtonG8ActionPerformed() {                                          
         Button("G8"); doneButton = false;
    }                                          
 
    public void jButtonG1ActionPerformed() {                                          
         Button("G1"); doneButton = false;
    }                                        
 
    public void jButtonG2ActionPerformed() {                                          
         Button("G2"); doneButton = false;
    }                                        
 
    public void jButtonG3ActionPerformed() {                                          
         Button("G3"); doneButton = false;
    }                                        
 
    public void jButtonG4ActionPerformed() {                                          
         Button("G4"); doneButton = false;
    }                                        
 
    public void jButtonG5ActionPerformed() {                                          
         Button("G5"); doneButton = false;
    }                                        
 
    public void jButtonG6ActionPerformed() {                                          
         Button("G6"); doneButton = false;
    }                                        
    
    public void jButtonG7ActionPerformed() {                                          
         Button("G7"); doneButton = false;
    }    
   
    public void jButtonH8ActionPerformed() {                                          
         Button("H8"); doneButton = false;
    }                                                                      
 
    public void jButtonH1ActionPerformed() {                                          
         Button("H1"); doneButton = false;
    }                                        
 
    public void jButtonH2ActionPerformed() {                                          
         Button("H2"); doneButton = false;
    }                                        
 
    public void jButtonH3ActionPerformed() {                                          
         Button("H3"); doneButton = false;
    }                                        
 
    public void jButtonH4ActionPerformed() {                                          
         Button("H4"); doneButton = false;
    }                                        
 
    public void jButtonH5ActionPerformed() {                                          
         Button("H5"); doneButton = false;
    }                                        
 
    public void jButtonH6ActionPerformed() {                                          
         Button("H6"); doneButton = false;
    }                                        
 
    public void jButtonH7ActionPerformed() {                                          
         Button("H7"); doneButton = false;
    }
    
    public void RotateShipButtonActionPerformed() {
         rotateButton();
    }
    
    public void DoneButtonActionPerformed() {
         done = true;
         doneButton = true;
         doneButton();
    }

    // -------------------------------------------------------                   
    public static javax.swing.JTextArea jTextArea1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton AircraftButton;
    public javax.swing.JButton DestroyerButton;
    public javax.swing.JButton DoneButton;
    public javax.swing.JPanel PlacingPanel;
    public javax.swing.JPanel PlayerPanel;
    public javax.swing.JButton RotateShipButton;
    public javax.swing.JButton SubmarineButton;
    public javax.swing.JButton jButtonB8;
    public javax.swing.JButton jButtonB1;
    public javax.swing.JButton jButtonB2;
    public javax.swing.JButton jButtonB3;
    public javax.swing.JButton jButtonB4;
    public javax.swing.JButton jButtonB5;
    public javax.swing.JButton jButtonB6;
    public javax.swing.JButton jButtonB7;
    public javax.swing.JButton jButtonC8;
    public javax.swing.JButton jButtonC1;
    public javax.swing.JButton jButtonA1;
    public javax.swing.JButton jButtonC2;
    public javax.swing.JButton jButtonC3;
    public javax.swing.JButton jButtonC4;
    public javax.swing.JButton jButtonC5;
    public javax.swing.JButton jButtonC6;
    public javax.swing.JButton jButtonC7;
    public javax.swing.JButton jButtonD8;
    public javax.swing.JButton jButtonD1;
    public javax.swing.JButton jButtonD2;
    public javax.swing.JButton jButtonD3;
    public javax.swing.JButton jButtonA2;
    public javax.swing.JButton jButtonD4;
    public javax.swing.JButton jButtonD5;
    public javax.swing.JButton jButtonD6;
    public javax.swing.JButton jButtonD7;
    public javax.swing.JButton jButtonE8;
    public javax.swing.JButton jButtonE1;
    public javax.swing.JButton jButtonE2;
    public javax.swing.JButton jButtonE3;
    public javax.swing.JButton jButtonE4;
    public javax.swing.JButton jButtonE5;
    public javax.swing.JButton jButtonA3;
    public javax.swing.JButton jButtonE6;
    public javax.swing.JButton jButtonE7;
    public javax.swing.JButton jButtonF8;
    public javax.swing.JButton jButtonF1;
    public javax.swing.JButton jButtonF2;
    public javax.swing.JButton jButtonF3;
    public javax.swing.JButton jButtonF4;
    public javax.swing.JButton jButtonF5;
    public javax.swing.JButton jButtonF6;
    public javax.swing.JButton jButtonF7;
    public javax.swing.JButton jButtonA4;
    public javax.swing.JButton jButtonG8;
    public javax.swing.JButton jButtonG1;
    public javax.swing.JButton jButtonG2;
    public javax.swing.JButton jButtonG3;
    public javax.swing.JButton jButtonG4;
    public javax.swing.JButton jButtonG5;
    public javax.swing.JButton jButtonG6;
    public javax.swing.JButton jButtonG7;
    public javax.swing.JButton jButtonH8;
    public javax.swing.JButton jButtonH1;
    public javax.swing.JButton jButtonA5;
    public javax.swing.JButton jButtonH2;
    public javax.swing.JButton jButtonH3;
    public javax.swing.JButton jButtonH4;
    public javax.swing.JButton jButtonH5;
    public javax.swing.JButton jButtonH6;
    public javax.swing.JButton jButtonH7;
    public javax.swing.JButton jButtonA6;
    public javax.swing.JButton jButtonA7;
    public javax.swing.JButton jButtonA8; 
    
    // -------------------------------------------------------

    public static void shipN(String s){
      shipName = s;}
    
    public static void rotateButton(){
         if(rotate == true){
            text("SHIPS NOW ROTATED VERTICAL");
            rotate = false;}
         else{//rotate == false
            text("SHIPS NOW ROTATED HORIZONTAL");
            rotate = true;}
    }
    
    public static boolean doneButton(){
         String[][] ships = shipSorter.getShips();
         if (doneButton == true){
            if (ships[0][0]==null||ships[1][0]==null||ships[2][0]==null){
               String errorDone = "ERROR - ALL SHIPS NOT PLACED";
               ShipSorter doneFalseShip = new ShipSorter(errorDone);
               done = false;
               return false;}
            else{
               done = true;
               ShipSorter doneTrueShip = new ShipSorter();
               doneTrueShip.doneTrue();
               return true;}
         }
         return false;
    }
    
    public static void Button(String b){
      if(shipName.equals("")){
         String errorNo = "ERROR - NO SHIP SELECTED";
         ShipSorter errorNoShip = new ShipSorter(errorNo);}
      else if(shipName.equals("AircraftCarrier")){
         ShipSorter shipAC = new ShipSorter(shipName, rotate, done);
         shipAC.buttonPressed(b);}
      else if(shipName.equals("Destroyer")){
         ShipSorter shipDS = new ShipSorter(shipName, rotate, done);
         shipDS.buttonPressed(b);}
      else if(shipName.equals("Submarine")){
         ShipSorter shipSM = new ShipSorter(shipName, rotate, done);
         shipSM.buttonPressed(b);}
      }
 }
