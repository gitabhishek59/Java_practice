import java.util.Scanner;
class ArrayEx6{
  public static void main(String[] args)
{ 
int max;
int[]marks={56,76,34,57,75};
max=marks[0];
for(int i=1;i<marks.length;i++)
{  
    if(max<marks[i])
{
     max=marks[i];  
}

}

System.out.println(max);


} 
}