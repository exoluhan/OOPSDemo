import java.util.Scanner;

public class RectArea {
	
	Scanner s;
	int length,breath;
	float area;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the value of length and breath: ");
		length= s.nextInt();
		breath= s.nextInt();
	}
	void returnArea()
	{
		area= length*breath;
		System.out.println("Area: "+area);
	}
}
