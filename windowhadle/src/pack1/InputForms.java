package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputForms {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
/*		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
        List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
       for (int i = 0; i <checkbox.size(); i++) {
		      String cb= checkbox.get(i).getAttribute("value");
		    System.out.println(cb);  
		  //  String value=  cb.getAttribute("value");
		  //  System.out.println(value);
		  //  System.out.println("ok");
		      
	}
 */
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	List<WebElement> listbox=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		System.out.println(listbox.size());
	
		for (int i = 0; i <listbox.size(); i++) {
			System.out.println(listbox.get(i).getText());
		    if(listbox.get(i).getText().trim().contains("selenium testing")){
		    	listbox.get(i).click();
		    	break;  
		    	}
		    }
		
	}

}
