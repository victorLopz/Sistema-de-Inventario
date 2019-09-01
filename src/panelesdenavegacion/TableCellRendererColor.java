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
        
        
        int fila1, fila2;
        
            fila1  =(int) table.getValueAt(row, 2);
            fila2  =(int) table.getValueAt(row, 3);
            
            if (fila1 <= fila2)
                componentes.setBackground(Color.YELLOW);
            
            if (table.getValueAt(row,2).toString().equals("0"))
                componentes.setBackground(Color.red);
            
            else if (fila1 <= fila2)
                componentes.setBackground(Color.YELLOW);
            
                else 
                componentes.setBackground(Color.white);
            
            return componentes;
    }
   
}