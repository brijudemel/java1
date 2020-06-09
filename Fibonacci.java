import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the length of series to be displayed:  ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        {
        System.out.print("0\t");
        if(n>1)
            fib((n-1),1,0);
        }
        else
            System.out.println("Invalid length is entered");
    }

    static void fib(int n,int a,int b)
    {
        if(n==1)
            System.out.println(a);
        else
        {
            System.out.print(a+"\t");
            fib((n-1),a+b,a);
        }
    }
}
