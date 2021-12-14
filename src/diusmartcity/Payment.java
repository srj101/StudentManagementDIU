/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diusmartcity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SRJOY
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public  Connection conn=null;
    private int studentId;
    public Payment() {
        initComponents();
    }
    
    public Payment(int id){
        this.studentId = id;
        DatabaseConnection Database = new DatabaseConnection();
        conn = Database.getcon();
        initComponents();
        
        DefaultTableModel tblModel = (DefaultTableModel)TransactionTable.getModel();
        
        try {
                String SQLL = "SELECT * FROM payments where studentId='"+this.studentId+"'";
                try (Statement stmt = conn.createStatement()) {
                    ResultSet rs = stmt.executeQuery(SQLL);

                    while(rs.next()){
                        String type = rs.getString("type");
                        String amount = Double.toString(rs.getDouble("amount"));
                        String date = rs.getString("date");
                        String transactionID = rs.getString("transactionId");
                        
                        
                        String tbData[] = {type,amount,date,transactionID};
                        
                        tblModel.addRow(tbData);

                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    
    public static String generateTransactionID(int len) {
        
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        paymentTypeCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        navBackButton = new javax.swing.JButton();
        dateSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diusmartcity/payment.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 1260, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 225, 23, 506));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Payment Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 225, 105, 28));

        paymentTypeCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paymentTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mid Term", "Final Term" }));
        getContentPane().add(paymentTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 228, 114, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount (Taka)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 312, -1, -1));

        amountField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 312, 114, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 391, 105, 20));

        payButton.setBackground(new java.awt.Color(51, 255, 51));
        payButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payButton.setText("Pay Now! ");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 549, -1, -1));

        TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Type", "Amount", "Date", "Transaction ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TransactionTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 225, -1, 384));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Transactions");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 185, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setText("x");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 11, -1, 34));

        navBackButton.setBackground(new java.awt.Color(255, 51, 0));
        navBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        navBackButton.setText("Back");
        navBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(navBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, -1, -1));

        dateSpinner.setModel(new javax.swing.SpinnerDateModel());
        getContentPane().add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 390, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diusmartcity/payamentinfo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBackButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new StudentPortal().setVisible(true);
    }//GEN-LAST:event_navBackButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        String paymentType = paymentTypeCombo.getSelectedItem().toString();
        Double amount = Double.parseDouble(amountField.getText());
        String date = dateSpinner.getValue().toString();
        String transactionNumber = generateTransactionID(7);
        
        String SQL = "INSERT INTO payments(studentId,type,amount,date,transactionId) VALUES('"+this.studentId+"','"+paymentType+"','"+amount+"','"+date+"','"+transactionNumber+"')";
        String updateSQL = "UPDATE student SET paid=paid+'"+amount+"',payable=payable-'"+amount+"' WHERE id='"+this.studentId+"'";
        
        
        
        try{
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(SQL);
                    stmt.execute(updateSQL);
                    JOptionPane.showMessageDialog(null, "Successful payment\nTransactionNo. '"+transactionNumber+"'","Payment Confirmation",JOptionPane.INFORMATION_MESSAGE);
                    
                    dispose();
                    new Payment(this.studentId).setVisible(true);
                    
                }
        }catch(SQLException e) {
            System.out.println("Something went wrong :"+e);
        }
        
    }//GEN-LAST:event_payButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TransactionTable;
    private javax.swing.JTextField amountField;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton navBackButton;
    private javax.swing.JButton payButton;
    private javax.swing.JComboBox<String> paymentTypeCombo;
    // End of variables declaration//GEN-END:variables
}
