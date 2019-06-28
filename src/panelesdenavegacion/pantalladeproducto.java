package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class pantalladeproducto extends javax.swing.JPanel {
    
    static ResultSet res, rs,sacarid;
    int count;
    
    public static  void ingresarproductos(int a,String b, int c, int d)throws SQLException{
       CallableStatement entrada = conexion.getConexion().prepareCall("{call EntradaProducto(?,?,?,?)}");
       entrada.setInt(1,a);
       entrada.setString(2,b);
       entrada.setInt(3,c);
       entrada.setInt(4,d);
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
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre del producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("precio del producto");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Registar nuevo producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(331, 331, 331)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nompro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(351, 351, 351)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addComponent(cantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addComponent(preciopro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jButton1)))
                .addGap(0, 476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nompro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(preciopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomproActionPerformed
        
    }//GEN-LAST:event_nomproActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
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
                    
                        pantalladeproducto.ingresarproductos(id,nompro.getText(), Integer.parseInt(preciopro.getText()), Integer.parseInt(cantidadpro.getText()));                        
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nompro;
    private javax.swing.JTextField preciopro;
    // End of variables declaration//GEN-END:variables
}
