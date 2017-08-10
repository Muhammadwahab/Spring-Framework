package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// spring bean container
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/beans.xml");
		Person person1=(Person) context.getBean("person");
		person1.speek();
		
		// bean scope check 
		Person person2=(Person) context.getBean("person");
		person2.speek();
		person1.setTextID(22222);
		
		
		// bean scope check 
		System.out.println("\n person 1 "+person1);
		// bean scope check 
		
		System.out.println("\n person 2 "+person2);
		
		Address address=(Address) context.getBean("address");
	
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
