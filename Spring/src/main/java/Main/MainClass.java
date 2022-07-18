package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Question;

public class MainClass {
public static void main(String[] args) {
	
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

	Question q = context.getBean("ques",Question.class);
	q.display();
}
}
