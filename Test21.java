import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;     //entry is inner interface in the interface of map which have the entrys of map

class Test21
{
  public static void main(String[] args)
{
  HashMap<String,String> map=new HashMap<>();
 map.put("abc@gmail.com","abc@123");
  map.put("xyz@yahoo.com","xyz@123");
map.put("bbc@rediff.com","redbbc");
map.put("someuse@xyz.com","somexyz");            
                                                

Set<Entry<String,String>> set=map.entrySet();
for(Entry<String,String> s:set)
System.out.println(s.getKey()+"   "+s.getValue());
       
}
}