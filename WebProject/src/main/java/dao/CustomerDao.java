package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import util.DBConnection;

public class CustomerDao 
{
	Connection cn;
	public CustomerDao() {
		
		cn = DBConnection.connect();
	}
	public int addCustomer(Customer c) {

		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, c.getUname());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getPass());
			ps.setString(5, c.getMobile());
			
			
			i = ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public String loginCheck(Customer c) {
		
		String user = null;
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where email=? and pass=?");
			ps.setString(1, c.getEmail());
			ps.setString(2, c.getPass());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				user = rs.getString(2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	public String isExist(Customer c) {
		
		String user = null;
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where email=?");
			ps.setString(1, c.getEmail());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				user = rs.getString(2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	
}
