package factura;

import conexiones.conexion;
import java.awt.PopupMenu;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class factura extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int count;
    static ResultSet Rs, Rs2, Rs3, Rs4, res, res2, res3, eso, eso2, revisada;
    //
    
    
    public static String fechaactual(){
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    
    public factura() {
        initComponents();
        
        modelo.addColumn("Cant.");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        jTable2.setModel(modelo);
        
        fecha.setText(fechaactual());
        
        this.seleccionproducto.removeAllItems();
        this.seleccciondebebidas.removeAllItems();
        this.extras.removeAllItems();
        this.jComboBox1.removeAllItems();
        
        
        
        try{
            CallableStatement actualizacion = conexion.getConexion().prepareCall("{call imprimircatalogo}");
            Rs = actualizacion.executeQuery();
            
            CallableStatement actualizacion2 = conexion.getConexion().prepareCall("{call impresiondebebidas}");
            Rs2 = actualizacion2.executeQuery();
            
            CallableStatement actualizacion3 = conexion.getConexion().prepareCall("{call impresiondeExtras}");
            Rs3 = actualizacion3.executeQuery();
            
            CallableStatement actualizacion4 = conexion.getConexion().prepareCall("{call lista_empleados}");
            Rs4 = actualizacion4.executeQuery();
            
                while(Rs3.next()){
                    this.extras.addItem(Rs3.getString("nombre_extra" ));
                } 
                
                while(Rs2.next()){
                    this.seleccciondebebidas.addItem(Rs2.getString("descripcion"));
                }
                
                while(Rs.next()){
                  this.seleccionproducto.addItem(Rs.getString("nombre_plato"));
                }
                
                while(Rs4.next()){
                    this.jComboBox1.addItem(Rs4.getString("nombre_empleado"));
                }
                    
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        seleccionproducto = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        seleccciondebebidas = new javax.swing.JComboBox();
        cantbebidas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        extras = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(855, 503));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Bar-Restaurante \"El Mirador\"");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("CANTIDAD");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total");

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setText("Anadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        seleccionproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionproductoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setText("Facturar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fecha.setEnabled(false);
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cant. ", "Descripción ", "Valor "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        seleccciondebebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccciondebebidasActionPerformed(evt);
            }
        });

        cantbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantbebidasActionPerformed(evt);
            }
        });
        cantbebidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantbebidasKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CANTIDAD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("I.V.A");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SUB TOTAL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FECHA");

        jLabel7.setText("MESERO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("PRODUCTO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("EXTRAS");

        jLabel12.setText("CANTIDAD");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Platos");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("BEBIDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(113, 719, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(seleccciondebebidas, 0, 141, Short.MAX_VALUE)
                                    .addComponent(seleccionproducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(extras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cantbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seleccionproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(seleccciondebebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void seleccionproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionproductoActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
    
       
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Agregartabla();
        } catch (SQLException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try {
            //Boton de facturado
            FacturarTodo();
        } catch (SQLException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void cantbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantbebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantbebidasActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
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
    }//GEN-LAST:event_jTextField4KeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
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
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantbebidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantbebidasKeyTyped
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
    }//GEN-LAST:event_cantbebidasKeyTyped

    private void seleccciondebebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccciondebebidasActionPerformed
        //Jcombox bebidas
    }//GEN-LAST:event_seleccciondebebidasActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantbebidas;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox extras;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox seleccciondebebidas;
    public javax.swing.JComboBox seleccionproducto;
    // End of variables declaration//GEN-END:variables

    private void Agregartabla() throws SQLException {
        
        //Revisar si hay en el almacen las bebidas
        
        int counta = 0;
        int conta2= 0;
        int contador = 0;
        int existentes = 0;
                
        if(cantbebidas.getText().isEmpty()){}else{
            
        revisada = conexion.Consulta("select cantidad from catalogobebidas inner join producto_proveedor on idcatprovprod = idproducto_prov where descripcion = '" + seleccciondebebidas.getSelectedItem() +"'");
        
        try{while(revisada.next()){existentes = revisada.getInt(1);}}catch(SQLException e){}
        
        if(existentes <= Integer.parseInt(cantbebidas.getText())){
            JOptionPane.showMessageDialog(null,"No hay "+ cantbebidas.getText() + "existentes");
        }else{
            
        res = conexion.Consulta("select precioventabeb from catalogobebidas where descripcion = '" + seleccciondebebidas.getSelectedItem()+ "'");
        while(res.next()){ counta = res.getInt(1);}
                
        String []bebidas = new String[3];
        bebidas[0]= cantbebidas.getText();
        bebidas[1]= (String) seleccciondebebidas.getSelectedItem();
        Double monto = Double.parseDouble(bebidas[0])*counta;
        bebidas[2]= monto.toString();
        modelo.addRow(bebidas);
        
        cantbebidas.setText("");
        
            }
        }
        if(jTextField4.getText().isEmpty()){}else{
        res2 = conexion.Consulta("select precio_extra from extrasmenu where nombre_extra = '" + extras.getSelectedItem() + "'");
        while(res2.next()){conta2 = res2.getInt(1);}
        
        String extrasmas[] = new String[3];
        extrasmas[0] = jTextField4.getText();
        extrasmas[1] = (String) extras.getSelectedItem();
        Double montoextras = Double.parseDouble(extrasmas[0]) * conta2;
        extrasmas[2] = montoextras.toString();
        modelo.addRow(extrasmas);
        jTextField4.setText("");
        }
        
        if(cantidad.getText().isEmpty()){}else{
            
            res3 = conexion.Consulta("select precioventacat from catalogo where nombre_plato = '" + seleccionproducto.getSelectedItem() + "'");
            while(res3.next()){ contador = res3.getInt(1);}
            
            String plato[] = new String[3];
            plato[0] = cantidad.getText();
            plato[1] = (String) seleccionproducto.getSelectedItem();
            Double montototal = Double.parseDouble(plato[0]) * contador;
            plato[2] = montototal.toString();
            modelo.addRow(plato);
            
            cantidad.setText("");
        }
        
            int fila = jTable2.getRowCount();
            int i;
            double resultado = 0;
            for (i = 0; i < fila; i++) {
                Double valor = Double.parseDouble(jTable2.getValueAt(i, 2).toString());
                resultado += valor;               
            }
            
            jTextField6.setText(""+resultado);
            Double iva= (Double) ((resultado) * (0.15));
            jTextField5.setText(""+ iva);
            Double total = (Double) (iva + resultado);
            jTextField7.setText(""+total);
        
    }

    private void FacturarTodo() throws SQLException {

            int vlextra = 0;
            int vlempleado = 0;
            
            //Numero de extras
            eso = conexion.Consulta("select idextras from extrasmenu where nombre_extra ='" + extras.getSelectedItem() + "'");
            while(eso.next()){ vlextra = eso.getInt(1);}
            
            
            //Cantidad de Productos
            int fila = jTable2.getRowCount();
            
            int cantidades=0;
            for (int i = 0; i < fila; i++) {
                int valor = Integer.parseInt(jTable2.getValueAt(i, 0).toString());
                cantidades += valor;
            }
            
            //Precio Total
            Double preciototal = Double.parseDouble(jTextField7.getText());
            
            //Precio Iva
            Double precioiva = Double.parseDouble(jTextField5.getText());
            
            // Para Sacar el empleado
            eso2 = conexion.Consulta("select idempleados from empleados where nombre_empleado = '" + jComboBox1.getSelectedItem() + "'");
            while(eso2.next()){vlempleado = eso2.getInt(1);}
            
            JOptionPane.showMessageDialog(null,"Numero de extras = " + vlextra + "\n"+ "Cantidad de producto = " + cantidades + "\n"+ "Precio total = " + preciototal + "\n" + "Precio en IVA = " + precioiva + "\n" + "Numero de empleado = "+ vlempleado);
            //CallableStatement detalles = conexion.getConexion().prepareCall("{call }")
            
    }

}
