
package com.UI;

import com.controlers.Controler;
import com.dao.Connect;
import com.dao.DateToString;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author Rishi
 */
public class AddActivity extends javax.swing.JFrame {

    
    private int sid,key=0;
    private Map<String,Integer> hm =new HashMap<String,Integer>(); 
    public AddActivity() {
        initComponents();
        this.setLocationRelativeTo(null);
        Add.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        company = new javax.swing.JComboBox<>();
        Exp = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        Date_act = new com.toedter.calendar.JDateChooser();

        jLabel7.setText("jLabel7");

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(102, 179, 255));
        Background.setPreferredSize(new java.awt.Dimension(410, 400));

        Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("New Activity");

        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/Icons/icons8_Multiply_32px.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Company:");
        Form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 132, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Name Of Medicine:");
        Form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setToolTipText("Name Of Medicine");
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Form.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Quantity:");
        Form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Expiry Date:");
        Form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        quantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quantity.setToolTipText("Qunatity");
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        Form.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, -1));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.setToolTipText("Total Amount");
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        Form.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Total Amount:");
        Form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Add.setBackground(new java.awt.Color(102, 179, 255));
        Add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("Add");
        Add.setToolTipText("Add New Supplier");
        Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.setOpaque(true);
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Form.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 105, 39));

        company.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        company.setMaximumRowCount(20);
        company.setToolTipText("Select Supplier");
        company.setBorder(null);
        Form.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 190, -1));
        Form.add(Exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 190, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Activity Date:");
        Form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        Form.add(Date_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Title)
                        .addGap(67, 67, 67)
                        .addComponent(Close))
                    .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        try {
            Connect c=new Connect();
            Connection con=c.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(activity_id)+1 as pkey from activity");
            key=rs.getInt("pkey");
            st.close();
            con.close();
            Payment pay=new Payment();
            sid=hm.get(company.getSelectedItem());
            String medname=name.getText().toUpperCase();
            int quant=Integer.parseInt(quantity.getText());
            String date=DateToString.getDate(Exp.getDate().getDate(),Exp.getDate().getMonth(), Exp.getDate().getYear());
            String act_date=DateToString.getDate(Date_act.getDate().getDate(), Date_act.getDate().getMonth(),Date_act.getDate().getYear());
            int total=Integer.parseInt(amount.getText()); 
            this.dispose();
            pay.getWindow(key, sid, medname, total, quant, date,act_date);
            
        } catch (SQLException ex) {
            Logger.getLogger(AddActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_AddMouseClicked

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        char v=evt.getKeyChar();
        if(!Character.isDigit(v)||v==KeyEvent.VK_BACKSPACE){
            evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char v=evt.getKeyChar();
        if(!Character.isDigit(v)||v==KeyEvent.VK_BACKSPACE){
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    
    public void getWindow() throws SQLException{
        Connect c=new Connect();
        Connection con=c.getConnection();
        Statement st=con.createStatement();
        ResultSet rs1=st.executeQuery("select supplier_id,company from suppliers");
        while(rs1.next()){
            hm.put(rs1.getString("company"),rs1.getInt("supplier_id"));
        }
        Object[] companies=hm.keySet().toArray();
        for (Object i:companies){
            company.addItem(i.toString());
        }
        this.setVisible(true);
    }
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Close;
    private com.toedter.calendar.JDateChooser Date_act;
    private com.toedter.calendar.JDateChooser Exp;
    private javax.swing.JPanel Form;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> company;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
