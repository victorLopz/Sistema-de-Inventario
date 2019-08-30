package panelesdenavegacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TableCellRendererColor extends DefaultTableCellRenderer {

    private Component componentes ;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componentes = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(table.getValueAt(row,3).toString().equals(table.getValueAt(row,2).toString())){
            
            componentes.setBackground(Color.YELLOW);
            
        }else if(table.getValueAt(row,2).toString().equals("0")){
            
            componentes.setBackground(Color.red);
            
        }else{
            componentes.setBackground(Color.green);
        }
        return componentes;
    }
     
}