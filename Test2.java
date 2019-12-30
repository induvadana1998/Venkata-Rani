class Employee 
{
  private int empid;
  private String ename;
  double salary;
  public Employee(){}
  public Employee(int empid,String ename,double salary)
    {
      this.empid=empid;
      this.salary=salary;
      this.ename=ename;
     }
   public String toString()
{
return "Empid is "+empid+"\n Ename is "+ename+"\nSalary is "+salary;
}
}
class Test2
{
  public static void main(String[] args)
   {
    Employee e = new Employee(101,"arun",25500);
    System.out.println(e);

}
}
 

  