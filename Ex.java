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
class Students extends Person 
{

private int sid;
private double fees;
public Students(){}
public Students(int ssn,String name,int age,int sid,double fees)
{
super(ssn,name,age);
this.sid=sid; 
this.fees=fees;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setFees(double fees)
{
this.fees=fees;
}
public int getSid()
{
return sid;
}
public double getFees()
{
return fees;
}
}
class PgStudent extends Students
  {
  String course;
  public PgStudent(){}
  public PgStudent(int ssn,String name,int age,int sid,double fees,String course)
    {
    super(ssn,name,age,sid,fees);
    this.course=course;
    }
   public void setCourse(String Course)
   {
   this.course=course;
   }
   public String getCourse()
   {
    return course;
   }
 
   
 }

class Ex
{
public static void main(String[] args)
{
PgStudent st = new PgStudent(101,"Jhon",25,9001,15000,"Computer science");
System.out.println(st.getSsn());
System.out.println(st.getName());
System.out.println(st.getAge());
System.out.println(st.getSid());
System.out.println(st.getFees());
System.out.println(st.getCourse());


}
}