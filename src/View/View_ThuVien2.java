package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View_ThuVien2 extends JFrame {

    public View_ThuVien2() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_ThuVien2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ThuVien2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ThuVien2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ThuVien2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQls = new javax.swing.JButton();
        btnQlm = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnQls1 = new javax.swing.JButton();
        btnQls2 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Thư Viện");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");
        jLabel1.setIcon(new javax.swing.ImageIcon("Icon\\icons8-book-shelf-48.png"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THƯ VIỆN SÁCH");

        btnQls.setBackground(new java.awt.Color(0, 102, 102));
        btnQls.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQls.setForeground(new java.awt.Color(0, 102, 102));
        //btnQls.setIcon(new javax.swing.ImageIcon("Icon\\icons8-library-64.png"));
        btnQls.setText("QUẢN LÝ SÁCH");


        btnQlm.setBackground(new java.awt.Color(0, 102, 102));
        btnQlm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQlm.setForeground(new java.awt.Color(0, 102, 102));
        //btnQlm.setIcon(new javax.swing.ImageIcon("Icon\\icons8-library-64.png"));
        btnQlm.setText("QUẢN LÝ MƯỢN TRẢ");


        btnthoat.setBackground(new java.awt.Color(102, 102, 102));
        btnthoat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnthoat.setForeground(new java.awt.Color(0, 102, 102));
        btnthoat.setText("Thoát");


        btnQls1.setBackground(new java.awt.Color(0, 102, 102));
        btnQls1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQls1.setForeground(new java.awt.Color(0, 102, 102));
        btnQls1.setText("BÁO CÁO, THỐNG KÊ");
        btnQls1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQls1ActionPerformed(evt);
            }
        });

        btnQls2.setBackground(new java.awt.Color(0, 102, 102));
        btnQls2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQls2.setForeground(new java.awt.Color(0, 102, 102));
        btnQls2.setText("QUẢN LÝ THỦ THƯ");
        btnQls2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQls2ActionPerformed(evt);
            }
        });
        jLabel4.setIcon(new javax.swing.ImageIcon("Icon\\icons8-book-shelf-48.png"));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnQls, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnQls1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnQlm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(61, 61, 61))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btnQls2)
                                        .addContainerGap(375, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(175, 175, 175))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnQls, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnQlm, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(btnQls1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(192, Short.MAX_VALUE)
                                        .addComponent(btnQls2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

    }// </editor-fold>






    private void btnQls1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnQls2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        View_ThuVien2 viewThuVien2 = new View_ThuVien2();
        viewThuVien2.setVisible(true);

    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnQlm;
    private javax.swing.JButton btnQls;
    private javax.swing.JButton btnQls1;
    private javax.swing.JButton btnQls2;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
    public void QLmActionPerformed(ActionListener log){
        btnQlm.addActionListener(log);
    }
    public void QlsActionPerformed(ActionListener log){
        btnQls.addActionListener(log);
    }
    public void QltkActionPerformed(ActionListener log){
        btnQls1.addActionListener(log);
    }
    public void QlttActionPerformed(ActionListener log){
        btnQls2.addActionListener(log);
    }
    public void ThoatActionPerformed(ActionListener log){
        btnthoat.addActionListener(log);
    }
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }

}

