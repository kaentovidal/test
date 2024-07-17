import java.sql.*;
import javax.swing.JOptionPane;


public class conection {
    String url = "jdbc:mysql://172.17.0.1:3306/bdescuela";
    String usr = "root";
    String pwd = "admin";
    Connection conectar =  null;
    
    public Connection conectar() {
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usr, pwd);
            JOptionPane.showMessageDialog(
                    null,
                    "Se ha establecido conexion a la base de datos dbescuela",
                    "",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }catch(ClassNotFoundException |  SQLException e) {
        JOptionPane.showMessageDialog(
            null, 
            e, 
            "Conexion", 
            JOptionPane.ERROR_MESSAGE
        );
    }   
   
    return conectar;
    }
}
