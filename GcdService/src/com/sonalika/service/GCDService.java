package com.sonalika.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GCDService {
	
	

	public int gcd(){
		
		LinkListQueue q = new LinkListQueue();
		
		int number1=(int) q.dequeue();
		int number2=(int) q.dequeue();

		if (number2 == 0)
			return number1;
		else
			return gcd();
		
	}	
	
	public List<Integer> gcdList() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Get a connection to DataBase
		String host = "jdbc:mysql://localhost/3310/expense";
		String username = "root";
		String password = "root";
		Connection connect = DriverManager.getConnection(host, username, password);

        List<Integer> list = new ArrayList<Integer>();
        Iterator it = list.iterator();
		
		//Create a statement
		Statement myStmt = connect.createStatement();
		//Fetch result set
		//Assuming there is a DB table "price" which has three columns
		//First column is Fullprice, second is saleprice, third is GCD price
		ResultSet myRs = myStmt.executeQuery("SELECT gcd FROM price");
		//Process result set
		while(it.hasNext()){
			Integer obj = (Integer)it.next();
			System.out.println(obj);
		}

	    return list;
		
	}

	//	which returns the sum of all computed greatest common divisors from a database.
	public int gcdSum(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//Get a connection to DataBase
		String host = "jdbc:mysql://localhost/3310/expense";
		String username = "root";
		String password = "root";
		int gcd;
		
		Connection connect;
		try {
			connect = DriverManager.getConnection(host, username, password);
			Statement myStmt = connect.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("SELECT SUM(gcd) FROM price");
			 while(myRs.next()){
					gcd = myRs.getInt("gcd");
					return gcd;
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
        
	}	
		
	}


	

