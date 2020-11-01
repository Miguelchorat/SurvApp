package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author chorat
 */
public class ModeloTablaUsuarios extends AbstractTableModel{
    
    String[] columnNames = {"ID","AVATAR","NOMBRE","CORREO",
    "FECHA ALTA",
    "ADMINISTRAR"};

    private Object[][] data = {};


    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col) {
        if ((col>=0) && (col<columnNames.length)) {
            return columnNames[col];
        } else {
            return "";
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
      return false;
    } 
    
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    } 
    
    public void refreshTableModel(List<Usuario> usuarios) {
        if(usuarios==null)
            return;
        if (!usuarios.isEmpty()) {
            int numCol=columnNames.length+1;
            int numFilas=usuarios.size();
            data = new Object[numFilas][numCol];
            for(int f=0; f<numFilas; f++)
            {   
                data[f][0]=usuarios.get(f).getId();
                data[f][1]=usuarios.get(f).getAvatar();
                data[f][2]=usuarios.get(f).getNombre();
                data[f][3]=usuarios.get(f).getCorreo();
                data[f][4]=usuarios.get(f).getFecha_alta();
                if(usuarios.get(f).isAdministrar()==0){
                    data[f][5]="false";
                }else{
                    data[f][5]="true";
                }
            }
        }
        else{
            data = new Object[0][0];
        }
        
        fireTableDataChanged();
    }
}
