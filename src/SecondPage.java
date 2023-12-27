
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghifa
 */
public class SecondPage extends javax.swing.JFrame {

    /**
     * Creates new form SecondPage
     */
    //ThirdPages p3 = new ThirdPages();
    public String ganti = "";
    public StringTokenizer token;
    public long angka;

    public SecondPage() {
        initComponents();
        setTitle("Detail Harga");
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        getContentPane().setBackground(new Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

    }

    public void some() {
        //menu1       
        //int myint = (int) jSpinner1.getValue();
        try {
            int val = Integer.parseInt(FirstPage.Harga1.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner1.getModel().getValue().toString());
            if (men.getText().equalsIgnoreCase("Caviar")) {
                ment.setText("" + (val * myint));
            } else {
                ment.setText("" + 0);
            }

        } catch (Exception e) {
            System.out.println("Menu 1 Kosong");
        }
        //menu2
        try {
            int val = Integer.parseInt(FirstPage.Harga2.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner2.getModel().getValue().toString());
            if (men2.getText().equalsIgnoreCase("Sandwich")) {
                ment2.setText("" + (val * myint));
            } else {
                ment2.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 2 Kosong");
        }
        //menu3       
        try {
            int val = Integer.parseInt(FirstPage.Harga3.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner3.getModel().getValue().toString());
            if (men3.getText().equalsIgnoreCase("French Fries")) {
                ment3.setText("" + (val * myint));
            } else {
                ment3.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 3 Kosong");
        }
        //MENU4
        try {
            int val = Integer.parseInt(FirstPage.Harga4.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner4.getModel().getValue().toString());
            if (men4.getText().equalsIgnoreCase("Fried Rice")) {
                ment4.setText("" + (val * myint));
            } else {
                ment4.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 4 Kosong");
        }
        //MENU5
        try {
            int val = Integer.parseInt(FirstPage.Harga5.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner5.getModel().getValue().toString());
            if (men5.getText().equalsIgnoreCase("Pizza")) {
                ment5.setText("" + (val * myint));
            } else {
                ment5.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 5 Kosong");
        }
        //MENU6
        try {
            int val = Integer.parseInt(FirstPage.Harga6.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner6.getModel().getValue().toString());
            if (men6.getText().equalsIgnoreCase("Lemon Tea")) {
                ment6.setText("" + (val * myint));
            } else {
                ment6.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 6 Kosong");
        }
        //MENU7
        try {
            int val = Integer.parseInt(FirstPage.Harga7.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner7.getModel().getValue().toString());
            if (men7.getText().equalsIgnoreCase("Coffe")) {
                ment7.setText("" + (val * myint));
            } else {
                ment7.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 7 Kosong");
        }//MENU8
        try {
            int val = Integer.parseInt(FirstPage.Harga8.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner8.getModel().getValue().toString());
            if (men8.getText().equalsIgnoreCase("Tea")) {
                ment8.setText("" + (val * myint));
            } else {
                ment8.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 8 Kosong");
        }
        //MENU9
        try {
            int val = Integer.parseInt(FirstPage.Harga9.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner9.getModel().getValue().toString());
            if (men9.getText().equalsIgnoreCase("Milkshake")) {
                ment9.setText("" + (val * myint));
            } else {
                ment9.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 9 Kosong");
        }
        //MENU10
        try {
            int val = Integer.parseInt(FirstPage.Harga10.getText());
            int myint = Integer.parseInt(FirstPage.jSpinner10.getModel().getValue().toString());
            if (men10.getText().equalsIgnoreCase("Soda")) {
                ment10.setText("" + (val * myint));
            } else {
                ment10.setText("" + 0);
            }
        } catch (Exception e) {
            System.out.println("Menu 10 Kosong");
        }
        //total harga
        int tot = Integer.parseInt(ment.getText());
        int tot2 = Integer.parseInt(ment2.getText());
        int tot3 = Integer.parseInt(ment3.getText());
        int tot4 = Integer.parseInt(ment4.getText());
        int tot5 = Integer.parseInt(ment5.getText());
        int tot6 = Integer.parseInt(ment6.getText());
        int tot7 = Integer.parseInt(ment7.getText());
        int tot8 = Integer.parseInt(ment8.getText());
        int tot9 = Integer.parseInt(ment9.getText());
        int tot10 = Integer.parseInt(ment10.getText());
        int kal = tot + tot2 + tot3 + tot4 + tot5 + tot6 + tot7 + tot8 + tot9 + tot10;

        total.setText("" + kal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        men = new javax.swing.JLabel();
        ment = new javax.swing.JLabel();
        men2 = new javax.swing.JLabel();
        ment2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        men3 = new javax.swing.JLabel();
        ment3 = new javax.swing.JLabel();
        men4 = new javax.swing.JLabel();
        ment4 = new javax.swing.JLabel();
        men5 = new javax.swing.JLabel();
        ment5 = new javax.swing.JLabel();
        men6 = new javax.swing.JLabel();
        ment6 = new javax.swing.JLabel();
        men7 = new javax.swing.JLabel();
        ment7 = new javax.swing.JLabel();
        men8 = new javax.swing.JLabel();
        ment8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        men9 = new javax.swing.JLabel();
        ment9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        men10 = new javax.swing.JLabel();
        ment10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 900));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setText("Total");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 750, 210, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        men.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men.setForeground(new java.awt.Color(51, 51, 51));
        men.setText("Menu 1");
        jPanel1.add(men, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, 50));

        ment.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment.setForeground(new java.awt.Color(153, 153, 153));
        ment.setText("0");
        jPanel1.add(ment, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 180, 60));

        men2.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men2.setForeground(new java.awt.Color(51, 51, 51));
        men2.setText("Menu 2");
        jPanel1.add(men2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        ment2.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment2.setForeground(new java.awt.Color(153, 153, 153));
        ment2.setText("0");
        jPanel1.add(ment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 180, 50));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Rp");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Rp");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Rp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Rp");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Rp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        men3.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men3.setForeground(new java.awt.Color(51, 51, 51));
        men3.setText("Menu 3");
        jPanel1.add(men3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        ment3.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment3.setForeground(new java.awt.Color(153, 153, 153));
        ment3.setText("0");
        jPanel1.add(ment3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 190, 60));

        men4.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men4.setForeground(new java.awt.Color(51, 51, 51));
        men4.setText("Menu 4");
        jPanel1.add(men4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        ment4.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment4.setForeground(new java.awt.Color(153, 153, 153));
        ment4.setText("0");
        jPanel1.add(ment4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 200, 60));

        men5.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men5.setForeground(new java.awt.Color(51, 51, 51));
        men5.setText("Menu 5");
        jPanel1.add(men5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        ment5.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment5.setForeground(new java.awt.Color(153, 153, 153));
        ment5.setText("0");
        jPanel1.add(ment5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 210, 60));

        men6.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men6.setForeground(new java.awt.Color(51, 51, 51));
        men6.setText("Menu 6");
        jPanel1.add(men6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        ment6.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment6.setForeground(new java.awt.Color(153, 153, 153));
        ment6.setText("0");
        jPanel1.add(ment6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 240, 60));

        men7.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men7.setForeground(new java.awt.Color(51, 51, 51));
        men7.setText("Menu 7");
        jPanel1.add(men7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        ment7.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment7.setForeground(new java.awt.Color(153, 153, 153));
        ment7.setText("0");
        jPanel1.add(ment7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 240, 60));

        men8.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men8.setForeground(new java.awt.Color(51, 51, 51));
        men8.setText("Menu 8");
        jPanel1.add(men8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        ment8.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment8.setForeground(new java.awt.Color(153, 153, 153));
        ment8.setText("0");
        jPanel1.add(ment8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 240, 60));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Rp");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Rp");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Rp");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        men9.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men9.setForeground(new java.awt.Color(51, 51, 51));
        men9.setText("Menu 9");
        jPanel1.add(men9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        ment9.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment9.setForeground(new java.awt.Color(153, 153, 153));
        ment9.setText("0");
        jPanel1.add(ment9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 240, 60));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Rp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

        men10.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        men10.setForeground(new java.awt.Color(51, 51, 51));
        men10.setText("Menu 10");
        jPanel1.add(men10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 130, -1));

        ment10.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        ment10.setForeground(new java.awt.Color(153, 153, 153));
        ment10.setText("0");
        jPanel1.add(ment10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 250, 60));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Rp");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 50, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 890, 460));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/bkb.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 90));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Rp");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 750, -1, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/hy.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 760, 210, 100));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 80)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("-");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, -1, 40));

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("X");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/uwu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 900));

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FirstPage().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/bk2.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/bkb.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ThirdPages().setVisible(true);
        try {
            int total1 = Integer.parseInt(total.getText());
            angka = total1;
            ganti = NumberFormat.getNumberInstance(Locale.US).format(angka);
            token = new StringTokenizer(ganti, ".");
            ganti = token.nextToken();
            ganti = ganti.replace(',', '.');
            ThirdPages.mab.setText("Rp. " + String.format(ganti));
        } catch (Exception e) {
            System.out.println("Total Kosong");
        }
        Calendar kal = new GregorianCalendar();
        int tahun = kal.get(Calendar.YEAR);
        int bulan = kal.get(Calendar.MONTH) + 1;
        int tgl = kal.get(Calendar.DAY_OF_MONTH);
        String tanggal = tahun + "-" + bulan + "-" + tgl;
        //ThirdPages.date.setText(tanggal);
        ThirdPages.jLabel9.setText(tanggal);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/hy2.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniGmbr/NIew/hy.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        jLabel15.setForeground(Color.red);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setForeground(Color.red);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel16MouseExited

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
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel men;
    public static javax.swing.JLabel men10;
    public static javax.swing.JLabel men2;
    public static javax.swing.JLabel men3;
    public static javax.swing.JLabel men4;
    public static javax.swing.JLabel men5;
    public static javax.swing.JLabel men6;
    public static javax.swing.JLabel men7;
    public static javax.swing.JLabel men8;
    public static javax.swing.JLabel men9;
    public static javax.swing.JLabel ment;
    public static javax.swing.JLabel ment10;
    public static javax.swing.JLabel ment2;
    public static javax.swing.JLabel ment3;
    public static javax.swing.JLabel ment4;
    public static javax.swing.JLabel ment5;
    public static javax.swing.JLabel ment6;
    public static javax.swing.JLabel ment7;
    public static javax.swing.JLabel ment8;
    public static javax.swing.JLabel ment9;
    public static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
