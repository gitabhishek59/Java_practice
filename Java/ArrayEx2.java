import java.util.Scanner;
class ArrayEx2{
  public static void main(String[] args)
{ 
int count=0,i;
Scanner var=new Scanner(System.in);
System.out.println("enter the number");
int num=var.nextInt();
int[]marks={56,76,34,57,75};
for(i=0;i<marks.length;i++)
{  
   if(num==marks[i])
{
   count++;
   break;
}
}

} 
}