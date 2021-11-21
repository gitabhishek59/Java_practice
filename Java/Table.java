import java.util.Scanner;
class Table {
 static void multiplication(int x){
for(int i=1;i<=10;i++)
{
  System.out.format("%d * %d = %d\n",x,i,x*i);
}

}
public static void main(String args[]){

int number;
System.out.println("ENTER NUMBER");
Scanner var=new Scanner(System.in);
number=var.nextInt();
multiplication(number);


}

}