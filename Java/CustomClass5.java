class AreaRectangle
{ 

  int length;
  int breadth;
  public int Area()
{
  return length*breadth;
}
}
class CustomClass5{
public static void main(String args[])
{
   System.out.println("This is our fifth custom class");
   AreaRectangle R1=new AreaRectangle();
   R1.length=5;
   R1.breadth=7;
   System.out.println(R1.Area());

   
}

}