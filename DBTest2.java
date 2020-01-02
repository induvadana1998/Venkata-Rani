
import java.sql.*;
public class DBTest2
{
 public static void main(String[] args) throws Exception
 {
	 String url="jdbc:oracle:thin:@localhost:1521:orcl";
	 Connection con=null;
	 Statement st=null;
	 ResultSet rs=null;
	 try
	 {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 con = DriverManager.getConnection(url,"scott","tiger");
	 st=con.createStatement();
	 rs=st.executeQuery("select * from emp");
	 while(rs.next())
		 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	 
 }
 catch(Exception e) 
 {
	 e.printStackTrace();
 }
 finally 
 {
	 try                //sql throws sql exception so we write in try for close() 
	 {
		 if(rs!=null) rs.close();
		 if(st!=null) st.close();
		 if(con!=null) con.close();
	 }
	 catch(Exception ex)
	 {
		 ex.printStackTrace();
	 }
 }
 }
}