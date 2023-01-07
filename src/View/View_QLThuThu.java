package View;

import Model.NhanVien_ThuVien;
import Model.Sach_ThuVien;
import Model.TTTableModel;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.util.List;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_QLThuThu extends javax.swing.JFrame {

    DefaultTableModel tblsachTV;//tạo ra table không cột ,không dòng
   List<NhanVien_ThuVien> Sltv = new ArrayList<>();//lưu ds có trong NhanVien_thuvien

    public View_QLThuThu() {

        initComponents();
        tblsachTV = (DefaultTableModel) jTable2.getModel();
        ShowSachTv();
       // ShowDuLieuSachTv();

    }

    private void ShowSachTv() {
//        Sltv = Them_Sua_Xoa_Find_TV.findSachAll();
//        tblsachTV.setRowCount(0);//xóa dữ liệu trong table
//        for (Sach_ThuVien sachTv : Sltv) {
//            tblsachTV.addRow(new Object[]{sachTv.getMASACH(), sachTv.getTENSACH(), sachTv.getNAMXB(), sachTv.getNHAXB(), sachTv.getGIA(), sachTv.getTINHTRANG()});
//        }
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mtt = new javax.swing.JTextField();
        ns = new JDateChooser();
        hvt = new javax.swing.JTextField();
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
        diachi = new javax.swing.JTextField();
        txtTk = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        setTitle("Quản Lý Thủ Thư");
        setLocation(400,5);
        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("Icon\\Reading.png"));
        jLabel1.setText("QUẢN LÝ THỦ THƯ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Thủ Thư :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ngày Sinh :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Họ Và Tên :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Giới Tính :");

        mtt.setBackground(new java.awt.Color(204, 204, 204));

        ns.setBackground(new java.awt.Color(204, 204, 204));

        hvt.setBackground(new java.awt.Color(204, 204, 204));

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 51, 51));
        btnThem.setText("Thêm");
        btnThem.setIcon(new javax.swing.ImageIcon("Icon\\icons8-add-user-male-16.png"));
//        btnThem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnThemActionPerformed(evt);
//            }
//        });

        btnxoa.setBackground(new java.awt.Color(153, 153, 153));
        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(0, 51, 51));
        btnxoa.setText("Xóa");
        btnxoa.setIcon(new javax.swing.ImageIcon("Icon\\icons8-add-trash-24.png"));
//        btnxoa.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnxoaActionPerformed(evt);
//            }
//        });

        btnsua.setBackground(new java.awt.Color(153, 153, 153));
        btnsua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsua.setForeground(new java.awt.Color(0, 51, 51));
        btnsua.setText("Sửa");
        btnsua.setIcon(new javax.swing.ImageIcon("Icon\\icons8-update-left-rotation-24.png"));
//        btnsua.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnsuaActionPerformed(evt);
//            }
//        });

        btntk.setBackground(new java.awt.Color(153, 153, 153));
        btntk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btntk.setForeground(new java.awt.Color(0, 51, 51));
        btntk.setText("Tìm Kiếm Theo Mã Thủ Thư");
        btntk.setIcon(new javax.swing.ImageIcon("Icon\\icons8-search-16.png"));
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
                        "Mã TT", "Họ và Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Email"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable2);

        btnThoat.setBackground(new java.awt.Color(153, 153, 153));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 51, 51));
        btnThoat.setText("Thoát");
        btnThoat.setIcon(new javax.swing.ImageIcon("Icon\\icons8-logout-rounded-left-26.png"));
//        btnThoat.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnThoatActionPerformed(evt);
//            }
//        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 51, 51));
        btnReset.setText("Reset");
        btnReset.setIcon(new javax.swing.ImageIcon("Icon\\icons8-available-updates-26.png"));
//        btnReset.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnResetActionPerformed(evt);
//            }
//        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa Chỉ :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email :");

        diachi.setBackground(new java.awt.Color(204, 204, 204));

        txtTk.setBackground(new java.awt.Color(204, 204, 204));
        txtTk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTk.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        email.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Username :");

        txtuser.setBackground(new java.awt.Color(204, 204, 204));

        txtpass.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Password :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
//        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jComboBox1ActionPerformed(evt);
//            }
//        });
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Nhân Viên" }));
        jComboBox2.setToolTipText("");
//        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jComboBox2ActionPerformed(evt);
//            }
//        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(mtt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnThem)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ns)
                                                                        .addComponent(diachi)
                                                                        .addComponent(txtuser)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(80, 80, 80)
                                                                .addComponent(btnxoa)
                                                                .addGap(55, 55, 55)
                                                                .addComponent(btnsua)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(hvt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel9)
                                                                                        .addComponent(jLabel7))))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(email))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(13, 13, 13)
                                                                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(36, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(btnReset)
                                                .addGap(47, 47, 47)
                                                .addComponent(btnThoat)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(242, 242, 242)
                                                .addComponent(btntk))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(164, 164, 164)
                                                .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(185, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9))
                                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnThoat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btntk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        btnTroLai.setBackground(new java.awt.Color(153, 153, 153));
        btnTroLai.setForeground(new java.awt.Color(0, 102, 102));
        btnTroLai.setIcon(new javax.swing.ImageIcon("Icon\\icons8-logout-rounded-left-26.png"));
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
    }// </editor-fold>

//    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
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
//    }

//    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
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
//    }


//    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
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
//    }


//    private void btntkActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
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
//    }

//    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        if (JOptionPane.showConfirmDialog(this, "Bạn có chắn muốn thoát không?", "Thông báo",
//                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            System.exit(0);
//        }
//    }

//    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        ms.setText("");
//        ts.setText("");
//        nxb.setText("");
//        nnxb.setText("");
//        txtgia.setText("");
//        txtTk.setText("");
//        jcTinhtrang.setSelectedItem("");
//    }

//    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        int Exit = JOptionPane.showConfirmDialog(this, "Bạn có muốn rời khỏi trang?", "Confirm", JOptionPane.YES_NO_OPTION);
//        if (Exit != JOptionPane.YES_OPTION) {
//            return;
//        }
//        QUAN_LY_THU_VIEN_SACH tvs = new QUAN_LY_THU_VIEN_SACH();
//        tvs.setVisible(true);
//        this.dispose();
//    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(View_QLThuThu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_QLThuThu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_QLThuThu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_QLThuThu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_QLThuThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    public javax.swing.JButton btnReset;
    public javax.swing.JButton btnThem;
    public javax.swing.JButton btnThoat;
    public javax.swing.JButton btnTroLai;
    public javax.swing.JButton btnsua;
    public javax.swing.JButton btntk;
    public javax.swing.JButton btnxoa;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public static javax.swing.JTextField mtt;
    public static javax.swing.JTextField email;
    public static javax.swing.JTextField hvt;
    public JDateChooser ns;
    public static javax.swing.JTextField txtTk;
    public static javax.swing.JTextField diachi;
    public static javax.swing.JPasswordField txtpass;
    public static javax.swing.JTextField txtuser;
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public void BtnThoatActionPerformed(ActionListener log){ btnThoat.addActionListener(log);}
    public void BtnSuaActionPerformed(ActionListener log){ btnsua.addActionListener(log);}
    public void BtnThemActionPerformed(ActionListener log){ btnThem.addActionListener(log);}
    public void BtnXoaActionPerformed(ActionListener log){ btnxoa.addActionListener(log);}
    public void BtnTrolaiActionPerformed(ActionListener log){ btnTroLai.addActionListener(log);}
    public void BtnTkActionPerformed(ActionListener log){ btntk.addActionListener(log);}
    public void BtnResetActionPerformed(ActionListener log){ btnReset.addActionListener(log);}
    public void setTableModel(TTTableModel tableModel){jTable2.setModel(tableModel);}
    public NhanVien_ThuVien getNhanVien(){
        NhanVien_ThuVien nhanvien = new NhanVien_ThuVien(mtt.getText(), hvt.getText(), ns.getDate(),
                jComboBox1.getSelectedItem().toString(), diachi.getText(),email.getText());
        return nhanvien;
    }
    // End of variables declaration
}
