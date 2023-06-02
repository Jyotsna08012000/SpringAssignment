package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("SetterInjection/spring.xml");
    	Student student1=(Student) con.getBean("student1");
    	System.out.println(student1);
    }
}
