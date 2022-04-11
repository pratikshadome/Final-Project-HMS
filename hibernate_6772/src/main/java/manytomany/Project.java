package manytomany;

import java.util.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project
{
	    @Id
        private int projectid;
	    @Column
        private String projectname;
	    @ManyToMany
	    List<Employee>employee;
	    
		public int getProjectid() {
			return projectid;
		}
		public void setProjectid(int projectid) {
			this.projectid = projectid;
		}
		public String getProjectname() {
			return projectname;
		}
		public void setProjectname(String projectname) {
			this.projectname = projectname;
		}
		public List<Employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee> employee) {
			this.employee = employee;
		}
		public Project(int projectid, String projectname, List<Employee> employee) {
			super();
			this.projectid = projectid;
			this.projectname = projectname;
			this.employee = employee;
		}
		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Project [projectid=" + projectid + ", projectname=" + projectname + ", employee=" + employee + "]";
		}
	    
	    
        
}
