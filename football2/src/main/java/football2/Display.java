package football2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springhibernate.xml");
		Manunited mu = (Manunited) context.getBean("manu");
		System.out.println(mu.getId());
		System.out.println(mu.id);
	
	
	
	
}
}