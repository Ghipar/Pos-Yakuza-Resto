
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

//import jaco.mp3.player.MP3Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghifa
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    //FirstPage fp = new FirstPage();
    //MP3Player player;
    public Login() {
        initComponents();
        setTitle("Form Login Cashier");
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 255, 255));
        //hra();%
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));
        //jButton1.setBorder(new );

    }

    public void hra() {
        id.setBorder(new EmptyBorder(20, 3, 10, 3));
    }

    ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new TextField2();
        pass = new PasswordField();
        id = new TextField();
        eye = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 820));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Segoe Print", 0, 22)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 330, 70));

        pass.setFont(new java.awt.Font("Segoe Print", 0, 22)); // NOI18N
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 330, 70));

        id.setFont(new java.awt.Font("Segoe Print", 0, 22)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 160, 70));

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/tutu2.png"))); // NOI18N
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eyeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eyeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eyeMousePressed(evt);
            }
        });
        getContentPane().add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 560, 40, 20));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 20, -1, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/yu.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 650, 210, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/Login5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            pass.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            id.requestFocus();
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //jButton1.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            username.requestFocus();
        }
    }//GEN-LAST:event_passKeyPressed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            username.requestFocus();
        }
    }//GEN-LAST:event_idKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(35);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
        // TODO add your handling code here:

        pass.setEchoChar('*');

    }//GEN-LAST:event_eyeMouseClicked

    private void eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMousePressed
        // TODO add your handling code here:
        pass.setEchoChar((char) 0);


    }//GEN-LAST:event_eyeMousePressed

    private void eyeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseEntered
        // TODO add your handling code here:
        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/cxz.png")));
    }//GEN-LAST:event_eyeMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(153, 153, 153));

    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
       jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/tyty.png"))); 
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/yu.png"))); 
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String Username = username.getText();
        String password = pass.getText();
        String ID = id.getText();

        try {
            String sql = "select * from kasir where ID_Kasir = '" + ID + "'";
            Connection connection = Config.configDB();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            //String url = "src\\\\sound\\\\Project1.mp3";
            //player = new MP3Player(new File(url));

            if (rs.next()) {

                if (ID.equalsIgnoreCase(rs.getString("ID_Kasir")) && Username.equalsIgnoreCase(rs.getString("username"))
                        && password.equalsIgnoreCase(rs.getString("password"))) {

                    JOptionPane.showMessageDialog(this, "Berhasil Login\nSelamat Bekerja " , "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    new FirstPage().setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(this, "Id, username dan password salah", "Error", JOptionPane.WARNING_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(this, "Id, username dan Password Salah", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);

        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void eyeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseExited
        // TODO add your handling code here:
        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/tutu2.png")));
    }//GEN-LAST:event_eyeMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eye;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
