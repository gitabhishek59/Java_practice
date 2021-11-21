class JavaMethods{
static int logic(int x, int y){
int z;
if(x>y){
z=x+y;
}
else
{
z=5*(x+y);
}
return z;
}
public static void main(String args[])
{
  int a=5;
  int b=6;
  JavaMethods obj=new JavaMethods();
  int c=obj.logic(a,b);
  System.out.println("the logic function returns : "+c);
}

}