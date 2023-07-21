import java.util.*;

class sum1
{
public static void main(String args[])
{

int i,j=0,flag=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size");
int m=sc.nextInt();

int a[]=new int[n];
System.out.println("Enter Array elements");

for(i=0;i<m;i++)
{
a[i]=sc.nextInt();  
}

System.out.println("Target= ");
int n=sc.nextInt();

for(i=0;i<m;i++)
{
  if(a[i]==t)
{
j=i;
flag=1;
break;
}  
else
{
flag=0;
}
}
if (flag==1)
{
System.out.println(j);
}
else
{
System.out.println("-1");
}
}
}