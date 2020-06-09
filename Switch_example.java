import java.util.Scanner;
public class Switch_example
{
    public static void main(String[] args)
    {
        String ch;
        Scanner sc =new Scanner (System.in);
        System.out.println("Type 'Hi','Hello' or 'Hey': ");
        ch=sc.next();
        ch=ch.toLowerCase();
        switch(ch)
        {
            case "hi":
            System.out.println("You Entered Hi");
            break;
            case "hello":
            System.out.println("You Entered Hello");
            break;
            case "hey":
            System.out.println("You Entered Hey");
            break;
            default:
            System.out.println("Invalid input");
        }  
    }
}
