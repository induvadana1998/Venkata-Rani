import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
           System.setProperty("webdriver.chrome.driver",
        		   "C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
           WebDriver ObjDriver=new ChromeDriver();
           ObjDriver.get("https://demo.opencart.com/index.php?route=product/category&path=57");
          WebElement Sortby_dropdown=ObjDriver.findElement(By.xpath("//*[@id='input-sort']"));
  		Select sortby=new Select(Sortby_dropdown);
  		List<WebElement> dropdown=sortby.getOptions();
  		for(int i=0;i<dropdown.size();i++){
  			String drop_down_values=dropdown.get(i).getText();
  			System.out.println("dropdown values are Sortby sets"+drop_down_values);
  			
  		}

  	}

           

	}


