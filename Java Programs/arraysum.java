import java.io.*;
import java.util.*;
class sumofarray
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
System.out.println("Enter row");
int r=s.newInt();
System.out.println("Enter column:");
int c=s.nextInt();
System.out.println("Enter array");
int a[][]=new int[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Enter array2:");
int b[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("Sum is :");
int sum[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
sum[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<r;i++29
{
for(j=0;j<c;j++)
{
Sysem.out.println(sum[i][j]);
}
}
}
}