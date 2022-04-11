package np1;
import java.util.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Np1main {

	public static void main(String[] args)
	{
		
		 System.out.println( "Hello World!" );
	    	
	        Configuration config = new Configuration();
	        
	        config.configure("hibernate.cfg.xml");
	        
	        SessionFactory sf = config.buildSessionFactory();
	        
	        Session session = sf.getSessionFactory().openSession();
	        List<Class1>list = session.createQuery("from class1 cc join fetch cc.student1",Class1.class).getResultList();
	        
	        
	        for(Class1 cls : list)
	        {
	        	System.out.println("class details....");
	        	System.out.println(cls.getClassid()+"\t"+cls.getClassname());
	        	
	        	List<Student1>list2 = cls.getStudent1();
	        	for(Student1 stu : list2)
	        	{
	        		System.out.println(stu.getStuid()+"\t"+stu.getStuname());
	        	}
	        }
	        //Transaction tf  = session.beginTransaction();  
	        
	        Class1 cl = new Class1();
	        cl.setClassid(11);
	        cl.setClassname("java");
	        cl.setStudent1(sd1);
	        

	        Class1 cl1 = new Class1();
	        cl1.setClassid(22);
	        cl1.setClassname("python");


	        Class1 cl2 = new Class1();
	        cl2.setClassid(33);
	        cl2.setClassname("sql");
	        
	        Student1 sd = new Student1();
	        sd.setStuid(1);
	        sd.setStuname("pratiksha");
	        
	        Student1 sd1 = new Student1();
	        sd1.setStuid(2);
	        sd1.setStuname("tina");
	        
	        Student1 sd2 = new Student1();
	        sd2.setStuid(3);
	        sd2.setStuname("mina");
	        
	        Student1 sd3 = new Student1();
	        sd3.setStuid(4);
	        sd3.setStuname("sina");
	        
	        Student1 sd4 = new Student1();
	        sd4.setStuid(5);
	        sd4.setStuname("ina");
	        
	        Student1 sd5 = new Student1();
	        sd5.setStuid(6);
	        sd5.setStuname("lina");
	        
			/*
			 * List<Student1>list1 = new ArrayList(); list1.add(sd1); list1.add(sd2);
			 * 
			 * List<Student1>list2 = new ArrayList<Student1>(); list2.add(sd3);
			 * list2.add(sd4);
			 * 
			 * List<Student1>list3 = new ArrayList<Student1>(); list3.add(sd4);
			 * list3.add(sd);
			 */
	        session.saveOrUpdate(cl);
	        session.saveOrUpdate(cl1);
	        session.saveOrUpdate(cl2);
	        
	        session.saveOrUpdate(sd);
	        session.saveOrUpdate(sd1);
	        session.saveOrUpdate(sd2);
	        session.saveOrUpdate(sd3);
	        session.saveOrUpdate(sd4);
	        session.saveOrUpdate(sd5);
	        
			/*
			 * session.saveOrUpdate(list1); session.saveOrUpdate(list2);
			 * session.saveOrUpdate(list3);
			 */
	        
	        //tf.commit();
	        
	        
	}

}
