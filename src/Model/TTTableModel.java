package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TTTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã TT", "Họ và Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Email","User"};
    private List<NhanVien_ThuVien> nhanvien;
    public TTTableModel(){
        nhanvien = new ArrayList<>();
    }
    public void setData(List<NhanVien_ThuVien> nhanvien){
        this.nhanvien = nhanvien;
        fireTableDataChanged();
    }
    public String getColumnName(int i) {
        return columnNames[i];
    }
    @Override
    public int getRowCount() {
        if (nhanvien == null) return 0;
        else return nhanvien.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NhanVien_ThuVien _nhanvien = nhanvien.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _nhanvien.getMaTT();
            case 1 -> _nhanvien.getHVT();
            case 2 -> _nhanvien.getNs();
            case 3 -> _nhanvien.getGt();
            case 4 -> _nhanvien.getDiachi();
            case 5 -> _nhanvien.getEmail();
            case 6 -> _nhanvien.getUser();
            default -> null;
        };
    }

}
