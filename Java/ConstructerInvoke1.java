class Cylinder{
 private int id;
 private String name;
 public Cylinder(int a,String b){
id=a;
name=b;
}

 public int getId(){
   return id;
}
  public String getName(){
   return name;
}

}
class ConstructerInvoke1{

public static void main(String a[]){

 Cylinder value=new Cylinder(12,"Abhusj");
 System.out.println("ID is"+ value.getId());
 
 System.out.println("NAME is"+ value.getName());


}
}