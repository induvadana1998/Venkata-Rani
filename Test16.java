import java.util.ArrayList;
import java.util.Iterator;
class Test16
{
  public static void main(String[] args)
{
  ArrayList<String> list=new ArrayList<>();
 list.add("Welcome");
 list.add("Hello");
  list.add("Apple");
   list.add("Welcome");
list.add(1,"Banana");               //we gave the place "1" for banana in the array order

for(String s: list)
System.out.println(s);                //there are three ways to retrive the elements
for(int i=0;i<list.size();i++)        //it is array list so we use size to compare not the length
System.out.println(list.get(i));        
}
}