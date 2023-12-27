
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
//import java.io.FileInputStream;
//import java.io.InputStream;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghifa
 */
public class FirstPage extends javax.swing.JFrame {

    SecondPage p2 = new SecondPage();

    //Login log = new Login();
    /**
     * Creates new form FirstPage
     */
    //String nama;
    Icon icon = new javax.swing.ImageIcon("src\\IniGmbr\\cen.png");

    public FirstPage() {
        initComponents();
        setTitle("Detail Pesanan");
        setLocationRelativeTo(null);
        log();
        stok();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        liste();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

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

    private void log() {
        try {
            String sql = "SELECT * FROM kasir where ID_Kasir = '" + Login.id.getText() + "' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                lol.setText("You Login As " + res.getString("Nama"));
            }
        } catch (Exception e) {
            System.out.println("Kosong");
        }
    }

    public void stok() {
        //menu1
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '01' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok1.setText(res.getString("Stok"));
                Harga1.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu2
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '02' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok2.setText(res.getString("Stok"));
                Harga2.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu3
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '03' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                
                stok3.setText(res.getString("Stok"));
                Harga3.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu4
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '04' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok4.setText(res.getString("Stok"));
                Harga4.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu5
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '09' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok5.setText(res.getString("Stok"));
                Harga5.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu6
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '06' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok6.setText(res.getString("Stok"));
                Harga6.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu7
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '07' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok7.setText(res.getString("Stok"));
                Harga7.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu8
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '08' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok8.setText(res.getString("Stok"));
                Harga8.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu9
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '05' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok9.setText(res.getString("Stok"));
                Harga9.setText(res.getString("Harga"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu10
        try {
            String sql = "SELECT * FROM menu where Kode_Menu = '10' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                stok10.setText(res.getString("Stok"));
                Harga10.setText(res.getString("Harga"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        pl11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        Caviar = new javax.swing.JLabel();
        Rp1 = new javax.swing.JLabel();
        Harga1 = new javax.swing.JLabel();
        Stk = new javax.swing.JLabel();
        stok1 = new javax.swing.JLabel();
        Res1 = new javax.swing.JButton();
        cav = new javax.swing.JLabel();
        pl12 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        Sandwich = new javax.swing.JLabel();
        Rp2 = new javax.swing.JLabel();
        Harga2 = new javax.swing.JLabel();
        Stk1 = new javax.swing.JLabel();
        stok2 = new javax.swing.JLabel();
        Res2 = new javax.swing.JButton();
        Sand = new javax.swing.JLabel();
        pl13 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        FF = new javax.swing.JLabel();
        Rp3 = new javax.swing.JLabel();
        Harga3 = new javax.swing.JLabel();
        Stk2 = new javax.swing.JLabel();
        stok3 = new javax.swing.JLabel();
        Res3 = new javax.swing.JButton();
        ff = new javax.swing.JLabel();
        pl14 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        Fried = new javax.swing.JLabel();
        Rp4 = new javax.swing.JLabel();
        Harga4 = new javax.swing.JLabel();
        Stk3 = new javax.swing.JLabel();
        stok4 = new javax.swing.JLabel();
        Res4 = new javax.swing.JButton();
        FR = new javax.swing.JLabel();
        pl15 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        Milkshake = new javax.swing.JLabel();
        Rp5 = new javax.swing.JLabel();
        Harga5 = new javax.swing.JLabel();
        Stk4 = new javax.swing.JLabel();
        stok5 = new javax.swing.JLabel();
        Res5 = new javax.swing.JButton();
        pza = new javax.swing.JLabel();
        lol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stoke = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        apli = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        riw = new javax.swing.JLabel();
        ker = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pl16 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        Caviar3 = new javax.swing.JLabel();
        Rp6 = new javax.swing.JLabel();
        Harga6 = new javax.swing.JLabel();
        Stk5 = new javax.swing.JLabel();
        stok6 = new javax.swing.JLabel();
        Res6 = new javax.swing.JButton();
        lmo = new javax.swing.JLabel();
        pl17 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        Caviar4 = new javax.swing.JLabel();
        Rp7 = new javax.swing.JLabel();
        Harga7 = new javax.swing.JLabel();
        Stk6 = new javax.swing.JLabel();
        stok7 = new javax.swing.JLabel();
        Res7 = new javax.swing.JButton();
        CFE = new javax.swing.JLabel();
        pl18 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        Caviar5 = new javax.swing.JLabel();
        Rp8 = new javax.swing.JLabel();
        Harga8 = new javax.swing.JLabel();
        Stk7 = new javax.swing.JLabel();
        stok8 = new javax.swing.JLabel();
        Res8 = new javax.swing.JButton();
        TIE = new javax.swing.JLabel();
        pl19 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        Pizza = new javax.swing.JLabel();
        Rp9 = new javax.swing.JLabel();
        Harga9 = new javax.swing.JLabel();
        Stk8 = new javax.swing.JLabel();
        stok9 = new javax.swing.JLabel();
        Res9 = new javax.swing.JButton();
        MILK = new javax.swing.JLabel();
        pl20 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        Caviar7 = new javax.swing.JLabel();
        Rp10 = new javax.swing.JLabel();
        Harga10 = new javax.swing.JLabel();
        Stk9 = new javax.swing.JLabel();
        stok10 = new javax.swing.JLabel();
        Res10 = new javax.swing.JButton();
        SODA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lougt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1059, 820));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl11MouseExited(evt);
            }
        });
        jPanel2.add(pl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 100));

        jSpinner1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, 40));

        Caviar.setBackground(new java.awt.Color(255, 255, 255));
        Caviar.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Caviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Caviar.setText(" Caviar");
        Caviar.setAutoscrolls(true);
        Caviar.setOpaque(true);
        jPanel2.add(Caviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        Rp1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp1.setForeground(new java.awt.Color(255, 255, 255));
        Rp1.setText("Rp");
        jPanel2.add(Rp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 30, -1));

        Harga1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga1.setForeground(new java.awt.Color(255, 255, 255));
        Harga1.setText("-----------");
        jPanel2.add(Harga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, -1));

        Stk.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk.setForeground(new java.awt.Color(255, 255, 255));
        Stk.setText("Stok :");
        jPanel2.add(Stk, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 60, -1));

        stok1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok1.setForeground(new java.awt.Color(255, 255, 255));
        stok1.setText("----------");
        jPanel2.add(stok1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, -1));

        Res1.setBackground(new java.awt.Color(255, 255, 204));
        Res1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res1.setText("Reset");
        Res1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res1ActionPerformed(evt);
            }
        });
        jPanel2.add(Res1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 80, 30));

        cav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/caviar2.png"))); // NOI18N
        jPanel2.add(cav, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 300, 360));

        pl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl12MouseExited(evt);
            }
        });
        jPanel2.add(pl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 100));

        jSpinner2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 60, 40));

        Sandwich.setBackground(new java.awt.Color(255, 255, 255));
        Sandwich.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Sandwich.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sandwich.setText(" Sandwich");
        Sandwich.setOpaque(true);
        jPanel2.add(Sandwich, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 190, -1));

        Rp2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp2.setForeground(new java.awt.Color(255, 255, 255));
        Rp2.setText("Rp");
        jPanel2.add(Rp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        Harga2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga2.setForeground(new java.awt.Color(255, 255, 255));
        Harga2.setText("-----------");
        jPanel2.add(Harga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        Stk1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk1.setForeground(new java.awt.Color(255, 255, 255));
        Stk1.setText("Stok :");
        jPanel2.add(Stk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        stok2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok2.setForeground(new java.awt.Color(255, 255, 255));
        stok2.setText("----------");
        jPanel2.add(stok2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        Res2.setBackground(new java.awt.Color(255, 255, 204));
        Res2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res2.setText("Reset");
        Res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res2ActionPerformed(evt);
            }
        });
        jPanel2.add(Res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 80, 30));

        Sand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/sand.png"))); // NOI18N
        jPanel2.add(Sand, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 340));

        pl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl13MouseExited(evt);
            }
        });
        jPanel2.add(pl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 100, 100));

        jSpinner3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 70, 40));

        FF.setBackground(new java.awt.Color(255, 255, 255));
        FF.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        FF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FF.setText(" French Fries");
        FF.setOpaque(true);
        jPanel2.add(FF, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 230, -1));

        Rp3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Rp3.setForeground(new java.awt.Color(255, 255, 255));
        Rp3.setText("Rp");
        jPanel2.add(Rp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));

        Harga3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Harga3.setForeground(new java.awt.Color(255, 255, 255));
        Harga3.setText("-----------");
        jPanel2.add(Harga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        Stk2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Stk2.setForeground(new java.awt.Color(255, 255, 255));
        Stk2.setText("Stok :");
        jPanel2.add(Stk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        stok3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        stok3.setForeground(new java.awt.Color(255, 255, 255));
        stok3.setText("----------");
        jPanel2.add(stok3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 70, -1));

        Res3.setBackground(new java.awt.Color(255, 255, 204));
        Res3.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res3.setText("Reset");
        Res3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res3ActionPerformed(evt);
            }
        });
        jPanel2.add(Res3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 80, 30));

        ff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/ff.png"))); // NOI18N
        jPanel2.add(ff, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 340));

        pl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl14MouseExited(evt);
            }
        });
        jPanel2.add(pl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, 100));

        jSpinner4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 70, 40));

        Fried.setBackground(new java.awt.Color(255, 255, 255));
        Fried.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Fried.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fried.setText(" Fried Rice");
        Fried.setOpaque(true);
        jPanel2.add(Fried, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 210, -1));

        Rp4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp4.setForeground(new java.awt.Color(255, 255, 255));
        Rp4.setText("Rp");
        jPanel2.add(Rp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        Harga4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga4.setForeground(new java.awt.Color(255, 255, 255));
        Harga4.setText("-----------");
        jPanel2.add(Harga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        Stk3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk3.setForeground(new java.awt.Color(255, 255, 255));
        Stk3.setText("Stok :");
        jPanel2.add(Stk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        stok4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok4.setForeground(new java.awt.Color(255, 255, 255));
        stok4.setText("----------");
        jPanel2.add(stok4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 70, -1));

        Res4.setBackground(new java.awt.Color(255, 255, 204));
        Res4.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res4.setText("Reset");
        Res4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res4ActionPerformed(evt);
            }
        });
        jPanel2.add(Res4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 80, -1));

        FR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/FR.png"))); // NOI18N
        jPanel2.add(FR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 360));

        pl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl15MouseExited(evt);
            }
        });
        jPanel2.add(pl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 100, 100));

        jSpinner5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 70, 40));

        Milkshake.setBackground(new java.awt.Color(255, 255, 255));
        Milkshake.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Milkshake.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Milkshake.setText(" Pizza");
        Milkshake.setAutoscrolls(true);
        Milkshake.setOpaque(true);
        jPanel2.add(Milkshake, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, -1));

        Rp5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp5.setForeground(new java.awt.Color(255, 255, 255));
        Rp5.setText("Rp");
        jPanel2.add(Rp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        Harga5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga5.setForeground(new java.awt.Color(255, 255, 255));
        Harga5.setText("-----------");
        jPanel2.add(Harga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        Stk4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk4.setForeground(new java.awt.Color(255, 255, 255));
        Stk4.setText("Stok :");
        jPanel2.add(Stk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        stok5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok5.setForeground(new java.awt.Color(255, 255, 255));
        stok5.setText("----------");
        jPanel2.add(stok5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 70, -1));

        Res5.setBackground(new java.awt.Color(255, 255, 204));
        Res5.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res5.setText("Reset");
        Res5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res5ActionPerformed(evt);
            }
        });
        jPanel2.add(Res5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 80, -1));

        pza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pz.png"))); // NOI18N
        jPanel2.add(pza, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 360));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 1160, 310));

        lol.setBackground(new java.awt.Color(153, 255, 204));
        lol.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        lol.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(lol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 560, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("New Stok");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 240, -1, -1));

        stoke.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        getContentPane().add(stoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 310, 240, 50));

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 26)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 390, 170, -1));

        apli.setBackground(new java.awt.Color(255, 255, 204));
        apli.setFont(new java.awt.Font("Serif", 1, 26)); // NOI18N
        apli.setText("Apply");
        apli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apliActionPerformed(evt);
            }
        });
        getContentPane().add(apli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 490, 130, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("X");
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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("-");
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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 10, -1, 40));

        riw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/riwtran4.png"))); // NOI18N
        riw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                riwMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                riwMouseExited(evt);
            }
        });
        getContentPane().add(riw, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, -1, -1));

        ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/kertran.png"))); // NOI18N
        ker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kerMouseExited(evt);
            }
        });
        getContentPane().add(ker, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Minuman");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl16MouseExited(evt);
            }
        });
        jPanel1.add(pl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 100));

        jSpinner6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 70, 40));

        Caviar3.setBackground(new java.awt.Color(255, 255, 255));
        Caviar3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Caviar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Caviar3.setText(" Lemon Tea");
        Caviar3.setAutoscrolls(true);
        Caviar3.setOpaque(true);
        jPanel1.add(Caviar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 220, 40));

        Rp6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp6.setForeground(new java.awt.Color(255, 255, 255));
        Rp6.setText("Rp");
        jPanel1.add(Rp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Harga6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga6.setForeground(new java.awt.Color(255, 255, 255));
        Harga6.setText("-----------");
        jPanel1.add(Harga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        Stk5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk5.setForeground(new java.awt.Color(255, 255, 255));
        Stk5.setText("Stok :");
        jPanel1.add(Stk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        stok6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok6.setForeground(new java.awt.Color(255, 255, 255));
        stok6.setText("----------");
        jPanel1.add(stok6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        Res6.setBackground(new java.awt.Color(255, 255, 204));
        Res6.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res6.setText("Reset");
        Res6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res6ActionPerformed(evt);
            }
        });
        jPanel1.add(Res6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 80, -1));

        lmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/lmon.png"))); // NOI18N
        jPanel1.add(lmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 320));

        pl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl17MouseExited(evt);
            }
        });
        jPanel1.add(pl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 100));

        jSpinner7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, 40));

        Caviar4.setBackground(new java.awt.Color(255, 255, 255));
        Caviar4.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Caviar4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Caviar4.setText(" Coffe");
        Caviar4.setAutoscrolls(true);
        Caviar4.setOpaque(true);
        jPanel1.add(Caviar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 180, -1));

        Rp7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp7.setForeground(new java.awt.Color(255, 255, 255));
        Rp7.setText("Rp");
        jPanel1.add(Rp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        Harga7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga7.setForeground(new java.awt.Color(255, 255, 255));
        Harga7.setText("-----------");
        jPanel1.add(Harga7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        Stk6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk6.setForeground(new java.awt.Color(255, 255, 255));
        Stk6.setText("Stok :");
        jPanel1.add(Stk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        stok7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok7.setForeground(new java.awt.Color(255, 255, 255));
        stok7.setText("----------");
        jPanel1.add(stok7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        Res7.setBackground(new java.awt.Color(255, 255, 204));
        Res7.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res7.setText("Reset");
        Res7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res7ActionPerformed(evt);
            }
        });
        jPanel1.add(Res7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 80, -1));

        CFE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/CFEE.png"))); // NOI18N
        jPanel1.add(CFE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 340));

        pl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl18MouseExited(evt);
            }
        });
        jPanel1.add(pl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 100, 100));

        jSpinner8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 70, 40));

        Caviar5.setBackground(new java.awt.Color(255, 255, 255));
        Caviar5.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Caviar5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Caviar5.setText(" Tea");
        Caviar5.setAutoscrolls(true);
        Caviar5.setOpaque(true);
        jPanel1.add(Caviar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 170, 40));

        Rp8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp8.setForeground(new java.awt.Color(255, 255, 255));
        Rp8.setText("Rp");
        jPanel1.add(Rp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        Harga8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga8.setForeground(new java.awt.Color(255, 255, 255));
        Harga8.setText("-----------");
        jPanel1.add(Harga8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        Stk7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk7.setForeground(new java.awt.Color(255, 255, 255));
        Stk7.setText("Stok :");
        jPanel1.add(Stk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));

        stok8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok8.setForeground(new java.awt.Color(255, 255, 255));
        stok8.setText("----------");
        jPanel1.add(stok8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, -1, -1));

        Res8.setBackground(new java.awt.Color(255, 255, 204));
        Res8.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res8.setText("Reset");
        Res8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res8ActionPerformed(evt);
            }
        });
        jPanel1.add(Res8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 80, -1));

        TIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/TI.png"))); // NOI18N
        jPanel1.add(TIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, -10, -1, 360));

        pl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl19MouseExited(evt);
            }
        });
        jPanel1.add(pl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 100));

        jSpinner9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 60, 40));

        Pizza.setBackground(new java.awt.Color(255, 255, 255));
        Pizza.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Pizza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pizza.setText(" Milkshake");
        Pizza.setAutoscrolls(true);
        Pizza.setOpaque(true);
        jPanel1.add(Pizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 220, 40));

        Rp9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp9.setForeground(new java.awt.Color(255, 255, 255));
        Rp9.setText("Rp");
        jPanel1.add(Rp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        Harga9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga9.setForeground(new java.awt.Color(255, 255, 255));
        Harga9.setText("-----------");
        jPanel1.add(Harga9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        Stk8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk8.setForeground(new java.awt.Color(255, 255, 255));
        Stk8.setText("Stok :");
        jPanel1.add(Stk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        stok9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok9.setForeground(new java.awt.Color(255, 255, 255));
        stok9.setText("----------");
        jPanel1.add(stok9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        Res9.setBackground(new java.awt.Color(255, 255, 204));
        Res9.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res9.setText("Reset");
        Res9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res9ActionPerformed(evt);
            }
        });
        jPanel1.add(Res9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 80, -1));

        MILK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/MLK.png"))); // NOI18N
        jPanel1.add(MILK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 340));

        pl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png"))); // NOI18N
        pl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pl20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pl20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pl20MouseExited(evt);
            }
        });
        jPanel1.add(pl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 100, 100));

        jSpinner10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 70, 40));

        Caviar7.setBackground(new java.awt.Color(255, 255, 255));
        Caviar7.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Caviar7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Caviar7.setText(" Soda");
        Caviar7.setAutoscrolls(true);
        Caviar7.setOpaque(true);
        jPanel1.add(Caviar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 180, -1));

        Rp10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Rp10.setForeground(new java.awt.Color(255, 255, 255));
        Rp10.setText("Rp");
        jPanel1.add(Rp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        Harga10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Harga10.setForeground(new java.awt.Color(255, 255, 255));
        Harga10.setText("-----------");
        jPanel1.add(Harga10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        Stk9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Stk9.setForeground(new java.awt.Color(255, 255, 255));
        Stk9.setText("Stok :");
        jPanel1.add(Stk9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, -1, -1));

        stok10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        stok10.setForeground(new java.awt.Color(255, 255, 255));
        stok10.setText("----------");
        jPanel1.add(stok10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, -1, -1));

        Res10.setBackground(new java.awt.Color(255, 255, 204));
        Res10.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        Res10.setText("Reset");
        Res10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Res10ActionPerformed(evt);
            }
        });
        jPanel1.add(Res10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 80, 30));

        SODA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/SODA.png"))); // NOI18N
        jPanel1.add(SODA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, 380));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 1160, 300));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Makanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 590, 60));

        Lougt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lougt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/lotran.png"))); // NOI18N
        Lougt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LougtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LougtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LougtMouseExited(evt);
            }
        });
        getContentPane().add(Lougt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 120));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/fp.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1080, 820));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(25);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void Res1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset caviar succes");
        SecondPage.men.setText("Menu 1");
        jSpinner1.setValue(1);
    }//GEN-LAST:event_Res1ActionPerformed

    private void Res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset sandwich succes");
        SecondPage.men2.setText("Menu 2");
        jSpinner2.setValue(1);
    }//GEN-LAST:event_Res2ActionPerformed

    private void Res3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset french fries succes");
        SecondPage.men3.setText("Menu 3");
        jSpinner3.setValue(1);
    }//GEN-LAST:event_Res3ActionPerformed

    private void Res4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset fried rice succes");
        SecondPage.men4.setText("Menu 4");
        jSpinner4.setValue(1);
    }//GEN-LAST:event_Res4ActionPerformed

    private void Res5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset pizza succes");
        SecondPage.men5.setText("Menu 5");
        jSpinner5.setValue(1);
    }//GEN-LAST:event_Res5ActionPerformed

    private void Res6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset lemon tea succes");
        SecondPage.men6.setText("Menu 6");
        jSpinner6.setValue(1);
    }//GEN-LAST:event_Res6ActionPerformed

    private void Res7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset coffe succes");
        SecondPage.men7.setText("Menu 7");
        jSpinner7.setValue(1);
    }//GEN-LAST:event_Res7ActionPerformed

    private void Res8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset tea succes");
        SecondPage.men8.setText("Menu 8");
        jSpinner8.setValue(1);
    }//GEN-LAST:event_Res8ActionPerformed

    private void Res9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset milkshake succes");
        SecondPage.men9.setText("Menu 9");
        jSpinner9.setValue(1);
    }//GEN-LAST:event_Res9ActionPerformed

    private void Res10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Res10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reset soda succes");
        SecondPage.men10.setText("Menu 10");
        jSpinner10.setValue(1);
    }//GEN-LAST:event_Res10ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void apliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apliActionPerformed
        // TODO add your handling code here:
        try {
            //JOptionPane.showMessageDialog(this, "Succes");
            String sql = "UPDATE `menu` SET `Stok`= '" + stoke.getText() + "' WHERE Nama = '" + jComboBox1.getSelectedItem() + "'";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
        re();
        stoke.setText("");
    }//GEN-LAST:event_apliActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel4MouseExited

    private void riwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwMouseEntered
        // TODO add your handling code here:
        riw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/riwa.png")));
    }//GEN-LAST:event_riwMouseEntered

    private void riwMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwMouseExited
        // TODO add your handling code here:
        riw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/riwtran4.png")));
    }//GEN-LAST:event_riwMouseExited

    private void riwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
        new Rtranpage().setVisible(true);
    }//GEN-LAST:event_riwMouseClicked

    private void kerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kerMouseEntered
        // TODO add your handling code here:
        ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/kera.png")));
    }//GEN-LAST:event_kerMouseEntered

    private void kerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kerMouseExited
        // TODO add your handling code here:
        ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/kertran.png")));
    }//GEN-LAST:event_kerMouseExited

    private void kerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kerMouseClicked
        // TODO add your handling code here:
        p2.some();
        this.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_kerMouseClicked

    private void LougtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LougtMouseEntered
        // TODO add your handling code here:
        Lougt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/loga3.png")));
    }//GEN-LAST:event_LougtMouseEntered

    private void LougtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LougtMouseExited
        // TODO add your handling code here:
        Lougt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/lotran.png")));
    }//GEN-LAST:event_LougtMouseExited

    private void LougtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LougtMouseClicked
        // TODO add your handling code here:
        int sel = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Log Out?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (sel == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_LougtMouseClicked

    private void pl11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl11MouseEntered
        // TODO add your handling code here:
        pl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));

    }//GEN-LAST:event_pl11MouseEntered

    private void pl11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl11MouseExited
        // TODO add your handling code here:
        pl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl11MouseExited

    private void pl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl11MouseClicked
        // TODO add your handling code here:
        int stk = Integer.parseInt("" + stok1.getText());
        int jml = Integer.parseInt(jSpinner1.getModel().getValue().toString());
        try {

            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Caviar out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '01' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men.setText(res.getString("Nama"));
                    //p2.menh.setText(res.getString("Harga"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl11MouseClicked

    private void pl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl12MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok2.getText());
            int jml = Integer.parseInt(jSpinner2.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Sandwich out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '02' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men2.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl12MouseClicked

    private void pl12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl12MouseEntered
        // TODO add your handling code here:
        pl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl12MouseEntered

    private void pl12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl12MouseExited
        // TODO add your handling code here:
        pl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl12MouseExited

    private void pl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl13MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok3.getText());
            int jml = Integer.parseInt(jSpinner3.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "French Fries out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '03' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men3.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl13MouseClicked

    private void pl13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl13MouseEntered
        // TODO add your handling code here:
        pl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl13MouseEntered

    private void pl13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl13MouseExited
        // TODO add your handling code here:
        pl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl13MouseExited

    private void pl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl14MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok4.getText());
            int jml = Integer.parseInt(jSpinner4.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Fried Rice out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '04' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men4.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl14MouseClicked

    private void pl14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl14MouseEntered
        // TODO add your handling code here:
        pl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl14MouseEntered

    private void pl14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl14MouseExited
        // TODO add your handling code here:
        pl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl14MouseExited

    private void pl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl15MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok5.getText());
            int jml = Integer.parseInt(jSpinner5.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Pizza out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '09' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men5.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl15MouseClicked

    private void pl15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl15MouseEntered
        // TODO add your handling code here:
        pl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl15MouseEntered

    private void pl15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl15MouseExited
        // TODO add your handling code here:
        pl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl15MouseExited

    private void pl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl16MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok6.getText());
            int jml = Integer.parseInt(jSpinner6.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Lemon Tea out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '06' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men6.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl16MouseClicked

    private void pl16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl16MouseEntered
        // TODO add your handling code here:
        pl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl16MouseEntered

    private void pl16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl16MouseExited
        // TODO add your handling code here:
        pl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl16MouseExited

    private void pl17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl17MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok7.getText());
            int jml = Integer.parseInt(jSpinner7.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Coffe out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '07' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men7.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl17MouseClicked

    private void pl17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl17MouseEntered
        // TODO add your handling code here:
        pl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl17MouseEntered

    private void pl17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl17MouseExited
        // TODO add your handling code here:
        pl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl17MouseExited

    private void pl18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl18MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok8.getText());
            int jml = Integer.parseInt(jSpinner8.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Tea out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '08' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men8.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl18MouseClicked

    private void pl18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl18MouseEntered
        // TODO add your handling code here:
        pl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl18MouseEntered

    private void pl18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl18MouseExited
        // TODO add your handling code here:
        pl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl18MouseExited

    private void pl19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl19MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok9.getText());
            int jml = Integer.parseInt(jSpinner9.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Milkshake out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '05' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men9.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl19MouseClicked

    private void pl19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl19MouseEntered
        // TODO add your handling code here:
        pl19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl19MouseEntered

    private void pl19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl19MouseExited
        // TODO add your handling code here:
        pl19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl19MouseExited

    private void pl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl20MouseClicked
        // TODO add your handling code here:
        try {
            int stk = Integer.parseInt("" + stok10.getText());
            int jml = Integer.parseInt(jSpinner10.getModel().getValue().toString());
            if (jml > stk) {
                JOptionPane.showMessageDialog(this, "Soda out of stock", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                String sql = "SELECT * FROM menu where Kode_Menu = '10' ";
                //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery();
                while (res.next()) {
                    SecondPage.men10.setText(res.getString("Nama"));
                }
            }
        } catch (Exception e) {
            System.out.println("Belom konek");
        }
    }//GEN-LAST:event_pl20MouseClicked

    private void pl20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl20MouseEntered
        // TODO add your handling code here:
        pl20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2.png")));
    }//GEN-LAST:event_pl20MouseEntered

    private void pl20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pl20MouseExited
        // TODO add your handling code here:
        pl20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/menu/pl2-removebg-preview.png")));
    }//GEN-LAST:event_pl20MouseExited

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CFE;
    public javax.swing.JLabel Caviar;
    public javax.swing.JLabel Caviar3;
    public javax.swing.JLabel Caviar4;
    public javax.swing.JLabel Caviar5;
    public javax.swing.JLabel Caviar7;
    private javax.swing.JLabel FF;
    private javax.swing.JLabel FR;
    private javax.swing.JLabel Fried;
    public static javax.swing.JLabel Harga1;
    public static javax.swing.JLabel Harga10;
    public static javax.swing.JLabel Harga2;
    public static javax.swing.JLabel Harga3;
    public static javax.swing.JLabel Harga4;
    public static javax.swing.JLabel Harga5;
    public static javax.swing.JLabel Harga6;
    public static javax.swing.JLabel Harga7;
    public static javax.swing.JLabel Harga8;
    public static javax.swing.JLabel Harga9;
    private javax.swing.JLabel Lougt;
    private javax.swing.JLabel MILK;
    public javax.swing.JLabel Milkshake;
    public javax.swing.JLabel Pizza;
    private javax.swing.JButton Res1;
    private javax.swing.JButton Res10;
    private javax.swing.JButton Res2;
    private javax.swing.JButton Res3;
    private javax.swing.JButton Res4;
    private javax.swing.JButton Res5;
    private javax.swing.JButton Res6;
    private javax.swing.JButton Res7;
    private javax.swing.JButton Res8;
    private javax.swing.JButton Res9;
    private javax.swing.JLabel Rp1;
    private javax.swing.JLabel Rp10;
    private javax.swing.JLabel Rp2;
    private javax.swing.JLabel Rp3;
    private javax.swing.JLabel Rp4;
    private javax.swing.JLabel Rp5;
    private javax.swing.JLabel Rp6;
    private javax.swing.JLabel Rp7;
    private javax.swing.JLabel Rp8;
    private javax.swing.JLabel Rp9;
    private javax.swing.JLabel SODA;
    private javax.swing.JLabel Sand;
    private javax.swing.JLabel Sandwich;
    private javax.swing.JLabel Stk;
    private javax.swing.JLabel Stk1;
    private javax.swing.JLabel Stk2;
    private javax.swing.JLabel Stk3;
    private javax.swing.JLabel Stk4;
    private javax.swing.JLabel Stk5;
    private javax.swing.JLabel Stk6;
    private javax.swing.JLabel Stk7;
    private javax.swing.JLabel Stk8;
    private javax.swing.JLabel Stk9;
    private javax.swing.JLabel TIE;
    private javax.swing.JButton apli;
    private javax.swing.JLabel cav;
    private javax.swing.JLabel ff;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JSpinner jSpinner1;
    public static javax.swing.JSpinner jSpinner10;
    public static javax.swing.JSpinner jSpinner2;
    public static javax.swing.JSpinner jSpinner3;
    public static javax.swing.JSpinner jSpinner4;
    public static javax.swing.JSpinner jSpinner5;
    public static javax.swing.JSpinner jSpinner6;
    public static javax.swing.JSpinner jSpinner7;
    public static javax.swing.JSpinner jSpinner8;
    public static javax.swing.JSpinner jSpinner9;
    private javax.swing.JLabel ker;
    private javax.swing.JLabel lmo;
    public javax.swing.JLabel lol;
    private javax.swing.JLabel pl11;
    private javax.swing.JLabel pl12;
    private javax.swing.JLabel pl13;
    private javax.swing.JLabel pl14;
    private javax.swing.JLabel pl15;
    private javax.swing.JLabel pl16;
    private javax.swing.JLabel pl17;
    private javax.swing.JLabel pl18;
    private javax.swing.JLabel pl19;
    private javax.swing.JLabel pl20;
    private javax.swing.JLabel pza;
    private javax.swing.JLabel riw;
    public static javax.swing.JLabel stok1;
    public static javax.swing.JLabel stok10;
    public static javax.swing.JLabel stok2;
    public static javax.swing.JLabel stok3;
    public static javax.swing.JLabel stok4;
    public static javax.swing.JLabel stok5;
    public static javax.swing.JLabel stok6;
    public static javax.swing.JLabel stok7;
    public static javax.swing.JLabel stok8;
    public static javax.swing.JLabel stok9;
    private javax.swing.JTextField stoke;
    // End of variables declaration//GEN-END:variables
}
