
public class AddTimes {

	
		int sec;
		int min;
		int hr;
		
		public AddTimes(int h, int m, int s)
		{
			hr=h;
			min=m;
			sec=s;
			
		}
		void add(AddTimes obj2)
		{
			this.hr += obj2.hr;
			this.min += obj2.min;
			this.sec += obj2.sec;
		}
		void check()
		{
			if(this.sec>=60)
			{
				this.min+=1;
				this.sec=this.sec-60;
			}
			if(this.min>=60)
			{
				this.hr+=1;
				this.min=this.min-60;
			}
			if(this.hr>24)
			{
				this.hr= this.hr-24;
			}
			
		}
		void display()
		{
			System.out.println(this.hr+":" + this.min+":"  + this.sec);
		}
		
		public static void main(String[] args)
		{
			
			AddTimes obj1 = new AddTimes(10,45,60);
			AddTimes obj2 = new AddTimes(03,55,05);
			
			obj1.add(obj2);
			obj1.check();
			System.out.println("The addition of the times is: ");
			obj1.display();
		}
}