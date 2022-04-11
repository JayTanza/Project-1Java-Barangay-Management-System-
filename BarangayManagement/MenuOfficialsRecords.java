/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayManagement;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.mysql.jdbc.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
/**
 *
 * @author Jay Tanza
 */
public class MenuOfficialsRecords extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu1
     */
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String imgPath = null;
    
    public MenuOfficialsRecords() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
//    static
//    {
//      File file = new File("");
//    }
//    ////////////////////////////////////START CAMERA CODE////////////////////////////////////////////
//    private DaemonThread myThread = null;
//    private VideoCapture webSource = null;
//    private final Mat frame = new Mat(1000, 1000, 1);
//    private final MatOfByte mem = new MatOfByte();
//    private class DaemonThread implements Runnable {
//        protected volatile boolean runnable = false;
//        private JLabel jLabelProfileImage;
//        public DaemonThread(JLabel displayLabel) {
//            this.jLabelProfileImage = displayLabel;
//        }
//        @Override
//        public void run() {
//            synchronized (this) {
//                while (runnable) {
//                    if (webSource.grab()) {
//                        try {
//                            webSource.retrieve(frame);
//                            Highgui.imencode(".bmp", frame, mem);
//                            Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
//
//                            BufferedImage buff = (BufferedImage) im;
//                            Graphics g = jLabelProfileImage.getGraphics();
//
//                            if (g.drawImage(buff, 1, 1, jLabelProfileImage.getWidth(), jLabelProfileImage.getHeight(), null)) {
//                                if (runnable == false) {
//                                    this.wait();
//                                }
//                            }
//                        } catch (Exception e) {
//                        }
//                    }
//                }
//            }
//        }
//    }
///////////////////////////////////END CAMERA CODE/////////////////////////////////////////////


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel42 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(995, 692));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel42.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/ahong cover2.jpg"))); // NOI18N
        jPanel42.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -3, 990, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        BufferedImage img = null;

            ImageIcon picture = new ImageIcon("src/Images2/ahong2.jpg");
            Image image1 = picture.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(image1));
        
        
    }//GEN-LAST:event_jRadioButton6ActionPerformed
    public void slideshow()
    {
      
    }
//    public ImageIcon ResizeImage(String imgPath){
//        ImageIcon MyImage = new ImageIcon(imgPath);
//        Image img = MyImage.getImage();
//        Image newImage = img.getScaledInstance(jLabelProfileImage3.getWidth(), jLabelProfileImage3.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImage);
//        return image;
//        }     
//    private void stopWebCamera()
//    {
//       if(myThread != null)
//       {
//         if(myThread.runnable == true)
//         {
//            myThread.runnable = false;
//            webSource.release();
//         }
//       }
//    }
    //    private static File get_image_file;
//    private static final SecureRandom RAND = new SecureRandom();
//    private static String IMAGE_FILE_NAME = null;
//    
//    private void setWebCamCapturedImageOnLabel(JLabel image)
//    {
//       try
//       {
//         stopWebCamera();
//         if(get_image_file != null)
//         {
//           ImageIcon imageIcon = new ImageIcon(new ImageIcon(IMAGE_FILE_NAME).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
//           image.setIcon(imageIcon);
//         }
//         
//       }catch(Exception e)
//       {
//         JOptionPane.showMessageDialog(null, e, "Warning", 0);
//       }
//    }
    /**public void showTable() 
    {
       String registerUserQuery = "SELECT * FROM residentaccountinfo";
       try {
        ps = MyConnection.getConnection().prepareStatement(registerUserQuery);
        rs = ps.executeQuery();
       jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
       }catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, ex);
                }
    }**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    private Icon ResizeImage(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private BufferedImage resize(BufferedImage bi, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
}