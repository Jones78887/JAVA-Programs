import java.io.*;
import java.util.*;
public class leap{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num%4==0)
{
System.out.println(num+ "is a leap Year");

}
else
System.out.println(num+ "is not a leap year");
}
}