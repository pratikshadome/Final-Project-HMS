package mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String[] args) 
	{
        System.out.println( "Hello World!" );
    	
        Configuration config = new Configuration();
        
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
       
        Transaction tf  = session.beginTransaction();
        
        Person person = new Person();
        person.setName("Pratiksha");
        
        
        
        Account account = new Account();
        account.setAccountNo(1234);
        account.setAccountType("saving");
     
        account.setPerson(person);
    
        
        Account account1 = new Account();
        account1.setAccountNo(12345);
        account1.setAccountType("current");
        account1.setPerson(person);
        
        List<Account> list= new ArrayList<Account>();
        list.add(account);
        list.add(account1);
        
        person.setAccount(list);
     
     
        
        session.save(account);
        session.save(person);
        session.save(account1);
        
        tf.commit();
	}

}
