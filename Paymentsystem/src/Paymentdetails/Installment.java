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
public class Installment extends javax.swing.JFrame {

    /**
     * Creates new form Installment
     */
    public Installment() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ist_id = new javax.swing.JTextField();
        ico_id = new javax.swing.JTextField();
        ico_fees = new javax.swing.JTextField();
        ipaynow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Amount of Payment");

        ist_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ist_idKeyPressed(evt);
            }
        });

        ico_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ico_idActionPerformed(evt);
            }
        });
        ico_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ico_idKeyPressed(evt);
            }
        });

        ico_fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ico_feesKeyPressed(evt);
            }
        });

        ipaynow.setBackground(new java.awt.Color(0, 0, 0));
        ipaynow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ipaynow.setForeground(new java.awt.Color(240, 240, 240));
        ipaynow.setText("Pay Now");
        ipaynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipaynowActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
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
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ico_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ico_id, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ist_id, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ipaynow, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ist_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ico_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ico_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(ipaynow, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ico_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ico_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ico_idActionPerformed

    private void ipaynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipaynowActionPerformed

 if(ist_id.getText().length()==0 && ico_id.getText().length()==0 && ico_fees.getText().length()==0 ){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }
else if(ist_id.getText().length()==0 || ico_id.getText().length()==0 || ico_fees.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }
         else{String x= ist_id.getText();
int s_id=Integer.parseInt(x);
String y=ico_id.getText();
int c_id=Integer.parseInt(y);
String z=ico_fees.getText();
int amount=Integer.parseInt(z);
Databaseconnection db=new Databaseconnection();
boolean s=db.update_payment(c_id,s_id,amount);

if(s==true){
    JOptionPane.showMessageDialog(this, "Successfull!");
    ist_id.setText("");
    ico_id.setText("");
    ico_fees.setText("");
   }
else{
    JOptionPane.showMessageDialog(this, "Error");
} }       // TODO add your handling code here:
    }//GEN-LAST:event_ipaynowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int x=JOptionPane.showConfirmDialog(this,"Are you sure?","confirm",JOptionPane.YES_NO_OPTION);
if(x==JOptionPane.YES_OPTION){
this.hide();
Getpayments obj=new Getpayments();
obj.setVisible(true);}
else if(x==JOptionPane.NO_OPTION){
System.out.println("No...option selected");
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ico_feesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ico_feesKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(ist_id.getText().length()==0 && ico_id.getText().length()==0 && ico_fees.getText().length()==0 ){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }
else if(ist_id.getText().length()==0 || ico_id.getText().length()==0 || ico_fees.getText().length()==0){
     JOptionPane.showMessageDialog(null," FILL UP ALL THE FIELDS!");
         }}
/*else if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
                ico_id.requestFocus();}*/
         else{String x= ist_id.getText();
int s_id=Integer.parseInt(x);
String y=ico_id.getText();
int c_id=Integer.parseInt(y);
String z=ico_fees.getText();
int amount=Integer.parseInt(z);
Databaseconnection db=new Databaseconnection();
boolean s=db.update_payment(c_id,s_id,amount);

if(s==true){
    JOptionPane.showMessageDialog(this, "Successfull!");
    ist_id.setText("");
    ico_id.setText("");
    ico_fees.setText("");
   }
else{
    JOptionPane.showMessageDialog(this, "Error! student ID or Course Id don't match");
}  }        // TODO add your handling code here:
    }//GEN-LAST:event_ico_feesKeyPressed

    private void ist_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ist_idKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
            ico_id.requestFocus();}
       // TODO add your handling code here:
    }//GEN-LAST:event_ist_idKeyPressed

    private void ico_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ico_idKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        //if(ico_id.getText().length()==0)
          ico_fees.requestFocus();}
        /*else if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
                ist_id.requestFocus();} */       // TODO add your handling code here:
    }//GEN-LAST:event_ico_idKeyPressed

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
            java.util.logging.Logger.getLogger(Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Installment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ico_fees;
    private javax.swing.JTextField ico_id;
    private javax.swing.JButton ipaynow;
    private javax.swing.JTextField ist_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}