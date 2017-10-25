/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Dtcon {
    public Connection getconnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_central?zeroDateTimeBehavior=convertToNull","root","26265");
            return cn;
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            return null;
        }
    }
}
