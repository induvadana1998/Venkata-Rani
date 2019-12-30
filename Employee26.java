class Employee26 implements java.io.Serializable
{
  int empid;
  String ename;
  double sal;
  public Employee26(){}
  public Employee26(int empid,String ename,double sal)
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
