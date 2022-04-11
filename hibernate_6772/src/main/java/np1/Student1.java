package np1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student1
{
     @Id
     int stuid;
     @Column
     String stuname;
     @ManyToOne
     Class1 class1;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public Class1 getClass1() {
		return class1;
	}
	public void setClass1(Class1 class1) {
		this.class1 = class1;
	}
	@Override
	public String toString() {
		return "Student1 [stuid=" + stuid + ", stuname=" + stuname + ", class1=" + class1 + "]";
	}
	public Student1(int stuid, String stuname, Class1 class1) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.class1 = class1;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
     
     
     
     
}
