package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/annotationconfig.xml");
		context.registerShutdownHook();
		Vehicle v = (Vehicle) context.getBean("vehicle");
		System.out.println(v);

	}

}
