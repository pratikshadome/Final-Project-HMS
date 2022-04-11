package mapping;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;



@Entity
public class Person
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Column
    private String name;
	
	
	public Person(int id, String name, ArrayList<Account> account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	@OneToMany
	List<Account> account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return account;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
    
    
    
}
