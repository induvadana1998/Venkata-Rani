import java.util.HashSet;
import java.util.Iterator;
class Test1103
{
 public static void main(String[] args)
  {
    HashSet<Integer> hs1 = new HashSet<Integer>();
    hs1.add(10);
    hs1.add(30);
    hs1.add(new Integer(789));
    hs1.add(8);
    
    for(Integer i: hs1)  
      System.out.println(i);
  
    }
}