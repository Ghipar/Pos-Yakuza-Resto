
import java.sql.Connection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghifa
 */
public class Ristok extends javax.swing.JFrame {

    /**
     * Creates new form Ristok
     */
    public Ristok() {
        initComponents();
        liste();
    }

    private void re() {
        //menu1
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 01";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok1.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu2
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 02";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok2.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu3
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 03";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok3.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
         //menu4
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 04";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok4.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
         //menu5
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 09";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok5.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu6
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 06";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok6.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu7
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 07";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok7.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu8
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 08";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok8.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu9
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 05";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok9.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu10
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = 10";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                FirstPage.stok10.setText(res.getString("Stok"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void liste() {
        try {
            String sql = "SELECT * FROM menu ";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                jComboBox1.addItem(res.getString("Nama"));

            }
        } catch (Exception e) {
            System.out.println(e);

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

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {} ));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Re Stok");

        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("New Stok :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            //JOptionPane.showMessageDialog(this, "Succes");
            String sql = "UPDATE `menu` SET `Stok`= '" + jTextField1.getText() + "' WHERE Nama = '" + jComboBox1.getSelectedItem() + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
        re();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ristok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ristok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ristok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ristok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ristok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
