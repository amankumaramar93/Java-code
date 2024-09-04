import java.util.*;
public class Pallindrome
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=454,temp,rem,sum=0;
temp=n;
while(n!=0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}

if(temp==sum)
{
System.out.println("Given Number is pallindrome");
}
else
{
System.out.println("number is not Pallindrome");
}
}
}