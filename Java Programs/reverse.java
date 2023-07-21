import java.io.*;
import java.util.*;

class reverse

{
  public static void main(String args[])
{
int y,a=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");

int x=s.nextInt();

if(x==0)
{
System.out.println("no is 0");
}
else if(x<0)
{
System.out.println("no is negative");
}
else if(x!=0)
{

while(x!=0)
{
    y=x%10;
    x=x/10;
    a=y;

if(a%2==0)
{
System.out.println("The number is even number");

}
else

{
System.out.println("The number is an old number");
}

}

}


else
{
System.out.println("");
}
}
}