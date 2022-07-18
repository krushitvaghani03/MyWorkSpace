package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

import model.User;
import util.DBConnection;

public class UserDao 
{
	Connection cn;
	public UserDao() {
		
		cn = DBConnection.connect();
	}
	public String loginCheck(User u) {

		String user = null;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where uname=? and pass=?");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPass());
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
	User u = new User();
}
