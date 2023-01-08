package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class MTTTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã sinh viên", "Mã Sách", "Ngày Mượn", "Ngày hẹn trả", "Số Lượng", "QLTV"};
    private List<MuonTra_ThuVien> mttt;
    public MTTTableModel(){
        mttt = new ArrayList<>();
    }
    public void setData(List<MuonTra_ThuVien> mttt){
        this.mttt = mttt;
        fireTableDataChanged();
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        if (mttt == null) return 0;
        else return mttt.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MuonTra_ThuVien _mttt = mttt.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _mttt.getMSV();
            case 1 -> _mttt.getMASACH();
            case 2 -> _mttt.getNGAYMUON();
            case 3 -> _mttt.getNGAYTRA();
            case 4 -> _mttt.getSOLUONG();
            case 5 -> _mttt.getQLTHUVIEN();
            default -> null;
        };
    }
}
