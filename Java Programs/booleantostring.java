//boolen to string

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
boolean a=false;
boolean b=true;
String s1=new Boolean(a).toString();
String s2=new Boolean(b).toString();
System.out.println(s1);
System.out.println(s2);
}
}*/

//integer to boolean

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
int v=100;
System.out.println("Integer : "+v);
boolean b=(v==100);
System.out.println("Converted to boolen: "+b);
}
}*/

//string to boolean

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
String s="false";
boolean b=Boolean.parseBoolean(s);
System.out.println(b);
}
}*/

//convert boolean primitive to boolean object 

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
boolean v=false;
Boolean r=Boolean.valueOf(v);
System.out.println(r);
}}*/

//string object to boolean object

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
String s="true";
Boolean b=Boolean.valueOf(s);
System.out.println(b);
}
}*/

//convert boolean to integer

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
boolean s=true;

System.out.println("Boolean Value: "+s);
int v=(s)?1:0;
System.out.println("Integer value: "+v);
}
}*/

//convert integer to string

/*import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
int v=150;
String m=Integer.toString(v);
System.out.println("String: "+m);
}
}*/

//covert string to integer

import java.io.*;
import java.util.*;
class demo
{
public static void main(String[] args)
{
String s="456";
System.out.println(Integer.parseInt(s));
}
}