/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubh
 */

import java.sql.*;
import java.io.*;
import javax.swing.*;
public class Database_connection_class {
    Connection con;
    public static Connection DBconnect()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/login","root","824211");
        return con;
        }catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
          return null;
        }
    }
}
