package multithreading;

class MovieTickets
{
	public int t;
	static int total_tkt = 20;
	public static synchronized void bookTickets(int ticket)
	{
		if(total_tkt >=ticket)
		{
			total_tkt = total_tkt-ticket;
			System.out.println(+ticket+ " tickets are booked only " +total_tkt+ " tickets are remaining");
		}
		else
			System.out.println("all tickets are booked ");
	}
	
	}
public class MyMovieShow01 extends Thread
{
	static MovieTickets book;
	static int t;
	public void run()
	{
		
		book.bookTickets(t);

	}
	
	public static void main(String[] args)
	{
		
		book = new MovieTickets();
		MyMovieShow01 pratiksha = new MyMovieShow01();
		pratiksha.t = 2;
		pratiksha.start();
		
		
		MyMovieShow01 datta = new MyMovieShow01();
		datta.t= 5;
		datta.start();
		
		MyMovieShow01 prashant = new MyMovieShow01();
		prashant.t = 10;
		prashant.start();
		
		

	}

}
