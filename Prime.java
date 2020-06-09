import java.util.Scanner;
public class Prime
{
    int n;
    Prime(int n)        //Constructor
    {
        this.n=n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);    //Scanner object created.
        int n;
        while(true)
        {
            System.out.println("Enter the No. to be checked");
            n=sc.nextInt();
            Prime ob = new Prime(n);
            if(ob.check())
            {
                System.out.println(ob.n+" is a PRIME Number.");
            }
            else
            {
                System.out.println(ob.n+" is a COMPOSITE Number.");
            }
            ob=null;
            int choice;       //To check it more than once.
            System.out.println("Enter 1 to check another number, else press any other key");
            choice=sc.nextInt();
            if(choice!=1)
                break;
        }
    }
    boolean check()       //Checks if the number is prime or not.
    {
        boolean b=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                b=false;
                break;
            }
        }
        return b;       //Returns a boolean value.
    }
}
