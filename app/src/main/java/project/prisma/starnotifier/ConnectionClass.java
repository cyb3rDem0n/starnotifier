package project.prisma.starnotifier;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * Created by Giuseppe D'Agostino on 06/05/2018.
 */

public class ConnectionClass {
        String classs = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/starnotifierdb";
        String un = "root";
        String password = "toor";



        @SuppressLint("NewApi")
        public Connection CONN() {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Connection conn = null;
            String ConnURL = null;
            try {

                Class.forName(classs);

                conn = DriverManager.getConnection(url, un, password);


                conn = DriverManager.getConnection(ConnURL);
            } catch (SQLException se) {
                Log.e("ERRO", se.getMessage());
            } catch (ClassNotFoundException e) {
                Log.e("ERRO", e.getMessage());
            } catch (Exception e) {
                Log.e("ERRO", e.getMessage());
            }
            return conn;
        }
    }