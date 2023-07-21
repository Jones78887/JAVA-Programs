import java.io.*;
import java.util.*;
class Anirudh 
{
public static void main(String args[])
{
int n;
int i,min;

int count=0;


System.out.println("Enter the num");

Scanner s=new Scanner(System.in);
n=s.nextInt();

int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}

min=a[0];

for(i=0;i<n;i++)
{
if(min>a[i])
{
min=a[i];
}
}



for(i=0;i<n;i++)
{
if(a[i]==min)
{
min=a[i];
}

else
{
while(a[i]>min)
{
count++;
a[i]--;
}
}

}
System.out.print(+count);
}
}