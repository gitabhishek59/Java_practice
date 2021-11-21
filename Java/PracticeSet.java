class Cylinder{
 private int radius;
 private int height;
 public void setData(int a,int b){
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
class PracticeSet{

public static void main(String a[]){

 Cylinder var1=new Cylinder();
 var1.setData(4,9);
 System.out.println("Radius is"+ var1.getData1());
 
 System.out.println("Height is"+ var1.getData2());


}
}