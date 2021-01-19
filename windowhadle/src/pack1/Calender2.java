package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver(); 
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
			driver.get("https://www.spicejet.com/");

	}

}
