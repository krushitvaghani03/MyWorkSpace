package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmpDao;
import model.Employee;

public class AddData {
public static void main(String[] args) {
	
	Employee e = new Employee();
	e.setId(1);
	e.setEname("Jaimeen");
	e.setEmail("jaimeen@gmail.com");
	e.setPass("jaimeen123");
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	EmpDao dao = context.getBean("dao", EmpDao.class);
	//dao.addEmp(e);
	
	//dao.updateEmp(e);
	
	//dao.deleteEmp(2);

	List<Employee> emp =  dao.viewEmp();
	
	for(Employee e1 : emp)
	{
		System.out.println(e1.getId()+" "+e1.getEname()+" "+e1.getEmail()+" "+e1.getPass());
	}
	

}
}