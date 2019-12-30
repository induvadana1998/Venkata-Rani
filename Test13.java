import java.util.LinkedHashSet;
import java.util.Iterator;
class Test13
{
 public static void main(String[] args)
  {
    LinkedHashSet<Employee12> hs = new LinkedHashSet<Employee12>();
hs.add(new Employee12(101,"Max",1000.00));
hs.add(new Employee12(102,"Martin",3000.00));
hs.add(new Employee12(103,"Allen",1000.00));
hs.add(new Employee12(101,"Max",1000.00));
  for(Employee12 e:hs)
    e.display();
Iterator<Employee12> itr = hs.iterator();
while(itr.hasNext())
itr.next().display();
  
    }
}