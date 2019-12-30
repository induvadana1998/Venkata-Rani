class Employee12 
{
  int empid;
  String ename;
  double salary;
  public Employee12(){}
  public Employee12(int empid,String ename,double salary)
    {
      this.empid=empid;
      this.ename=ename;
      this.salary=salary;
     }
public void display()
   {  
    System.out.println(empid+"  "+ename+" "+salary);
    }
 public int hashCode()
{
return empid;
}
public boolean equals(Object obj)
{
Employee12 e=(Employee12)obj;
return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
}
}
