import java.io.*;
import java.util.*;

class reverse {
 public static void main(String args[])
{   
     int n,a;

  System.out.printf("Enter the number :");
  Scanner s=new Scanner(System.in);

  n=s.nextInt();

while(n!=0)
{
a=n%10;
n=n/10;

System.out.printf("%d ",a);
}
}
}