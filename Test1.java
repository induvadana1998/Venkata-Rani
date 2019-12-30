
    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectOutputStream;

public class Test1 
{
   public static void main(String[] args) 
	{
	
		Student s=new Student(190,24,"Jhon",1,50,89,98);
		try(FileOutputStream fos=new FileOutputStream("std.dat");
		    ObjectOutputStream oos=new ObjectOutputStream(fos);)
		{
		oos.writeObject(s);
		}
		catch(IOException ex)
		{
		System.out.println(ex);
		}

	}

}
