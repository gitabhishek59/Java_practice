class Employee
{
   int id;
   int salary;
   String name;
  void PrintDetails()
{
System.out.println("My id is"+id);
System.out.println("My name is"+name);
System.out.println("My salary is"+ salary);


}

}
class CustomClass2{
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
   Anand.PrintDetails();
   Abhi.PrintDetails();
  
}

}