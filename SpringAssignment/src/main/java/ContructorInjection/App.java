package ContructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("ContructorInjection/spring1.xml");
    	Person person=(Person) con.getBean("person");
    	System.out.println(person);

	}

}
