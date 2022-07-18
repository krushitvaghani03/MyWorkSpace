package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import model.Employee;

public class EmpDao {

	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addEmp(Employee e)
	{
		String qry = "insert into employee values (0,'"+e.getEname()+"','"+e.getEmail()+"','"+e.getPass()+"')";
		jdbcTemplate.update(qry);
		System.out.println("Data Inserted!!!");
	}

	public void updateEmp(Employee e) {
		
		String qry = "update employee set ename='"+e.getEname()+"',email='"+e.getEmail()+"',pass='"+e.getPass()+"' where id='"+e.getId()+"' ";
		jdbcTemplate.update(qry);
		System.out.println("Data Updated!!!");
	}

	public void deleteEmp(int i) {

		String qry = "delete from employee where id='"+i+"'";
		jdbcTemplate.update(qry);
		System.out.println("Data Deleted!!!");
		
	}

	public List<Employee> viewEmp() {

		
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				ArrayList<Employee> al = new ArrayList<Employee>();
				while(rs.next())
				{
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setEmail(rs.getString(3));
					e.setPass(rs.getString(4));
					al.add(e);
					
				}
				
				return al;
			}
			
			
		});
	}
}
