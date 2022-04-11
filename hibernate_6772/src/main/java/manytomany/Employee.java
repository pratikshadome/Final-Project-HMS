package manytomany;
import java.util.*;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee
{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
	@Column
    private String empname;
    @ManyToMany(mappedBy = "employee",cascade= CascadeType.ALL)
    List<Project>project;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Employee(int empid, String empname, List<Project> project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", project=" + project + "]";
	}
    
    
    
}
