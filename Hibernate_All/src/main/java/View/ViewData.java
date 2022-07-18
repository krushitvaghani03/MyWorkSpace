package View;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_Details;
import model.Student;

public class ViewData {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(Instructor_Details.class)
			.addAnnotatedClass(Course.class)
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();

	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
//	
//	Course c = s.load(Course.class, 5);
//	
//	for(Student st : c.getStudent())
//	{
//		System.out.println(st.getSid()+" "+st.getSname());
//	}
//	System.out.println(c.getInstructor().getIns_id()+" "+c.getInstructor().getIns_name());
//	System.out.println(c.getInstructor().getInstructor_Details().getInsd_id()+" "+c.getInstructor().getInstructor_Details().getInsd_channel());
//	
	
	Student st = s.load(Student.class, 2);
	
	System.out.println("Student : "+st.getSname());
	for(Course c : st.getCourse())
	{
		System.out.println(c.getCid()+" "+c.getCname()+" "+c.getInstructor().getIns_name()+" "+c.getInstructor().getInstructor_Details().getInsd_channel());

	}
	tx.commit();
}
}
