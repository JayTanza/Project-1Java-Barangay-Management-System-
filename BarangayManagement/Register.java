/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayManagement;

import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Image;
/**
 *
 * @author Jay Tanza
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String UserName = "";
    String Position  = "";
    String reportGetID = "";
    String reportGetID2 = "";
    String imgPath = null;
    public Register() {
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

        jPanel42 = new javax.swing.JPanel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonResidentLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Username.setBackground(new java.awt.Color(31, 36, 42));
        jTextField_Username.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        jPanel42.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 280, 40));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(169, 224, 49));
        jLabel11.setText("Create New User");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel42.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 130, 20));

        jPasswordField_Password.setBackground(new java.awt.Color(31, 36, 42));
        jPasswordField_Password.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));
        jPasswordField_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusLost(evt);
            }
        });
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });
        jPanel42.add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 280, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(169, 224, 49));
        jLabel12.setText("User Name");
        jPanel42.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel13.setText("Password");
        jPanel42.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, 20));

        CheckBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(169, 224, 49));
        CheckBox.setText("See Password");
        CheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49), 2));
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        jPanel42.add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, 20));

        jButton5.setBackground(new java.awt.Color(169, 224, 49));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(21, 25, 28));
        jButton5.setText("RESIDENT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel42.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(169, 224, 49));
        jLabel14.setText("Forgot Password?");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel42.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 130, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Lock_35px.png"))); // NOI18N
        jPanel42.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 40, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Shield_100px.png"))); // NOI18N
        jPanel42.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Male_User_35px.png"))); // NOI18N
        jPanel42.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 40, 40));

        jButtonResidentLogin.setBackground(new java.awt.Color(169, 224, 49));
        jButtonResidentLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonResidentLogin.setForeground(new java.awt.Color(21, 25, 28));
        jButtonResidentLogin.setText("Sign In");
        jButtonResidentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResidentLoginActionPerformed(evt);
            }
        });
        jPanel42.add(jButtonResidentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        // TODO add your handling code here:
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            // change the text field color to black
            jTextField_Username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        // TODO add your handling code here:
        if(jTextField_Username.getText().trim().equals("") ||
            jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("Username");
            jTextField_Username.setForeground(new Color(155,153,153));
        }
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        //jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPasswordField_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusGained
        // TODO add your handling code here:
        String password = String.valueOf(jPasswordField_Password.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            jPasswordField_Password.setText("");
            jPasswordField_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_PasswordFocusGained

    private void jPasswordField_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(jPasswordField_Password.getPassword());
        if(password.trim().equals("") ||
            password.trim().toLowerCase().equals("password"))
        {
            jPasswordField_Password.setText("Password");
            jPasswordField_Password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_PasswordFocusLost

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:
        if(CheckBox.isSelected())
        {
            jPasswordField_Password.setEchoChar((char)0);
        }
        else
        {
            jPasswordField_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        //jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButtonResidentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResidentLoginActionPerformed
        // TODO add your handling code here:
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField_Password.getPassword());

        String query = "SELECT `Firstname`,`Middlename`,`Lastname`,`Birthdate`,`Age`,`Address`,`Gender`,`profilepic`,`Phonenumber`,`ResidentID`  FROM `residentaccountinfo` WHERE `Firstname` = ? AND `Phonenumber` = ?";

        try
        {
            pst = (PreparedStatement) MyConnection.getConnection().prepareStatement(query);

            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if(rs.next())
            {
                //InputStream img = new FileInputStream(new File(imgPath));
                //show a new form
                UserName = (rs.getString("Firstname"));

                Dashboard form = new Dashboard();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                form.Displayname2.setText(rs.getString(1));
                form.Middlename.setText(rs.getString("Middlename"));
                form.Lastname.setText(rs.getString("Lastname"));
                form.DOB.setText(rs.getString("Birthdate"));
                form.Age.setText(rs.getString("Age"));
                form.Address.setText(rs.getString("Address"));
                form.ID.setText(rs.getString("ResidentID"));
                form.Gender.setText(rs.getString("Gender"));
                form.Phonenumber.setText(rs.getString("Phonenumber"));
                //form.jLabel_Image.setIcon(rs.getImage("profilepic"));
                
                //pst.setBlob(9,img);
                
                byte[] img = rs.getBytes("profilepic");
                ImageIcon image = new ImageIcon(img);
                
               Image im = image.getImage();
               Image myimg = im.getScaledInstance(form.jLabel_Image.getWidth(), form.jLabel_Image.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon newImage = new ImageIcon(myimg);
               form.jLabel_Image.setIcon(newImage);
//               
               //form.jLabelProfileImage.setIcon(rs.getImage("profilepic"));
                //close the current form(login form)
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome! Resident,"+UserName);    
            }
            else
            {
                //error message
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonResidentLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonResidentLogin;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
