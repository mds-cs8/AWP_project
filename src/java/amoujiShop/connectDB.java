

// we create this class to connection with DB
//read DB info from txt file

package amoujiShop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connectDB {

    private static Connection connection ;

    public static Connection getConnection() throws IOException, SQLException {

        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver); // in netbeans we do not need this 
            
            // here we read DB name , DBurl and DBpass from file
            Properties connectDB = new Properties();
            FileInputStream info = new FileInputStream("C:\\codingUQU\\netbeansCode\\appliancesProject\\jdbcConnect.txt");
            connectDB.load(info);
             connection = DriverManager.getConnection(connectDB.getProperty("urlDB"), connectDB.getProperty("userDB"), connectDB.getProperty("password"));
            // here we read URLDB , user , password frpm file <NameFile.txt> and write this info into getConnection method

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
