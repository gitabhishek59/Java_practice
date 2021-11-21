class AreaOfCircle
{ 

  int radius;
  public int Area()
{
  return 4*radius;
}
}
class CustomClass4{
public static void main(String args[])
{
   System.out.println("This is our fourth custom class");
   AreaOfCircle c1=new AreaOfCircle();
   c1.radius=5;
   System.out.println(c1.Area());

   
}

}