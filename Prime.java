import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int c=0;

for(int i=2;i<=a/2;i++)
{
if(a%i==0)
{
c=c+1;
break;
}
}
if(c==1)
System.out.println("Not Prime");
else
System.out.println("Prime");
}
}