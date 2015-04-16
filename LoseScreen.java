import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoseScreen extends javax.swing.JFrame {

    public LoseScreen() {
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.getContentPane().setBackground(Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 120));
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("YOU LOSE!");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton1.setText("Quit?");
        jButton1.setActionCommand("Quit?");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("Quit");

        pack();
    
    }                   

    private void jButton1ActionPerformed() {
      System.exit(0);
    }                                      
                        
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;                 
}
