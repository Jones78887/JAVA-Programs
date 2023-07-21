import java.io.*;
import java.util.*;

class arrayequal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array : ");
int n=sc.nextInt();
int i;
System.out.println("Enter the array 1 :");
int a[]=new int[n];
for(i=0;i<n;i++)
{
   a[i]=sc.nextInt();
}
System.out.println("Enter the size of 2nd array :");
int m=sc.nextInt();
System.out.println("Enter the array2 :"); 
int b[]=new int[m];

for(i=0;i<m;i++)
{
   b[i]=sc.nextInt();
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