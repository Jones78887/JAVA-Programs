import java.io.*;
import java.util.*;
public class example{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num>0)
{
System.out.println(num+ "is positive integer");

}
else
System.out.println(num+ "is negative integer");
}
}