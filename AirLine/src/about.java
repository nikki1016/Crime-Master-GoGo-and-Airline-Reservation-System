
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package about;

/**
 *
 * @author user
 */
public class about extends javax.swing.JFrame {

    /**
     * Creates new form food_menu
     */
    public about() {
        initComponents();
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }
    Statement stmt=null;
    ResultSet rs=null;
    public void update() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");

            String SQL1="Select * from star ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            //int st=Integer.parseInt(jTextField1.getText());
            double t=0;
            int a=0;
            int c=0;
            while(rs.next()) {
                c++;
                a=rs.getInt(1);
                t=t+a;
                
            }
            
            if(c==0)
                jTextField1.setText("0");
            else {
                double ta=t/c;
            String avg=String.format("%.2f",ta);
            
                jTextField1.setText(avg);
                System.out.println("updated");
            }
            //con.close();

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        desi2 = new javax.swing.JLabel();
        nikita = new javax.swing.JLabel();
        ananya = new javax.swing.JLabel();
        shuchi = new javax.swing.JLabel();
        desi1 = new javax.swing.JLabel();
        desi3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
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
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_1479984157188.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 420, 120, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_1479984516093.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1210, 210, 120, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_11-24-04.34.40.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1210, 0, 120, 180);

        desi2.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        desi2.setText("Back-end Developer");
        getContentPane().add(desi2);
        desi2.setBounds(910, 320, 260, 40);
        desi2.getAccessibleContext().setAccessibleName("Developer");

        nikita.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        nikita.setText(" NIKITA JAIN");
        getContentPane().add(nikita);
        nikita.setBounds(930, 490, 350, 50);

        ananya.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        ananya.setText(" ANANYA ANAND");
        getContentPane().add(ananya);
        ananya.setBounds(900, 40, 370, 50);

        shuchi.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        shuchi.setText(" SHUCHI DWIVEDI");
        getContentPane().add(shuchi);
        shuchi.setBounds(870, 270, 410, 40);
        shuchi.getAccessibleContext().setAccessibleName("Miss. Shuchi Dwivedi");

        desi1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        desi1.setText("Front-end Developer");
        getContentPane().add(desi1);
        desi1.setBounds(900, 90, 270, 40);

        desi3.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        desi3.setText("Designer");
        getContentPane().add(desi3);
        desi3.setBounds(1050, 540, 130, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Rate us");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 14, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5s.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 260, 210, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1s.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 20, 210, 40);
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 20, 210, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2s.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(170, 80, 210, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3s.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 140, 210, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4s.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(170, 200, 210, 40);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 22)); // NOI18N
        jLabel3.setText("Average Rating");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 420, 210, 50);

        jTextField1.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 430, 150, 29);

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 22)); // NOI18N
        jLabel6.setText("Your Rating");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 350, 210, 50);

        jTextField2.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(230, 360, 150, 29);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NV8mzye.jpg"))); // NOI18N
        image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageFocusGained(evt);
            }
        });
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageMouseEntered(evt);
            }
        });
        getContentPane().add(image);
        image.setBounds(0, 0, 1500, 750);

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

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ananya.setVisible(true);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(true);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ananya.setVisible(false);
        shuchi.setVisible(true);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(true);
        desi3.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(true);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void imageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseEntered
        ananya.setVisible(false);
        shuchi.setVisible(false);
        nikita.setVisible(false);
        desi1.setVisible(false);
        desi2.setVisible(false);
        desi3.setVisible(false);
    }//GEN-LAST:event_imageMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
    Statement stmt=null;
ResultSet rs =null;
         stmt=con.createStatement();
         //int total=0;
         //int count=1;
         rs=stmt.executeQuery("select * from star");
         while(rs.next())
         {
               /*int a=rs.getInt(1);
               count++;
               total+=a;*/
         }
         int c=5;
 String strSQL="INSERT INTO star VALUES ('"+(c)+"')";
 int rowEffected=stmt.executeUpdate(strSQL);
 jTextField2.setText("5");
 JOptionPane.showMessageDialog(rootPane, "Your valuable rating has been recorded.\nThanks","Thank you..",JOptionPane.INFORMATION_MESSAGE);
 /*total+=3;
        int b=total/count;
        String ba=(""+b);
        jTextField1.setText(ba);*/
           
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }  
        update();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
    Statement stmt=null;
ResultSet rs =null;
         stmt=con.createStatement();
         //int total=0;
         //int count=1;
         rs=stmt.executeQuery("select * from star");
         while(rs.next())
         {
               /*int a=rs.getInt(1);
               count++;
               total+=a;*/
         }
         int c=2;
 String strSQL="INSERT INTO star VALUES ('"+(c)+"')";
 int rowEffected=stmt.executeUpdate(strSQL);
 jTextField2.setText("2");
 JOptionPane.showMessageDialog(rootPane, "Your valuable rating has been recorded.\nThanks","Thank you..",JOptionPane.INFORMATION_MESSAGE);
 /*total+=3;
        int b=total/count;
        String ba=(""+b);
        jTextField1.setText(ba);*/
           
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }  
        update();       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
    Statement stmt=null;
ResultSet rs =null;
         stmt=con.createStatement();
         //int total=0;
         //int count=1;
         rs=stmt.executeQuery("select * from star");
         while(rs.next())
         {
               /*int a=rs.getInt(1);
               count++;
               total+=a;*/
         }
         int c=3;
 String strSQL="INSERT INTO star VALUES ('"+(c)+"')";
 int rowEffected=stmt.executeUpdate(strSQL);
 jTextField2.setText("3");
 JOptionPane.showMessageDialog(rootPane, "Your valuable rating has been recorded.\nThanks","Thank you..",JOptionPane.INFORMATION_MESSAGE);
 /*total+=3;
        int b=total/count;
        String ba=(""+b);
        jTextField1.setText(ba);*/
           
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }  
        update();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
    Statement stmt=null;
ResultSet rs =null;
         stmt=con.createStatement();
         //int total=0;
         //int count=1;
         rs=stmt.executeQuery("select * from star");
         while(rs.next())
         {
               /*int a=rs.getInt(1);
               count++;
               total+=a;*/
         }
         int c=4;
 String strSQL="INSERT INTO star VALUES ('"+(c)+"')";
 int rowEffected=stmt.executeUpdate(strSQL);
 jTextField2.setText("4");
 JOptionPane.showMessageDialog(rootPane, "Your valuable rating has been recorded.\nThanks","Thank you..",JOptionPane.INFORMATION_MESSAGE);
 /*total+=3;
        int b=total/count;
        String ba=(""+b);
        jTextField1.setText(ba);*/
           
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }  
        update();       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
    Statement stmt=null;
ResultSet rs =null;
         stmt=con.createStatement();
         //int total=0;
         //int count=1;
         rs=stmt.executeQuery("select * from star");
         while(rs.next())
         {
               /*int a=rs.getInt(1);
               count++;
               total+=a;*/
         }
         int c=1;
 String strSQL="INSERT INTO star VALUES ('"+(c)+"')";
 int rowEffected=stmt.executeUpdate(strSQL);
 jTextField2.setText("1");
 JOptionPane.showMessageDialog(rootPane, "Your valuable rating has been recorded.\nThanks","Thank you..",JOptionPane.INFORMATION_MESSAGE);
 
 /*total+=3;
        int b=total/count;
        String ba=(""+b);
        jTextField1.setText(ba);*/
           
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }  
        update();                            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void imageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_imageFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");

            String SQL1="Select * from star ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            //int st=Integer.parseInt(jTextField1.getText());
            double t=0;
            int a=0;
            int c=0;
            while(rs.next()) {
                c++;
                a=rs.getInt(1);
                t=t+a;
                
            }
            
            if(c==0)
                jTextField1.setText("0");
            else {
                double ta=t/c;
            String avg=String.format("%.2f",ta);
            
                jTextField1.setText(avg);
                System.out.println("updated");
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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JLabel ananya;
    private javax.swing.JLabel desi1;
    private javax.swing.JLabel desi2;
    private javax.swing.JLabel desi3;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu flyers;
    private javax.swing.JMenu food;
    private javax.swing.JMenu home;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nikita;
    private javax.swing.JMenu search;
    private javax.swing.JLabel shuchi;
    // End of variables declaration//GEN-END:variables
}
