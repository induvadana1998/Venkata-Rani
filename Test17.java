import java.util.ArrayList;
import java.util.ListIterator;
class Test17
{
  public static void main(String[] args)
{
  ArrayList<String> list=new ArrayList<>();
 list.add("Welcome");
 list.add("Hello");
  list.add("Apple");
   list.add("Welcome");
list.add(1,"Banana");               
                                                //will come in the reverse order of previous output
ListIterator<String> itr = list.listIterator();  
while(itr.hasNext())
System.out.println(itr.next());
System.out.println();              
while(itr.hasPrevious())        
System.out.println(itr.previous());        
}
}