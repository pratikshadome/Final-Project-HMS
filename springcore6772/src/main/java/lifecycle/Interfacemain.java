package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Interfacemain {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/interfaceconfig.xml");
		context.registerShutdownHook();
		Animal A = (Animal) context.getBean("animal");
		System.out.println(A);
	}

}
