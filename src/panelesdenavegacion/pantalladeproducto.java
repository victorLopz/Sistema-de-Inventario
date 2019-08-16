package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pantalladeproducto extends javax.swing.JPanel {
    
    static ResultSet res, rs,sacarid, resultado;
    int count;
    public String agregaritem;
    
    public static  void ingresarproductos(int a, String b, int c, int d, String e, String f)throws SQLException{
       CallableStatement entrada = conexion.getConexion().prepareCall("{call EntradaProductoporvarios(?,?,?,?,?,?,?)}");
       entrada.setInt(1,a);
       entrada.setString(2,b);
       entrada.setInt(3,c);
       entrada.setInt(4,d);
       entrada.setString(5,e);
       entrada.setString(6,f);
       entrada.setString(7, "Varios");
       entrada.execute();   
    }

    public pantalladeproducto() {
        initComponents();
        updatefue();
        jTable1.setDefaultRenderer(Object.class, new TableCellRendererColor());
        
        this.spinnerprov.removeAllItems();
        try{
            CallableStatement  actua = conexion.getConexion().prepareCall("{call impresiondeproveedores}");
            rs = actua.executeQuery();
            while(rs.next()){this.spinnerprov.addItem(rs.getString("Nombre"));}
            
        }catch(SQLException e){} 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nompro = new javax.swing.JTextField();
        preciopro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        spinnerprov = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tipodeunidades = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Unidadese = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre del producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 89, 133, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("precio del Compra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 117, 142, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Unidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 154, 90, 20));

        nompro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nompro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomproActionPerformed(evt);
            }
        });
        nompro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomproKeyTyped(evt);
            }
        });
        jPanel1.add(nompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 91, 324, 26));

        preciopro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        preciopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioproActionPerformed(evt);
            }
        });
        preciopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioproKeyTyped(evt);
            }
        });
        jPanel1.add(preciopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 128, 123, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivos.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, 32));

        spinnerprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinnerprovActionPerformed(evt);
            }
        });
        jPanel1.add(spinnerprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 194, 164, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 33, 89));
        jLabel4.setText("Registar nuevo producto Varios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, -1, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Seleccionar proveedor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 196, -1, 23));

        Tipodeunidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija Opcion...", "Docena", "Bolsa", "Libra", "Ristra", "Quintal" }));
        jPanel1.add(Tipodeunidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 155, 164, -1));

        jLabel5.setText("Agregar Opcion");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 158, -1, -1));

        Unidadese.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Unidadese, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 158, 51, -1));

        descrip.setColumns(20);
        descrip.setRows(5);
        jScrollPane1.setViewportView(descrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 320, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descripcion de producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 161, 27));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "CostoPor Unidad", "Cantidad", "Tipo de Unidad", "Monto Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 950, 230));

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomproActionPerformed
        
    }//GEN-LAST:event_nomproActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            if(nompro.getText().isEmpty() || preciopro.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Los Campos estan vacios/n Ingrese Valores");
                        nompro.setText("");
                        preciopro.setText("");
                        Unidadese.setText("");
                        
                        nompro.requestFocus();
                        preciopro.requestFocus();
                        Unidadese.requestFocus();
        }else{
            
            try{
                res = conexiones.conexion.Consulta("select count(producto) from producto_proveedor where producto = '"+ nompro.getText()+ "'");
                try{
                    while(res.next()){
                        count = res.getInt(1);
                    }
                }catch(SQLException e){
                }
                if(count >= 1){
                JOptionPane.showMessageDialog(null, "Este elemento ya existe");
                }else{
                        
                        sacarid = conexion.Consulta("select id_proveedor from Proveedor where Nombre = '" + spinnerprov.getSelectedItem() + "'");
                        int id =0;
                        while(sacarid.next()){id = sacarid.getInt(1);}
                        
                        ingresarproductos(id,nompro.getText(), Integer.parseInt(preciopro.getText()), Integer.parseInt(Unidadese.getText()), (String) Tipodeunidades.getSelectedItem(), descrip.getText());
                        nompro.setText("");
                        preciopro.setText("");
                        Unidadese.setText("");
                        descrip.setText("");
                        
                        nompro.requestFocus();
                        preciopro.requestFocus();
                        Unidadese.requestFocus();
                        descrip.requestFocus();
                                
                        JOptionPane.showMessageDialog(null, "Los Datos han sidos Guardados conrectamente"); 
                    }
                }catch(SQLException e){}
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomproKeyTyped
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
    }//GEN-LAST:event_nomproKeyTyped

    private void precioproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioproKeyTyped
        // TODO add your handling code here:
           char verificar=evt.getKeyChar();
        
        if (Character.isLetter(verificar)){
            JOptionPane.showMessageDialog(null,"Ingrese solo Números");
            getToolkit().beep();
            evt.consume();
        }
            else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
            
            JOptionPane.showMessageDialog(null,"Ingrese solo Números");
            getToolkit().beep();
         evt.consume();
        }
    }//GEN-LAST:event_precioproKeyTyped

    private void spinnerprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinnerprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spinnerprovActionPerformed

    private void precioproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioproActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        agregaritem = JOptionPane.showInputDialog("Ingrese su nueva Opcion de medida");
        Tipodeunidades.addItem(agregaritem);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        updatefue();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int selecion = jTable1.rowAtPoint(evt.getPoint());
        String nombre = (String) jTable1.getValueAt(selecion, 0);
        
        int newvalorcant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese La Nueva Cantidad del produto " + nombre));
        
        try{
            CallableStatement e = conexion.getConexion().prepareCall("{call updatepara_alta(?,?)}");
            e.setInt(1,newvalorcant);
            e.setString(2,nombre);
            e.execute();
            
            JOptionPane.showMessageDialog(null,"La cantidad Ha sido Actualizada");
            
        }catch(SQLException e){}
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Tipodeunidades;
    private javax.swing.JTextField Unidadese;
    private javax.swing.JTextArea descrip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nompro;
    private javax.swing.JTextField preciopro;
    private javax.swing.JComboBox spinnerprov;
    // End of variables declaration//GEN-END:variables

    private void updatefue() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        resultado = conexion.Consulta("select producto as Producto, precio_compra as 'Costo Por Unidad',cantidad as Cantidad, tipodeunidad as 'Tipo de Unidad', total_costo as 'Monto Total', tipo from producto_proveedor where tipo = 'Varios'");
        
        try{
            while(resultado.next()){
                Vector e = new Vector();
                e.add(resultado.getString(1));
                e.add(resultado.getInt(2));
                e.add(resultado.getInt(3));
                e.add(resultado.getString(4));
                e.add(resultado.getInt(5));
                modelo.addRow(e);
                jTable1.setModel(modelo);
            }
        }catch(SQLException e){}
    }

}
