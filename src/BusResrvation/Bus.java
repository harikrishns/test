package BusResrvation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; //get(66 and set
	Bus(int no,boolean ac,int cap)
	{
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public int getCapacity() {
		return capacity;
	}
		public void setAc(boolean val){
			ac=val;
		}
		public void setCapacity(int cap) {
			capacity=cap;
			
		}
		public void displayBusInfo() {
			System.out.println("Bus no:"+ busNo +"Ac:"+ac+"Total Capacity:"+capacity);
			
			
			
		
	
	
	}
		public int getBusNo() {
			// TODO Auto-generated method stub
			return 0;
		}

}
