class Student
 {
   private int rno;
   private String name;
   private int m1,m2,m3;
     public Student(){}
     public Student(int rno,String name,int m1,int m2,int m3)
      { 
       this.rno=rno;
       this.name=name;
       this.m1=m1;
       this.m2=m2;
       this.m3=m3;
 
       }

  public int getTotal()
  {
   return m1+m2+m3;
  }
  public int getAverage()
  {
   return (m1+m2+m3)/3;
  }
  public String getResults()
  {
   if(m1>40 && m2>40 && m3>40)
    return "Passed";
    return "Failed";
  }
  public int getDivision()
  {
    if(m1>=40 && m2>=40 && m3>=40)
      {
       int avg=getAverage();
       if(avg>=70)
         return "First";
       else if(avg>=50)
         return "Second";
       else
         return "Third";
      }
       else
          return "Nill";
      }
  public int getRno() { return rno; }
  public String getName() { return name; }

 }
class Test3
{
public static void main(String[] args)
{
  Student s=new Student(101,"max",90,100,95);
System.out.println(s.getRno());
System.out.println(s.getName());
System.out.println(s.getTotal());
System.out.println(s.getAverage());
System.out.println(s.getResults());
System.out.println(s.getDivision());
}
}
