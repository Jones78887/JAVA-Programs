import java.io.*;
import java.util.*;

class a1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,count=0,j;
System.out.println("Enter the String: ");
String str1=sc.nextLine();

char a[]=new char[100];
a=str1.toCharArray();

for(i=1;i<a.length;i++)
         {
        for(j=a.length-1;j<i;j--)
         {  
            if(a[i]==a[j])
{
            count++;
 }           
          }
System.out.printf("%d",count);

		
           }



}
}
