 
public class Person implements java.io.Serializable
{
	 int ssn,age;
	  String pname;
	   public Person() {}
	   public Person(int ssn, int age, String pname) 
	{

		this.ssn = ssn;
		this.age = age;
		this.pname = pname;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}  
		}

