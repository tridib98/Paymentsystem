/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paymentdetails;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Tridib
 */
public class Pay extends javax.swing.JFrame {

    /**
     * Creates new form Pay
     */
    public Pay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PAYNOW = new javax.swing.JButton();
        st_id = new javax.swing.JTextField();
        co_id = new javax.swing.JTextField();
        co_fees = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pay Now", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Student ID");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Course ID");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Course Fees");

        PAYNOW.setBackground(new java.awt.Color(0, 51, 51));
        PAYNOW.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PAYNOW.setForeground(new java.awt.Color(255, 255, 0));
        PAYNOW.setText("PAY NOW");
        PAYNOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYNOWActionPerformed(evt);
            }
        });

        st_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_idActionPerformed(evt);
            }
        });
        st_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                st_idKeyPressed(evt);
            }
        });

        co_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                co_idKeyPressed(evt);
            }
        });

        co_fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                co_feesKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAYNOW, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st_id, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(co_id)
                            .addComponent(co_fees))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(st_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(co_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(co_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(PAYNOW, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PAYNOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYNOWActionPerformed

        if(st_id.getText().length()==0 && co_id.getText().length()==0 && co_fees.getText().length()==0 ){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDs!");
         }
else if(st_id.getText().length()==0 || co_id.getText().length()==0 || co_fees.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }
         else{ String x= st_id.getText();
int s_id=Integer.parseInt(x);
String y=co_id.getText();
int c_id=Integer.parseInt(y);
String z=co_fees.getText();
int amount=Integer.parseInt(z);
Databaseconnection db=new Databaseconnection();
boolean s=db.add_payment(c_id,s_id,amount);

if(s==true){
    JOptionPane.showMessageDialog(this, "Successfull!");
    st_id.setText("");
    co_id.setText("");
    co_fees.setText("");
    
   }
else{
    JOptionPane.showMessageDialog(this, "ERROR! Check your Student id/course Id");}
}        // TODO add your handling code here:
    }//GEN-LAST:event_PAYNOWActionPerformed

    private void st_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int x=JOptionPane.showConfirmDialog(this,"Are you sure?","confirm",JOptionPane.YES_NO_OPTION);
if(x==JOptionPane.YES_OPTION){
this.hide();
Getpayments obj=new Getpayments();
obj.setVisible(true);}
else if(x==JOptionPane.NO_OPTION){
System.out.println("No...option selected");
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void st_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st_idKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
         /*if(st_id.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP THE FIELD!");
         }
         else{*/
       co_id.requestFocus(); }  // }        // TODO add your handling code here:
    }//GEN-LAST:event_st_idKeyPressed

    private void co_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_co_idKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
         /*if(co_id.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP THE FIELD!");
         }
         else{*/
       co_fees.requestFocus(); }  // }        // TODO add your handling code here:
    }//GEN-LAST:event_co_idKeyPressed

    private void co_feesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_co_feesKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(st_id.getText().length()==0 && co_id.getText().length()==0 && co_fees.getText().length()==0 ){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDs!");
         }
else if(st_id.getText().length()==0 || co_id.getText().length()==0 || co_fees.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }}
         else{    String x= st_id.getText();
int s_id=Integer.parseInt(x);
String y=co_id.getText();
int c_id=Integer.parseInt(y);
String z=co_fees.getText();
int amount=Integer.parseInt(z);
Databaseconnection db=new Databaseconnection();
boolean s=db.add_payment(c_id,s_id,amount);

if(s==true){
    JOptionPane.showMessageDialog(this, "Successfull!");
    st_id.setText("");
    co_id.setText("");
    co_fees.setText("");
   }
else{
    JOptionPane.showMessageDialog(this, "Error! Check you Student ID/Course ID");}
}        // T // TODO add your handling code here:
    }//GEN-LAST:event_co_feesKeyPressed

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
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PAYNOW;
    private javax.swing.JTextField co_fees;
    private javax.swing.JTextField co_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField st_id;
    // End of variables declaration//GEN-END:variables
}