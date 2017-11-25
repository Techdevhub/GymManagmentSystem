/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;


/**
 *
 * @author Akka
 */
public class timetest {
    
    
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_central?zeroDateTimeBehavior=convertToNull","root","26265");
            String query = "SELECT * FROM tasks ORDER BY `date`;";
            Statement st = cn.createStatement();
            Time[] time = new Time[6];
            int i =0;
            ResultSet rss = st.executeQuery(query);
            while (rss.next()) {
                time[i]=rss.getTime(5);
                i++;
                if(i>5)
                    break;
            }
            
            for (int j = 0; j < 6; j++) {
                System.out.println(time[j]);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            Logger.getLogger(ComponantTest.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("aman");
    }
}
