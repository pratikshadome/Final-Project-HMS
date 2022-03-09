package multithreading;


	
		class BMS
		{
		static int total_tickets=20;
		synchronized public void BT(int ticket)
		{
		if(total_tickets>=ticket)
		{
		total_tickets = total_tickets-ticket;
		System.out.println(ticket+" has tickets has been booked & remaining are"
		+total_tickets);
		}
		else
		{
		System.out.println("Ticket is not booked only "+total_tickets+" are available ");
		}
		}
		
	
		}

		public class MMS extends Thread
		{
		static BMS book;
		int t;
		public void run()
		{
		book.BT(t);
		}
		public static void main(String[] args)
		{
		
		book = new BMS();

		MMS pratiksha = new MMS();
		pratiksha.t=15;
		pratiksha.start();

		MMS prashant = new MMS();
		prashant.t=5;
		prashant.start();

		}

		
	}


