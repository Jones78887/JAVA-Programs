import java.io.*;
import java.util.*;
public class mark{
public static void main(String args[])
{
int a=65;
int b=56;
int c=72;
int d=(a+b+c);

if((a>=65) && (b>=55) && (c>=50) && (d>=180) || ((a+b)>=140))
{
System.out.println("eligible");
}
else
System.out.println("not eligible");
}
}