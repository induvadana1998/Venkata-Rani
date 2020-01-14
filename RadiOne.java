import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html"); 
	    //WebElement radio_button=ObjDriver.findElement(By.name("radiooptions"));
		WebElement radio_button=ObjDriver.findElement(By.xpath("//*[@id='checkbox1']"));
		radio_button.click();
	    boolean status=radio_button.isDisplayed();
	    System.out.println("radio button is displayed>>"+status);
	    boolean enabled_status=radio_button.isEnabled();
	    System.out.println("radio_button is Enabled>>"+enabled_status);
	    WebElement radio_button2=ObjDriver.findElement(By.xpath("//*[@id='checkbox2']"));
		radio_button2.click();
	    boolean status2=radio_button.isDisplayed();
	    System.out.println("radio button is displayed>>"+status2);
	    boolean enabled_status2=radio_button.isEnabled();
	    System.out.println("radio_button is Enabled>>"+enabled_status2);
	    WebElement radio_button3=ObjDriver.findElement(By.xpath("//*[@id='checkbox3']"));
		radio_button3.click();
	    boolean status3=radio_button.isDisplayed();
	    System.out.println("radio button is displayed>>"+status3);
	    boolean enabled_status3=radio_button.isEnabled();
	    System.out.println("radio_button is Enabled>>"+enabled_status3);
	   /* boolean selected_status=radio_button.isSelected();
	    System.out.println("radio_button  is selected>>"+selected_status);
	    radio_button.click();
	    boolean selected_status_new = radio_button.isSelected();
	    System.out.println("radio button is selected>>"+selected_status_new);*/
	}

}
