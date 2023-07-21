import java.io.*;
import java.util.*;

class question2

{
  public static void main(String args[])
{
int i,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the integers");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();

if((x!=0) && (y!=0) && (z!=0))
{
for(i=1;i<=y;i++)
{
count++;
}
int a=count/z;
System.out.print(a);
}
else
{
System.out.println("invalid");
}
}
}