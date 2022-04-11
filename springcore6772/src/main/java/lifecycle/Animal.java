package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean,DisposableBean
{
     private String name;
     private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception 
	{
		
		System.out.println("this is destroy method");
	}

	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("this is afterpropertiesset()");
	}
     
     
}
