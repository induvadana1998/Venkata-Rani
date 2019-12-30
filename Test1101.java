import java.util.HashSet;
import java.util.Iterator;
class Test1101
{
 public static void main(String[] args)
  {
    HashSet<String> hs = new HashSet<String>();
    hs.add("Welcome");
    hs.add("Hello");
    hs.add("Bye Bye");
    hs.add("Farewell");
    System.out.println(hs.add("Welcome"));
    System.out.println(hs.size());
    for(String s: hs)  
      System.out.println(s);
   System.out.println(hs.remove("Hello")); // remove the string and gives boolean,if string exist true or it will give false
    hs.clear();                         // clear the values and no iteration 
   Iterator<String> itr = hs.iterator();
   while(itr.hasNext())
    System.out.println(itr.next());
    }
}