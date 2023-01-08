package Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class STMTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Mã sách", "Tên Sách", "Giá", "Số Lượng"};
    private List<STM> stm;
    public STMTableModel(){
        stm = new ArrayList<>();
    }
    public void setData(List<STM> stm){
        this.stm = stm;
        fireTableDataChanged();
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        if (stm == null) return 0;
        else return stm.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        STM _stm = stm.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> _stm.getMASACH();
            case 1 -> _stm.getTENSACH();
            case 2 -> _stm.getGIA();
            case 3 -> _stm.getSOLUONG();
            default -> null;
        };
    }
}
