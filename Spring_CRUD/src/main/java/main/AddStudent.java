package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import model.Student;

public class AddStudent {

	public static void main(String[] args) {
		
		Student s = new Student();
		//s.setId(4);
		s.setName("Tops");
		s.setEmail("Tops@gmail.com");
		s.setPass("Tops");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		StudentDao 	dao = context.getBean("dao",StudentDao.class);
		
		//dao.addStudent(s);	
		
		//dao.update(s);
		
		//dao.delete(4);
		
		List<Student> al = dao.viewAll();
		for(Student st : al)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail()+" "+s.getPass());
		}
		
		
	}
}