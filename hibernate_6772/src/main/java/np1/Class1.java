package np1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Class1 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     int classid;
	@Column
     String classname;
	@OneToMany(cascade= CascadeType.ALL)
	List<Student1>student1;
	
	
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public List<Student1> getStudent1() {
		return student1;
	}
	public void setStudent1(List<Student1> student1) {
		this.student1 = student1;
	}
	@Override
	public String toString() {
		return "Class1 [classid=" + classid + ", classname=" + classname + ", student1=" + student1 + "]";
	}
	public Class1(int classid, String classname, List<Student1> student1) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.student1 = student1;
	}
	public Class1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
   
}
