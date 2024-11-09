package accenture.preparation.interview;
import java.text.ParseException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int choice=1;
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
		buses.add(new Bus(1,false,2));
		buses.add(new Bus(2,true,75));
		buses.add(new Bus(3,false,45));
		
		for(int i=0;i<buses.size();i++)
			buses.get(i).DisplayBusInfo();
		
		while(choice==1)
		{
			System.out.println("Enter your choice");
			if(choice==1) {
				Booking booking=new Booking();
				if(booking.Availability(buses,bookings)==true) {
					System.out.println("Booking Your Ticket....");
					bookings.add(booking);
					System.out.println("Your Ticket has been booked successfully");
				}
				else {
					System.out.println("The bus you are looking for is out of capacity, please select another Bus");
				}
				
				//bookings.add(new Booking());
			}
				
			 choice=sc.nextInt();
			 if(choice==2)
			{
				System.out.println("Exit....");
				System.exit(0);
			}
		}
		
		
	}

}
