/*import java.io.*;
import java.util.*;
class empty
{
public static void main(String [] args)
{
int sum=0,i;
double avg;
int a[]={12,4,5,2,4};
for(i=0;i<5;i++)
{
sum=sum+a[i];

}
avg=sum/6;
System.out.println(avg);
}
}*/


/*import java.io.*;
import java.util.*;
class empty
{
public static void main(String [] args)
{
int mult=1,i;

int a[]={1,4,5,2,4};
for(i=0;i<5;i++)
{
mult=mult*a[i];

}

System.out.println(mult);
}
}*/

import java.io.*;
import java.util.*;
class empty
{
public static void main(String [] args)
{

int a[]={1,4,5,2,40};
int l=a[0];
int m=a[0],i;

for(i=0;i<5;i++)
{
if(l<a[i])
{
l=a[i];
}
else if(m>a[i])
{
m=a[i];

}
}
System.out.println(l);
System.out.println(m);
}
}