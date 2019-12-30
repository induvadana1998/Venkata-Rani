import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Test2601
{
public static void main(String[] args)
{
   Employee26 e = null;
   try(FileInputStream fis=new FileInputStream("emp.dat");
    ObjectInputStream ois=new ObjectInputStream(fis);)
{
     e=(Employee26)ois.readObject();
    System.out.println(e.getEmpid()+"  "+e.getEname()+"  "+e.getSal());
}
catch(IOException | ClassNotFoundException ex)
{
System.out.println(ex);
}
}
}
