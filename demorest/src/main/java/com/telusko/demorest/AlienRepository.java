package com.telusko.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository 
{
	String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	String username = "root";
	String password = "password123";
	
	Connection con = null;
	
	public AlienRepository()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Alien> getAliens() throws SQLException 
	{
		List<Alien> aliens = new ArrayList<>();
		String sql = "select * from restdb";

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			Alien a = new Alien();
			a.setName(rs.getString(1));
			a.setPoints(rs.getInt(2));
			
			aliens.add(a);
		}
		
		return aliens;
	}
	
	public Alien getAlien(String name) throws SQLException
	{
		String sql = "select * from restdb where name=" + name;

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		Alien a = new Alien();
		
		if(rs.next())
		{
			a.setName(rs.getString(1));
			a.setPoints(rs.getInt(2));
		}
		
		return a;
	}

	public void create(Alien a1) throws SQLException 
	{
		String sql = "insert into restdb values(?,?)";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,  a1.getName());
		st.setInt(2, a1.getPoints());
		
		st.executeUpdate();
		
	}
	
	// MySql, Postgres, Oracle
	// JDBC
	
	public void Update(Alien a1) throws SQLException 
	{
		String sql = "update restdb set points=? where name=?";

		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, a1.getPoints());
		st.setString(2,  a1.getName());
		
		st.executeUpdate();
		
	}

	public void delete(String name) throws SQLException 
	{
		String sql = "delete from restdb where name=?";

		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, name);
		
		st.executeUpdate();
	}
	
	
}
