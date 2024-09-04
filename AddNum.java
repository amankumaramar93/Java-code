import java.util.*;
public class AddNum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);

        int size=sc.nextInt();
        int sum=0;
        int a[]=new int[size];
        for(int i=0;i<size-1;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<size-1;i++)
        {
            sum=sum+a[i];
        }

        System.out.println("Sum of number is: "+sum);
    }
}