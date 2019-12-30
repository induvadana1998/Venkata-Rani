import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2
{
public static void main(String[] args)
{
   Student s = null;
   try(FileInputStream fis=new FileInputStream("std.dat");
    ObjectInputStream ois=new ObjectInputStream(fis);)
{
     s=(Student)ois.readObject();
    System.out.println(s.getSsn()+"  "+s.getAge()+"  "+s.getPname()+"  "+s.getRno()+"  "+s.getM1()+"  "+s.getM2()+"  "+s.getM3());
}
catch(IOException | ClassNotFoundException ex)
{
System.out.println(ex);
}
}

}

