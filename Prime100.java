import java.util.Scanner;
public class Prime100
{
    public static void main(String[] args)
    {
        boolean f;
        for(int i=2;i<=100;i++)
        {
            f=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.print(i+"\t");
        }
    }
}
