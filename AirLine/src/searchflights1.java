import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BeBu
 */
public class searchflights1 extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public searchflights1() {
        initComponents();
    }
Statement stmt=null;
ResultSet rs =null;
//public void setu(String f) {
      //  txtuser.setText(f);
   // }//

//public void show1()

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsrc = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdes = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlightInfo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        search = new javax.swing.JMenu();
        food = new javax.swing.JMenu();
        about = new javax.swing.JMenu();
        flyers = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(1470, 770));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setText("Source");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 180, 110, 30);

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Why we?");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(890, 70, 640, 60);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setText("Destination");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 240, 120, 30);

        txtsrc.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        txtsrc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banglore(BLR)", "Bhubaneshwar(BBI)", "Delhi(DEL)", "Hyderabad(HYD)" }));
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        getContentPane().add(txtsrc);
        txtsrc.setBounds(300, 180, 157, 30);

        jLabel8.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText(" “low fares, on-time flights and a hassle-free experience” to ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 280, 720, 40);

        jLabel10.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Come, let's fly high up into the sky!!");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(780, 40, 640, 40);

        txtdes.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        txtdes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banglore(BLR)", "Bhubaneshwar(BBI)", "Delhi(DEL)", "Hyderabad(HYD)" }));
        txtdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesActionPerformed(evt);
            }
        });
        getContentPane().add(txtdes);
        txtdes.setBounds(300, 240, 157, 30);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 350, 200, 50);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        tblFlightInfo.setAutoCreateRowSorter(true);
        tblFlightInfo.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        tblFlightInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Code", "Flight Name", "Class", "Source", "Destination", "Economic seats", "Business seats", "Date", "Departure", "INR for Economic", "INR for Business"
            }
        ));
        tblFlightInfo.setColumnSelectionAllowed(true);
        tblFlightInfo.setGridColor(new java.awt.Color(255, 255, 255));
        tblFlightInfo.setOpaque(false);
        jScrollPane1.setViewportView(tblFlightInfo);
        tblFlightInfo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 430, 1130, 180);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setText("Boarding Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 300, 150, 21);

        jLabel11.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("FlightSite is built for people with things to do and places to see");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(680, 120, 660, 40);

        jLabel12.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("people who don't want to waste time, money or energy in the process.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(650, 160, 710, 40);

        jLabel13.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText(" We continuously focus on keeping costs low and the frequency of our flights");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(600, 190, 780, 60);

        txtdate.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtdate);
        txtdate.setBounds(300, 290, 160, 30);

        jLabel4.setText("(yyyy-mm-dd)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 300, 80, 20);

        jLabel14.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("our passengers.");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(880, 320, 210, 40);

        jLabel15.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText(" high while striving to fulfil our simple brand message of providing");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(630, 240, 710, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thy_tr_wp2.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-30, -50, 1430, 770);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(20.0F);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(301, 51));

        home.setText("HOME");
        home.setAlignmentX(205.0F);
        home.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        home.setIconTextGap(30);
        home.setMaximumSize(new java.awt.Dimension(205, 32767));
        home.setPreferredSize(new java.awt.Dimension(205, 21));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        search.setText("SEARCH");
        search.setAlignmentX(205.0F);
        search.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        search.setIconTextGap(30);
        search.setPreferredSize(new java.awt.Dimension(205, 21));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jMenuBar1.add(search);

        food.setText("FOOD MENU");
        food.setAlignmentX(415.0F);
        food.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        food.setIconTextGap(30);
        food.setMaximumSize(new java.awt.Dimension(255, 32767));
        food.setPreferredSize(new java.awt.Dimension(255, 21));
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMouseClicked(evt);
            }
        });
        jMenuBar1.add(food);

        about.setText("ABOUT");
        about.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        about.setIconTextGap(30);
        about.setPreferredSize(new java.awt.Dimension(205, 21));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        flyers.setText("FREQUENT FLYERS");
        flyers.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        flyers.setIconTextGap(30);
        flyers.setMaximumSize(new java.awt.Dimension(255, 32767));
        flyers.setPreferredSize(new java.awt.Dimension(255, 21));
        flyers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flyersMouseClicked(evt);
            }
        });
        jMenuBar1.add(flyers);

        jMenu5.setText("EXIT");
        jMenu5.setAlignmentX(280.0F);
        jMenu5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jMenu5.setIconTextGap(30);
        jMenu5.setMaximumSize(new java.awt.Dimension(0, 0));
        jMenuBar1.add(jMenu5);

        admin.setText("ADMIN");
        admin.setAlignmentX(0.0F);
        admin.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        admin.setIconTextGap(30);
        admin.setMaximumSize(new java.awt.Dimension(175, 32767));
        admin.setPreferredSize(new java.awt.Dimension(175, 21));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        jMenuBar1.add(admin);

        exit.setText("EXIT");
        exit.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        exit.setMaximumSize(new java.awt.Dimension(175, 32767));
        exit.setPreferredSize(new java.awt.Dimension(175, 21));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //public void show1()
        String src=(String) txtsrc.getSelectedItem();
             
             String des=(String) txtdes.getSelectedItem();
             String dt=txtdate.getText();
        DefaultTableModel tModel = (DefaultTableModel) tblFlightInfo.getModel();
                int rows = tModel.getRowCount();
                if (rows > 0) {
                    for (int i = 0; i< rows; i++){
                        tModel.removeRow(0);
                    }
                }
       try{

           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
            stmt=con.createStatement();
           rs=stmt.executeQuery("Select * from Flightdetails");
           int count=0;
                    while(rs.next()) {
                       //System.out.println(rs.getString(1)+" : "+rs.getString(2));

                String FCode = rs.getString(1);
                String Name=rs.getString(2);
                String cls=rs.getString(3);
                String source=rs.getString(4);
                if(!src.equals(source)) continue;
                String desti=rs.getString(5);
                if(!desti.equals(des)) continue;
                String Eco=rs.getString(6);
                String Busi=rs.getString(7);
                String Date=rs.getString(8);
                if(!Date.equals(dt)) continue;
                String Depart=rs.getString(9);
                String Prceco=rs.getString(10);
                String Prcbui=rs.getString(11);
                tModel.addRow(new Object[] {FCode,Name,cls,source,desti,  Eco,Busi,Date,Depart,Prceco, Prcbui});
                count++;
                //jComboBox1.addItem(FCode);
                    }
                    if(count==0)
                        JOptionPane.showMessageDialog(rootPane, "No flights found","We are sorry",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        login_home1 add = new login_home1();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        searchflights1 add = new searchflights1();
        add.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:*/
    }//GEN-LAST:event_searchMouseClicked

    private void foodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseClicked
        foodmenu add = new foodmenu();
        add.setVisible(true);
        this.setVisible(false);
                // TODO add your handling code here:
    }//GEN-LAST:event_foodMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        about add = new about();
        add.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void flyersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flyersMouseClicked
        login_customer add = new login_customer();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_flyersMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        login_admin add = new login_admin();
        add.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void txtdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");

            String SQL1="Select * from cities ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            while(rs.next()) {
                
                
                String src=rs.getString(1);
                String des=rs.getString(2);
                txtsrc.addItem(src);
                txtdes.addItem(des);
            }
            
            //con.close();

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(searchmflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchmflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchmflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchmflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchmflights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu flyers;
    private javax.swing.JMenu food;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu search;
    private javax.swing.JTable tblFlightInfo;
    private javax.swing.JTextField txtdate;
    private javax.swing.JComboBox txtdes;
    private javax.swing.JComboBox txtsrc;
    // End of variables declaration//GEN-END:variables
}