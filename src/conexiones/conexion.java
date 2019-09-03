package conexiones;

import java.sql.*;
import javax.swing.*;

public class conexion{
    
    static Connection contacto = null;
    
    public static String usuar;
    public static String contra;
    
    public static boolean status = false; 
    
    public static Connection getConexion(){
        
        status = false;
        

        //String url1 = "jdbc:sqlserver://victor:1433;databaseName=BDfinal";
        //String url2 = "jdbc:sqlserver://LAPTOP-TP4DD3VF:1433;databaseName=BDfinal";
        String url3 = "jdbc:sqlserver://DESKTOP-JACAQ7R:1433;databaseName=BDfinal";
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revisar la conexion en los drivers"
                    +e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);         
        }        
        try{
            contacto = DriverManager.getConnection(url3,conexion.usuar,conexion.contra);
            status = true ;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error...." 
                    +e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto; 
    }  
    
    public static void setcuenta (String usuar, String contra){
        conexion.usuar = usuar;
        conexion.contra = contra;
    
    }
    
    public static boolean getstatus(){
    return status; 
    }
    
    public static ResultSet Consulta(String Consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(Consulta);
            return respuesta;       
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la consulta...."
            +e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
  
}