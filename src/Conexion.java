import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexion {

    public Connection getConnection() {

    Connection  conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if(conection != null){
                System.out.printf("la conexion es exitosa");
            }
        }

        catch(SQLException e){
            System.out.println(e);

            }
        return conection;

    }
}




