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
        
        if(value instanceof Integer){
            //campoTexto.setText(""+(Integer)value);  
            //campoTexto.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        /*if(valor.compareTo(new BigDecimal(0))==0){
            componentes.setBackground(Color.red);
        }else{}
        */
        return componentes;
    }
     
}
