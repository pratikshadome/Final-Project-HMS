package manytomany;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class m2mMain {

	public static void main(String[] args) 
	{
        System.out.println( "Hello World!" );
    	
        Configuration config = new Configuration();
        
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
       
        Transaction tf  = session.beginTransaction();
        
        Employee employee1 = new Employee();
        employee1.setEmpname("Pratiksha");
        
        Employee employee2 = new Employee();
        employee2.setEmpname("Dome");
        
        List<Employee>emplist= new ArrayList<Employee>();
        emplist.add(employee1);
        emplist.add(employee2);
        
        Project project1 = new Project();
        project1.setProjectid(101);
        project1.setProjectname("python");
        
        Project project2 = new Project();
        project2.setProjectid(102);
        project2.setProjectname("java");
        
        List<Project>projectlist = new ArrayList<Project>();
        projectlist.add(project1);
        projectlist.add(project2);
        
        employee1.setProject(projectlist);
        employee2.setProject(projectlist);
        
        //session.save(employee1);
        //session.save(employee2);
        //session.save(project1);
        //session.save(project2);
       //session.saveOrUpdate(projectlist);
       // session.saveOrUpdate(emplist);
        session.saveOrUpdate(employee1);
       session.saveOrUpdate(employee2);
       session.save(emplist);
       session.save(projectlist);
        
        tf.commit();
        
        
       
	}

}
