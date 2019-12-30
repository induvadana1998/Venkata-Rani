import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test2501
{
public static void main(String[] args)
{


try(FileOutputStream fis=new FileOutputStream("abc.dat"))
{
for(int i=65;i<=90;i++)
fis.write(i);
}
catch(IOException ex)
{
System.out.println(ex);
}

}
}               /* try with resourse and we dont need to use finally */
