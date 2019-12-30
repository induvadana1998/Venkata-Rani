import java.util.HashSet;
import java.util.Iterator;
class Test1102
{
 public static void main(String[] args)
  {
    HashSet<String> hs1 = new HashSet<String>();
    hs1.add("Welcome");
    hs1.add("Hello");
    hs1.add("Bye Bye");
    hs1.add("Farewell");
    HashSet<String> hs2 = new HashSet<String>();
    hs2.add("Hello");
    hs2.add("Banana");
                         //hs1.removeAll(hs2); remove repeated values and hs1.addAll(hs2); will add all values
    hs1.retainAll(hs2);  // shows repeated values

    for(String s: hs1)  
      System.out.println(s);
  
    }
}