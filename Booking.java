package accenture.preparation.interview;
import java.util.*;
import java.text.*;
public class Booking {
	String PassengerName;
	int BusNo;
	Date date;
	Booking() throws ParseException{
			Scanner sc=new Scanner(System.in);
			System.out.println("Name:");
			this.PassengerName=sc.nextLine();
			System.out.println("Bus No:");
			this.BusNo=sc.nextInt();
			System.out.println("Date to travel dd-mm-yy:");
			String dupe=sc.next();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yy");
			this.date=dateFormat.parse(dupe);
			
			
	}
	public boolean Availability(ArrayList<Bus> buses,ArrayList<Booking> bookings) {
		 int capacity=0;
		 int count=0;
		 for(Bus bus:buses)
		 {
			 if(bus.getBusNo()==this.BusNo)
				 capacity=bus.getCapacity();
		 }
		 for(Booking booked:bookings)
		 {
			 if(booked.BusNo==this.BusNo && booked.date.equals(this.date))
				 count++;
		 }
		 return (count<capacity)?true:false;
	}

}
