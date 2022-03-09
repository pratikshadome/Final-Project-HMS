package inhritance;

class Sem1
{
	int math,c,java;
	public void input1()
	{
		math=90;
		c=80;
		java=30;
	}
	public void output1()
	{
		System.out.println("Reuslt of semister 1 is");
		System.out.println("marks in mathematics"+math);
		System.out.println("marks in c language"+c);
		System.out.println("marks in java"+java);
	}
}
class Sem2 extends Sem1
{
int toc,os,ds;
public void input2()
{
	toc=35;
	os=88;
	ds=66;
}
public void output2()
{
	System.out.println(".....................................................................................");
	System.out.println("reuslt of semister 2 is");
	System.out.println("marks in theory of computer"+toc);
	System.out.println("marks in operating system"+os);
	System.out.println("marks in data structure ds");
}
}
public class SingleInheritance {

	public static void main(String[] args)
	
	{
		Sem2 obj1 = new Sem2();
		obj1.input1();
		obj1.output1();
		
		obj1.input2();
		obj1.output2();
		
		
		
		}

}
