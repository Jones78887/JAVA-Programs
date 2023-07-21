import java.util.*;
class TestClass { public static void main(String args[] ) 
{
Scanner s = new Scanner(System.in); 
int N = 0; N = s.nextInt();   
int[] data = new int[N]; 
for(int i=0; i<N; i++)
{
 data[i] = s.nextInt();
 }
 int last=data[N-1];
 if(last%10!=0)
{
 System.out.println("No");
}
 else System.out.println("Yes");   
} 
}