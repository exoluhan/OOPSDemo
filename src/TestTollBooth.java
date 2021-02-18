interface Truck
{
	int AXEL=5;
	int WEIGHT=10;
}
interface TollBooth
{
	public void calculateTollDue(Truck t);
	public void displayData();
}
class FordTruck implements Truck
{
	int a,w;
	String s;
	FordTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s="FordTruck";
	}
}
class NissanTruck implements Truck
{
	int a,w;
	String s;
	NissanTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s= "NissanTruck";
	}
}
class DaewooTruck implements Truck
{
	int a,w;
	String s;
	DaewooTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s= "DaewooTruck";
	}
}
class AlleghenyTollBooth implements TollBooth
{
	int due,alx,wt,total=0;
	String tru;
	static int count;
	public void calculateTollDue(Truck t) {}
	public void calculateTollDue(FordTruck f)
	{
		due = f.a*FordTruck.AXEL+(f.w/450)*FordTruck.WEIGHT;
		this.alx=f.a;
		this.wt=f.w;
		this.tru=f.s;
		count++;
	}
	public void calculateTollDue(NissanTruck f)
	{
		due = f.a*NissanTruck.AXEL+(f.w/450)*NissanTruck.WEIGHT;
		this.alx=f.a;
		this.wt=f.w;
		this.tru=f.s;
		count++;
	}
	public void calculateTollDue(DaewooTruck f)
	{
		due = f.a*DaewooTruck.AXEL+(f.w/450)*DaewooTruck.WEIGHT;
		this.alx=f.a;
		this.wt=f.w;
		this.tru=f.s;
		count++;
	}
	public void displayData()
	{
		System.out.println("Type of vehicle is: "+ tru+", no.of axels is: "+alx+", the weight of truck is "+wt);
		System.out.println("The toll charge for this vehicle is: "+due);
		total += due;
	}
	void tillLastReceipt()
	{
		System.out.println("No.of vehicles crossed TollBooth is: "+count);
		System.out.println("Total amount collected by tollbooth is: "+total);
		total=0;
		count=0;
	}
	
}
public class TestTollBooth {

	public static void main(String[] args) {
		
		AlleghenyTollBooth booth =new AlleghenyTollBooth();
		
		FordTruck ford = new FordTruck(5,12000); // 5 Axles and 12000 kilograms
		booth.calculateTollDue(ford);
		booth.displayData();
		
		NissanTruck nissan= new NissanTruck(2,5000); // 2 Axles and 5000 kg
		booth.calculateTollDue(nissan);
		booth.displayData();
		
		DaewooTruck daewoo = new DaewooTruck(6,17000);
		booth.calculateTollDue(daewoo);
		booth.displayData();
		
		booth.tillLastReceipt();
		System.out.println("\tReset counter\t");
		booth.tillLastReceipt();
	}

}
