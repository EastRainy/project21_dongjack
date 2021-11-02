package prac;

import java.sql.*;

public class Jdbc_prac {
    

    public static void main(String[] args) throws SQLException {
        

        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        String durl = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection conn = DriverManager.getConnection(durl, "scott", "tiger");
    
     
        PreparedStatement pstmt = conn.prepareStatement("SELECT ENAME,EMPNO FROM EMP");
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString("ENAME")+" : "+rs.getString(2));
        }



        rs.close();
        pstmt.close();
        conn.close();


    }

}
