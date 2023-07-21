import java.io.*;
import java.util.*;

public class armstrong

{
  public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");

int x=s.nextInt();

int ans=x,rem,res=0;

while(x!=0)
{

rem=x%10;

x=x/10;

res=res+rem*rem*rem;
}
if(res==ans)
{

System.out.printf("It is armstrong number");

}
else
{
System.out.printf("It is not an armstrong number");

}

}

}