class MethodsInJava3{
static void foo(){
System.out.println("hii bro!");
}
static void foo(int x){
int z;
z=x*5;
System.out.println("hii bro!"+z+"times");
}
static void foo(int x, int y){
int z;
z=x+y;
System.out.println("hii bro!"+z+"times");
}
public static void main(String args[])
{
  int a=5;
  int b=6;
  int c;
  foo(a,b);
  foo();
  foo(a);
  
}

}