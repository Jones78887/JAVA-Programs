import java.io.*;
import java.util.*;

class sum2
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the nums= ");
int r=s.nextInt();
int a[]=new int[r];
int i,s;
for(i=0;i<r;i++)
{
a[i]=s.nextInt();
}

s=a[0];
a[0]=a[r-1];
a[r]=s;

for(i=0;i<r;i++)
{
System.out.print(a[i]+"  ");
}

}}
