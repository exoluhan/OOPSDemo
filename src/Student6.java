import java.util.Scanner;

public class Student6 implements IMaths {

	@Override
	public void add() {
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform addition");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a+b;

        System.out.println("Sum of "+a+" and "+b+" is "+s);
		

	}

	@Override
	public void sub() {
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform substraction");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a-b;

        System.out.println("Difference of "+a+" and "+b+" is "+s);
		

	}

	@Override
	public void mul() {
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values multiplication");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a*b;

        System.out.println("Product of "+a+" and "+b+" is "+s);
		

	}

	@Override
	public void div() {
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values division");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a/b;

        System.out.println("Quotient of "+a+" and "+b+" is "+s);
		

	}

	public static void main(String[] args) {
		
		Student6 s1= new Student6();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		
		

	}

}
