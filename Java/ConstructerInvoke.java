class Cylinder{
 private int radius;
 private int height;
 public void Cylinder(int a,int b){
radius=a;
height=b;
}

 public int getData1(){
   return radius;
}
  public int getData2(){
   return height;
}

}
class ConstructerInvoke{

public static void main(String a[]){

 Cylinder var1=new Cylinder(45,67);
 System.out.println("Radius is"+ var1.getData1());
 
 System.out.println("Height is"+ var1.getData2());


}
}