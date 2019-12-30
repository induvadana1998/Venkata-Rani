import java.util.HashMap;
class Test19
{
  public static void main(String[] args)
{
  HashMap<String,String> map=new HashMap<>();
 map.put("abc@gmail.com","abc@123");
  map.put("xyz@yahoo.com","xyz@123");
map.put("bbc@rediff.com","redbbc");
map.put("someuse@xyz.com","somexyz");            
                                                

System.out.println(map.size());     
System.out.println(map.get("abc@gmail.com"));         
       
}
}