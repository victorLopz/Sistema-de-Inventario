package Backup;

import conexiones.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BAKCUPCONEXION {
    
    static Connection contacto = null;
    
    public static String usuar;
    public static String contra;
    
    public static boolean status = false; 
    
    public static Connection getConexion(){
        
        status = false;
                
        String url1 = "jdbc:sqlserver://victor:1433;databaseName=BDfinal";
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revisar la conexion en los drivers"
                    +e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);         
        }        
        try{
            contacto = DriverManager.getConnection(url1,conexion.usuar,conexion.contra);
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
}
