package criteria;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        System.out.println( "Hello World!" );
    	
        Configuration config = new Configuration();
        
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        
    //.........................greater than...........................................
        
        Criteria c = session.createCriteria(Employee111.class);
        c.add(Restrictions.gt("salary", 2000));
        List list = c.list();
        
        for(int i = 0; i<list.size();i++)
        {
        	System.out.println(list.get(i));
        	
        }
        
   //.......................less than..........................................................     
        
        Criteria c1 = session.createCriteria(Employee111.class);
        c1.add(Restrictions.lt("salary", 5000));
        List list11 = c1.list();
        
        for(int i = 0; i<list11.size();i++)
        {
        	System.out.println(list11.get(i));
        }
       
       
        
   //.....................less than equal......................................................     
        
        Criteria c2 = session.createCriteria(Employee111.class);
        c2.add(Restrictions.le("salary", 5000));
        List list22 = c2.list();
        
        for(int i = 0; i<list22.size();i++)
        {
        	System.out.println(list22.get(i));
        }
       
        
        
   // ...................not equal to........................................................
        
       Criteria c3 = session.createCriteria(Employee111.class);
        c3.add(Restrictions.ne("salary", 5000));
        List list33 = c3.list();
        
        for(int i = 0; i<list33.size();i++)
        {
        	System.out.println(list33.get(i));
        }
       
       
   
   //....................between..............................................................
        
       Criteria c4 = session.createCriteria(Employee111.class);
        c4.add(Restrictions.between("salary", 5000,7000));
        List list44 = c4.list();
        
        for(int i = 0; i<list44.size();i++)
        {
        	System.out.println(list44.get(i));
        }
       
       
        
   //.....................like..................................................................
        
        Criteria c5 = session.createCriteria(Employee111.class);
        c5.add(Restrictions.like("salary", 5000));
        List list55 = c5.list();
        
        for(int i = 0; i<list55.size();i++)
        {
        	System.out.println(list55.get(i));
        }
       
       
        
   //................using order class sorting asc or dsc....................................
        
        Criteria c6 = session.createCriteria(Employee111.class);
        c6.addOrder(Order.asc("salary"));
        List list66 = c6.list();
        
        for(int i = 0; i<list66.size();i++)
        {
        	System.out.println(list66.get(i));
        }
       
  //......................using projection class performs aggregate operations......................
        
        Criteria c7 = session.createCriteria(Employee111.class);
        c7.setProjection(Projections.rowCount());
        
      //  c7.setProjection(Projections.avg("salary"));
        
      //  c7.setProjection(Projections.max("salary"));
        
      //  c7.setProjection(Projections.min("salary"));
        
      //  c7.setProjection(Projections.countDistinct("name"));
        
        List list77 = c7.list();
        
        for(int i = 0; i<list77.size();i++)
        {
        	System.out.println(list77.get(i));
        }
        
        Transaction tf  = session.beginTransaction();  
        
        
        
      /*  Employee111 obj1 = new Employee111();
        obj1.setId(1);
        obj1.setName("Pratiksha");
        obj1.setSalary(2000);
        
        Employee111 obj2 = new Employee111();
        obj2.setId(2);
        obj2.setName("tokio");
        obj2.setSalary(4000);
        
        Employee111 obj3 = new Employee111();
        obj3.setId(3);
        obj3.setName("denvor");
        obj3.setSalary(5000);
        
        Employee111 obj4 = new Employee111();
        obj4.setId(4);
        obj4.setName("berlin");
        obj4.setSalary(6000);
        
        Employee111 obj5 = new Employee111();
        obj5.setId(5);
        obj5.setName("sergio");
        obj5.setSalary(5000);
        
        Employee111 obj6 = new Employee111();
        obj6.setId(6);
        obj6.setName("rio");
        obj6.setSalary(8000);
        
       /* List<Employee111>list1 =new ArrayList();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);
        list1.add(obj4);
        list1.add(obj5);
        list1.add(obj6);
        
        session.saveOrUpdate(list1);
        
        session.saveOrUpdate(obj1);
        session.saveOrUpdate(obj2);
        session.saveOrUpdate(obj3);
        session.saveOrUpdate(obj4);
        session.saveOrUpdate(obj5);
        session.saveOrUpdate(obj6);*/
        tf.commit();
	}

}
