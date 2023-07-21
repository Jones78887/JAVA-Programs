import java.io.*;
import java.util.*;

class a1
{
public static void main(String[] args)
{
int i=0,count=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the size of the array :");
int n=sc.nextInt();

char arr[]=new CharAt(n);
System.out.println("Enter the elements of the array :");
for(i=0;i<arr.length;i++)
{
  arr[i]=sc.next().CharAt(int);
}
 for(i=0;i<arr.length;i++)
         {
        for(int j=arr.length-1;j<i;j--)
         {  
            count++;
           
          }
		System.out.printf("%s is %d",arr[i],count);
           }

}
}

