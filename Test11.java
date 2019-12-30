import java.util.HashSet;
class Test11
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
    }
}