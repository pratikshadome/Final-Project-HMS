/*Create an ArrayList of Employee( id,name,address,sal) objects
and search for particular Employee object based on id number.*/

package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

		class Emp 
		{
			private int id;
			private String name;
			private String address;
			private Double salary;
			
			public Emp(int id, String name, String address, Double salary)
			{
				super();
				this.id = id;
				this.name = name;
				this.address = address;
				this.salary = salary;
			}	
			
			public int getId()
			{
				return id;
			}

			@Override
			public String toString() 
			{
				return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
			}
		}
		public class Assignment04
		{

			public static void main(String[] args) 
			{
				List<Emp> list = new ArrayList<>();
				
				list.add(new Emp(1, "stockhomes", "spen", 2000000000000000000.0));
				list.add(new Emp(2, "tokiyo", "indoneshia", 300000000000000.0));
				list.add(new Emp(3, "denvor", "france", 55000000000.0));
				list.add(new Emp(4, "berlin", "jarmany", 80000000000000.0));
				
				Iterator<Emp> itr = list.iterator();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter ID :");
				int searchId=sc.nextInt();
				
			;
				while (itr.hasNext())
				{
					Emp emp = itr.next();
					if (emp.getId() == searchId)
						System.out.println(emp);
				}
			}

		



	}


