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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import panelesdenavegacion.detallefac;



public class factura extends javax.swing.JPanel {
    public static String empleado;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int count;
    static ResultSet Rs, Rs2, Rs3, Rs4, res, res2, res3, eso, eso2, revisada;
    
    public static String fechaactual(){
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    
    public factura() {
        initComponents();
        fecha.setText(fechaactual());
        modelo.addColumn("Cant.");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        jTable2.setModel(modelo);
        
        componentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantbebidas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cantextras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        seleccciondebebidas = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        extras = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        billete = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        seleccionproducto = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(855, 503));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 48, 20));

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 85, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-guardar-24.png"))); // NOI18N
        jButton2.setText("Facturar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("I.V.A");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SUB TOTAL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("PRODUCTO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 85, -1));

        jTextField6.setEditable(false);
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 85, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Telefono: xxxxxxxx");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-camarones-y-langosta-filled-50(1).png"))); // NOI18N
        jLabel2.setText(" Bar-Restaurante \"El Mirador\"");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Numero de factura:");

        jLabel7.setText("MESERO");

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FECHA");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(722, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CANTIDAD");

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("CANTIDAD");

        cantextras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantextrasActionPerformed(evt);
            }
        });
        cantextras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantextrasKeyTyped(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-acercar-30.png"))); // NOI18N
        jButton1.setText("Anadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        seleccciondebebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccciondebebidasActionPerformed(evt);
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
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Extras");

        jLabel17.setText("efectivo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("EXTRAS");

        seleccionproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionproductoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Platos");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Bebidas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(425, 425, 425))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(seleccciondebebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seleccionproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(30, 30, 30)
                                    .addComponent(extras, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(cantbebidas)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cantextras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(billete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel10)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seleccciondebebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(billete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cantextras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1220, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

     private void phoneKeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
        if (cantidad.getText().length()<=3); 
        {
        //evt.consume();
        getToolkit().beep();
        
        }
        
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
    }                              

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
            //Boton de facturado
        /*
            empleado = (String) jComboBox1.getSelectedItem();
            
            for(int i = 0; i < modelo.getRowCount(); i++){
                String Vector[] =  new String[3];
                
                Vector[0] = modelo.getValueAt(i, 0).toString();
                Vector[1] = modelo.getValueAt(i, 1).toString();
                Vector[2] = modelo.getValueAt(i, 2).toString();
                
                detallefac.modelo2.addRow(Vector);
            }
          */  
            detallefac detalle = new detallefac();
            detalle.setVisible(true);
            
            
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void cantbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantbebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantbebidasActionPerformed

     private void canbebidasKeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
        if (cantbebidas.getText().length()<=3); 
        {
        //evt.consume();
        getToolkit().beep();
        
        }
        
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
    }                              

    private void cantextrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantextrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantextrasActionPerformed

    
     private void cantextras1KeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
        if (cantextras.getText().length()<=3); 
        {
        //evt.consume();
        getToolkit().beep();
        
        }
        
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
    }                              

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void cantextrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantextrasKeyTyped
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
    }//GEN-LAST:event_cantextrasKeyTyped

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

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        componentes();
    }//GEN-LAST:event_jComboBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billete;
    private javax.swing.JTextField cantbebidas;
    private javax.swing.JTextField cantextras;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
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
        if(cantextras.getText().isEmpty()){}else{
        res2 = conexion.Consulta("select precio_extra from extrasmenu where nombre_extra = '" + extras.getSelectedItem() + "'");
        while(res2.next()){conta2 = res2.getInt(1);}
        
        String extrasmas[] = new String[3];
        extrasmas[0] = cantextras.getText();
        extrasmas[1] = (String) extras.getSelectedItem();
        Double montoextras = Double.parseDouble(extrasmas[0]) * conta2;
        extrasmas[2] = montoextras.toString();
        modelo.addRow(extrasmas);
        cantextras.setText("");
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

    public void FacturarTodo() throws SQLException {
        
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
    
    public void componentes() {
        
        
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
            
                while(Rs3.next()){this.extras.addItem(Rs3.getString("nombre_extra" ));} 
                
                while(Rs2.next()){this.seleccciondebebidas.addItem(Rs2.getString("descripcion"));}
                
                while(Rs.next()){this.seleccionproducto.addItem(Rs.getString("nombre_plato"));}
                
                while(Rs4.next()){this.jComboBox1.addItem(Rs4.getString("nombre_empleado"));}
                
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
    }
}
