package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class SachTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã sách", "Tên sách", "Năm Xuất Bản", "Nhà Xuất Bản", "Giá", "Số Lượng"};
    private List<Sach_ThuVien> sach;
    public SachTableModel(){
        sach = new ArrayList<>();
    }
    public void setData(List<Sach_ThuVien> sach){
        this.sach = sach;
        fireTableDataChanged();
    }
    public String getColumnName(int i) {
        return columnNames[i];
    }
    @Override
    public int getRowCount() {
        if (sach == null) return 0;
        else return sach.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sach_ThuVien _sach = sach.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _sach.getMASACH();
            case 1 -> _sach.getTENSACH();
            case 2 -> _sach.getNAMXB();
            case 3 -> _sach.getNHAXB();
            case 4 -> _sach.getGIA();
            case 5 -> _sach.getSOLUONG();
            default -> null;
        };
    }

}
