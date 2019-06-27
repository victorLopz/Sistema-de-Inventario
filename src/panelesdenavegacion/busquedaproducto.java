package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Victor Joaquin
 */
public class busquedaproducto extends javax.swing.JPanel {

    static ResultSet res;
    int count;
    
    public static String Parametro;
    
    public busquedaproducto() {
        initComponents();
    }
    
    public static void Eliminar_producto(int a) throws SQLException{
       CallableStatement entrada = conexion.getConexion().prepareCall("{call EliminarProductos(?)}");
       entrada.setInt(1,a);
       entrada.execute();       
    }

    public static void busqueda_de_producto(String a ) throws SQLException {
        CallableStatement busqueda = conexion.getConexion().prepareCall("{call busquedadeproducto(?)}");
        busqueda.setString(1,a);
        busqueda.execute();
    }   
    
    private void cargar_productos() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        //res = conexiones.conexion.Consulta("select * from producto where nombre_produc= '"+ busquedadeproduc.getText() + "'");
        
        try {
            CallableStatement tabladeproductos = conexion.getConexion().prepareCall("{call busquedadeproducto(?)}");
            tabladeproductos.setString(1, busquedadeproduc.getText());
            res=tabladeproductos.executeQuery();

            while (res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getInt(3));
                v.add(res.getInt(4));
                modelo.addRow(v);
                jTable1.setModel(modelo);
                
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        busquedadeproduc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(855, 503));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(855, 503));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingresar nombre de producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 58, 170, 25));

        busquedadeproduc.setToolTipText("hola");
        busquedadeproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedadeproducActionPerformed(evt);
            }
        });
        busquedadeproduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedadeproducKeyTyped(evt);
            }
        });
        jPanel1.add(busquedadeproduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 94, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 795, 120));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda de productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 170, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void busquedadeproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedadeproducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedadeproducActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(busquedadeproduc.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Ingrese un Producto a Buscar");
            busquedadeproduc.setText("");
            
            busquedadeproduc.requestFocus();
        }else{
            res = conexiones.conexion.Consulta("select COUNT(producto) from producto_proveedor where producto = '"+ busquedadeproduc.getText()+ "'");
            try{
                    while(res.next()){
                        count = res.getInt(1);
                    }
                }catch(SQLException e){
                }
            if(count >= 1){
                        cargar_productos();                          
                    }else{
                        JOptionPane.showMessageDialog(null, "El producto no existe");
                        
                        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                        modelo.setRowCount(0);
                       

                    }
        
        
        
        }       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int row = jTable1.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this,"¿Estas seguro que lo deseas Eliminar el elemento Selecionado?","Pregunta",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (opc == JOptionPane.YES_OPTION){
            try{
                Eliminar_producto(Integer.parseInt(jTable1.getValueAt(row, 0).toString()));
            }catch(SQLException e){}
        }else{
        
        JOptionPane.showMessageDialog(this,"no se elimino");}              
    }//GEN-LAST:event_jButton2ActionPerformed
  
    
    
    
    
    private void busquedadeproducKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedadeproducKeyTyped
        // TODO add your handling code here:
           char verificar=evt.getKeyChar();
        
        if (Character.isDigit(verificar)){
            JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            getToolkit().beep();
            evt.consume();
        }
            else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
            
            JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            getToolkit().beep();
         evt.consume();
        }
    }//GEN-LAST:event_busquedadeproducKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (busquedadeproduc.getText().isEmpty()){JOptionPane.showMessageDialog(null, "Que es lo que va a editar?");}
        else{   try {    
                    Parametro = busquedadeproduc.getText();
                    // TODO add your handling code here:
                    Modi_producto obj = new Modi_producto();
                    obj.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(busquedaproducto.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busquedadeproduc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}