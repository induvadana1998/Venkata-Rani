class Person
{

private int ssn,age;
private String name;
public Person(){}
public Person(int ssn,String name,int age)
{
this.ssn=ssn;
this.name=name;
this.age=age;
}
public void setSsn(int ssn)
{
this.ssn=ssn;
}
public void setName(String name)
{
this.name=name;
}
public void setAge(int age)
{
this.age=age;
}
public int getSsn()
{ 
return ssn; 
}
public String getName()
{ 
return name;
}
public int getAge()
{
 return age; 
}


}
class Employee extends Person 
{

private int eid;
private double sal;
public Employee(){}
public Employee(int ssn,String name,int age,int eid,double sal)
{
super(ssn,name,age);
this.eid=eid; 
this.sal=sal;
}
public void setEid(int eid)
{
this.eid=eid;
}
public void setSal(double sal)
{
this.sal=sal;
}
public int getEid()
{
return eid;
}
public double getSal()
{
return sal;
}
}
class SalesMan extends Employee
  {
  int points;
  public SalesMan(){}
  public SalesMan(int ssn,String name,int age,int eid,double sal,int points)
    {
    super(ssn,name,age,eid,sal);
    this.points=points;
    }
   public void setPoints(int points)
   {
   this.points=points;
   }
   public int getPoints()
   {
    return points;
   }
   public double getIncentives()
   {
    return points*500;
   }
    public double getTotalSal()
   {
    return getSal()+points*500;
   }
 }

class Test9
{
public static void main(String[] args)
{
SalesMan sm = new SalesMan(101,"jhon",25,9001,15000,7);
System.out.println(sm.getSsn());
System.out.println(sm.getName());
System.out.println(sm.getAge());
System.out.println(sm.getEid());
System.out.println(sm.getSal());
System.out.println(sm.getPoints());
System.out.println(sm.getIncentives());
System.out.println(sm.getTotalSal());

}
}