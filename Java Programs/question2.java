import java.util.*;

class q2
{
public static void main(String args[])
{

int i,j,s,q,count=1;

Scanner so=new Scanner(System.in);

System.out.print("Enter the input ");
int n=so.nextInt();

int a[]=new int[n];

for(i=0;i<n;i++)
{

System.out.print("Enter the height ");
a[i]=sc.nextInt();

}

for(i=0;i<n-1;i++)
{
 
s=a[i];
q=a[i+1];

if(s>q)
{

count++;

}


}
System.out.println("The number of groups is "+count);



}
}