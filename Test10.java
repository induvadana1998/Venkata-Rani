interface Calculator
{
  int sum(int x,int y);
  int product(int x,int y);
}

class Abc implements Calculator
{
  public int sum(int x,int y)
   {
     return x+y;
   }
  public int product(int x,int y)
   {
     return x*y;
   }
}

class Xyz implements Calculator
{
  public int sum(int x,int y)
  {
    return x-(-y);
  }
  public int product(int x,int y)
  {
    return x*y;
  }
}

class Test10
 {
   public static void main(String[] args)
    {
     Abc a = new Abc();
     Xyz x = new Xyz();    
      
        System.out.println("Sum is "+a.sum(1,2));
        System.out.println("Product is "+a.product(4,5));
      
        System.out.println("Sum is "+x.sum(7,1));
        System.out.println("Product is "+x.product(6,5));
     
}
}