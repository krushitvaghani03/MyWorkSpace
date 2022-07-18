package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;
import util.DBConnection;


public class ProductDao {

	Connection cn;
	public ProductDao() {
	
		cn = DBConnection.connect();

	}
	public ArrayList<Product> getAllProduct() {
	
		ArrayList<Product> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product p1 = new Product();
				p1.setPid(rs.getInt(1));
				p1.setPname(rs.getString(2));
				p1.setPrice(rs.getDouble(3));
				
				al.add(p1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	public int addProduct(Product p) {
	
		int i =0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into product values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, p.getPname());
			ps.setDouble(3, p.getPrice());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public String isExist(Product p) {

		String prod = null;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from product where pname = ?");
			ps.setString(1, p.getPname());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				prod = rs.getString(2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prod;
	}
	public int deleteProduct(int uid) {

		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete  from product where id=?");
			ps.setInt(1, uid);
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}
	public Product getDataById(int uid) {
		Product p = new Product();
	
		try {
			PreparedStatement ps = cn.prepareStatement("select * from product where id=?");
			ps.setInt(1, uid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
		
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}
	public int editProduct(Product p) {
		
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("update product set pname=? , price=? where id=?");
			ps.setString(1, p.getPname());
			ps.setDouble(2, p.getPrice());
			ps.setInt(3, p.getPid());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	
	
}
