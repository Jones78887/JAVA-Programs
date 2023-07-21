import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Arrayequals
{
public static void main(String args[])
{
int i;
System.out.println("Enter the array size");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println("Enter the array elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the array size");
int m=s.nextInt();
System.out.println("Enter the array elements");
int b[]=new int[m];
for(i=0;i<m;i++)
{
b[i]=s.nextInt();
}
if(Arrays.equals(a,b))
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}