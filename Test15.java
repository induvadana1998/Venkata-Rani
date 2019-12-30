import java.util.TreeSet;
import java.util.Iterator;
class Test15
{
  public static void main(String[] args)
{
  TreeSet<Employee15> tset=new TreeSet<>();
  tset.add(new Employee15(102,"Max",2000));
   tset.add(new Employee15(103,"Satya",9000));
   tset.add(new Employee15(105,"Anju",3000));
   tset.add(new Employee15(101,"Harish",6000));
for(Employee15 e: tset)
e.display();
}
}