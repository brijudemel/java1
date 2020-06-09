import java.util.Scanner;
public class Time_calc 
{
    public static void main(String[] args)
    {
        long t;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter total no. of minutes:\t");
        t=sc.nextLong();
        long hours,days,years,rem_min;
        hours=t/60;
        rem_min=t%60;
        days=hours/24;
        hours=hours%24;
        years=days/365;
        days=days%365;
        if(rem_min>30)
            hours++;
        if(hours>12)
            days++;
        System.out.println(t+" minutes is approximately "+years+" years and "+days+" days.");
    }
    
}
