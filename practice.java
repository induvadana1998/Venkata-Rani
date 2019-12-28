import java.util.LinkedList;


class Student
{
private int sid,age;
private String sname;
public Student(){}
public Student(int sid,String sname,int age)
{
this.sid=sid;
this.sname=sname;
this.age=age;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setSname(String sname)
{
this.sname=sname;
}
public void setAge(int age)
{
this.age=age;
}
public int getSid()
{
return sid;
}
public String getSname()
{
return sname;
}
public int getAge()
{
return age;
}
}

class Training
{
private int tid;
private String tloc;
LinkedList<Student> slist=new LinkedList<>();
public Training(){}
public Training(int tid,String tloc,)
{
this.tid=tid;
this.tloc=tloc;
this.slist=sslist;
}
public void setTfee(int tid)
{
this.tid=tid;
}
public void setTloc(String tloc)
{
this.tloc=tloc;
}
public void setStudent(Student slist)
{
this.s=s;
}
public int getTid()
{
return tid;
}
public String getTloc()
{
return tloc;
}
public Student getStudent()
{
return slist;
}
}



class practice
{
public static void main(String[] args)
{
for(String s:slist)
System.out.println(slist);
