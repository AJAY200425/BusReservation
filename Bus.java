package accenture.preparation.interview;

public class Bus {
	private int BusNo;
	private boolean Ac;
	private int Capacity;
	
	Bus(int BusNo,boolean Ac,int Capacity){
		this.BusNo=BusNo;
		this.Ac=Ac;
		this.Capacity=Capacity;
	}
	
	public int getBusNo() {
		return this.BusNo;
	}
	public void setBusNo(int busNo) {
		this.BusNo = busNo;
	}
	public boolean isAc() {
		return this.Ac;
	}
	public void setAc(boolean ac) {
		this.Ac = ac;
	}
	public int getCapacity() {
		return this.Capacity;
	}
	public void setCapacity(int capacity) {
		this.Capacity = capacity;
	}
	
	public void DisplayBusInfo() {
		System.out.println("Bus No:"+this.BusNo);
		System.out.println("Ac Availablity:"+(this.Ac==true?"Yes":"No"));
		System.out.println("Capacity of the Bus:"+this.Capacity);
		System.out.println("-------------------------");
	}
	

}
