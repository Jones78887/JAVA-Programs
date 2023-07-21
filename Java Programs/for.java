import java.util.*;

class a
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(i=1;i<=a;i++)
{
if(i==1||i==a)
{
for(j=1;j<=a;j++)
{
System.out.print(" @");
}
System.out.println(" ");
}
else
{
for(j=1;j<=a-i;j++)
{
System.out.print("  ");
}
System.out.print("##");
System.out.println(" ");
}
}
}
}