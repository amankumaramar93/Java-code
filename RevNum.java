public class RevNum
{
public static void main(String args[])
{
int num=1234,rem,sum=0;
while(num!=0)
{
rem=num%10;
sum=sum*10+rem;
num=num/10;
}
System.out.println("reverse number is: "+sum);
}
}