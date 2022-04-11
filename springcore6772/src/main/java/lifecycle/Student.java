//first approach of life cycle............xml

package lifecycle;

public class Student 
{
     private int studentid;
     private String studentname;
     private String education;
     
     
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
		System.out.println("this is id setter method");
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", education=" + education + "]";
	}
	public Student(int studentid, String studentname, String education) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.education = education;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	public void start()
	{
		System.out.println("this is start method");
	}
	public void end()
	{
		System.out.println("this is end method");
	}
     
}
