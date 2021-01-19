package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDatePicker {

	public static void main(String[] args) throws Exception {
		
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver(); 
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	driver.get("https://www.goibibo.com/");
	
/*	driver.switchTo().alert().dismiss();

    Robot r = new Robot();
     r.keyPress(KeyEvent.VK_TAB);
     r.keyPress(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_TAB);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
  
     System.out.println("==========");
	WebElement dt= driver.findElement(By.xpath("//input[@id='onward_cal' and @class='db']"));
    WebDriverWait wait =new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(dt));
    
    System.out.println("==========");
    
    r.keyPress(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    
  */
	String month="August 2020";
	String day ="20";
	driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
List<WebElement> monthpick=	driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
	while(true) {
	for (WebElement Element : monthpick) 
	{
		System.out.println(Element.getText());
		if(Element.getText().contains(month)) {
	              Element.click();
		}
		else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
	
		
		
	List<WebElement> daytobeclick=driver.findElements(By.xpath("//div[@role='grid']//following::div[@role='gridcell']//div"));
	for (WebElement webEl : daytobeclick) {
	
		if(webEl.getText().contains(day)) {
			webEl.click();
			break;
		}
	
	
	
	}
	
	}
	
	}
	}
	

}
