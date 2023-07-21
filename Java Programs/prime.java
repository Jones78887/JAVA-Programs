import java.io.*;
import java.util.*;

class prime {
 public static void main(String args[])
{   
     int n,i;

  System.out.printf("Enter the number :");
  Scanner s=new Scanner(System.in);

  n=s.nextInt();

  for(i=2;i<n;i++)
{
    while(n%i==0)
{
    System.out.println(i);
    n=n/i;
    
}

}
if(n>2)
{
System.out.println(n);
}
}
}