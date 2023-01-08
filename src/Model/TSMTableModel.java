package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TSMTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã sinh viên", "Số lượng sách"};
    private List<TSM> tsm;
    public TSMTableModel(){
        tsm = new ArrayList<>();
    }
    public void setData(List<TSM> tsm){
        this.tsm = tsm;
        fireTableDataChanged();
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        if (tsm == null) return 0;
        else return tsm.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TSM _tsm = tsm.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _tsm.getMSV();
            case 1 -> _tsm.getSOLUONG();
            default -> null;
        };
    }
}
