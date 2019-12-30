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
class Test5
{
public static void main(String[] args)
{
  Employee[] e1={new Employee(101,"Anju",1000),new Employee(102,"Max",30000),new Employee(103,"Fran",70000)}; 

     Department d=new Department(10,"Sales",e1);
     System.out.println("Dno is "+d.getDno());
     System.out.println("Dname is "+d.getDname());
     System.out.println("Employee Details");
Employee[] e2=d.getEmployee();
for(int i=0;i<e2.length;i++)
{

    System.out.println("Empid is "+e2[i].getEmpid());
    System.out.println("Ename is "+e2[i].getEname());
    System.out.println("Salary is"+e2[i].getSal());
    System.out.println();
   }
 }
}