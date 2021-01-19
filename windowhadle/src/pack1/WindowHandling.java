package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.airtel.in/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.className("icon-outlined-payment-bank")).click();
	Thread.sleep(10000);
	driver.findElements(By.xpath("//div[@class='quick-action--element ng-star-inserted']")).get(0).click();
	driver.findElements(By.xpath("//div[@class='quick-action--element ng-star-inserted']")).get(5).click();
	driver.findElements(By.xpath("//div[@class='quick-action--element ng-star-inserted']")).get(3).click();
	driver.findElements(By.xpath("//div[@class='quick-action--element ng-star-inserted']")).get(4).click();
	
	
	
	
	String title = driver.getTitle();
	System.out.println("parent title is -    " + title);
		
	String parentwindow = driver.getWindowHandle();
	System.out.println("parent id id -   " +parentwindow);
     	
	
	Set<String> handle= driver.getWindowHandles();
	System.out.println(handle);
	for(String child : handle) {
	  if(!parentwindow.equals(child)) {
		driver.switchTo().window(child);
			}
			
		}
		
	driver.findElements(By.xpath("//div[contains(@tabindex,'0')]")).get(4).click();
	String childtitle = driver.getTitle();
	System.out.println("child title is -     " +childtitle);
	driver.switchTo().window(parentwindow);
		 
	List<WebElement> linkcount= driver.findElements(By.tagName("a"));
	System.out.println("Tot no.of links "  + linkcount.size());
		 
	for(WebElement linkNames : linkcount)
	 System.out.println(linkNames.getText());
		
	}   
/*	/html/body/apb-root/mat-sidenav-container
	/mat-sidenav-content/div/apb-header/header/div/div[2]/div/div/div/div/div[4]
	*/

}
