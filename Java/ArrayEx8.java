import java.util.Scanner;
class ArrayEx8{
  public static void main(String[] args)
{ 
int count=0;
int[]marks={23,24,56,67,78};
for(int i=1;i<marks.length-1;i++)
{  
    if(marks[i]>marks[i+1])
{
     count++;  
}

}
if(count>0)
System.out.println("not in sorted");
else
{
  System.out.println("sorted");
}


} 
}