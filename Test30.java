import java.util.Scanner;

class Test30
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number ");
int x=sc.nextInt();
sc.nextLine();
System.out.print("Enter a String ");
String s=sc.nextLine();
System.out.println(x+" "+s);
}
}