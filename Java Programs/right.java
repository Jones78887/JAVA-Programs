import java.io.*;
import java.util.*;
class right
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
System.out.println("Enter row");
int r=s.nextInt();
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
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+ "  ");
}
System.out.println("  ");
}
System.out.println("The right matrix :");


for(i=0;i<r;i++)
{
for(j=0;j<=i;j++)
{

System.out.print(a[i][j]+ "  ");
}
System.out.println("  ");
}
}
}