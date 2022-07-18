package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Instructor;
import model.Instructor_Details;

public class AddData {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(Instructor_Details.class)
			.buildSessionFactory();

	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	Instructor_Details id = new Instructor_Details();
//	id.setInsd_channel("W3_School");
//	
//	Instructor i = new Instructor();
//	i.setIns_name("Laxman");
//	i.setInstructor_Details(id);
	
	Instructor_Details id = new Instructor_Details();
	id.setInsd_channel("Learning_Java");
	
	Instructor i = new Instructor();
	i.setIns_name("Savan");
	i.setInstructor_Details(id);
	
	s.save(i);
	tx.commit();
	
}

}
