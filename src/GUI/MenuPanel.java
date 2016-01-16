/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jennie
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
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

        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 255, 254));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Oswald", 1, 100)); // NOI18N
        title.setForeground(new java.awt.Color(70, 118, 139));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Roogle");
        title.setAlignmentX(0.5F);
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title.setIconTextGap(5);
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 300, 120));

        subTitle.setBackground(new java.awt.Color(255, 255, 255));
        subTitle.setFont(new java.awt.Font("Proxima Nova Rg", 1, 36)); // NOI18N
        subTitle.setForeground(new java.awt.Color(224, 102, 102));
        subTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitle.setText("Random Boogle");
        subTitle.setAlignmentX(0.5F);
        subTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subTitle.setIconTextGap(5);
        add(subTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 300, 60));

        startButton.setBackground(new java.awt.Color(70, 118, 139));
        startButton.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        startButton.setForeground(new java.awt.Color(206, 255, 254));
        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setAlignmentX(0.5F);
        startButton.setBorder(null);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setFocusPainted(false);
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setMargin(new java.awt.Insets(2, 14, 15, 14));
        startButton.setMaximumSize(new java.awt.Dimension(150, 50));
        startButton.setMinimumSize(new java.awt.Dimension(150, 50));
        startButton.setPreferredSize(new java.awt.Dimension(150, 50));
        startButton.setRolloverEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        tutorialButton.setBackground(new java.awt.Color(70, 118, 139));
        tutorialButton.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        tutorialButton.setForeground(new java.awt.Color(206, 255, 254));
        tutorialButton.setText("Tutorial");
        tutorialButton.setToolTipText("");
        tutorialButton.setAlignmentX(0.5F);
        tutorialButton.setBorder(null);
        tutorialButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutorialButton.setFocusPainted(false);
        tutorialButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tutorialButton.setMargin(new java.awt.Insets(2, 14, 15, 14));
        tutorialButton.setMaximumSize(new java.awt.Dimension(150, 50));
        tutorialButton.setMinimumSize(new java.awt.Dimension(150, 50));
        tutorialButton.setPreferredSize(new java.awt.Dimension(150, 50));
        tutorialButton.setRolloverEnabled(false);
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });
        add(tutorialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            MyFrame.drawContent(new gamePanel());
        } catch (IOException ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorialButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton startButton;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JButton tutorialButton;
    // End of variables declaration//GEN-END:variables
}
