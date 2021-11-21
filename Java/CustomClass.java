class Employee
{
   int id;
   int salary;
   String name;

}
class CustomClass{
public static void main(String args[])
{
   System.out.println("This is our first custom class");
   Employee Abhi=new Employee();
   Employee Anand=new Employee();
   Anand.id=12;
   Anand.salary=19000;
   Anand.name="Anand";
   Abhi.id=13;
   Abhi.salary=12000;
   Abhi.name="Abhi";
   System.out.println(Anand.salary);
System.out.println(Anand.id);
System.out.println(Anand.name);
System.out.println(Abhi.salary);
System.out.println(Abhi.id);
  
}

}