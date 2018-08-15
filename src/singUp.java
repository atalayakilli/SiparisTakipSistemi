
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atalay AKILLI
 */
public class singUp extends javax.swing.JFrame {

    /**
     * Creates new form singUp
     */
    public singUp() {
        initComponents();
         DB db = new DB();
         db.baglan();
         
    }
public boolean dataKontrol(String mail){
    boolean result = false;
    mail = txtMail.getText().trim();
    String selectQuery = "select * from admins fadmin";
   
    
    try {
        DB db = new DB();
    ResultSet rs = db.baglan().executeQuery(selectQuery);
        
    while(rs.next()){
        String adminMail = rs.getString("fadmin").trim().toLowerCase();
      
      
        if(adminMail.equals(mail)){
            
            result=true;
            break;
        }

    }
    } catch (Exception e) {
        String reason = "Sing up data kontrol: ";
         Giris grs = new Giris();
             grs.hataYaz(reason,e);
    }
    
 return result;   
}
    public void dataGonder(){
        String name  = txtAdi.getText().trim();
        String surName = txtSoyAdi.getText().trim();
        String mail = txtMail.getText().trim();
        if(!mail.contains("@")||!mail.contains(".")){
            JOptionPane.showMessageDialog(rootPane,mail+" geçerli bir mail adresi değil.Lütfen geçerli bir mail adresi giriniz!");
            txtMail.setText("");
            txtMail.requestFocus();
        }
        else{
        String password = String.valueOf(txtPass.getPassword());
        String insertQuery = "insert into admins values(null,'"+name+"','"+surName+"','"+mail+"','"+password+"')";
        int passSize = password.length();
        if(passSize<5){
            JOptionPane.showMessageDialog(rootPane,"Şifreniz en az 5 haneli olmalıdır!");
            txtPass.setText("");
            txtPass.requestFocus();
        }
        else{
        
        try {
           DB db = new DB();
           int writeResult = db.baglan().executeUpdate(insertQuery);
           if(writeResult>0){
               JOptionPane.showMessageDialog(rootPane,"Sn."+name+" "+surName+" "+"başarıyla kayıt oldunuz!");
           }
           
            
        } catch (Exception e) {
            String reason ="Class: singUp, Function: dataGonder --- ";
             Giris grs = new Giris();
             grs.hataYaz(reason,e);
        }
        txtAdi.setText("");
        txtSoyAdi.setText("");
        txtMail.setText("");
        txtPass.setText("");
        txtAdi.requestFocus();}
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyAdi = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblSifre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        asd.setBorder(javax.swing.BorderFactory.createTitledBorder("Admin Kayıt"));

        jLabel1.setText("Adı");

        jLabel2.setText("Soy Adı");

        jLabel3.setText("Mail");

        jLabel4.setText("Şifre");

        txtAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdiKeyReleased(evt);
            }
        });

        txtSoyAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoyAdiKeyReleased(evt);
            }
        });

        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kayıt Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout asdLayout = new javax.swing.GroupLayout(asd);
        asd.setLayout(asdLayout);
        asdLayout.setHorizontalGroup(
            asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifre)
                    .addGroup(asdLayout.createSequentialGroup()
                        .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(asdLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPass)
                            .addComponent(txtMail)
                            .addComponent(txtSoyAdi)
                            .addComponent(txtAdi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asdLayout.setVerticalGroup(
            asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSifre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(txtAdi.getText().trim().equals("")){
           JOptionPane.showMessageDialog(rootPane,"Adı kısmı boş olamaz!");
           txtAdi.requestFocus();
        }
        else if(txtSoyAdi.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Soy Adı kısmı boş olamaz!");
            txtSoyAdi.requestFocus();
        }
        else if(txtMail.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Mail kısmı boş olamaz!");
            txtMail.requestFocus();
        }
        else if(String.valueOf(txtPass.getPassword()).trim().equals("")){
        JOptionPane.showMessageDialog(rootPane,"Şifre kısmı boş olamaz!");
        txtPass.requestFocus();
    }
        else{
            
            String mail = txtMail.getText().trim().toLowerCase();
        if(dataKontrol(mail)){
            JOptionPane.showMessageDialog(rootPane,mail+" ile başka bir kullanıcı kayıtlı! Lütfen farklı bir mail adresi giriniz.");
            txtMail.setText("");
            txtMail.requestFocus();
       }
        else {
          dataGonder();
        }
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Giris grs = new Giris();
        grs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdiKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton2ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtAdiKeyReleased

    private void txtSoyAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoyAdiKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton2ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtSoyAdiKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton2ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtMailKeyReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        String a = String.valueOf(txtPass.getPassword());
        lblSifre.setText(a);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
       lblSifre.setText("");
    }//GEN-LAST:event_jButton3MouseReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton2ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtPassKeyReleased

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
            java.util.logging.Logger.getLogger(singUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSoyAdi;
    // End of variables declaration//GEN-END:variables
}
