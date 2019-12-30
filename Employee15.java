class Employee15 implements Comparable<Employee15>
{
  int empid;
  String ename;
  double salary;
  public Employee15(){}
  public Employee15(int empid,String ename,double salary)
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
Employee15 e=(Employee15)obj;
return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
}
public int compareTo(Employee15 e)
{
return empid- e.empid;
}
}
