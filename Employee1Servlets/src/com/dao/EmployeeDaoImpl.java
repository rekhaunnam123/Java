package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Emp;


public class EmployeeDaoImpl implements EmployeeDao{

	
	public Connection getConnection() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		String driverName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverName);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","Rekha123456#");
		System.out.println(conn != null ? "connected" : "connection failed");
		 } 
		catch (ClassNotFoundException cnfe) 
		{
		System.out.println("There is no respective jars : "+ cnfe.getMessage());
		}
		catch (SQLException se) {// Catching SQL Exception
		System.out.println("SQL Exception :" + se.getMessage());
		} 
		catch (Exception e) {
		System.out.println(e);
		}
		 /*finally {
		try {
		con.close();
		} 
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}*/
		return conn;
		}
	@Override
	public int save(Emp emp) {
		PreparedStatement preparedStatement=null;
		Connection connection=getConnection();
		 int status=0;  
		
	        try{ 
	        	
	            preparedStatement=connection.prepareStatement(  
	                         "insert into user(name,password,email,country) values (?,?,?,?)");  
	            preparedStatement.setString(1,emp.getName());  
	            preparedStatement.setString(2,emp.getPassword());  
	            preparedStatement.setString(3,emp.getEmail());  
	            preparedStatement.setString(4,emp.getCountry());  
	              
	            status=preparedStatement.executeUpdate();  
	              
	            connection.close();  
	        }catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        	}  
	          
	        return status;  
	    } 
	

	@Override
	public int update(Emp emp) {
		PreparedStatement preparedStatement=null;
		Connection connection=getConnection();
		 int status=0; 
		 try{  
	             
	            preparedStatement =connection.prepareStatement(  
	                         "update user set name=?,password=?,email=?,country=? where id=?");  
	            preparedStatement.setString(1,emp.getName());  
	            preparedStatement.setString(2,emp.getPassword());  
	            preparedStatement.setString(3,emp.getEmail());  
	            preparedStatement.setString(4,emp.getCountry());  
	            preparedStatement.setInt(5,emp.getId());  
	              
	            status= preparedStatement.executeUpdate();  
	              
	            connection.close();  
	        }catch(Exception ex)
		 {ex.printStackTrace();}  
	          
	        return status;  
	}

	@Override
	public int delete(int id) {
		PreparedStatement preparedStatement=null;
		Connection connection=getConnection();
		 int status=0; 
		 try{  
	             
	            preparedStatement =connection.prepareStatement("delete from user where id=?");  
	            preparedStatement.setInt(1,id);  
	            status=preparedStatement.executeUpdate();  
	              
	            connection.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  

	@Override
	public Emp getEmployeeById(int id) {
		PreparedStatement preparedStatement=null;
		Connection connection=getConnection();
		 Emp emp=new Emp(); 
		 try{  
	             
	            preparedStatement =connection.prepareStatement("select * from user where id=?");  
	            preparedStatement.setInt(1,id);  
	            ResultSet rs=preparedStatement.executeQuery();  
	            if(rs.next()){  
	                emp.setId(rs.getInt(1));  
	                emp.setName(rs.getString(2));  
	                emp.setPassword(rs.getString(3));  
	                emp.setEmail(rs.getString(4));  
	                emp.setCountry(rs.getString(5));  
	            }  
	            connection.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return emp;  
	}

	@Override
	public List<Emp> getAllEmployees() {
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		Connection connection=getConnection();
		 List<Emp> list=new ArrayList<Emp>();
		 try
		 {
		 preparedStatement=connection.prepareStatement("select * from user");  
          resultSet=preparedStatement.executeQuery();  
         while(resultSet.next()){  
             Emp emp=new Emp();  
             emp.setId(resultSet.getInt(1));  
             emp.setName(resultSet.getString(2));  
             emp.setPassword(resultSet.getString(3));  
             emp.setEmail( resultSet.getString(4));  
             emp.setCountry(resultSet.getString(5));  
             list.add(emp);  
         }  
         connection.close();  
     }
		 catch(Exception ex)
     {
    	 ex.printStackTrace();
     } 
       
     return list;  
	}

}
