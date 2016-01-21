/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import controller.Main;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jennie
 */
public class gamePanel extends javax.swing.JPanel {
    
    private static int interval = 60;
    private static Timer cdown;
    
    /**
     * Creates new form gamePanel
     */
    public gamePanel() {
        int delay = 1000;
        int period = 1000;
        
        initComponents();
        
        setBoard();
        
        cdown = new Timer();
        cdown.scheduleAtFixedRate(new TimerTask(){
            
            public void run()
            {
                if(setInterval() > 9)
                {
                    timeLimit.setText("00:" + Integer.toString(setInterval()));
                }
                
                else
                {
                    timeLimit.setText("00:0" + Integer.toString(setInterval()));
                }
            }
        }, delay, period);
    }
    
    private static final int setInterval() {
        if (interval == 1)
            cdown.cancel();
        return --interval;
    }
    
    private void setBoard()
    {
        String board = Main.b.getBoard();
        
        letter1.setText(Character.toString(board.charAt(0)));
        letter2.setText(Character.toString(board.charAt(1)));
        letter3.setText(Character.toString(board.charAt(2)));
        letter4.setText(Character.toString(board.charAt(3)));
        letter5.setText(Character.toString(board.charAt(4)));
        letter6.setText(Character.toString(board.charAt(5)));
        letter7.setText(Character.toString(board.charAt(6)));
        letter8.setText(Character.toString(board.charAt(7)));
        letter9.setText(Character.toString(board.charAt(8)));
        letter10.setText(Character.toString(board.charAt(9)));
        letter11.setText(Character.toString(board.charAt(10)));
        letter12.setText(Character.toString(board.charAt(11)));
        letter13.setText(Character.toString(board.charAt(12)));
        letter14.setText(Character.toString(board.charAt(13)));
        letter15.setText(Character.toString(board.charAt(14)));
        letter16.setText(Character.toString(board.charAt(15)));
        
        try {
            MyFrame.drawContent(new gamePanel());
        } catch (IOException ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        timeLimit = new javax.swing.JLabel();
        timeTitle = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        scoreTitle = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();
        letter1 = new javax.swing.JButton();
        letter2 = new javax.swing.JButton();
        letter3 = new javax.swing.JButton();
        letter4 = new javax.swing.JButton();
        letter5 = new javax.swing.JButton();
        letter6 = new javax.swing.JButton();
        letter7 = new javax.swing.JButton();
        letter8 = new javax.swing.JButton();
        letter9 = new javax.swing.JButton();
        letter10 = new javax.swing.JButton();
        letter11 = new javax.swing.JButton();
        letter12 = new javax.swing.JButton();
        letter13 = new javax.swing.JButton();
        letter14 = new javax.swing.JButton();
        letter15 = new javax.swing.JButton();
        letter16 = new javax.swing.JButton();
        userAnswer = new javax.swing.JLabel();
        aiAnswer = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        answerIcon = new javax.swing.JLabel();
        refreshIcon = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 255, 254));
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLimit.setFont(new java.awt.Font("Proxima Nova Rg", 1, 36)); // NOI18N
        timeLimit.setForeground(new java.awt.Color(70, 118, 139));
        timeLimit.setText("60");
        add(timeLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        timeTitle.setFont(new java.awt.Font("Oswald Regular", 1, 30)); // NOI18N
        timeTitle.setText("TIME");
        add(timeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        scoreLabel.setFont(new java.awt.Font("Proxima Nova Rg", 1, 36)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(70, 118, 139));
        scoreLabel.setText("0000");
        add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        scoreTitle.setFont(new java.awt.Font("Oswald Regular", 1, 30)); // NOI18N
        scoreTitle.setText("SCORE");
        add(scoreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        boardPanel.setBackground(new java.awt.Color(206, 255, 254));
        boardPanel.setMaximumSize(new java.awt.Dimension(800, 800));
        boardPanel.setMinimumSize(new java.awt.Dimension(800, 800));
        boardPanel.setPreferredSize(new java.awt.Dimension(800, 800));
        boardPanel.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        letter1.setBackground(new java.awt.Color(252, 241, 209));
        letter1.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter1.setText("letter1");
        letter1.setActionCommand("");
        letter1.setAlignmentX(0.5F);
        letter1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter1.setFocusPainted(false);
        letter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        letter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter1ActionPerformed(evt);
            }
        });
        boardPanel.add(letter1);

        letter2.setBackground(new java.awt.Color(252, 241, 209));
        letter2.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter2.setText("letter2");
        letter2.setActionCommand("");
        letter2.setAlignmentX(0.5F);
        letter2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter2.setFocusPainted(false);
        letter2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter2);

        letter3.setBackground(new java.awt.Color(252, 241, 209));
        letter3.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter3.setText("letter3");
        letter3.setActionCommand("");
        letter3.setAlignmentX(0.5F);
        letter3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter3.setFocusPainted(false);
        letter3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter3);

        letter4.setBackground(new java.awt.Color(252, 241, 209));
        letter4.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter4.setText("letter4");
        letter4.setActionCommand("");
        letter4.setAlignmentX(0.5F);
        letter4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter4.setFocusPainted(false);
        letter4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter4);

        letter5.setBackground(new java.awt.Color(252, 241, 209));
        letter5.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter5.setText("letter5");
        letter5.setActionCommand("");
        letter5.setAlignmentX(0.5F);
        letter5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter5.setFocusPainted(false);
        letter5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        letter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter5ActionPerformed(evt);
            }
        });
        boardPanel.add(letter5);

        letter6.setBackground(new java.awt.Color(252, 241, 209));
        letter6.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter6.setText("letter6");
        letter6.setActionCommand("");
        letter6.setAlignmentX(0.5F);
        letter6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter6.setFocusPainted(false);
        letter6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter6);

        letter7.setBackground(new java.awt.Color(252, 241, 209));
        letter7.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter7.setText("letter7");
        letter7.setActionCommand("");
        letter7.setAlignmentX(0.5F);
        letter7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter7.setFocusPainted(false);
        letter7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        letter7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter7ActionPerformed(evt);
            }
        });
        boardPanel.add(letter7);

        letter8.setBackground(new java.awt.Color(252, 241, 209));
        letter8.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter8.setText("letter8");
        letter8.setActionCommand("");
        letter8.setAlignmentX(0.5F);
        letter8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter8.setFocusPainted(false);
        letter8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter8);

        letter9.setBackground(new java.awt.Color(252, 241, 209));
        letter9.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter9.setText("letter9");
        letter9.setActionCommand("");
        letter9.setAlignmentX(0.5F);
        letter9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter9.setFocusPainted(false);
        letter9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter9);

        letter10.setBackground(new java.awt.Color(252, 241, 209));
        letter10.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter10.setText("letter10");
        letter10.setActionCommand("");
        letter10.setAlignmentX(0.5F);
        letter10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter10.setFocusPainted(false);
        letter10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter10);

        letter11.setBackground(new java.awt.Color(252, 241, 209));
        letter11.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter11.setText("letter11");
        letter11.setActionCommand("");
        letter11.setAlignmentX(0.5F);
        letter11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter11.setFocusPainted(false);
        letter11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter11);

        letter12.setBackground(new java.awt.Color(252, 241, 209));
        letter12.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter12.setText("letter12");
        letter12.setActionCommand("");
        letter12.setAlignmentX(0.5F);
        letter12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter12.setFocusPainted(false);
        letter12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter12);

        letter13.setBackground(new java.awt.Color(252, 241, 209));
        letter13.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter13.setText("letter13");
        letter13.setActionCommand("");
        letter13.setAlignmentX(0.5F);
        letter13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter13.setFocusPainted(false);
        letter13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter13);

        letter14.setBackground(new java.awt.Color(252, 241, 209));
        letter14.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter14.setText("letter14");
        letter14.setActionCommand("");
        letter14.setAlignmentX(0.5F);
        letter14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter14.setFocusPainted(false);
        letter14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter14);

        letter15.setBackground(new java.awt.Color(252, 241, 209));
        letter15.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter15.setText("letter15");
        letter15.setActionCommand("");
        letter15.setAlignmentX(0.5F);
        letter15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter15.setFocusPainted(false);
        letter15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter15);

        letter16.setBackground(new java.awt.Color(252, 241, 209));
        letter16.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        letter16.setText("letter16");
        letter16.setActionCommand("");
        letter16.setAlignmentX(0.5F);
        letter16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 207, 165), 2, true));
        letter16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        letter16.setFocusPainted(false);
        letter16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boardPanel.add(letter16);

        add(boardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 105, 580, 600));

        userAnswer.setBackground(new java.awt.Color(70, 118, 139));
        userAnswer.setFont(new java.awt.Font("Proxima Nova Rg", 1, 40)); // NOI18N
        userAnswer.setForeground(new java.awt.Color(206, 255, 254));
        userAnswer.setText("userAnswer");
        userAnswer.setMaximumSize(new java.awt.Dimension(360, 50));
        userAnswer.setMinimumSize(new java.awt.Dimension(360, 50));
        userAnswer.setOpaque(true);
        userAnswer.setPreferredSize(new java.awt.Dimension(360, 50));
        add(userAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 740, 360, -1));

        aiAnswer.setBackground(new java.awt.Color(255, 255, 255));
        aiAnswer.setFont(new java.awt.Font("Proxima Nova Rg", 1, 40)); // NOI18N
        aiAnswer.setForeground(new java.awt.Color(70, 118, 139));
        aiAnswer.setText("aiAnswer");
        aiAnswer.setMaximumSize(new java.awt.Dimension(178, 50));
        aiAnswer.setMinimumSize(new java.awt.Dimension(178, 50));
        aiAnswer.setPreferredSize(new java.awt.Dimension(178, 50));
        add(aiAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 810, 360, -1));

        submitButton.setBackground(new java.awt.Color(70, 118, 139));
        submitButton.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        submitButton.setForeground(new java.awt.Color(206, 255, 254));
        submitButton.setText("Submit");
        submitButton.setToolTipText("");
        submitButton.setAlignmentX(0.5F);
        submitButton.setBorder(null);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setFocusPainted(false);
        submitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submitButton.setMargin(new java.awt.Insets(2, 14, 15, 14));
        submitButton.setMaximumSize(new java.awt.Dimension(150, 50));
        submitButton.setMinimumSize(new java.awt.Dimension(150, 50));
        submitButton.setPreferredSize(new java.awt.Dimension(150, 50));
        submitButton.setRolloverEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, -1, -1));

        answerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/yes.png"))); // NOI18N
        add(answerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 740, -1, -1));

        refreshIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/loading.png"))); // NOI18N
        refreshIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshIconMouseClicked(evt);
            }
        });
        add(refreshIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 740, -1, -1));

        nextButton.setBackground(new java.awt.Color(70, 118, 139));
        nextButton.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        nextButton.setForeground(new java.awt.Color(206, 255, 254));
        nextButton.setText("Next");
        nextButton.setToolTipText("");
        nextButton.setAlignmentX(0.5F);
        nextButton.setBorder(null);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.setFocusPainted(false);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setMargin(new java.awt.Insets(2, 14, 15, 14));
        nextButton.setMaximumSize(new java.awt.Dimension(150, 50));
        nextButton.setMinimumSize(new java.awt.Dimension(150, 50));
        nextButton.setPreferredSize(new java.awt.Dimension(150, 50));
        nextButton.setRolloverEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 810, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void letter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter1ActionPerformed

    private void letter7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter7ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

    }//GEN-LAST:event_submitButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void refreshIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIconMouseClicked
        answerIcon.setIcon(null);
        userAnswer.setText("");
        this.revalidate();
    }//GEN-LAST:event_refreshIconMouseClicked

    private void letter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter5ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aiAnswer;
    private javax.swing.JLabel answerIcon;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JButton letter1;
    private javax.swing.JButton letter10;
    private javax.swing.JButton letter11;
    private javax.swing.JButton letter12;
    private javax.swing.JButton letter13;
    private javax.swing.JButton letter14;
    private javax.swing.JButton letter15;
    private javax.swing.JButton letter16;
    private javax.swing.JButton letter2;
    private javax.swing.JButton letter3;
    private javax.swing.JButton letter4;
    private javax.swing.JButton letter5;
    private javax.swing.JButton letter6;
    private javax.swing.JButton letter7;
    private javax.swing.JButton letter8;
    private javax.swing.JButton letter9;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel refreshIcon;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreTitle;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel timeLimit;
    private javax.swing.JLabel timeTitle;
    private javax.swing.JLabel userAnswer;
    // End of variables declaration//GEN-END:variables
}
