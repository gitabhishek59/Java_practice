import java.util.Scanner;
class FibonacciSeries{
static int fibonacci(int x)
{
if(x<=1)
return x;
return fibonacci(x-1)+fibonacci(x-2);
}
public static void main(String args[])
{
   int a;
   Scanner var=new Scanner(System.in);
   a=var.nextInt();
 
   System.out.println(fibonacci(a-1));
}

}