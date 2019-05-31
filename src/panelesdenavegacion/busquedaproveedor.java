package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Joaquin
 */
public class busquedaproveedor extends javax.swing.JPanel {

    static ResultSet res;
    int count;
    
    public static String parametro;
        
    public busquedaproveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busquedadeproveedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(690, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda de proveedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 11, 170, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingresar nombre de proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 56, 170, 25));

        busquedadeproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedadeproveedorActionPerformed(evt);
            }
        });
        jPanel1.add(busquedadeproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 92, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Buscar");
        jButton1.setActionCommand("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posicion", "Direccion", "Nombre", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 190, 540, 150));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(15, 39, 115));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

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

    private void busquedadeproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedadeproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedadeproveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        busquedadeproveedores();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //eliminar       
        int row = jTable2.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this,"¿Estas seguro que lo deseas Eliminar el elemento Selecionado?","Pregunta",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (opc == JOptionPane.YES_OPTION){
            try{
                busquedaproveedor.Eliminar_proveedor(Integer.parseInt(jTable2.getValueAt(row, 0).toString()));
            }catch(SQLException e){}
        }else{
        
        JOptionPane.showMessageDialog(this,"no se elimino");}              
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Modificar_proveedor obj = new Modificar_proveedor();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField busquedadeproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void busquedadeproveedores() {
                
        if(busquedadeproveedor.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Ingrese un Producto a Buscar");
            busquedadeproveedor.setText("");
            
            busquedadeproveedor.requestFocus();
        }else{
            
            res = conexiones.conexion.Consulta("select COUNT(nombre) from proveedor where nombre ='"+ busquedadeproveedor.getText()+ "'");
            try{
                    while(res.next()){
                        count = res.getInt(1);
                    }
                }catch(SQLException e){
                }
            if(count >= 1){
                        cargar_proveedor();
                    }else{
                        JOptionPane.showMessageDialog(null, "El proveedor no existe");
                        
                        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
                        modelo.setRowCount(0);
                        res = null;
        
                        try {
                            while (res.next()){
                                Vector v = new Vector();
                                v.add(res.getInt(1));
                                v.add(res.getString(2));
                                v.add(res.getString(3));
                                v.add(res.getInt(4));
                                modelo.addRow(v);
                                jTable2.setModel(modelo);

                            }
                        }catch(SQLException e){
                                JOptionPane.showMessageDialog(null,e);
                        }

                    }
            parametro=busquedadeproveedor.getText();
            
        }
    }

    private void cargar_proveedor() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        //res = conexiones.conexion.Consulta("select * from proveedor where nombre= '"+ busquedadeproveedor.getText() + "'");
        
        try {
            CallableStatement tabladeproveedor = conexion.getConexion().prepareCall("{call busquedadeproveedor(?)}");
            tabladeproveedor.setString(1,busquedadeproveedor.getText());
            res = tabladeproveedor.executeQuery();

            while (res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getInt(4));
                modelo.addRow(v);
                jTable2.setModel(modelo);
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public static void Eliminar_proveedor(int a) throws SQLException{
            CallableStatement entrada = conexion.getConexion().prepareCall("{call Eliminarproveedor(?)}");
            entrada.setInt(1,a);
            entrada.execute();
    }

    public static void buscar_proveedor(String a) throws SQLException{
        CallableStatement entrada_proveedor = conexion.getConexion().prepareCall("{call busquedadeproveedor(?)}");
        entrada_proveedor.setString(1,a);
        entrada_proveedor.execute();
    }
      
}