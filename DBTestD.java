import java.sql.Date;

import com.del.dao.EmployeeDAO3;
import com.del.entity.Employee;

public class DBTestD
{

	public static void main(String[] args)
	{
		Employee e = new Employee(103,"Chandra Sekhar",2200,new Date(1990,10,12));
          EmployeeDAO3 edao = new EmployeeDAO3();
          if(edao.modifyEmployee(e))
       	   System.out.println("Employee record modified");
          else
       	   System.out.println("Modification Failed");


	}

}
