package java8;
import java.util.function.Consumer;

public class Consumerex01 {

	public static void main(String[] args) 
	{
            Consumer<String>con = s->System.out.println(s);
            con.accept("hello java");
            
            Consumer<String>con1 = s->System.out.println(s.toLowerCase());
        //    Consumer<String>con2 = s->System.out.println(s);
            con1.accept("HELLO PRATKSHA");
            
	}

}