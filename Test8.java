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

class Test8
{
public static void main(String[] args)
{
Employee e= new Employee(101,"jhon",25,90,89990);
System.out.println(e.getSsn());
System.out.println(e.getName());
System.out.println(e.getAge());
System.out.println(e.getEid());
System.out.println(e.getSal());
}
}