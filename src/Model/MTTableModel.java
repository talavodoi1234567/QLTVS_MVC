package Model;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class MTTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã SV", "Mã sách", "Ngày mượn", "Ngày trả", "SL mượn", "QLTV"};
    private List<MuonTra_ThuVien> mttvs;
    public MTTableModel(){
        mttvs = new ArrayList<>();
    }
    public void setData(List<MuonTra_ThuVien> mttv){
        this.mttvs = mttv;
        fireTableDataChanged();
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        if (mttvs == null) return 0;
        else return mttvs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MuonTra_ThuVien _mttv = mttvs.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _mttv.getMSV();
            case 1 -> _mttv.getMASACH();
            case 2 -> _mttv.getNGAYMUON();
            case 3 -> _mttv.getNGAYTRA();
            case 4 -> _mttv.getSOLUONG();
            case 5 -> _mttv.getQLTHUVIEN();
            default -> null;
        };
    }
}
