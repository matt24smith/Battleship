import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends javax.swing.JFrame {

   public static AIPlayer AI = new AIPlayer(false);

	public GameGUI() {

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
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		PlayerPanel1 = new javax.swing.JPanel();
		OjButtonA1 = new javax.swing.JButton();
		OjButtonA2 = new javax.swing.JButton();
		OjButtonA3 = new javax.swing.JButton();
		OjButtonA4 = new javax.swing.JButton();
		OjButtonA5 = new javax.swing.JButton();
		OjButtonA6 = new javax.swing.JButton();
		OjButtonA7 = new javax.swing.JButton();
		OjButtonA8 = new javax.swing.JButton();
		OjButtonB8 = new javax.swing.JButton();
		OjButtonB1 = new javax.swing.JButton();
		OjButtonB2 = new javax.swing.JButton();
		OjButtonB3 = new javax.swing.JButton();
		OjButtonB4 = new javax.swing.JButton();
		OjButtonB5 = new javax.swing.JButton();
		OjButtonB6 = new javax.swing.JButton();
		OjButtonB7 = new javax.swing.JButton();
		OjButtonC8 = new javax.swing.JButton();
		OjButtonC1 = new javax.swing.JButton();
		OjButtonC2 = new javax.swing.JButton();
		OjButtonC3 = new javax.swing.JButton();
		OjButtonC4 = new javax.swing.JButton();
		OjButtonC5 = new javax.swing.JButton();
		OjButtonC6 = new javax.swing.JButton();
		OjButtonC7 = new javax.swing.JButton();
		OjButtonD8 = new javax.swing.JButton();
		OjButtonD1 = new javax.swing.JButton();
		OjButtonD2 = new javax.swing.JButton();
		OjButtonD3 = new javax.swing.JButton();
		OjButtonD4 = new javax.swing.JButton();
		OjButtonD5 = new javax.swing.JButton();
		OjButtonD6 = new javax.swing.JButton();
		OjButtonD7 = new javax.swing.JButton();
		OjButtonE8 = new javax.swing.JButton();
		OjButtonE1 = new javax.swing.JButton();
		OjButtonE2 = new javax.swing.JButton();
		OjButtonE3 = new javax.swing.JButton();
		OjButtonE4 = new javax.swing.JButton();
		OjButtonE5 = new javax.swing.JButton();
		OjButtonE6 = new javax.swing.JButton();
		OjButtonE7 = new javax.swing.JButton();
		OjButtonF8 = new javax.swing.JButton();
		OjButtonF1 = new javax.swing.JButton();
		OjButtonF2 = new javax.swing.JButton();
		OjButtonF3 = new javax.swing.JButton();
		OjButtonF4 = new javax.swing.JButton();
		OjButtonF5 = new javax.swing.JButton();
		OjButtonF6 = new javax.swing.JButton();
		OjButtonF7 = new javax.swing.JButton();
		OjButtonG8 = new javax.swing.JButton();
		OjButtonG1 = new javax.swing.JButton();
		OjButtonG2 = new javax.swing.JButton();
		OjButtonG3 = new javax.swing.JButton();
		OjButtonG4 = new javax.swing.JButton();
		OjButtonG5 = new javax.swing.JButton();
		OjButtonG6 = new javax.swing.JButton();
		OjButtonG7 = new javax.swing.JButton();
		OjButtonH8 = new javax.swing.JButton();
		OjButtonH1 = new javax.swing.JButton();
		OjButtonH2 = new javax.swing.JButton();
		OjButtonH3 = new javax.swing.JButton();
		OjButtonH4 = new javax.swing.JButton();
		OjButtonH5 = new javax.swing.JButton();
		OjButtonH6 = new javax.swing.JButton();
		OjButtonH7 = new javax.swing.JButton();
		PlayerBoard = new javax.swing.JLabel();
		OpponentsBoard = new javax.swing.JLabel();

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

		OjButtonA1.setBackground(Color.BLUE);
		OjButtonA2.setBackground(Color.BLUE);
		OjButtonA3.setBackground(Color.BLUE);
		OjButtonA4.setBackground(Color.BLUE);
		OjButtonA5.setBackground(Color.BLUE);
		OjButtonA6.setBackground(Color.BLUE);
		OjButtonA7.setBackground(Color.BLUE);
		OjButtonA8.setBackground(Color.BLUE);
		OjButtonB8.setBackground(Color.BLUE);
		OjButtonB1.setBackground(Color.BLUE);
		OjButtonB2.setBackground(Color.BLUE);
		OjButtonB3.setBackground(Color.BLUE);
		OjButtonB4.setBackground(Color.BLUE);
		OjButtonB5.setBackground(Color.BLUE);
		OjButtonB6.setBackground(Color.BLUE);
		OjButtonB7.setBackground(Color.BLUE);
		OjButtonC8.setBackground(Color.BLUE);
		OjButtonC1.setBackground(Color.BLUE);
		OjButtonC2.setBackground(Color.BLUE);
		OjButtonC3.setBackground(Color.BLUE);
		OjButtonC4.setBackground(Color.BLUE);
		OjButtonC5.setBackground(Color.BLUE);
		OjButtonC6.setBackground(Color.BLUE);
		OjButtonC7.setBackground(Color.BLUE);
		OjButtonD8.setBackground(Color.BLUE);
		OjButtonD1.setBackground(Color.BLUE);
		OjButtonD2.setBackground(Color.BLUE);
		OjButtonD3.setBackground(Color.BLUE);
		OjButtonD4.setBackground(Color.BLUE);
		OjButtonD5.setBackground(Color.BLUE);
		OjButtonD6.setBackground(Color.BLUE);
		OjButtonD7.setBackground(Color.BLUE);
		OjButtonE8.setBackground(Color.BLUE);
		OjButtonE1.setBackground(Color.BLUE);
		OjButtonE2.setBackground(Color.BLUE);
		OjButtonE3.setBackground(Color.BLUE);
		OjButtonE4.setBackground(Color.BLUE);
		OjButtonE5.setBackground(Color.BLUE);
		OjButtonE6.setBackground(Color.BLUE);
		OjButtonE7.setBackground(Color.BLUE);
		OjButtonF8.setBackground(Color.BLUE);
		OjButtonF1.setBackground(Color.BLUE);
		OjButtonF2.setBackground(Color.BLUE);
		OjButtonF3.setBackground(Color.BLUE);
		OjButtonF4.setBackground(Color.BLUE);
		OjButtonF5.setBackground(Color.BLUE);
		OjButtonF6.setBackground(Color.BLUE);
		OjButtonF7.setBackground(Color.BLUE);
		OjButtonG8.setBackground(Color.BLUE);
		OjButtonG1.setBackground(Color.BLUE);
		OjButtonG2.setBackground(Color.BLUE);
		OjButtonG3.setBackground(Color.BLUE);
		OjButtonG4.setBackground(Color.BLUE);
		OjButtonG5.setBackground(Color.BLUE);
		OjButtonG6.setBackground(Color.BLUE);
		OjButtonG7.setBackground(Color.BLUE);
		OjButtonH8.setBackground(Color.BLUE);
		OjButtonH1.setBackground(Color.BLUE);
		OjButtonH2.setBackground(Color.BLUE);
		OjButtonH3.setBackground(Color.BLUE);
		OjButtonH4.setBackground(Color.BLUE);
		OjButtonH5.setBackground(Color.BLUE);
		OjButtonH6.setBackground(Color.BLUE);
		OjButtonH7.setBackground(Color.BLUE);

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

		javax.swing.GroupLayout PlayerPanelLayout = new javax.swing.GroupLayout(
				PlayerPanel);
		PlayerPanel.setLayout(PlayerPanelLayout);
		PlayerPanelLayout
				.setHorizontalGroup(PlayerPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 428, Short.MAX_VALUE)
						.addGroup(
								PlayerPanelLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PlayerPanelLayout
														.createSequentialGroup()
														.addGap(31, 31, 31)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonD1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonD8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonE1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonE8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonF1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonF8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonG1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonG8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonH1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonH8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonC1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonC8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonB1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonB8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButtonA1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButtonA8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));
		PlayerPanelLayout
				.setVerticalGroup(PlayerPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 405, Short.MAX_VALUE)
						.addGroup(
								PlayerPanelLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PlayerPanelLayout
														.createSequentialGroup()
														.addGap(7, 7, 7)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonA8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonA1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonB8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonB1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonC8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonC1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonD8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonD1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonE8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonE1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonF8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonF1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonG8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonG1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButtonH8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButtonH1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addContainerGap(
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));

		jScrollPane1
				.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane1.setToolTipText("");
		jScrollPane1
				.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

		jTextArea1.setEditable(false);
		jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jTextArea1.setForeground(new java.awt.Color(0, 255, 0));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jTextArea1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(51, 51, 51)));
		jScrollPane1.setViewportView(jTextArea1);

		OjButtonA1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA1ActionPerformed();
			}
		});

		OjButtonA2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA2ActionPerformed();
			}
		});

		OjButtonA3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA3ActionPerformed();
			}
		});

		OjButtonA4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA4ActionPerformed();
			}
		});

		OjButtonA5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA5ActionPerformed();
			}
		});

		OjButtonA6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA6ActionPerformed();
			}
		});

		OjButtonA7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA7ActionPerformed();
			}
		});

		OjButtonA8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonA8ActionPerformed();
			}
		});

		OjButtonB8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB8ActionPerformed();
			}
		});

		OjButtonB1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB1ActionPerformed();
			}
		});

		OjButtonB2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB2ActionPerformed();
			}
		});

		OjButtonB3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB3ActionPerformed();
			}
		});

		OjButtonB4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB4ActionPerformed();
			}
		});

		OjButtonB5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB5ActionPerformed();
			}
		});

		OjButtonB6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB6ActionPerformed();
			}
		});

		OjButtonB7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonB7ActionPerformed();
			}
		});

		OjButtonC8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC8ActionPerformed();
			}
		});

		OjButtonC1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC1ActionPerformed();
			}
		});

		OjButtonC2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC2ActionPerformed();
			}
		});

		OjButtonC3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC3ActionPerformed();
			}
		});

		OjButtonC4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC4ActionPerformed();
			}
		});

		OjButtonC5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC5ActionPerformed();
			}
		});

		OjButtonC6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC6ActionPerformed();
			}
		});

		OjButtonC7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonC7ActionPerformed();
			}
		});

		OjButtonD8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD8ActionPerformed();
			}
		});

		OjButtonD1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD1ActionPerformed();
			}
		});

		OjButtonD2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD2ActionPerformed();
			}
		});

		OjButtonD3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD3ActionPerformed();
			}
		});

		OjButtonD4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD4ActionPerformed();
			}
		});

		OjButtonD5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD5ActionPerformed();
			}
		});

		OjButtonD6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD6ActionPerformed();
			}
		});

		OjButtonD7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonD7ActionPerformed();
			}
		});

		OjButtonE8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE8ActionPerformed();
			}
		});

		OjButtonE1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE1ActionPerformed();
			}
		});

		OjButtonE2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE2ActionPerformed();
			}
		});

		OjButtonE3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE3ActionPerformed();
			}
		});

		OjButtonE4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE4ActionPerformed();
			}
		});

		OjButtonE5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE5ActionPerformed();
			}
		});

		OjButtonE6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE6ActionPerformed();
			}
		});

		OjButtonE7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonE7ActionPerformed();
			}
		});

		OjButtonF8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF8ActionPerformed();
			}
		});

		OjButtonF1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF1ActionPerformed();
			}
		});

		OjButtonF2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF2ActionPerformed();
			}
		});

		OjButtonF3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF3ActionPerformed();
			}
		});

		OjButtonF4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF4ActionPerformed();
			}
		});

		OjButtonF5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF5ActionPerformed();
			}
		});

		OjButtonF6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF6ActionPerformed();
			}
		});

		OjButtonF7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonF7ActionPerformed();
			}
		});

		OjButtonG8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG8ActionPerformed();
			}
		});

		OjButtonG1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG1ActionPerformed();
			}
		});

		OjButtonG2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG2ActionPerformed();
			}
		});

		OjButtonG3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG3ActionPerformed();
			}
		});

		OjButtonG4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG4ActionPerformed();
			}
		});

		OjButtonG5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG5ActionPerformed();
			}
		});

		OjButtonG6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG6ActionPerformed();
			}
		});

		OjButtonG7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonG7ActionPerformed();
			}
		});

		OjButtonH8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH8ActionPerformed();
			}
		});

		OjButtonH1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH1ActionPerformed();
			}
		});

		OjButtonH2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH2ActionPerformed();
			}
		});

		OjButtonH3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH3ActionPerformed();
			}
		});

		OjButtonH4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH4ActionPerformed();
			}
		});

		OjButtonH5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH5ActionPerformed();
			}
		});

		OjButtonH6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH6ActionPerformed();
			}
		});

		OjButtonH7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OjButtonH7ActionPerformed();
			}
		});

		javax.swing.GroupLayout PlayerPanel1Layout = new javax.swing.GroupLayout(
				PlayerPanel1);
		PlayerPanel1.setLayout(PlayerPanel1Layout);
		PlayerPanel1Layout
				.setHorizontalGroup(PlayerPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(
								PlayerPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PlayerPanel1Layout
														.createSequentialGroup()
														.addGap(31, 31, 31)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonD1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonD8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonE1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonE8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonF1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonF8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonG1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonG8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonH1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonH8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonC1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonC8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonB1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonB8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				PlayerPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								OjButtonA1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								OjButtonA8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								42,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));
		PlayerPanel1Layout
				.setVerticalGroup(PlayerPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(
								PlayerPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PlayerPanel1Layout
														.createSequentialGroup()
														.addGap(7, 7, 7)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonA8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonA1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonB8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonB1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonC8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonC1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonD8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonD1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonE8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonE1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonF8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonF1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonG8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonG1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																PlayerPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				OjButtonH8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				OjButtonH1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addContainerGap(
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));

		PlayerBoard.setFont(new java.awt.Font("Tahoma", 0, 24));
		PlayerBoard.setText("PLAYER'S BOARD");

		OpponentsBoard.setFont(new java.awt.Font("Tahoma", 0, 24));
		OpponentsBoard.setText("OPPONENT'S BOARD");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(33, 33,
																		33)
																.addComponent(
																		PlayerBoard)
																.addGap(406,
																		406,
																		406)
																.addComponent(
																		OpponentsBoard))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		PlayerPanel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		PlayerPanel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		417,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		820,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(26, 26, 26)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										121,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														PlayerPanel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														PlayerPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(PlayerBoard)
												.addComponent(OpponentsBoard))
								.addContainerGap()));

		pack();
	}

	// -------------------------------------------------------

	public void jButtonA1ActionPerformed() {
		Button("A1");
	}

	public void jButtonA2ActionPerformed() {
		Button("A2");
	}

	public void jButtonA3ActionPerformed() {
		Button("A3");
	}

	public void jButtonA4ActionPerformed() {
		Button("A4");
	}

	public void jButtonA5ActionPerformed() {
		Button("A5");
	}

	public void jButtonA6ActionPerformed() {
		Button("A6");
	}

	public void jButtonA7ActionPerformed() {
		Button("A7");
	}

	public void jButtonA8ActionPerformed() {
		Button("A8");
	}

	public void jButtonB1ActionPerformed() {
		Button("B1");
	}

	public void jButtonB2ActionPerformed() {
		Button("B2");
	}

	public void jButtonB3ActionPerformed() {
		Button("B3");
	}

	public void jButtonB4ActionPerformed() {
		Button("B4");
	}

	public void jButtonB5ActionPerformed() {
		Button("B5");
	}

	public void jButtonB6ActionPerformed() {
		Button("B6");
	}

	public void jButtonB7ActionPerformed() {
		Button("B7");
	}

	public void jButtonB8ActionPerformed() {
		Button("B8");
	}

	public void jButtonD5ActionPerformed() {
		Button("D5");
	}

	public void jButtonC8ActionPerformed() {
		Button("C8");
	}

	public void jButtonC1ActionPerformed() {
		Button("C1");
	}

	public void jButtonC2ActionPerformed() {
		Button("C2");
	}

	public void jButtonC3ActionPerformed() {
		Button("C3");
	}

	public void jButtonC4ActionPerformed() {
		Button("C4");
	}

	public void jButtonC5ActionPerformed() {
		Button("C5");
	}

	public void jButtonC6ActionPerformed() {
		Button("C6");
	}

	public void jButtonC7ActionPerformed() {
		Button("C7");
	}

	public void jButtonD8ActionPerformed() {
		Button("D8");
	}

	public void jButtonD1ActionPerformed() {
		Button("D1");
	}

	public void jButtonD2ActionPerformed() {
		Button("D2");
	}

	public void jButtonD3ActionPerformed() {
		Button("D3");
	}

	public void jButtonD4ActionPerformed() {
		Button("D4");
	}

	public void jButtonD6ActionPerformed() {
		Button("D6");
	}

	public void jButtonD7ActionPerformed() {
		Button("D7");
	}

	public void jButtonE8ActionPerformed() {
		Button("E8");
	}

	public void jButtonE1ActionPerformed() {
		Button("E1");
	}

	public void jButtonE2ActionPerformed() {
		Button("E2");
	}

	public void jButtonE3ActionPerformed() {
		Button("E3");
	}

	public void jButtonE4ActionPerformed() {
		Button("E4");
	}

	public void jButtonE5ActionPerformed() {
		Button("E5");
	}

	public void jButtonE6ActionPerformed() {
		Button("E6");
	}

	public void jButtonE7ActionPerformed() {
		Button("E7");
	}

	public void jButtonF8ActionPerformed() {
		Button("F8");
	}

	public void jButtonF1ActionPerformed() {
		Button("F1");
	}

	public void jButtonF2ActionPerformed() {
		Button("F2");
	}

	public void jButtonF3ActionPerformed() {
		Button("F3");
	}

	public void jButtonF4ActionPerformed() {
		Button("F4");
	}

	public void jButtonF5ActionPerformed() {
		Button("F5");
	}

	public void jButtonF6ActionPerformed() {
		Button("F6");
	}

	public void jButtonF7ActionPerformed() {
		Button("F7");
	}

	public void jButtonG8ActionPerformed() {
		Button("G8");
	}

	public void jButtonG1ActionPerformed() {
		Button("G1");
	}

	public void jButtonG2ActionPerformed() {
		Button("G2");
	}

	public void jButtonG3ActionPerformed() {
		Button("G3");
	}

	public void jButtonG4ActionPerformed() {
		Button("G4");
	}

	public void jButtonG5ActionPerformed() {
		Button("G5");
	}

	public void jButtonG6ActionPerformed() {
		Button("G6");
	}

	public void jButtonG7ActionPerformed() {
		Button("G7");
	}

	public void jButtonH8ActionPerformed() {
		Button("H8");
	}

	public void jButtonH1ActionPerformed() {
		Button("H1");
	}

	public void jButtonH2ActionPerformed() {
		Button("H2");
	}

	public void jButtonH3ActionPerformed() {
		Button("H3");
	}

	public void jButtonH4ActionPerformed() {
		Button("H4");
	}

	public void jButtonH5ActionPerformed() {
		Button("H5");
	}

	public void jButtonH6ActionPerformed() {
		Button("H6");
	}

	public void jButtonH7ActionPerformed() {
		Button("H7");
	}

	public void OjButtonA1ActionPerformed() {
		ButtonO("A1");
	}

	public void OjButtonA2ActionPerformed() {
		ButtonO("A2");
	}

	public void OjButtonA3ActionPerformed() {
		ButtonO("A3");
	}

	public void OjButtonA4ActionPerformed() {
		ButtonO("A4");
	}

	public void OjButtonA5ActionPerformed() {
		ButtonO("A5");
	}

	public void OjButtonA6ActionPerformed() {
		ButtonO("A6");
	}

	public void OjButtonA7ActionPerformed() {
		ButtonO("A7");
	}

	public void OjButtonA8ActionPerformed() {
		ButtonO("A8");
	}

	public void OjButtonB1ActionPerformed() {
		ButtonO("B1");
	}

	public void OjButtonB2ActionPerformed() {
		ButtonO("B2");
	}

	public void OjButtonB3ActionPerformed() {
		ButtonO("B3");
	}

	public void OjButtonB4ActionPerformed() {
		ButtonO("B4");
	}

	public void OjButtonB5ActionPerformed() {
		ButtonO("B5");
	}

	public void OjButtonB6ActionPerformed() {
		ButtonO("B6");
	}

	public void OjButtonB7ActionPerformed() {
		ButtonO("B7");
	}

	public void OjButtonB8ActionPerformed() {
		ButtonO("B8");
	}

	public void OjButtonD5ActionPerformed() {
		ButtonO("D5");
	}

	public void OjButtonC8ActionPerformed() {
		ButtonO("C8");
	}

	public void OjButtonC1ActionPerformed() {
		ButtonO("C1");
	}

	public void OjButtonC2ActionPerformed() {
		ButtonO("C2");
	}

	public void OjButtonC3ActionPerformed() {
		ButtonO("C3");
	}

	public void OjButtonC4ActionPerformed() {
		ButtonO("C4");
	}

	public void OjButtonC5ActionPerformed() {
		ButtonO("C5");
	}

	public void OjButtonC6ActionPerformed() {
		ButtonO("C6");
	}

	public void OjButtonC7ActionPerformed() {
		ButtonO("C7");
	}

	public void OjButtonD8ActionPerformed() {
		ButtonO("D8");
	}

	public void OjButtonD1ActionPerformed() {
		ButtonO("D1");
	}

	public void OjButtonD2ActionPerformed() {
		ButtonO("D2");
	}

	public void OjButtonD3ActionPerformed() {
		ButtonO("D3");
	}

	public void OjButtonD4ActionPerformed() {
		ButtonO("D4");
	}

	public void OjButtonD6ActionPerformed() {
		ButtonO("D6");
	}

	public void OjButtonD7ActionPerformed() {
		ButtonO("D7");
	}

	public void OjButtonE8ActionPerformed() {
		ButtonO("E8");
	}

	public void OjButtonE1ActionPerformed() {
		ButtonO("E1");
	}

	public void OjButtonE2ActionPerformed() {
		ButtonO("E2");
	}

	public void OjButtonE3ActionPerformed() {
		ButtonO("E3");
	}

	public void OjButtonE4ActionPerformed() {
		ButtonO("E4");
	}

	public void OjButtonE5ActionPerformed() {
		ButtonO("E5");
	}

	public void OjButtonE6ActionPerformed() {
		ButtonO("E6");
	}

	public void OjButtonE7ActionPerformed() {
		ButtonO("E7");
	}

	public void OjButtonF8ActionPerformed() {
		ButtonO("F8");
	}

	public void OjButtonF1ActionPerformed() {
		ButtonO("F1");
	}

	public void OjButtonF2ActionPerformed() {
		ButtonO("F2");
	}

	public void OjButtonF3ActionPerformed() {
		ButtonO("F3");
	}

	public void OjButtonF4ActionPerformed() {
		ButtonO("F4");
	}

	public void OjButtonF5ActionPerformed() {
		ButtonO("F5");
	}

	public void OjButtonF6ActionPerformed() {
		ButtonO("F6");
	}

	public void OjButtonF7ActionPerformed() {
		ButtonO("F7");
	}

	public void OjButtonG8ActionPerformed() {
		ButtonO("G8");
	}

	public void OjButtonG1ActionPerformed() {
		ButtonO("G1");
	}

	public void OjButtonG2ActionPerformed() {
		ButtonO("G2");
	}

	public void OjButtonG3ActionPerformed() {
		ButtonO("G3");
	}

	public void OjButtonG4ActionPerformed() {
		ButtonO("G4");
	}

	public void OjButtonG5ActionPerformed() {
		ButtonO("G5");
	}

	public void OjButtonG6ActionPerformed() {
		ButtonO("G6");
	}

	public void OjButtonG7ActionPerformed() {
		ButtonO("G7");
	}

	public void OjButtonH8ActionPerformed() {
		ButtonO("H8");
	}

	public void OjButtonH1ActionPerformed() {
		ButtonO("H1");
	}

	public void OjButtonH2ActionPerformed() {
		ButtonO("H2");
	}

	public void OjButtonH3ActionPerformed() {
		ButtonO("H3");
	}

	public void OjButtonH4ActionPerformed() {
		ButtonO("H4");
	}

	public void OjButtonH5ActionPerformed() {
		ButtonO("H5");
	}

	public void OjButtonH6ActionPerformed() {
		ButtonO("H6");
	}

	public void OjButtonH7ActionPerformed() {
		ButtonO("H7");
	}

	// -------------------------------------------------------

	public javax.swing.JButton OjButtonA1;
	public javax.swing.JButton OjButtonA2;
	public javax.swing.JButton OjButtonA3;
	public javax.swing.JButton OjButtonA4;
	public javax.swing.JButton OjButtonA5;
	public javax.swing.JButton OjButtonA6;
	public javax.swing.JButton OjButtonA7;
	public javax.swing.JButton OjButtonA8;
	public javax.swing.JButton OjButtonB1;
	public javax.swing.JButton OjButtonB2;
	public javax.swing.JButton OjButtonB3;
	public javax.swing.JButton OjButtonB4;
	public javax.swing.JButton OjButtonB5;
	public javax.swing.JButton OjButtonB6;
	public javax.swing.JButton OjButtonB7;
	public javax.swing.JButton OjButtonB8;
	public javax.swing.JButton OjButtonC1;
	public javax.swing.JButton OjButtonC2;
	public javax.swing.JButton OjButtonC3;
	public javax.swing.JButton OjButtonC4;
	public javax.swing.JButton OjButtonC5;
	public javax.swing.JButton OjButtonC6;
	public javax.swing.JButton OjButtonC7;
	public javax.swing.JButton OjButtonC8;
	public javax.swing.JButton OjButtonD1;
	public javax.swing.JButton OjButtonD2;
	public javax.swing.JButton OjButtonD3;
	public javax.swing.JButton OjButtonD4;
	public javax.swing.JButton OjButtonD5;
	public javax.swing.JButton OjButtonD6;
	public javax.swing.JButton OjButtonD7;
	public javax.swing.JButton OjButtonD8;
	public javax.swing.JButton OjButtonE1;
	public javax.swing.JButton OjButtonE2;
	public javax.swing.JButton OjButtonE3;
	public javax.swing.JButton OjButtonE4;
	public javax.swing.JButton OjButtonE5;
	public javax.swing.JButton OjButtonE6;
	public javax.swing.JButton OjButtonE7;
	public javax.swing.JButton OjButtonE8;
	public javax.swing.JButton OjButtonF1;
	public javax.swing.JButton OjButtonF2;
	public javax.swing.JButton OjButtonF3;
	public javax.swing.JButton OjButtonF4;
	public javax.swing.JButton OjButtonF5;
	public javax.swing.JButton OjButtonF6;
	public javax.swing.JButton OjButtonF7;
	public javax.swing.JButton OjButtonF8;
	public javax.swing.JButton OjButtonG1;
	public javax.swing.JButton OjButtonG2;
	public javax.swing.JButton OjButtonG3;
	public javax.swing.JButton OjButtonG4;
	public javax.swing.JButton OjButtonG5;
	public javax.swing.JButton OjButtonG6;
	public javax.swing.JButton OjButtonG7;
	public javax.swing.JButton OjButtonG8;
	public javax.swing.JButton OjButtonH1;
	public javax.swing.JButton OjButtonH2;
	public javax.swing.JButton OjButtonH3;
	public javax.swing.JButton OjButtonH4;
	public javax.swing.JButton OjButtonH5;
	public javax.swing.JButton OjButtonH6;
	public javax.swing.JButton OjButtonH7;
	public javax.swing.JButton OjButtonH8;
	public javax.swing.JLabel OpponentsBoard;
	public javax.swing.JLabel PlayerBoard;
	public javax.swing.JPanel PlayerPanel;
	public javax.swing.JPanel PlayerPanel1;
	public javax.swing.JButton jButtonA1;
	public javax.swing.JButton jButtonA2;
	public javax.swing.JButton jButtonA3;
	public javax.swing.JButton jButtonA4;
	public javax.swing.JButton jButtonA5;
	public javax.swing.JButton jButtonA6;
	public javax.swing.JButton jButtonA7;
	public javax.swing.JButton jButtonA8;
	public javax.swing.JButton jButtonB1;
	public javax.swing.JButton jButtonB2;
	public javax.swing.JButton jButtonB3;
	public javax.swing.JButton jButtonB4;
	public javax.swing.JButton jButtonB5;
	public javax.swing.JButton jButtonB6;
	public javax.swing.JButton jButtonB7;
	public javax.swing.JButton jButtonB8;
	public javax.swing.JButton jButtonC1;
	public javax.swing.JButton jButtonC2;
	public javax.swing.JButton jButtonC3;
	public javax.swing.JButton jButtonC4;
	public javax.swing.JButton jButtonC5;
	public javax.swing.JButton jButtonC6;
	public javax.swing.JButton jButtonC7;
	public javax.swing.JButton jButtonC8;
	public javax.swing.JButton jButtonD1;
	public javax.swing.JButton jButtonD2;
	public javax.swing.JButton jButtonD3;
	public javax.swing.JButton jButtonD4;
	public javax.swing.JButton jButtonD5;
	public javax.swing.JButton jButtonD6;
	public javax.swing.JButton jButtonD7;
	public javax.swing.JButton jButtonD8;
	public javax.swing.JButton jButtonE1;
	public javax.swing.JButton jButtonE2;
	public javax.swing.JButton jButtonE3;
	public javax.swing.JButton jButtonE4;
	public javax.swing.JButton jButtonE5;
	public javax.swing.JButton jButtonE6;
	public javax.swing.JButton jButtonE7;
	public javax.swing.JButton jButtonE8;
	public javax.swing.JButton jButtonF1;
	public javax.swing.JButton jButtonF2;
	public javax.swing.JButton jButtonF3;
	public javax.swing.JButton jButtonF4;
	public javax.swing.JButton jButtonF5;
	public javax.swing.JButton jButtonF6;
	public javax.swing.JButton jButtonF7;
	public javax.swing.JButton jButtonF8;
	public javax.swing.JButton jButtonG1;
	public javax.swing.JButton jButtonG2;
	public javax.swing.JButton jButtonG3;
	public javax.swing.JButton jButtonG4;
	public javax.swing.JButton jButtonG5;
	public javax.swing.JButton jButtonG6;
	public javax.swing.JButton jButtonG7;
	public javax.swing.JButton jButtonG8;
	public javax.swing.JButton jButtonH1;
	public javax.swing.JButton jButtonH2;
	public javax.swing.JButton jButtonH3;
	public javax.swing.JButton jButtonH4;
	public javax.swing.JButton jButtonH5;
	public javax.swing.JButton jButtonH6;
	public javax.swing.JButton jButtonH7;
	public javax.swing.JButton jButtonH8;
	public javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTextArea jTextArea1;

	public void text(String text) {
		jTextArea1.append(text + "\n");
	}

	public void color(JButton button) {
		button.setBackground(Color.BLACK);
	}

	public void antiColor(JButton button) {
		button.setBackground(Color.BLUE);
	}

	public void colorHit(JButton button) {
		button.setBackground(Color.RED);
	}

	public void colorMiss(JButton button) {
		button.setBackground(Color.GRAY);
	}

	public void Attempt(String b) {
	}

	public void Button(String b) {
		text("ERROR - CANNOT ATTACK OWN SHIPS");
	}

	public void sameButton() {
		text("ERROR - LOCATION ALREADY ATTACKED");
	}

	public void ButtonO(String b) {
      AIPlayer.createShips();
		GameStart.attackOpponent(b);
      while (Game.playerTurn == false) {
         Game.playerTurn = AIPlayer.attackPlayerShipSmart();}
	}
}
