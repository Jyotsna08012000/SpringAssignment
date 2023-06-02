package CollectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("CollectionList/list.xml");
		Student s = (Student) con.getBean("s1");
		System.out.println(s);


	}

}
