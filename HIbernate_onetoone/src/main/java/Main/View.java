package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class View
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student st = s.load(Student.class, 2);
		
		System.out.println(st.getEmail()+" "+st.getPass()+" "+st.getStudentDetails().getFname()+" "+st.getStudentDetails().getLname());
	}
}
