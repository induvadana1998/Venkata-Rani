
public class Student extends Person 
{  
  
	int rno;
	int m1,m2,m3;
	Person p;

	public Student() {}

	public Student(int ssn,int age,String pname,int rno, int m1, int m2, int m3) 
	{
	super(ssn,age,pname);
		this.rno = rno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}
		
	}


