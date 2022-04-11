package com.Entity.hibernate_6772;



import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	
        Configuration config = new Configuration();
        
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
       
        Transaction tf  = session.beginTransaction();
        
   // .............................get and load method .............................................
        
     /* Student obj = session.get(Student.class, 1);
      System.out .println(obj.getRollno()+"\t"+obj.getName()+"\t"+obj.getEmail());
      
      Student obj1 = session.load(Student.class, 1);
      System.out .println(obj.getRollno()+"\t"+obj.getName()+"\t"+obj.getEmail());*/
     
      /*String hql = "from Student student where student.rollno=:rollnumber";
      Query<Student> query = session.createQuery(hql);
      query.setParameter("rollnumber",3);
      
      List<Student>list = query.list();
      for(int i = 0; i<list.size();i++)
      {
    	  System.out.println(list.get(i));
      }*/
      
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll number which you want to search");
        int rollnumber = sc.nextInt();
        
        System.out.println("enter the name which you want to search");
        sc.nextLine();
        String name = sc.nextLine();
        
        
        String hql = "update Student student set student.name=?1 where student.rollno = ?0";
        Query query = session.createQuery(hql);
        query.setParameter(0 , rollnumber );
        query.setString(1, name);
        
        int j= query.executeUpdate();
        
        if(j>0)
        {
        	tf.commit();
        	System.out.println("record updated"); 	
        }
        else
        {
        	System.out.println("record not updated");
        }
        
        
        
        List<Student>list = query.list();
        
        
        for(int i = 0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
        
       
        
     
       
    
        Student s = new Student();
        s.setRollno(1);
        s.setName("pratiksha");
        s.setEmail("pratiksha@gmail.com");
  
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("denver");
        s1.setEmail("denver@gmail.com");
        
        Student s2 = new Student();
        s2.setRollno(3);
        s2.setName("proffessor");
        s2.setEmail("proffessor@gmail.com");
        
        Student s3 = new Student();
        s3.setRollno(4);
        s3.setName("rio");
        s3.setEmail("rio@gmail.com");
        
       
        Student s4 = new Student();
        s4.setRollno(5);
        s4.setName("tokio");
        s4.setEmail("tokio@gmail.com");
        
      session.save(s);
      session.save(s1);
      session.save(s2);
      session.save(s3);
      session.save(s4);
        
        tf.commit();
        
        

    }
}
