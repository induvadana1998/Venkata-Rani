import java.util.HashSet;
import java.util.Iterator;
class Test12
{
 public static void main(String[] args)
  {
    HashSet<Employee12> hs = new HashSet<Employee12>();
hs.add(new Employee12(101,"Max",1000.00));
hs.add(new Employee12(102,"Martin",3000.00));
hs.add(new Employee12(103,"Allen",1000.00));
hs.add(new Employee12(101,"Max",1000.00));
  for(Employee12 e:hs)
    e.display();

    }
}