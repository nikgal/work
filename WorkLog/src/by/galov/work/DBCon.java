package by.galov.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBCon {
	public static void dbCon() {
	    
        Connection             conn  = null;        
        PreparedStatement   pstmt = null;
        ResultSet            rs    = null;
        
        try {
                        
             
            Properties connInfo = new Properties();
            
            connInfo.put("characterEncoding","UTF8");
            connInfo.put("user", "root");
            connInfo.put("password", "123");
            
            conn  = DriverManager.getConnection("jdbc:mysql://localhost/?", connInfo);
            
            pstmt = conn.prepareStatement("show databases;");
            
            if(pstmt.execute()) {
                rs = pstmt.getResultSet();                                
                
                while (rs.next()) {
                    //System.out.println(rs.getString(1));
                    System.out.println(rs.getString("Database"));
                }
            }                                    
        }
        catch (SQLException ex) {            
            System.out.println(ex.toString());
            //ex.printStackTrace();
        }
        finally {
            
            try {
                
                if (pstmt != null)
                    pstmt.close();
                
                if (conn != null)
                    conn.close();                
            }
            catch (SQLException ex) {            
                System.out.println("On close: " + ex.toString());
                //ex.printStackTrace();
            }                        
            
        }        
    }
}
