import java.util.Scanner;
class SumOfFirstNaturalNum {
 static int sum(int x){
if(x==1)
return 1;
return x+sum(x-1);
}
public static void main(String args[]){

int number;
System.out.println("ENTER NUMBER");
Scanner var=new Scanner(System.in);
number=var.nextInt();
int c=sum(number);
System.out.println(c);


}

}