import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class login_customer extends javax.swing.JFrame {

    /**
     * Creates new form login_customer
     */
    
    public login_customer() {
        initComponents();
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
//        jButton7.setVisible(false);
        jButton9.setVisible(false);
        jLabel7.setVisible(false);
        jLabel6.setVisible(false);


    }
   /* 
       
}*/
    public void setnme(String f) {
        txtname.setText(f);
    }
    
    Statement stmt=null;
ResultSet rs =null;
String sql ="select * From loginadmin";
private boolean validate_login(String username,String password) {
   try{           
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");    
       PreparedStatement pst = conn.prepareStatement("Select * from custlogin where username=? and pass=?");
       pst.setString(1, username); 
       pst.setString(2, password);
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1470, 770));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 58)); // NOI18N
        jLabel1.setText("Customer Login");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 170, 380, 80);

        jButton2.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jButton2.setText("Not a Customer yet? Join Us.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 550, 240, 30);

        txtpass.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txtpass.setToolTipText("");
        txtpass.setName(""); // NOI18N
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(660, 380, 210, 30);

        txtname.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(660, 310, 210, 30);

        jButton3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 450, 90, 30);

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 450, 90, 30);

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 310, 110, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 380, 130, 40);

        jButton4.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(750, 220, 130, 40);

        jButton5.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton5.setText("Book Tickets");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(250, 400, 150, 40);

        jButton9.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton9.setText("View Status");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(250, 320, 150, 40);

        jButton7.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jButton7.setText("Forgot Username or password?");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(580, 500, 240, 30);

        jButton6.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton6.setText("Cancel Tickets");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 480, 150, 40);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel6.setText("Pack Up");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 180, 110, 30);

        jLabel7.setFont(new java.awt.Font("Andalus", 3, 36)); // NOI18N
        jLabel7.setText("IT'S TIME TO MOVE ON...");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 220, 440, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thy_tr_wp2.jpg"))); // NOI18N
        jLabel8.setText("image");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel8.setMaximumSize(new java.awt.Dimension(1456, 700));
        jLabel8.setMinimumSize(new java.awt.Dimension(1456, 768));
        jLabel8.setPreferredSize(new java.awt.Dimension(1456, 708));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1456, 710);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thy_tr_wp2.jpg"))); // NOI18N
        jLabel4.setText("image");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel4.setMaximumSize(new java.awt.Dimension(1456, 700));
        jLabel4.setMinimumSize(new java.awt.Dimension(1456, 768));
        jLabel4.setPreferredSize(new java.awt.Dimension(1456, 708));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1456, 710);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signup_customer add=new signup_customer();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        login_home1 add = new login_home1();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtname.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   else if(txtpass.getPassword().length==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   else{
       String user = txtname.getText();   // Collecting the input
       char[] pass = txtpass.getPassword(); // Collecting the input
       String pwd = String.copyValueOf(pass);  // converting from array to string
       if(validate_login(user,pwd)) {
          //JOptionPane.showMessageDialog(null, "Correct Login Credentials");
          jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        txtname.setVisible(false);
        txtpass.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
//        jButton7.setVisible(true);
        jButton9.setVisible(true);
        jLabel7.setVisible(true);
        jLabel6.setVisible(true);
       }
       else {
          JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
          txtname.setText("");
          txtpass.setText("");
       }
   }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login_customer add=new login_customer();
        add.setVisible(true);
        //add.setu(txtname.getText());
        this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        searchflights add=new searchflights();
        add.setVisible(true);
        //add.setu(txtname.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frmCancellation add=new frmCancellation();
        try{

           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
            stmt=con.createStatement();
            String SQL1="Select * from custdetails where username='"+(txtname.getText())+"'";
           rs=stmt.executeQuery(SQL1);
                    while(rs.next()) {
                      // System.out.println(rs.getString(1)+" : "+rs.getString(2));

                //String FC = rs.getString(1);
                //String Name=rs.getString(1);
                
                //String nm=txtname.getText();
                //String source=rs.getString(4);
                //if(!Name.equals(nm)) continue;
                String passno=rs.getString(11);
                add.setu(txtname.getText());
                add.setf(passno);
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }

        add.setVisible(true);
        //add.setu(txtname.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String a="";
         String b="";
         String c="";
         String d="";
         String f="";
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
         stmt=con.createStatement();
         String SQL1="Select * from customer where cname='"+(txtname.getText())+"'";
         rs=stmt.executeQuery(SQL1);
         //int pno=1244;
         while(rs.next())
         {
             /*pno=rs.getInt(1);
             System.out.println("Passenger No "+pno);
             pno++;
             System.out.println("Passenger No"+pno);*/

         
         a=(rs.getString(4));
         b=(rs.getString(2));
         c=(rs.getString(3));
         d=(rs.getString(5));
         f=(rs.getString(7));
         //add.setVisible(true);
        //this.setVisible(false);
         /*con.close();
         rs.close();
         stmt.close();*/
         }
     }
     catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
     }
        viewstatus add=new viewstatus();
        add.setVisible(true);
        add.setu(txtname.getText());
        add.setad(a);
         add.setg(b);
         add.setd(c);
         add.sete(d);
         add.setc(f);
         
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
            String n=JOptionPane.showInputDialog(this, "Who is your username?", "Enter username..", JOptionPane.OK_CANCEL_OPTION);
            String find=JOptionPane.showInputDialog(this, "Who is your favourite author?", "Security question..", JOptionPane.OK_CANCEL_OPTION);
            
            String SQL1="Select * from customer where cname ='"+(n)+"' and answer='"+(find)+"'";
            System.out.println(SQL1);
            int count=0;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            String ans="";
            while(rs.next()) {
                count++;
                ans=rs.getString(6);
               /* String fNo = rs.getString(1);
                String fName = rs.getString(2);
                String cls=rs.getString(3);
                String Source=rs.getString(4);
                String Dest=rs.getString(5);
                String totE=rs.getString(6);
                String totB=rs.getString(7);
                String dt=rs.getString(8);
                String tim=rs.getString(9);
                String pric=rs.getString(10);
                String price=rs.getString(11);
                if(cls.equals("International"))
                {
                    optInter.setSelected(true);
                }
                 if(cls.equals("Domestic"))
                {
                    optDom.setSelected(true);
                }
                System.out.println(fNo+"|"+fName);
                txtflightCode.setText(fNo);
                txtFname.setText(fName);
                txtDepTime.setText(tim);
                txtDeptDate.setText(dt);
                txtPrice.setText(pric);
                txtsrc.setText(Source);
                txtTECo.setText(totE);
                txtTotBusi.setText(totB);
                txtdes.setText(Dest);
                txtPrice1.setText(price);*/
     }
            if(count==0) {
                JOptionPane.showMessageDialog(rootPane, "Your answers did not match","Error", JOptionPane.ERROR_MESSAGE);
            } else
                JOptionPane.showMessageDialog(rootPane, "Your password is "+(ans),"Successful", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(login_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_customer().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu search;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    void show1() {
          jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        txtname.setVisible(false);
        txtpass.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
//        jButton7.setVisible(true);
        jButton9.setVisible(true);
        jLabel7.setVisible(true);
        jLabel6.setVisible(true);//To change body of generated methods, choose Tools | Templates.
    }

    public void signlogin(String a){
    
       txtname.setText(a)  ; // Collecting the input
       //txtpass.setText(); // Collecting the input
       //String pwd = b;  // converting from array to string
       
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        txtname.setVisible(false);
        txtpass.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        //jButton7.setVisible(true);
        jButton9.setVisible(true);
        jLabel7.setVisible(true);
        jLabel6.setVisible(true);
       }
}
