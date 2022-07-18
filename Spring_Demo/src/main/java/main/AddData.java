package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student;

public class AddData {
public static void main(String[] args) {
	
//	Student s = new Student();
//	s.setId(10);
//	s.setEmail("Tops@gmail.com");
//	s.setName("Tops");
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	Student std = context.getBean("std",Student.class);

	std.display();
}
}
