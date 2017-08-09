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
		Person person=(Person) context.getBean("person");
		person.speek();
		
		
		System.out.println(person);
		
		Address address=(Address) context.getBean("address");
	
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
