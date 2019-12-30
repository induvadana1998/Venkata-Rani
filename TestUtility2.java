import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestUtility2 
{
  Utility u = null;
  @Before
    public void setup()
    {
	  u=new Utility();
    }
  @After
  public void tearDown()
  {
	  u=null;
  }
	@Test
	public void testsqr()
	{
		assertFalse(30==u.sqr(10));
	}
   @Test
   public void testsum()
   {
	   assertTrue(30==u.sum(20, 10));
   }
   
}
