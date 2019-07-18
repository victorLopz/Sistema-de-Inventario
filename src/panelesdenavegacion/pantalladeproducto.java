package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class pantalladeproducto extends javax.swing.JPanel {
    
    static ResultSet res, rs,sacarid;
    int count;
    
    public static  void ingresarproductos(int a,String b, int c, int d, int e, int f, String h)throws SQLException{
       CallableStatement entrada = conexion.getConexion().prepareCall("{call EntradaProducto(?,?,?,?,?,?,?)}");
       entrada.setInt(1,a);
       entrada.setString(2,b);
       entrada.setInt(3,c);
       entrada.setInt(4,d);
       entrada.setInt(5,e);
       entrada.setInt(6,f);
       entrada.setString(7,h);
       entrada.execute();   
    }

    public pantalladeproducto() {
        initComponents();
        
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
        cantidadpro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        spinnerprov = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bebidas = new javax.swing.JRadioButton();
        varios = new javax.swing.JRadioButton();
        precioventa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre del producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("precio del Compra");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("cantidad");

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

        preciopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioproKeyTyped(evt);
            }
        });

        cantidadpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadproActionPerformed(evt);
            }
        });
        cantidadpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadproKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivos.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        spinnerprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinnerprovActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Registar nuevo producto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de producto");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        Bebidas.setText("Bebidas");
        Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidasActionPerformed(evt);
            }
        });

        varios.setText("Varios");
        varios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bebidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        precioventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioventaActionPerformed(evt);
            }
        });
        precioventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioventaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio Venta");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Seleccionar proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(spinnerprov, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(preciopro)
                                        .addComponent(nompro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerprov, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nompro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preciopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomproActionPerformed
        
    }//GEN-LAST:event_nomproActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Bebidas.isSelected()){
        if(nompro.getText().isEmpty() || preciopro.getText().isEmpty() || cantidadpro.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Los Campos estan vacios/n Ingrese Valores");
            nompro.setText("");
            preciopro.setText("");
            cantidadpro.setText("");
            
            nompro.requestFocus();
            preciopro.requestFocus();
            cantidadpro.requestFocus();
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
                JOptionPane.showMessageDialog(null, "Este producto ya existe");
                    }else{
                        
                        sacarid = conexion.Consulta("select id_proveedor from Proveedor where Nombre = '" + spinnerprov.getSelectedItem() + "'");
                        int id =0;
                        while(sacarid.next()){id = sacarid.getInt(1);}
                        
                        int totalventa1= Integer.parseInt(preciopro.getText()) * Integer.parseInt(cantidadpro.getText());
                                            
                        ingresarproductos(id,nompro.getText(), Integer.parseInt(preciopro.getText()), Integer.parseInt(cantidadpro.getText()),Integer.parseInt(precioventa.getText()), totalventa1 , Bebidas.getText());                        
                        nompro.setText("");
                        preciopro.setText("");
                        cantidadpro.setText("");

                        nompro.requestFocus();
                        preciopro.requestFocus();
                        cantidadpro.requestFocus();
                        JOptionPane.showMessageDialog(null, "Los Datos han sidos Guardados conrectamente"); 
                    }
                }catch(SQLException e){}
             }
        
        }
        if(varios.isSelected()){
            if(nompro.getText().isEmpty() || preciopro.getText().isEmpty() || cantidadpro.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Los Campos estan vacios/n Ingrese Valores");
            nompro.setText("");
            preciopro.setText("");
            cantidadpro.setText("");
            
            nompro.requestFocus();
            preciopro.requestFocus();
            cantidadpro.requestFocus();
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
                        
                        int totalventa2= Integer.parseInt(preciopro.getText()) * Integer.parseInt(cantidadpro.getText());
                    
                        ingresarproductos(id,nompro.getText(), Integer.parseInt(preciopro.getText()), Integer.parseInt(cantidadpro.getText()),Integer.parseInt(precioventa.getText()), totalventa2, varios.getText());                        
                        nompro.setText("");
                        preciopro.setText("");
                        cantidadpro.setText("");

                        nompro.requestFocus();
                        preciopro.requestFocus();
                        cantidadpro.requestFocus();
                        JOptionPane.showMessageDialog(null, "Los Datos han sidos Guardados conrectamente"); 
                    }
                }catch(SQLException e){}
             }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cantidadproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadproActionPerformed
        
    }//GEN-LAST:event_cantidadproActionPerformed

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

    private void cantidadproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadproKeyTyped
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
    }//GEN-LAST:event_cantidadproKeyTyped

    private void BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BebidasActionPerformed

    private void variosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variosActionPerformed

    private void precioventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioventaActionPerformed

    private void precioventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioventaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_precioventaKeyTyped

    private void spinnerprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinnerprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spinnerprovActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bebidas;
    private javax.swing.JTextField cantidadpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nompro;
    private javax.swing.JTextField preciopro;
    private javax.swing.JTextField precioventa;
    private javax.swing.JComboBox spinnerprov;
    private javax.swing.JRadioButton varios;
    // End of variables declaration//GEN-END:variables

}
