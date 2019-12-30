import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Test26
{
public static void main(String[] args)
{
Employee26 e=new Employee26(190,"Anju",45000.00);
try(FileOutputStream fos=new FileOutputStream("emp.dat");
    ObjectOutputStream oos=new ObjectOutputStream(fos);)
{
oos.writeObject(e);
}
catch(IOException ex)
{
System.out.println(ex);
}
}
}
