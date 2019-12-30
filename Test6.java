class Employee
 {
  private int empid;
  private String ename;
  double sal;
  public Employee(){}
  public Employee(int empid,String ename,double sal)
   {
    this.empid=empid;
    this.ename=ename;
    this.sal=sal;
   }

  public void setEmpid(int empid)
   {
    this.empid=empid;
   }
  public void setEname(String ename)
   {
    this.ename=ename;
   }
  public void setSal(double sal)
   {
    this.sal=sal;
   }
  public int getEmpid() 
   {
    return empid;
   }
  public String getEname()
   {
    return ename;
   }
  public double getSal()
   {
    return sal;
   }
  public boolean equals(Object obj)

   {
    Employee e=(Employee)obj;
    return empid==e.empid && ename.equals(e.ename) && sal==e.sal;
   }

}

class Department
{
  private int dno;
  private String dname;
  Employee[] e;
  public Department(){}
  public Department(int dno,String dname,Employee[] e)

 {
   this.dno=dno;
   this.dname=dname;
   this.e=e;
 }
   public void setDno(int dno)
  {
   this.dno=dno;
  }
   public void setDname(String dname)
  {
    this.dname=dname;
   }
public void setEmployee(Employee[] e)
{
this.e=e;
}
public int getDno() 
{
return dno;
}
public String getDname()
{
return dname;
}
public Employee[] getEmployee()
{
return e;
}
}
class Test6
{
public static void main(String[] args)
{
 
  Employee e1=new Employee(101,"Arun",1000);
  Employee e2=new Employee(101,"Arun",1000);
  System.out.println(e1.equals(e2));

 }
}