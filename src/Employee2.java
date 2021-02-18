import java.util.Scanner;
public class Employee2 {
    int salary,hours;
    Scanner s;
    void getInfo()
    {
        s=new Scanner(System.in);
        System.out.println("Enter Salary and working hours: ");
        salary=s.nextInt();
        hours=s.nextInt();
    }
    void addSal()
    {
        if(salary<500)
        {
            salary=salary+10;
        }
        
    }
    void addWork()
    {
        if(hours>6)
        {
            salary=salary+5;
        }
    }
    void print()
    {
        System.out.println("Final Salary: "+salary);
    }

 

}