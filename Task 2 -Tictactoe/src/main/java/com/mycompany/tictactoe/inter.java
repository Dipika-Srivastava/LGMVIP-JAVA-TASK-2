/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ritika
 */
public class inter extends javax.swing.JFrame {

    private String startGame ="X";
    private int xCount  = 0;
    private int oCount = 0;
    
    /**
     * Creates new form inter
     */
    public inter() {
        initComponents();
    }
    private void gameScore()
    {
        xxxplayer.setText(String.valueOf(xCount));
        oooplayer.setText(String.valueOf(oCount));
    }

    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "0";
        }
        else
        {
            startGame = "X";
        }
    }
    private void WinningGame()
    {
        String d1 = txtbtn1.getText();
         String d2 = txtbtn2.getText();
          String d3 = txtbtn3.getText();
           String d4 = txtbtn4.getText();
           String d5 = txtbtn5.getText();
            String d6 = txtbtn6.getText();
             String d7 = txtbtn7.getText();
              String d8 = txtbtn8.getText();
               String d9 = txtbtn9.getText();
               if(d1 == ("X")&& d2 == ("X") && d3 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn2.setBackground(Color.PINK);
                       txtbtn3.setBackground(Color.PINK);
               }
                 if(d4 == ("X")&& d5 == ("X") && d6 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn4.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn6.setBackground(Color.PINK);
               }
                   if(d7 == ("X")&& d8 == ("X") && d9 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn7.setBackground(Color.PINK);
                     txtbtn8.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                     if(d1 == ("X")&& d4 == ("X") && d7 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn4.setBackground(Color.PINK);
                       txtbtn7.setBackground(Color.PINK);
               }
                       if(d2 == ("X")&& d5 == ("X") && d8 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn2.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn8.setBackground(Color.PINK);
               }
                         if(d3 == ("X")&& d6 == ("X") && d9 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn3.setBackground(Color.PINK);
                     txtbtn6.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                           if(d1 == ("X")&& d5 == ("X") && d9 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                 if(d3 == ("X")&& d5 == ("X") && d7 == ("X"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! Xth Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore();
                   txtbtn3.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn7.setBackground(Color.PINK);
               }
                  
                 
                  if(d1 == ("0")&& d2 == ("0") && d3 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn2.setBackground(Color.PINK);
                       txtbtn3.setBackground(Color.PINK);
               }
                 if(d4 == ("0")&& d5 == ("0") && d6 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn4.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn6.setBackground(Color.PINK);
               }
                   if(d7 == ("0")&& d8 == ("0") && d9 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn7.setBackground(Color.PINK);
                     txtbtn8.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                     if(d1 == ("0")&& d4 == ("0") && d7 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn4.setBackground(Color.PINK);
                       txtbtn7.setBackground(Color.PINK);
               }
                       if(d2 == ("0")&& d5 == ("0") && d8 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn2.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn8.setBackground(Color.PINK);
               }
                         if(d3 == ("0")&& d6 == ("0") && d9 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn3.setBackground(Color.PINK);
                     txtbtn6.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                           if(d1 == ("0")&& d5 == ("0") && d9 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn1.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn9.setBackground(Color.PINK);
               }
                 if(d3 == ("0")&& d5 == ("0") && d7 == ("0"))
               {
                   JOptionPane.showMessageDialog(this,"Congrats!! 0th Player Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore();
                   txtbtn3.setBackground(Color.PINK);
                     txtbtn5.setBackground(Color.PINK);
                       txtbtn7.setBackground(Color.PINK);
               }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        othplayer = new javax.swing.JLabel();
        oooplayer = new javax.swing.JLabel();
        xthplayer = new javax.swing.JLabel();
        xxxplayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setText("tic -tac -toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 0, 0));
        txtexit.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(0, 153, 153));
        txtreset.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.black));

        othplayer.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        othplayer.setText("0TH PLAYER :");

        oooplayer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        oooplayer.setForeground(new java.awt.Color(0, 0, 255));
        oooplayer.setText("XXXXXXXXXXXXXXX");

        xthplayer.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        xthplayer.setText("XTH PLAYER :");

        xxxplayer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        xxxplayer.setForeground(new java.awt.Color(0, 0, 255));
        xxxplayer.setText("XXXXXXXXXXXXXXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(othplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(xthplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xxxplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oooplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xthplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xxxplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(othplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oooplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(916, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
         if(JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit","TIC TAC TOE" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
             
                 System.exit(0);
             }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
          txtbtn1.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn1.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn1.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
          txtbtn2.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn2.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn2.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
           txtbtn3.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn3.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn3.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed

        // TODO add your handling code here:
          txtbtn4.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn4.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn4.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
        
        
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
          txtbtn5.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn5.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn5.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
        
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
          txtbtn6.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn6.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn6.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
          txtbtn7.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn7.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn7.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
          txtbtn8.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn8.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn8.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
          txtbtn9.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn9.setForeground(Color.RED);
        
        }
        else
        {
           txtbtn9.setForeground(Color.GREEN);
        }
         choosePlayer();
         WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.YELLOW);
        txtbtn2.setBackground(Color.YELLOW);
        txtbtn3.setBackground(Color.YELLOW);
        txtbtn4.setBackground(Color.YELLOW);
        txtbtn5.setBackground(Color.YELLOW);
        txtbtn6.setBackground(Color.YELLOW);
        txtbtn7.setBackground(Color.YELLOW);
        txtbtn8.setBackground(Color.YELLOW);    
        txtbtn9.setBackground(Color.YELLOW);
             
        
    }//GEN-LAST:event_txtresetActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oooplayer;
    private javax.swing.JLabel othplayer;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    private javax.swing.JLabel xthplayer;
    private javax.swing.JLabel xxxplayer;
    // End of variables declaration//GEN-END:variables
}
