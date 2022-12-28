package View;

import Model.Sach_ThuVien;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class View_TTSach extends javax.swing.JFrame {

    DefaultTableModel tblsachTV;//tạo ra table không cột ,không dòng
    List<Sach_ThuVien> Sltv = new ArrayList<>();//lưu ds có trong sach_thuvien

    public View_TTSach() {

        initComponents();
        tblsachTV = (DefaultTableModel) jTable2.getModel();
        //ShowSachTv();
        //ShowDuLieuSachTv();
        setLocationRelativeTo(null);
    }

    private void ShowSachTv() {
        //Sltv = Them_Sua_Xoa_Find_TV.findSachAll();
        tblsachTV.setRowCount(0);//xóa dữ liệu trong table
        for (Sach_ThuVien sachTv : Sltv) {
            tblsachTV.addRow(new Object[]{sachTv.getMASACH(), sachTv.getTENSACH(), sachTv.getNAMXB(), sachTv.getNHAXB(), sachTv.getGIA(), sachTv.getSOLUONG()});
        }
    }

//    public void ShowDuLieuSachTv() {
//        try {
//            jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//                @Override
//                public void valueChanged(ListSelectionEvent e) {
//                    if (jTable2.getSelectedRow() >= 0) {
//                        ms.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 0) + "");
//                        ts.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 1) + "");
//                        nxb.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 2) + "");
//                        nnxb.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 3) + "");
//                        txtgia.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 4) + "");
//                        jcTinhtrang.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 5) + "");
//
//                    }
//                }
//            });
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ms = new javax.swing.JTextField();
        ts = new javax.swing.JTextField();
        nxb = new javax.swing.JTextField();
        nnxb = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btntk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtgia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTk = new javax.swing.JTextField();
        btnPrint1 = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sách Thư Viện");

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("Icon\\icons8-book-shelf-48.png")); // NOI18N
        jLabel1.setText("QUẢN LÝ SÁCH");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Sách :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Sách :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Năm Xuất Bản :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nhà Xuất Bản :");

        ms.setBackground(new java.awt.Color(204, 204, 204));

        ts.setBackground(new java.awt.Color(204, 204, 204));

        nxb.setBackground(new java.awt.Color(204, 204, 204));

        nnxb.setBackground(new java.awt.Color(204, 204, 204));

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 51, 51));
        btnThem.setIcon(new javax.swing.ImageIcon("Icon\\icons8-add-user-male-16.png")); // NOI18N
        btnThem.setText("Thêm");
//        btnThem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnThemActionPerformed(evt);
//            }
//        });

        btnxoa.setBackground(new java.awt.Color(153, 153, 153));
        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(0, 51, 51));
        btnxoa.setIcon(new javax.swing.ImageIcon("Icon\\icons8-add-trash-24.png")); // NOI18N
        btnxoa.setText("Xóa");
//        btnxoa.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnxoaActionPerformed(evt);
//            }
//        });

        btnsua.setBackground(new java.awt.Color(153, 153, 153));
        btnsua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsua.setForeground(new java.awt.Color(0, 51, 51));
        btnsua.setIcon(new javax.swing.ImageIcon("Icon\\icons8-update-left-rotation-24.png")); // NOI18N
        btnsua.setText("Sửa");
//        btnsua.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnsuaActionPerformed(evt);
//            }
//        });

        btntk.setBackground(new java.awt.Color(153, 153, 153));
        btntk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btntk.setForeground(new java.awt.Color(0, 51, 51));
        btntk.setIcon(new javax.swing.ImageIcon("Icon\\icons8-search-16.png")); // NOI18N
        btntk.setText("Tìm Kiếm Mã Sách");
//        btntk.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btntkActionPerformed(evt);
//            }
//        });

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Mã Sách", "Tên Sách", "Năm Xuất Bản", "Nhà Xuất Bản", "Giá", "Số Lượng"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnThoat.setBackground(new java.awt.Color(153, 153, 153));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 51, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon("Icon\\icons8-logout-rounded-left-26.png")); // NOI18N
        btnThoat.setText("Thoát");
//        btnThoat.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnThoatActionPerformed(evt);
//            }
//        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 51, 51));
        btnReset.setIcon(new javax.swing.ImageIcon("Icon\\icons8-available-updates-26.png")); // NOI18N
        btnReset.setText("Reset");
//        btnReset.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnResetActionPerformed(evt);
//            }
//        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Giá :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Số lượng :");

        txtgia.setBackground(new java.awt.Color(204, 204, 204));

        txtSoLuong.setBackground(new java.awt.Color(204, 204, 204));

        txtTk.setBackground(new java.awt.Color(204, 204, 204));
        txtTk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTk.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnPrint1.setBackground(new java.awt.Color(153, 153, 153));
        btnPrint1.setForeground(new java.awt.Color(0, 51, 51));
        btnPrint1.setIcon(new javax.swing.ImageIcon("Icon\\icons8-print-48.png")); // NOI18N
        btnPrint1.setText("Print");
//        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnPrint1ActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(42, 42, 42)
                                                .addComponent(btnxoa))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ts)
                                                                .addComponent(txtgia)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(nxb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel5)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnsua)
                                                                        .addComponent(jLabel7)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(nnxb)
                                                                                .addComponent(txtSoLuong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnReset)
                                                                        .addGap(113, 113, 113)))))
                                        .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(61, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(268, 268, 268)
                                                .addComponent(btntk))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPrint1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnThoat))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(btntk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        btnTroLai.setBackground(new java.awt.Color(153, 153, 153));
        btnTroLai.setForeground(new java.awt.Color(0, 102, 102));
        btnTroLai.setIcon(new javax.swing.ImageIcon("Icon\\icons8-logout-rounded-left-26.png")); // NOI18N
//        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnTroLaiActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTroLai)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>//GEN-END:initComponents

//    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        int th = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm", "Confirm", JOptionPane.YES_NO_OPTION);
//        if (th != JOptionPane.YES_OPTION) {
//            return;
//        }
//
//        String masach = ms.getText();
//        String tenssach = ts.getText();
//        int namxb = Integer.parseInt(nxb.getText());
//        String nhaxb = nnxb.getText();
//        int gia = Integer.parseInt(txtgia.getText());
//        String tt = jcTinhtrang.getSelectedItem().toString();
//        Sach_ThuVien std = new Sach_ThuVien(masach, tenssach, namxb, nhaxb, gia, tt);
//        Them_Sua_Xoa_Find_TV.insert(std);
//        JOptionPane.showMessageDialog(this, "Thêm thành công");
//        ShowSachTv();
//    }//GEN-LAST:event_btnThemActionPerformed

//    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
//        int select = jTable2.getSelectedRow();//lấy ra vị trí đc chọn
//        if (select >= 0) {
//            Sach_ThuVien stv = Sltv.get(select);//lấy ra dữ liệu đc chọn
//            int xoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa");
//            System.out.println(":" + xoa);//yes=0,no=1,cancel=2
//            if (xoa == 0) {
//                Them_Sua_Xoa_Find_TV.DeleteSach(stv.getMASACH());
//                JOptionPane.showMessageDialog(this, "Xóa thành công");
//                ShowSachTv();
//            }
//        }
//    }//GEN-LAST:event_btnxoaActionPerformed
//
//
//    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
//        int sua = JOptionPane.showConfirmDialog(this, "Bạn có muốn Sửa", "Confirm", JOptionPane.YES_NO_OPTION);
//        if (sua != JOptionPane.YES_OPTION) {
//            return;
//        }
//        String masach = ms.getText();
//        String tenssach = ts.getText();
//        int namxb = Integer.parseInt(nxb.getText());
//        String nhaxb = nnxb.getText();
//        int gia = Integer.parseInt(txtgia.getText());
//        String tt = jcTinhtrang.getSelectedItem().toString();
//        Sach_ThuVien std = new Sach_ThuVien(masach, tenssach, namxb, nhaxb, gia, tt);
//        Them_Sua_Xoa_Find_TV.Update(std);
//        JOptionPane.showMessageDialog(this, "Sửa thành công");
//        tblsachTV.setRowCount(0);
//        ShowSachTv();
//    }//GEN-LAST:event_btnsuaActionPerformed
//
//
//    private void btntkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkActionPerformed
//        String Search = txtTk.getText();
//        if (Search.length() > 0) {//độ dài>0 mới thực hiện
//            Sltv = Them_Sua_Xoa_Find_TV.findmasach(Search);
//            tblsachTV.setRowCount(0);
//            for (Sach_ThuVien sachTv : Sltv) {
//                tblsachTV.addRow(new Object[]{sachTv.getMASACH(), sachTv.getTENSACH(), sachTv.getNAMXB(), sachTv.getNHAXB(), sachTv.getGIA(), sachTv.getTINHTRANG()});
//
//            }
//        }
//
//    }//GEN-LAST:event_btntkActionPerformed
//
//    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
//        if (JOptionPane.showConfirmDialog(this, "Bạn có chắn muốn thoát không?", "Thông báo",
//                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            System.exit(0);
//        }
//    }//GEN-LAST:event_btnThoatActionPerformed
//
//    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
//        ms.setText("");
//        ts.setText("");
//        nxb.setText("");
//        nnxb.setText("");
//        txtgia.setText("");
//        txtTk.setText("");
//        jcTinhtrang.setSelectedItem("");
//    }//GEN-LAST:event_btnResetActionPerformed
//
//    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
//        int Exit = JOptionPane.showConfirmDialog(this, "Bạn có muốn rời khỏi trang?", "Confirm", JOptionPane.YES_NO_OPTION);
//        if (Exit != JOptionPane.YES_OPTION) {
//            return;
//        }
//        QUAN_LY_THU_VIEN_SACH tvs = new QUAN_LY_THU_VIEN_SACH();
//        tvs.setVisible(true);
//        this.dispose();
//    }//GEN-LAST:event_btnTroLaiActionPerformed
//
//    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
//        JFileChooser fc = new JFileChooser();//JFileChooser trong java là một đối tượng hiển thị khung cho phép bạn mở hoặc lưu file
//        fc.setDialogTitle("Lưu Tệp");//tên tiêu đề
//        int userSelection = fc.showSaveDialog(this);
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            File filetosave = fc.getSelectedFile();
//            try {
//                FileWriter fw = new FileWriter(filetosave);//Lớp FileWriter được sử dụng để ghi các dữ liệu theo định dạng ký tự vào một file
//                BufferedWriter bw = new BufferedWriter(fw);//Lớp BufferedWriter được sử dụng để cung cấp bộ đệm cho các các thể hiện của lớp Writer
//                for (int i = 0; i < jTable2.getRowCount(); i++) {
//                    for (int j = 0; j < jTable2.getColumnCount(); j++) {
//                        bw.write(jTable2.getValueAt(i, j).toString());
//                    }
//                    bw.newLine();
//                }
//                JOptionPane.showMessageDialog(this, "Thành Công ", "Thông Tin", JOptionPane.INFORMATION_MESSAGE);
//                bw.close();
//                fw.close();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Error", "Error message", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }//GEN-LAST:event_btnPrint1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_TTSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_TTSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_TTSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_TTSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_TTSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btntk;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField ms;
    private javax.swing.JTextField nnxb;
    private javax.swing.JTextField nxb;
    private javax.swing.JTextField ts;
    private javax.swing.JTextField txtTk;
    private javax.swing.JTextField txtgia;
    // End of variables declaration//GEN-END:variables
}
