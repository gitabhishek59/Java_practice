import java.util.Scanner;
class TakingInput{
  public static void main(String[] args)
{
System.out.println("taking input from user");
Scanner var=new Scanner(System.in);
System.out.println("enter thefirst num");
int a=var.nextInt();
System.out.println("enter the second num");
int b=var.nextInt();
int sum=a+b;
System.out.println("Sum of the input no is : "+sum);



} 
}