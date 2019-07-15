package panelesdenavegacion;

import conexiones.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.Map;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;

    

public class nosotros extends javax.swing.JPanel {
    
    static ResultSet res1, res;
    
    public nosotros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        impresion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        parame = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        paramet1 = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Fecha", "Mesero", "Cantidad", "Producto", "Precio", "Sub Total", "IVA", "Total", "Dinero", "Cambio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Numero");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Fecha");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Mesero");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Cantidad");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Producto");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Precio");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Sub Total");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("IVA");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Total");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Dinero");
            jTable1.getColumnModel().getColumn(10).setHeaderValue("Cambio");
        }

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        impresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconimprimir.png"))); // NOI18N
        impresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impresionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ventas totales");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mesero", "Fecha", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        parame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parameActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        paramet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paramet1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(impresion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paramet1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(parame, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addComponent(jButton1)
                                .addGap(238, 238, 238)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(parame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paramet1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(impresion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Imprimir lo que hay en factura...
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        try {
            
            CallableStatement impresion = conexion.getConexion().prepareCall("{call imprimir_factura}");
            res1 = impresion.executeQuery();
           
            while (res1.next()){
                Vector v = new Vector();
                v.add(res1.getInt(1));
                v.add(res1.getString(2));
                v.add(res1.getString(3));
                v.add(res1.getInt(4));
                v.add(res1.getString(5));
                v.add(res1.getDouble(6));
                v.add(res1.getDouble(7));
                v.add(res1.getDouble(8));
                v.add(res1.getDouble(9));
                modelo.addRow(v);
                jTable1.setModel(modelo);       
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void impresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impresionActionPerformed
        

    }//GEN-LAST:event_impresionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //Boton de impresion de factura en PDF
            conexiones.conexion con = new conexiones.conexion();
            Connection conn = con.getConexion();

            JasperReport reporte = null;
            String path = "src\\Repositoriios\\facturas.jasper";
            Map parametro = new HashMap();
            String valor = parame.getText();
            int valor2 = Integer.parseInt(paramet1.getText());
            parametro.put("codigo_meser", valor);
            parametro.put("numerodefactura", valor2);

            //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint impresion = JasperFillManager.fillReport(reporte, parametro, conn);
            JasperViewer vista = new JasperViewer(impresion, false);
            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vista.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(listadeproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
       if(paramet1.getText().isEmpty() && calendario.getDate() == null && parame.getText().isEmpty() ){
           JOptionPane.showMessageDialog(null,"no ha ingresado ningun Parametro", "ERROR",JOptionPane.ERROR_MESSAGE);
       }
       else{
           if(paramet1.getText().isEmpty()){
                if(calendario.getDate() == null){
                    if(parame.getText().isEmpty()){
                    }else{
                        try {
                            CallableStatement impresion = conexion.getConexion().prepareCall("{call imprimirfacturapordetalle(?)}");
                            impresion.setString(1, parame.getText());
                            res = impresion.executeQuery();

                            while (res.next()){
                              Vector v = new Vector();
                              v.add(res.getInt(1));
                              v.add(res.getString(2));
                              v.add(res.getString(3));
                              v.add(res.getInt(4));
                              v.add(res.getString(5));
                              v.add(res.getDouble(6));
                              v.add(res.getDouble(7));
                              v.add(res.getDouble(8));
                              v.add(res.getDouble(9));
                              v.add(res.getDouble(10));
                              v.add(res.getDouble(11));
                              modelo.addRow(v);
                              jTable1.setModel(modelo);       
                            }
                          }catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
                    }
                }else{
                    try {
                            int año = calendario.getCalendar().get(Calendar.YEAR);
                            int dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
                            int mes = calendario.getCalendar().get(Calendar.MONTH)+1;
                            String fecha = año+ "-"+ mes+ "-"+ dia;
                            int hola = 0;
                            CallableStatement impresion = conexion.getConexion().prepareCall("{call imprimirporfecha(?)}");
                            impresion.setString(1,fecha);
                            res = impresion.executeQuery();

                            while (res.next()){
                              Vector v = new Vector();
                              v.add(res.getInt(1));
                              v.add(res.getString(2));
                              v.add(res.getString(3));
                              v.add(res.getInt(4));
                              v.add(res.getString(5));
                              v.add(res.getDouble(6));
                              v.add(res.getDouble(7));
                              v.add(res.getDouble(8));
                              v.add(res.getDouble(9));
                              v.add(res.getDouble(10));
                              v.add(res.getDouble(11));
                              modelo.addRow(v);
                              jTable1.setModel(modelo);       
                            }
                          }catch(SQLException e){JOptionPane.showMessageDialog(null,e);}                
                }
           }else{
               
               try {
                            CallableStatement impresion = conexion.getConexion().prepareCall("{call imprimirpornumerodefactura(?)}");
                            impresion.setInt(1,Integer.parseInt(paramet1.getText()));
                            res = impresion.executeQuery();

                            while (res.next()){
                              Vector v = new Vector();
                              v.add(res.getInt(1));
                              v.add(res.getString(2));
                              v.add(res.getString(3));
                              v.add(res.getInt(4));
                              v.add(res.getString(5));
                              v.add(res.getDouble(6));
                              v.add(res.getDouble(7));
                              v.add(res.getDouble(8));
                              v.add(res.getDouble(9));
                              v.add(res.getDouble(10));
                              v.add(res.getDouble(11));
                              modelo.addRow(v);
                              jTable1.setModel(modelo);       
                            }
                          }catch(SQLException e){JOptionPane.showMessageDialog(null,e);} 
               
           }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void paramet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paramet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paramet1ActionPerformed

    private void parameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton impresion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField parame;
    private javax.swing.JTextField paramet1;
    // End of variables declaration//GEN-END:variables
}
