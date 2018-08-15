
import java.awt.event.KeyEvent;
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
public class siparisEkle extends javax.swing.JFrame {

    /**
     * Creates new form siparisEkle
     */
    public siparisEkle() {
        initComponents();
    }

    public void dataGonder(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyAdi = new javax.swing.JTextField();
        txtUrun = new javax.swing.JTextField();
        txtAdet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Sipariş Ekle"));

        jLabel1.setText("Adı");

        jLabel2.setText("Soy Adı");

        jLabel3.setText("Ürün");

        jLabel4.setText("Adet");

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

        txtUrun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUrunKeyReleased(evt);
            }
        });

        txtAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdetKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdetKeyTyped(evt);
            }
        });

        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 242, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdi)
                            .addComponent(txtSoyAdi)
                            .addComponent(txtUrun)
                            .addComponent(txtAdet))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String adi = txtAdi.getText().trim();
String soyAdi = txtSoyAdi.getText().trim();
String urun = txtUrun.getText().trim();
String adet = txtAdet.getText().trim();
String durum = "";

if(adi.equals("")){
    JOptionPane.showMessageDialog(rootPane, "Müşteri adı boş olamaz!");
    txtAdi.requestFocus();
}
else if(soyAdi.equals("")){
    JOptionPane.showMessageDialog(rootPane, "Müşteri soy adı boş olamaz!");
    txtSoyAdi.requestFocus();
}
else if(urun.equals("")){
    JOptionPane.showMessageDialog(rootPane, "Ürün adı boş olamaz!");
    txtUrun.requestFocus();
}
else if(adet.equals("")){
    JOptionPane.showMessageDialog(rootPane, "Adet kısmı boş olamaz!");
    txtAdet.requestFocus();
}
else {
   int adetI = Integer.valueOf(adet);
    String insertQuery = "insert into siparisler values(null,'"+adi+"','"+soyAdi+"','"+urun+"','"+adetI+"','"+durum+"')";
    try {
        DB db =new DB();
        int writeResult = db.baglan().executeUpdate(insertQuery); 
        if(writeResult>0){
            JOptionPane.showMessageDialog(rootPane, "Siparişiniz eklendi!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Sipariş ekleme hatası!");
        }
    } catch (Exception e) {
        String reason ="Class: siparisEkle, Function: dataGonder --- ";
                
         Giris grs = new Giris();
             grs.hataYaz(reason,e);
    }
 siparisEkrani se = new siparisEkrani();
 se.setVisible(true);
 dispose();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAdetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdetKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtAdetKeyReleased

    private void txtUrunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUrunKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtUrunKeyReleased

    private void txtSoyAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoyAdiKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtSoyAdiKeyReleased

    private void txtAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdiKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
                    
        }
    }//GEN-LAST:event_txtAdiKeyReleased

    private void txtAdetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdetKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != '\b')) {
 
            evt.consume();
        }
    }//GEN-LAST:event_txtAdetKeyTyped
    
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
            java.util.logging.Logger.getLogger(siparisEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siparisEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siparisEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siparisEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siparisEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdet;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtSoyAdi;
    private javax.swing.JTextField txtUrun;
    // End of variables declaration//GEN-END:variables
}
