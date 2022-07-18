package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class Add
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		
		StudentDetails sd = new StudentDetails();
		sd.setFname("Tops");
		sd.setLname("Technologies");
		
		Student  s = new Student();
		s.setEmail("tops@gmail.com");
		s.setPass("tops123");
		s.setStudentDetails(sd);
		
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		se.save(s);
		tx.commit();
		
							
	}
}
