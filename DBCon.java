import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBCon{
    private final static String HOST = "127.0.0.1";
    private final static int PORT = 3306;
    private final static String DB_NAME = "test";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";

    private static Connection connection ;

    public static Connection getConnection(){
        try{
            connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DB_NAME),USERNAME,PASSWORD);
        }catch(SQLException se){
            se.printStackTrace();
        }
        return connection;
    }


}