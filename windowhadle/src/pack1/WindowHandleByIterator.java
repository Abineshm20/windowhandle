package pack1;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleByIterator {

	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver(); 
 //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://www.google.co.in/");
      driver.manage().window().maximize();
      driver.findElement(By.name("q")).sendKeys("selenium");
      Thread.sleep(4000);
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
  
  //   driver.findElements(By.xpath("//div[@class='FPdoLc tfB0Bf']//following::center/input[@type='submit']"));
  //    driver.findElement(By.xpath("//div/cite[@class='iUh30 tjvcx']")).click();
  //    driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
  
   
       List<WebElement> links= driver.findElements(By.xpath("//a"));
       System.out.println(links.size());
     
       for (WebElement totlinks : links) 
       {
		System.out.println(totlinks.getAttribute("href"));	
	   }
    driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]")).click();
    WebElement download=driver.findElement(By.xpath("//ul[@id='aboutSubnav']//div[7]//following::a[1]"));
      
    Actions act=new Actions(driver);
    act.contextClick(download).build().perform();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    
    r.keyPress(KeyEvent.VK_ENTER);
	}

}
