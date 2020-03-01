/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrflixter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Database {
    
        static Connection c;

    public static Connection con() throws Exception {

        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/mrflixter",
                "root", "1234");
        }
        return c;
    }

    //put data methode
    public void putdata (String sql) throws Exception{
        Statement s = con().createStatement();
        s.executeUpdate(sql);
    }

    //getData methode
    public ResultSet getdata(String sql) throws  Exception{
        Statement s = con().createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;
    }
}
