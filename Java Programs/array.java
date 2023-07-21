import java .io.*;
import java.util.*;

class Array
{
  public static void main(String args[])
     {
        int count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int value=sc.nextInt();
        int arr[]=new int[value];
int i=0;
System.out.println("Enter the numbers of Array:");
       for(i=0;i<arr.length;i++)
          {
            arr[i]=sc.nextInt();
           }


       for(i=0;i<arr.length;i++)
         {
        for(int j=arr.length-1;j<i;j--)
         {  
            count++;
           
          }
		System.out.println("%d is %d",arr[i],count);
           }


}

 }