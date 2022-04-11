package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.construct.Laptop;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/configlifecycle.xml");
		context.registerShutdownHook();
		Student s = (Student) context.getBean("student");
		System.out.println(s.getStudentid());
		System.out.println(s.getStudentname());
		System.out.println(s.getEducation());
	}

}
