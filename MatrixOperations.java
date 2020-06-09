import java.util.Scanner;
public class MatrixOperations
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int m,n;
        System.out.println("Enter the number of rows and columns of the array:");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        int d[][]=new int[m][n];
        System.out.println("Enter the elements of 1 st array :");
        for(int i=0;i<m;i++)              //Getting values of array 1
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd array :");
        for(int i=0;i<m;i++)              //Getting values of array 2
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)              //Adding matrix 1 and matrix 2
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++)              //Multiplying matrix 1 and matrix 2
        {
            for(int j=0;j<n;j++)
            {
                d[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    d[i][j]+=a[i][k]*b[k][j];   
                }
            }
        }
        System.out.println("Addition Matrix:");
        for(int i=0;i<m;i++)            //Printing Added Matrix
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Multiplication Matrix:");       
        for(int i=0;i<m;i++)        //Printing Multiplied Matrix
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(d[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
