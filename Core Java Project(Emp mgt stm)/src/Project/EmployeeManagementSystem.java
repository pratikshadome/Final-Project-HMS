
package Project;
import java.util.*;
public class EmployeeManagementSystem 
{
	int eid;
	static int a;
	String name,address,phno,dob,post,mail;
	float sal;
	
	
     public int getEid() 
     {
		return eid;
	 }

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPhno() 
	{
		return phno;
	}

	public void setPhno(String phno) 
	{
		this.phno = phno;
	}

	public String getDob() 
	{
		return dob;
	}

	public void setDob(String dob) 
	{
		this.dob = dob;
	}

	public String getPost() 
	{
		return post;
	}

	public void setPost(String post) 
	{
		this.post = post;
	}

	public String getMail() 
	{
		return mail;
	}

	public void setMail(String mail) 
	{
		this.mail = mail;
	}

	public float getSal() 
	{
		return sal;
	}

	public void setSal(float sal)
	{
		this.sal = sal;
	}

	
	@Override
	public String toString() 
	{
		return "[eid=" + eid + ", name=" + name + ", address=" + address + ", phno=" + phno
				+ ", dob=" + dob + ", post=" + post + ", mail=" + mail + ", sal=" + sal+"]\n";
	}
     
	
	public static void main(String[]args)
     {
		char ch1;
		String ename11="";
		String ph1;
		EmployeeManagementSystem e;
		ArrayList<EmployeeManagementSystem>ar=new ArrayList();
		 Scanner sc=new Scanner(System.in);
 		System.out.println("-------Login--------");
 		System.out.println("Enter User name");
 		String un=sc.next();
 		System.out.println("Enter Password");
 		String pass=sc.next();
 		if(un.equals("myname") && pass.equals("employee"))
 		{
 			
 			System.out.println("Login Successed \n\n");
 			do
 			{
 				//Scanner sc=new Scanner(System.in);

 				System.out.println("--------------------------Employee Management System-------------------------");
 				System.out.println("1.Add Employee Details");
 				System.out.println("2.Show Employee Details");
 				System.out.println("3.Search Employee ");
 				System.out.println("4.Update Employee");
 				System.out.println("5.Delete Employee");
 				System.out.println("Enter choice");
 				int ch=sc.nextInt();   		 
 				switch(ch)
 				{
 				case 1:      e=new EmployeeManagementSystem();

		 				System.out.println("Add Employee");
		 				System.out.println("Enter emp id");
		 				int id=sc.nextInt();	
		
		 				System.out.println("Enter emp name");
		 				String ename=sc.next();
		 				if(ename.matches("^[A-Za-z]\\w{3,29}$"))
		 				{
		 					e.setName(ename);
		 				}
		 				else
		 				{
		 					System.out.println("Invalid Name");
		 					System.out.println("Enter Name again");
		 					 ename11=sc.next();
		 					 e.setName(ename11);
		 				}
		 				System.out.println("Enter address");
		 				String addr=sc.next();
		 				System.out.println("Enter Contact No");
		 				String ph=sc.next();
		 				if(ph.matches("(0|91)?[7-9][0-9]{9}"))
		 				{
		 					e.setPhno(ph);
		 				}
		 				else
		 				{
		 					System.out.println("Invalid number");
		 					System.out.println("Type Contact No.again");
		 					ph1=sc.next();
		 					e.setPhno(ph1);
		 				}
		
		 				System.out.println("Enter DOB");
		 				String dob=sc.next();
		 				System.out.println("Enter Employee post");
		 				String post=sc.next();
		
		 				System.out.println("Enter Email id");
		 				String email=sc.next();
		 				if(email.matches("^[a-z0-9_!#$&'*+/=?'{|}~^.-]+@[a-z0-9.-]+$"))
		 				{
		 					e.setMail(email);
		 				}
		 				else
		 				{
		 					System.out.println("Invalid email id");
		 					System.out.println("Type EmailId again");
		 					String email1=sc.next();
		 					e.setMail(email1);
		 				}
		 				System.out.println("Enter Salary");
		 				float sal=sc.nextFloat();
		
		 				e.setEid(id);
		 				
		 				//e.setName(ename11);
		 				e.setAddress(addr);
		 				
		 				e.setDob(dob);
		 				e.setPost(post);
		 				
		 				e.setSal(sal);
		 				ar.add(e);
		 				
		 				
		 				break;
 				case 2:     System.out.println("------------------------------------------------------Show Employee Details-----------------------------------------------------------------\n");
		 				
		 				System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n","EMP ID", "EMP NAME","ADDRESS","PH NO.","DOB","POST","EMAIL ID","SALARY");
		 				for(int i=0;i<ar.size();i++)
		 				{
		 					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		 					System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n\n",ar.get(i).getEid(),ar.get(i).getName(),ar.get(i).getAddress(),ar.get(i).getPhno(),ar.get(i).getDob(),ar.get(i).getPost(),ar.get(i).getMail(),ar.get(i).getSal());	
		 					//System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		 					// fmt.format("%15s %15s %15s %15s %15s %15s %15s %15s\n",ar.get(i).getEid()+ar.get(i).getName()+ar.get(i).getAddress()+ar.get(i).getPhno()+ar.get(i).getDob()+ar.get(i).getPost()+ar.get(i).getMail()+ar.get(i).getSal());
		 				}
		 				// System.out.println(fmt);
		 				break;

 				case 3:     System.out.println("Search Employee");  
		 				System.out.println("Enter emp id to search employee");
		 				int idd=sc.nextInt();
		 				for(int i=0;i<ar.size();i++)
		 				{
		 					if(ar.get(i).getEid()==idd)
		 					{
		 						//System.out.println(ar.get(i));
		 						System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n","EMP ID", "EMP NAME","ADDRESS","PH NO.","DOB","POST","EMAIL ID","SALARY");
		 						System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		 						System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n\n",ar.get(i).getEid(),ar.get(i).getName(),ar.get(i).getAddress(),ar.get(i).getPhno(),ar.get(i).getDob(),ar.get(i).getPost(),ar.get(i).getMail(),ar.get(i).getSal());	
		
		 						break;
		 					}
		 					else
		 					{
		 						System.out.println("Record not available");
		 					}
		 				}
		 				break;

 				case 4:      e=new EmployeeManagementSystem();

		 				System.out.println("Update employee Details");  
		 				System.out.println("Enter emp id which you want to update");
		 				int id1=sc.nextInt();
		 				//System.out.println("what you want to update");
		 				//    		             float sal1=sc.nextFloat();
		 				//e.setSal(sal1);
		 				for(int i=0;i<ar.size();i++)
		 				{
		 					if(ar.get(i).getEid()==id1)
		 					{
		 						//System.out.println("1). Emp Name\n" + 	"2). Emp Address\n" + "3). Contact No.\n" + "4). DOB\n" +"). Post\n"+ "6). Email ID\n"+ "7)Salary \n");
		 						System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n","EMP ID", "EMP NAME","ADDRESS","PH NO.","DOB","POST","EMAIL ID","SALARY");
		 						System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		
		 						System.out.printf("%10s%15s%15s%15s%15s%15s%20s%15s\n\n",ar.get(i).getEid(),ar.get(i).getName(),ar.get(i).getAddress(),ar.get(i).getPhno(),ar.get(i).getDob(),ar.get(i).getPost(),ar.get(i).getMail(),ar.get(i).getSal());	
		
		 						// System.out.println(ar+"\n");
		 						System.out.println("Emp ID \n"+ar.get(i).getEid());
		 						System.out.println("Enter emp name");
		 						String ename1=sc.next();
		 						if(ename1.matches("^[A-Za-z]\\w{3,29}$"))
				 				{
		 							e.setName(ename1);
				 				}
				 				else
				 				{
				 					System.out.println("Invalid Name");
				 					System.out.println("Enter Name again");
				 					String ename12=sc.next();
				 					
				 				}
		 						System.out.println("Enter address");
		 						String addr1=sc.next();
		 						System.out.println("Enter Contact No");
		 						String ph2=sc.next();
		 						if(ph2.matches("(0|91)?[7-9][0-9]{9}"))
				 				{
				 					e.setPhno(ph2);
				 				}
				 				else
				 				{
				 					System.out.println("Invalid number");
				 					System.out.println("Type Contact No.again");
				 					String ph3=sc.next();
				 					e.setPhno(ph3);
				 				}
		 						System.out.println("Enter DOB");
		 						String dob1=sc.next();
		 						System.out.println("Enter Employee post");
		 						String post1=sc.next();
		
		 						System.out.println("Enter Email id");
		 						String email1=sc.next();
		 						if(email1.matches("^[a-z0-9_!#$&'*+/=?'{|}~^.-]+@[a-z0-9.-]+$"))
				 				{
				 					e.setMail(email1);
				 				}
				 				else
				 				{
				 					System.out.println("Invalid email id");
				 					System.out.println("Type EmailId again");
				 					String email2=sc.next();
				 					e.setMail(email2);
				 				}
		 						System.out.println("Enter Salary");
		 						float sal1=sc.nextFloat();
		
		 						e.setEid(ar.get(i).getEid());
		 					
		 					//	e.setName(ename12);
		 						e.setAddress(addr1);
		 						
		 						e.setDob(dob1);
		 						e.setPost(post1);
		 						
		 						e.setSal(sal1);
		 						ar.set(i, e);
		 						break;

 					        }


 				         } 	 


 				break;

 				case 5:     //e=new EmployeeManagementSystem();
		 					System.out.println("Enter ID to delete Record");
		 					int id2=sc.nextInt();
		 					String nm3="Not Availavle";
		 					
		 					for(int i=0;i<ar.size();i++)
		 					{
		 						if(ar.get(i).getEid()==id2)
		 						{
		 							ar.remove(i);
		 							nm3="Removed";     	
		 						} 	 	
//		 						int a=ar.get(i+1).getEid();
//		 						ar.get(i).setEid(a); 						
//		 						
		 					}
		 					System.out.println(nm3);
		 					
		 					break;
		
 				default:   System.out.println("Invalid input");	

 				}
 				System.out.println("Do you wish to continue");
 				ch1=sc.next().charAt(0);

 			}while(ch1=='y'||ch1=='Y');
 		}
 		else
 		{
 			System.out.println("Invalid User");
 		}
     }
}