import java.util.LinkedList;
import java.util.ListIterator;
class Test18
{
  public static void main(String[] args)
{
  LinkedList<String> list=new LinkedList<>();
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