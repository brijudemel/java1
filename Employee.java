import java.util.Scanner;
public class Employee
{
    String name, address;
    Scanner sc=new Scanner(System.in);
    int doj;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee emp[] = new Employee[3];     //Creating array of employee objects.
        for(int i=0;i<3;i++)
        {
            emp[i]=new Employee();
        }
        System.out.println("Enter Details of the Employees:");
        for(int i=0;i<3;i++)
        {
            System.out.println("Employee "+(i+1)+":");
            emp[i].get();
        }
        System.out.println("Name\t\t\tYear of Joining\t\t\tAddress");
        for(int i=0;i<3;i++)
        {
            emp[i].display();
        }
    }
    void get()        //To get Employee details
    {
        System.out.print("Name:\t");
        name=sc.nextLine();
        System.out.println();
        System.out.print("Address:\t");
        address=sc.nextLine();
        System.out.println();
        System.out.print("Year of Joining:\t");
        doj=sc.nextInt();
        System.out.println();
    }
    void display()        //To print Employee details
    {
        System.out.println(name+"\t\t\t"+doj+"\t\t\t"+address);
    }
}
