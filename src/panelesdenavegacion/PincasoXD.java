package panelesdenavegacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PincasoXD extends DefaultTableCellRenderer {
    
    private Component componentes ;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        componentes = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        componentes.setBackground(Color.white);
            
        return componentes;
    }
    
}
