package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class MTSVTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã sách", "Tên sách", "Giá", "SL mượn", "Ngày mượn", "Ngày trả"};
    private List<MTSV> mtsv;
    public MTSVTableModel(){
        mtsv = new ArrayList<>();
    }
    public void setData(List<MTSV> mtsv){
        this.mtsv = mtsv;
        fireTableDataChanged();
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        if (mtsv == null) return 0;
        else return mtsv.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MTSV _mtsv = mtsv.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _mtsv.getMASACH();
            case 1 -> _mtsv.getTENSACH();
            case 2 -> _mtsv.getGIA();
            case 3 -> _mtsv.getSOLUONG();
            case 4 -> _mtsv.getNGAYMUON();
            case 5 -> _mtsv.getNGAYTRA();
            default -> null;
        };
    }
}
