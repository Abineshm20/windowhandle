package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindDemo {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABINESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElements(By.xpath("//input[@type='text']")).get(1).click();
		driver.findElements(By.xpath("//input[@type='text']")).get(1).sendKeys("abinesh.m20@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijayakumari");
		driver.findElements(By.xpath("//button[@type='submit']")).get(1).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]").click();
	
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div[1]/div/img")).click();
		
		

	}

}
