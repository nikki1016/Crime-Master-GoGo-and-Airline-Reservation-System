import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmCancellation extends javax.swing.JFrame {

    /** Creates new form frmCancellation */
    public frmCancellation() {
        initComponents();
        btnCancel.setEnabled(false);
    }
    public void setf(String f){
        cmbPasengrNo.addItem(f);
    }
    public void setu(String f){
        jLabel6.setText(f);
        jTextField1.setText(f); 
   }
    public void clear() {
        lblFCode.setText("");
                lblPassangerName.setText("");
                //lblAddress.setText(addrs);
                //lblNationality.setText(nationality);
                lblDOB.setText("");
                lblsta.setText("");
                jLabel19.setText("");
                jLabel8.setText("");
                lblSeatID.setText("");
                //lblPassportNo.setText(PassprtNo);
                lblEmailID.setText("");
                lblGender.setText("");
                lblFlightCategory.setText("");
                 lblSubFlightCategory.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPassangerName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblFlightCategory = new javax.swing.JLabel();
        lblSubFlightCategory = new javax.swing.JLabel();
        lblSeatID = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        cmbPasengrNo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        lblFCode = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblsta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cancellation Form");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, 0, 1470, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Select Passenger No :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 80, 230, 30);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        btnClear.setText("Search");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(710, 80, 130, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Gender :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 320, 90, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Date of Birth :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 280, 136, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 160, 260, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Seat ID :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 520, 82, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("Flight Category :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 400, 190, 30);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("Passenger Name :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 240, 169, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("Sub Category :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(140, 440, 220, 30);

        lblPassangerName.setBackground(new java.awt.Color(255, 255, 255));
        lblPassangerName.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblPassangerName.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblPassangerName);
        lblPassangerName.setBounds(400, 240, 280, 30);

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblDOB);
        lblDOB.setBounds(400, 280, 170, 30);

        lblGender.setBackground(new java.awt.Color(255, 255, 255));
        lblGender.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblGender);
        lblGender.setBounds(400, 320, 150, 30);

        lblEmailID.setBackground(new java.awt.Color(255, 255, 255));
        lblEmailID.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblEmailID.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblEmailID);
        lblEmailID.setBounds(400, 360, 270, 30);

        lblFlightCategory.setBackground(new java.awt.Color(255, 255, 255));
        lblFlightCategory.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblFlightCategory.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblFlightCategory);
        lblFlightCategory.setBounds(400, 400, 220, 30);

        lblSubFlightCategory.setBackground(new java.awt.Color(255, 255, 255));
        lblSubFlightCategory.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblSubFlightCategory.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblSubFlightCategory);
        lblSubFlightCategory.setBounds(400, 440, 240, 30);

        lblSeatID.setBackground(new java.awt.Color(255, 255, 255));
        lblSeatID.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblSeatID.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblSeatID);
        lblSeatID.setBounds(400, 520, 170, 30);

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("Cancel Reservation");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 570, 350, 50);

        cmbPasengrNo.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        cmbPasengrNo.setForeground(new java.awt.Color(255, 255, 51));
        cmbPasengrNo.setModel(new DefaultComboBoxModel());
        cmbPasengrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPasengrNoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPasengrNo);
        cmbPasengrNo.setBounds(400, 80, 140, 27);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setText("Flight Code :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(140, 120, 120, 30);

        lblFCode.setBackground(new java.awt.Color(255, 255, 255));
        lblFCode.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblFCode.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblFCode);
        lblFCode.setBounds(400, 120, 140, 30);

        back.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(870, 570, 110, 50);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(400, 200, 230, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Status :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 480, 90, 30);

        lblsta.setBackground(new java.awt.Color(255, 255, 255));
        lblsta.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblsta.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(lblsta);
        lblsta.setBounds(400, 480, 160, 30);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 150, 0, 0);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("Source :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(140, 160, 110, 30);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 51));
        jLabel17.setText("Destination :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(140, 200, 140, 30);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 51));
        jLabel18.setText("Email ID :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(140, 360, 150, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/china-airlines.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 20, 1470, 790);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1090, 210, 59, 20);

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
Statement stmt=null;
ResultSet rs =null;
String sql ="select * From Passenger";

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");

            String SQL1="Select * from custdetails where Passno='"+(cmbPasengrNo.getSelectedItem())+"'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            while(rs.next()) {
                //String PssgeCode = rs.getString(1);
                String FCode = rs.getString(2);
                String Name=rs.getString(5);
                String Gender=rs.getString(6);
                String dob=rs.getString(7);
                String src=rs.getString(9);
                String des=rs.getString(10);
                String status=rs.getString(4);
                //String nationality=rs.getString(7);
                String email=rs.getString(8);
                //String PassprtNo=rs.getString(10);
                String Seatno=rs.getString(12);
                String cls=rs.getString(14);
                String SubCate=rs.getString(13);
                if(cls.equals("Inter")) {
                    lblFlightCategory.setText("International");
                }
                if(cls.equals("Domes")) {
                    lblFlightCategory.setText("Domestic");
                }
                //System.out.println(fNo+"|"+fName);
                lblFCode.setText(FCode);
                lblPassangerName.setText(Name);
                //lblAddress.setText(addrs);
                //lblNationality.setText(nationality);
                lblDOB.setText(dob);
                lblsta.setText(status);
                jLabel19.setText(des);
                jLabel8.setText(src);
                lblSeatID.setText(Seatno);
                //lblPassportNo.setText(PassprtNo);
                lblEmailID.setText(email);
                lblGender.setText(Gender);

                if(SubCate.equals("Eco")) { lblSubFlightCategory.setText("Economics"); }
                if(SubCate.equals("Busi")) { lblSubFlightCategory.setText("Business"); }
                btnCancel.setEnabled(true);
            }
            
            //con.close();

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
}//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        String upSQL1="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
            System.out.println(1);
            // String SQL="Select * from flightdetails";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            Statement stmt1=null;
            ResultSet rs1=null;

            int response= JOptionPane.showConfirmDialog(this, "Are you sure You want to cancel tickets?", "cancel Comfirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION)
                System.out.println("No button clicked");
            else if (response == JOptionPane.YES_OPTION) {
                System.out.println("Yes button clicked");
                String strSQL="Delete from Passenger where PassengerNo='"+cmbPasengrNo.getSelectedItem()+"'";
                String strSQL1="Delete from custdetails where Passno='"+cmbPasengrNo.getSelectedItem()+"'";
                int rowEffected=stmt.executeUpdate(strSQL);
                int rowEffected1=stmt.executeUpdate(strSQL1);
                System.out.println("rowEffected="+rowEffected);
                if (rowEffected == 0) {
                    JOptionPane.showMessageDialog(this,"Record Not Deleted");
                } else {
                    JOptionPane.showMessageDialog(rootPane,"Your ticket was cancelled successfully!!","Cancelled",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(rootPane,"Your money will be transferred to your account by 3 days.","Payment",JOptionPane.INFORMATION_MESSAGE);
                    
                }
                /**********update flight seat***********/
                 stmt1 = con.createStatement();
                rs1 = stmt1.executeQuery("select * from flightdetails");
                 String fcode="";
                while (rs1.next())
                {
                     fcode=rs1.getString(1);
                }

                 fcode=lblFCode.getText();
                stmt1 = con.createStatement();
                rs1 = stmt1.executeQuery("select * from flightdetails");
                if(lblSubFlightCategory.getText().equals("Business")){
                   upSQL1="Update Flightdetails set totalBus=totalBus+1 Where Flightcode='"+fcode+"'";
              
                }
                if(lblSubFlightCategory.getText().equals("Economics")){
                   upSQL1="Update Flightdetails set totalEco=totalEco+1 Where Flightcode='"+fcode+"'";

                }
            System.out.println(upSQL1);
            int rowsEffected1=stmt1.executeUpdate(upSQL1);
            if(rowsEffected1==0)
                JOptionPane.showMessageDialog(rootPane,"Record does not exists");
            //else
                //JOptionPane.showMessageDialog(,"Product Record Updated");
            System.out.println(rowsEffected1+"rows effected");
            login_customer add=new login_customer();
        add.setVisible(true);
        add.show1();
        add.setnme(jLabel6.getText());
        this.setVisible(false);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

}//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         /* String sql1="Select * from Passenger";
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql1);
            
            DefaultComboBoxModel model=(DefaultComboBoxModel) cmbPasengrNo.getModel();
            while(rs.next()) {
                System.out.println(rs.getString(1)+" : "+rs.getString(2));
                model.addElement(rs.getString(1));
               
            }
      }
      catch(Exception e)

        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_formWindowGainedFocus

    private void cmbPasengrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPasengrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPasengrNoActionPerformed

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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        login_customer add=new login_customer();
        add.setVisible(true);
        add.show1();
        
        add.setnme(jTextField1.getText());
        this.setVisible(false);

        /*if(txtname.getText().length()==0)  // Checking for empty field
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
                user.setVisible(false);
                jLabel2.setVisible(false);
                jLabel5.setVisible(false);
                txtname.setVisible(false);
                txtpass.setVisible(false);
                jButton4.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(true);
                jButton7.setVisible(true);
                jButton9.setVisible(true);
                txtdob.setVisible(true);
                jLabel6.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
                txtname.setText("");
                txtpass.setText("");
            }
            */
    }//GEN-LAST:event_backActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JButton back;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox cmbPasengrNo;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu flyers;
    private javax.swing.JMenu food;
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFCode;
    private javax.swing.JLabel lblFlightCategory;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPassangerName;
    private javax.swing.JLabel lblSeatID;
    private javax.swing.JLabel lblSubFlightCategory;
    private javax.swing.JLabel lblsta;
    private javax.swing.JMenu search;
    // End of variables declaration//GEN-END:variables

}
