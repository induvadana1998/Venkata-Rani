import com.deloitte.java.entity.Employee;

public class Test
{

	public static void main(String[] args)
	{
		Employee e=new Employee(101,"Jhon",39000);
		System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());

	}

}
