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
        
        res = conexion.Consulta("select idproducto_prov,producto,precio_compra,cantidad from producto_proveedor where producto like '%"+ busquedadeproduc.getText() +"%'");
            //CallableStatement tabladeproductos = conexion.getConexion().prepareCall("{call busquedadeproducto(?)}");
            //tabladeproductos.setString(1, busquedadeproduc.getText());
            //res=tabladeproductos.executeQuery();

            try{
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

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingresar nombre de producto");

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

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(busquedadeproduc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(busquedadeproduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            res = conexiones.conexion.Consulta("select COUNT(producto) from producto_proveedor where producto like '%"+ busquedadeproduc.getText()+ "%'");
            try{
                    while(res.next()){
                        count = res.getInt(1);
                    }
                }catch(SQLException e){}
            
            
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
          // char verificar=evt.getKeyChar();
        
        //if (Character.isLetter(verificar)){
            //JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            //getToolkit().beep();
           // evt.consume();
        //}
            //else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             //||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             //|| (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            // || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    //{
            
            //JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            //getToolkit().beep();
         //evt.consume();
        //}
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