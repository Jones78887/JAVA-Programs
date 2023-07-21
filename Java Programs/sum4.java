import java.io.*;
import java.util.*;

class sum4
{
public static void main(String args[])
{


Scanner s=new Scanner(System.in);
System.out.println("Enter the number1 : ");
int n=s.nextInt();

System.out.println("Enter the number2 : ");
int q=s.nextInt();

int sum=0;
int product=1;

if(q==1)
{
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
else if(q==2)
{
for(int i=0;i<=n;i++)
{
product=product*i;
}
System.out.println(product);
}

else if(product<2000000)
{
System.out.println(10^9+7);
}
else
{
System.out.println("enter the crt number ");
}
}
}