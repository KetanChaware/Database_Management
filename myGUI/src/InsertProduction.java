
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KETAN1
 */
public class InsertProduction extends javax.swing.JFrame {

    /**
     * Creates new form InsertProduction
     */
    public InsertProduction() {
        initComponents();
    }

    
    private static java.sql.Date getCurrentDate() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label1.setBackground(new java.awt.Color(255, 153, 255));
        label1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label1.setText("CRESCENT  STEEL  INDUSTRIES  PVT.  LTD.");

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("      RODS");

        jLabel2.setBackground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("  SHEETS");

        jLabel3.setBackground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("    COILS");

        jLabel4.setBackground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("  GURDERS");

        jTextField1.setText("00");

        jTextField2.setText("00");

        jTextField3.setText("00");

        jTextField4.setText("00");

        jButton1.setText("SUBMIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setText("0.5\" x 10'");

        jLabel6.setText("1\" x 10'");

        jLabel7.setText("1.5\" x 15'");

        jLabel8.setText("5' x 7'");

        jLabel9.setText("12' x 12'");

        jLabel10.setText("jLabel10");

        jLabel11.setText("10' x 12'");

        jLabel12.setText("0.4cm");

        jLabel13.setText("0.5cm");

        jLabel14.setText("0.6cm");

        jLabel16.setText("1\" x 10'");

        jLabel17.setText("1.5\" x 15'");

        jTextField5.setText("00");

        jTextField6.setText("00");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setText("00");

        jTextField8.setText("00");

        jTextField9.setText("00");

        jTextField10.setText("00");

        jTextField11.setText("00");

        jTextField12.setText("00");

        jLabel18.setText("0.5\" x 10'");

        jLabel19.setFont(new java.awt.Font("AR CENA", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 102, 255));
        jLabel19.setText("INSERT TODAY'S PRODUCTION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(jTextField6)
                        .addComponent(jTextField7)
                        .addComponent(jTextField8)
                        .addComponent(jTextField9)
                        .addComponent(jTextField10)
                        .addComponent(jTextField11)
                        .addComponent(jTextField12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int rods1 = Integer.parseInt(jTextField1.getText());
        int rods2 = Integer.parseInt(jTextField2.getText());
        int rods3 = Integer.parseInt(jTextField3.getText());
        
        int sheets1 = Integer.parseInt(jTextField4.getText());
        int sheets2 = Integer.parseInt(jTextField5.getText());
        int sheets3 = Integer.parseInt(jTextField6.getText());
        
        int coils1 = Integer.parseInt(jTextField7.getText());
        int coils2 = Integer.parseInt(jTextField8.getText());
        int coils3 = Integer.parseInt(jTextField9.getText());
        
        int gurders1 = Integer.parseInt(jTextField10.getText());
        int gurders2 = Integer.parseInt(jTextField11.getText());
        int gurders3 = Integer.parseInt(jTextField12.getText());
        
        
        int ore = rods1 + rods2 + rods3 + sheets1 + sheets2 + sheets3 + coils1 + coils2 + coils3 + gurders1 + gurders2 + gurders3;
        int anthracite = rods1 + rods2 + rods3 + sheets1 + sheets2+ sheets3 + coils1 + coils2 + coils3 + gurders1 + gurders2 + gurders3;
        int chromium = rods1 + rods2 + rods3 + sheets1 + sheets2 + sheets3 + coils1 + coils2 + coils3+ gurders1 + gurders2 + gurders3;
        int nickel = rods1 + rods2 + rods3 + sheets1 + sheets2 + sheets3 + coils1 + coils2 + coils3 + gurders1 + gurders2 + gurders3;
       
        
        try{ 
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","iit");
        
        int flag = 0;
        
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select qty_available from raw_material where item_no = 101");
        rs.next();
        
        ore = rs.getInt("qty_available") - ore;
        
        PreparedStatement dml_stmt = con.prepareStatement("update raw_material set qty_available = ? where item_no = 101");
        dml_stmt.setInt(1,ore);
        
        
        rs=stmt.executeQuery("select qty_available from raw_material where item_no = 102");
        rs.next();
        
        anthracite = rs.getInt("qty_available") - anthracite;
        
        PreparedStatement dml_stmta = con.prepareStatement("update raw_material set qty_available = ? where item_no = 102");
        dml_stmta.setInt(1,anthracite);
        
        
        rs=stmt.executeQuery("select qty_available from raw_material where item_no = 103");
        rs.next();
        
        chromium = rs.getInt("qty_available") - chromium;
        
        PreparedStatement dml_stmtb = con.prepareStatement("update raw_material set qty_available = ? where item_no = 103");
        dml_stmtb.setInt(1,chromium);
        
        
        rs=stmt.executeQuery("select qty_available from raw_material where item_no = 104");
        rs.next();
        
        nickel = rs.getInt("qty_available") - nickel;
        
        PreparedStatement dml_stmtc = con.prepareStatement("update raw_material set qty_available = ? where item_no = 104");
        dml_stmtc.setInt(1,nickel);
        
        
        if(ore < 0 || anthracite < 0 || chromium <0 || nickel <0)
        {
            JOptionPane.showMessageDialog(null,"Not Enough Raw Materials Available");
        }
        else
        {
            dml_stmt.executeUpdate();
            dml_stmta.executeUpdate();
            dml_stmtb.executeUpdate();
            dml_stmtc.executeUpdate();
            flag = 1;
        }
        
        
        if(flag == 1)
        {
        
        String s1 = "insert into daily_production values (201,?,?)";
        PreparedStatement dml_stmt1 = con.prepareStatement(s1);
        dml_stmt1.setDate(1,getCurrentDate());
        dml_stmt1.setInt(2,rods1);
        dml_stmt1.executeUpdate();
                
        String s2 = "insert into daily_production values (202,?,?)";
        PreparedStatement dml_stmt2 = con.prepareStatement(s2);
        dml_stmt2.setDate(1,getCurrentDate());
        dml_stmt2.setInt(2,rods2);
        dml_stmt2.executeUpdate();
        
        String s3 = "insert into daily_production values (203,?,?)";
        PreparedStatement dml_stmt3 = con.prepareStatement(s3);
        dml_stmt3.setDate(1,getCurrentDate());
        dml_stmt3.setInt(2,rods3);
        dml_stmt3.executeUpdate();
        
        String s4 = "insert into daily_production values (101,?,?)";
        PreparedStatement dml_stmt4 = con.prepareStatement(s4);
        dml_stmt4.setDate(1,getCurrentDate());
        dml_stmt4.setInt(2,sheets2);
        dml_stmt4.executeUpdate();
        
        String s5 = "insert into daily_production values (102,?,?)";
        PreparedStatement dml_stmt5 = con.prepareStatement(s5);
        dml_stmt5.setDate(1,getCurrentDate());
        dml_stmt5.setInt(2,sheets3);
        dml_stmt5.executeUpdate();
        
        String s6 = "insert into daily_production values (103,?,?)";
        PreparedStatement dml_stmt6 = con.prepareStatement(s6);
        dml_stmt6.setDate(1,getCurrentDate());
        dml_stmt6.setInt(2,sheets1);
        dml_stmt6.executeUpdate();
        
        String s7 = "insert into daily_production values (301,?,?)";
        PreparedStatement dml_stmt7 = con.prepareStatement(s7);
        dml_stmt7.setDate(1,getCurrentDate());
        dml_stmt7.setInt(2,gurders1);
        dml_stmt7.executeUpdate();
        
        String s8= "insert into daily_production values (302,?,?)";
        PreparedStatement dml_stmt8 = con.prepareStatement(s8);
        dml_stmt8.setDate(1,getCurrentDate());
        dml_stmt8.setInt(2,gurders2);
        dml_stmt8.executeUpdate();
        
        String s9 = "insert into daily_production values (303,?,?)";
        PreparedStatement dml_stmt9 = con.prepareStatement(s9);
        dml_stmt9.setDate(1,getCurrentDate());
        dml_stmt9.setInt(2,gurders3);
        dml_stmt9.executeUpdate();
        
        String s10 = "insert into daily_production values (401,?,?)";
        PreparedStatement dml_stmt10 = con.prepareStatement(s10);
        dml_stmt10.setDate(1,getCurrentDate());
        dml_stmt10.setInt(2,coils1);
        dml_stmt10.executeUpdate();
        
        String s11 = "insert into daily_production values (402,?,?)";
        PreparedStatement dml_stmt11 = con.prepareStatement(s11);
        dml_stmt11.setDate(1,getCurrentDate());
        dml_stmt11.setInt(2,coils2);
        dml_stmt11.executeUpdate();
        
        String s12 = "insert into daily_production values (403,?,?)";
        PreparedStatement dml_stmt12 = con.prepareStatement(s12);
        dml_stmt12.setDate(1,getCurrentDate());
        dml_stmt12.setInt(2,coils3);
        dml_stmt12.executeUpdate();
        
        Statement stmt1=con.createStatement();
        ResultSet rs1=stmt1.executeQuery("select qty_on_hand from stocks where product_no = 101");
        rs1.next();
        
        int total = rs1.getInt("qty_on_hand");
        String a1 = "update stocks set qty_on_hand = ? where product_no = 101";
        PreparedStatement dml_stmt13 = con.prepareStatement(a1);
        dml_stmt13.setInt(1,sheets2 + total);
        dml_stmt13.executeUpdate();
        
        Statement stmt2=con.createStatement();
        ResultSet rs2=stmt2.executeQuery("select qty_on_hand from stocks where product_no = 102");
        rs2.next();
        
        total = rs2.getInt("qty_on_hand");
        String a2 = "update stocks set qty_on_hand = ? where product_no = 102";
        PreparedStatement dml_stmt14 = con.prepareStatement(a2);
        dml_stmt14.setInt(1,sheets3 + total);
        dml_stmt14.executeUpdate();
        
        
        Statement stmt3=con.createStatement();
        ResultSet rs3=stmt3.executeQuery("select qty_on_hand from stocks where product_no = 103");
        rs3.next();
        
        total = rs3.getInt("qty_on_hand");
        String a3 = "update stocks set qty_on_hand = ? where product_no = 103";
        PreparedStatement dml_stmt15 = con.prepareStatement(a3);
        dml_stmt15.setInt(1,sheets1 + total);
        dml_stmt15.executeUpdate();
        
        Statement stmt4=con.createStatement();
        ResultSet rs4=stmt4.executeQuery("select qty_on_hand from stocks where product_no = 201");
        rs4.next();
        
        total = rs4.getInt("qty_on_hand");
        String a4 = "update stocks set qty_on_hand = ? where product_no = 201";
        PreparedStatement dml_stmt16 = con.prepareStatement(a4);
        dml_stmt16.setInt(1,rods1 + total);
        dml_stmt16.executeUpdate();
        
        
        Statement stmt5=con.createStatement();
        ResultSet rs5=stmt5.executeQuery("select qty_on_hand from stocks where product_no = 202");
        rs5.next();
        
        total = rs5.getInt("qty_on_hand");
        String a5 = "update stocks set qty_on_hand = ? where product_no = 202";
        PreparedStatement dml_stmt17 = con.prepareStatement(a5);
        dml_stmt17.setInt(1,rods2 + total);
        dml_stmt17.executeUpdate();
        
        Statement stmt6=con.createStatement();
        ResultSet rs6=stmt6.executeQuery("select qty_on_hand from stocks where product_no = 203");
        rs6.next();
        
        total = rs6.getInt("qty_on_hand");
        String a6 = "update stocks set qty_on_hand = ? where product_no = 203";
        PreparedStatement dml_stmt18 = con.prepareStatement(a6);
        dml_stmt18.setInt(1,rods3 + total);
        dml_stmt18.executeUpdate();
        
        Statement stmt7=con.createStatement();
        ResultSet rs7=stmt7.executeQuery("select qty_on_hand from stocks where product_no = 301");
        rs7.next();
        
        total = rs7.getInt("qty_on_hand");
        String a7 = "update stocks set qty_on_hand = ? where product_no = 301";
        PreparedStatement dml_stmt19 = con.prepareStatement(a7);
        dml_stmt19.setInt(1,gurders1 + total);
        dml_stmt19.executeUpdate();
        
        Statement stmt8=con.createStatement();
        ResultSet rs8=stmt8.executeQuery("select qty_on_hand from stocks where product_no = 302");
        rs8.next();
        
        total = rs8.getInt("qty_on_hand");
        String a8 = "update stocks set qty_on_hand = ? where product_no = 302";
        PreparedStatement dml_stmt20 = con.prepareStatement(a8);
        dml_stmt20.setInt(1,gurders2 + total);
        dml_stmt20.executeUpdate();
        
        Statement stmt9=con.createStatement();
        ResultSet rs9=stmt9.executeQuery("select qty_on_hand from stocks where product_no = 303");
        rs9.next();
        
        total = rs9.getInt("qty_on_hand");
        String a9 = "update stocks set qty_on_hand = ? where product_no = 303";
        PreparedStatement dml_stmt21 = con.prepareStatement(a9);
        dml_stmt21.setInt(1,gurders3 + total);
        dml_stmt21.executeUpdate();
        
        Statement stmt10=con.createStatement();
        ResultSet rs10=stmt10.executeQuery("select qty_on_hand from stocks where product_no = 401");
        rs10.next();
        
        total = rs10.getInt("qty_on_hand");
        String a10 = "update stocks set qty_on_hand = ? where product_no = 401";
        PreparedStatement dml_stmt22 = con.prepareStatement(a10);
        dml_stmt22.setInt(1,coils1 + total);
        dml_stmt22.executeUpdate();
        
        Statement stmt11=con.createStatement();
        ResultSet rs11=stmt11.executeQuery("select qty_on_hand from stocks where product_no = 402");
        rs11.next();
        
        total = rs11.getInt("qty_on_hand");
        String a11 = "update stocks set qty_on_hand = ? where product_no = 402";
        PreparedStatement dml_stmt23 = con.prepareStatement(a11);
        dml_stmt23.setInt(1,coils2 + total);
        dml_stmt23.executeUpdate();
        
        Statement stmt12=con.createStatement();
        ResultSet rs12=stmt12.executeQuery("select qty_on_hand from stocks where product_no = 403");
        rs12.next();
        
        total = rs12.getInt("qty_on_hand");
        String a12 = "update stocks set qty_on_hand = ? where product_no = 403";
        PreparedStatement dml_stmt24 = con.prepareStatement(a12);
        dml_stmt24.setInt(1,coils3 + total);
        dml_stmt24.executeUpdate();
        
         JOptionPane.showMessageDialog(null,"Entries Submitted Successfully!!");
        }
       
        
       }catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertProduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
