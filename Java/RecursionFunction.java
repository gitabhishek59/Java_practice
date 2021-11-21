import java.util.Scanner;
class RecursionFunction{
static int factorial(int x){
if(x==1 || x==0){
return 1;
}
else{
return x*factorial(x-1);
}
}
public static void main(String args[]){

int a;
int b;
System.out.println("Enter the nuber");
Scanner var=new Scanner(System.in);
a=var.nextInt();
b=factorial(a);
System.out.println(b);
}
}