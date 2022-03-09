package inhritance;

interface NewInterface {
	 
    
    static void hello()
    {
        System.out.println("Hello, This is a static method");
    }
 
    
    void overrideMethod(String s);
}
 

public class StaticInterface implements NewInterface 
{
 
    public static void main(String[] args)
    {
    	StaticInterface obj1 = new StaticInterface();
 
        
        NewInterface.hello();
 
        
        obj1.overrideMethod("Hello, This is Overrride method");
    }
 
    
 
    @Override
    public void overrideMethod(String s)
    {
        System.out.println(s);
    }
}






