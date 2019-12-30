import java.util.StringTokenizer;
class Test29
{
public static void main(String[] args)
{
 String s=" Somthing to, Written and Shown, to the participants";
 StringTokenizer st=new StringTokenizer(s,",");
System.out.println(st.countTokens());
while(st.hasMoreTokens())
System.out.println(st.nextToken());

}
}
