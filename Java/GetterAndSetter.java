class SetAndGet{
    private int id;
    private String name;
    public int GetId(){
      return id;
    }
    public void SetId(int i){
      id=i;
    }
    

    public void SetName(String n){
      name=n;
    }
    
    public String GetName(){
      return name;
    }



}


class GetterAndSetter{

public static void main(String args[])
{
   
  SetAndGet emp=new SetAndGet();
  emp.SetId(5);
  System.out.println(emp.GetId());
  emp.SetName("Anand");
  System.out.println(emp.GetName());

  



}




}