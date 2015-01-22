package com.ndmm.internship.jdbc

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement
//Java JDBC example
public class JDBCExample1 {
	public static void main(String[] args) {
		Connection con = null
		Statement stmt = null
		ResultSet rs = null
		try{
			Class.forName("com.mysql.jdbc.Driver")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root", "",)
			stmt = con.createStatement()
			rs = stmt.executeQuery("select * from Forum")
			while (rs.next()) {
				System.out.println("Forum id : " + rs.getLong(1) +"  |  "+
						"Forum Name : " + rs.getString(2) +"  |  "+
						"Forum Description : " + rs.getString(3))+"  |  "
			}
		}catch(SQLException e){
			e.printStackTrace()
		}catch(ClassNotFoundException e){
			e.printStackTrace()
		}finally{
			try{
				rs.close()
			}catch(Exception e){
			}
			try{
				stmt.close()
			}catch(Exception e){
			}
			try{
				con.close()
			}catch(Exception e){
			}
		}
	}
}