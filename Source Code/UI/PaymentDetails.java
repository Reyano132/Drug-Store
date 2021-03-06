
package com.UI;

import com.dao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rishi
 */
public class PaymentDetails extends javax.swing.JFrame {

    
    public PaymentDetails() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Payment = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(102, 179, 255));
        Background.setPreferredSize(new java.awt.Dimension(410, 400));

        Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Payment Details");

        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/Icons/icons8_Multiply_32px.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Payment.setEditable(false);
        Payment.setBorder(new javax.swing.border.MatteBorder(null));
        Payment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Payment.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Payment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Close))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Close)
                .addGap(11, 11, 11)
                .addComponent(Title)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseMouseClicked


    
   public void getWindow(int account_id) throws SQLException{
       Connect c=new Connect();
       Connection con=c.getConnection();
       PreparedStatement ps=con.prepareStatement("select P.payment_id,P.amount,P.date,P.mode from ACTIVITY_PAYMENT A ,PAYMENT P where A.activity_id=? and A.payment_id=P.payment_id");
       ps.setInt(1,account_id);
       Integer i=1;
       ResultSet rs=ps.executeQuery();
       String data=new String("");
       while(rs.next()){
           String card="";
           if(rs.getString("MODE").equals("CARD")){
               PreparedStatement ps1=con.prepareStatement("select * from CARD where payment_id=?");
               ps1.setString(1,rs.getString("payment_id"));
               ResultSet rs1=ps1.executeQuery();
               card="\nCard Type:"+rs1.getString("card_type")+"\nCard Number:"+rs1.getString("card_number")+"\nBank:"+rs1.getString("bank");
               ps1.close();
           }else if(rs.getString("MODE").equals("CHEQUE")){
               PreparedStatement ps2=con.prepareStatement("select * from CHEQUE where payment_id=?");
               ps2.setString(1, rs.getString("payment_id"));
               ResultSet rs2=ps2.executeQuery();
               card="\nCheque Number:"+rs2.getString("Ch_number")+"\nBank:"+rs2.getString("bank_name");
               rs2.close();
               ps2.close();
           }
           
           data+="Payment :"+i.toString()+"\nDate:"+rs.getString("date")+"\nAmount:"+rs.getString("amount")+"\nMode:"+rs.getString("mode")+card+"\n----------------------------------------\n";
           
           i++;
       }
       Payment.setText(data);
       this.setVisible(true);
       con.close();
   }
    
   
   public static void main(String[] ar){
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
               
            }
        });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Close;
    private javax.swing.JTextPane Payment;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
