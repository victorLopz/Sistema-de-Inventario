package panelesdenavegacion;


import conexiones.conexion;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ingresarproveedor extends javax.swing.JPanel {
    
    static ResultSet res;
    int count;
    
    public ingresarproveedor() { 
        initComponents(); 
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        direc = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(841, 531));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Dirección");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 247, 30));

        direc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcActionPerformed(evt);
            }
        });
        direc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direcKeyTyped(evt);
            }
        });
        jPanel1.add(direc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 247, 31));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 247, 30));

        registrar.setBackground(new java.awt.Color(0, 153, 51));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivos.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 33, 89));
        jLabel5.setText("Registar nuevo proveedor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        if(direc.getText().isEmpty() || name.getText().isEmpty() || phone.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Los Campos estan vacios/n Ingrese Valores");
            direc.setText("");
            name.setText("");
            phone.setText("");

            direc.requestFocus();
            name.requestFocus();
            phone.requestFocus();
        }else{

            try{
                res = conexiones.conexion.Consulta("select COUNT(nombre) from proveedor where nombre = '"+ direc.getText()+ "'");
                try{
                    while(res.next()){
                        count = res.getInt(1);
                    }
                }catch(SQLException e){
                }
                if(count >= 1){
                    JOptionPane.showMessageDialog(null, "este elemento ya existe");
                }else{
                    ingresarproveedor.ingresarproveedores(direc.getText(), name.getText(), Integer.parseInt(phone.getText()));
                    direc.setText("");
                    name.setText("");
                    phone.setText("");

                    direc.requestFocus();
                    name.requestFocus();
                    phone.requestFocus();
                    JOptionPane.showMessageDialog(null, "Los Datos an sidos Guardados conreectamente");
                }
            }catch(SQLException e){}
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void direcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
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
    }//GEN-LAST:event_nameKeyTyped

    private void direcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcKeyTyped
        // TODO add your handling code here:
         
             char verificar=evt.getKeyChar();
        if (Character.isDigit(verificar)){
            JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            getToolkit().beep();
            evt.consume();
        }
         else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             //||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             //|| (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
            
            JOptionPane.showMessageDialog(null,"Ingrese solo letras");
            getToolkit().beep();
         evt.consume();
        }
    }//GEN-LAST:event_direcKeyTyped

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

   
    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
        if (phone.getText().length()<=8); 
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
        int limite=8;
        if (phone.getText().length()>limite){
          evt.consume();
        }
    }//GEN-LAST:event_phoneKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables

public static  void ingresarproveedores(String a,String b, int c)throws SQLException{
       CallableStatement entrada = conexion.getConexion().prepareCall("{call Entradaproveedor(?,?,?)}");
       entrada.setString(1,a);
       entrada.setString(2,b);
       entrada.setInt(3,c);
       entrada.execute();
    }

   
}
