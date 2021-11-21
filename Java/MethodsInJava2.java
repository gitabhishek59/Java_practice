class MethodsInJava2{
static int logic(int x, int y){
int z;
z=x+y;
return z;
}
public static void main(String args[])
{
  int a=5;
  int b=6;
  int a1=7;
  int b1=8;
  int c;
  c=logic(a,b);
  int c1;
  c1=logic(a1,b1);
  System.out.println("a+b is:"+c);
  System.out.println("a1+b1 is:"+c1);
  
}

}