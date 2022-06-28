package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");//setting the Chromedriver location
		WebDriver driver= new ChromeDriver(); //creating object
		driver.get("https://stage.dvc-ubi.wdprapps.disney.com/home/636170744803/");//open the Url
		driver.manage().window().maximize();//maximize the window
	
		System.out.println("Title" +driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println("navigate to " +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("navigate back " +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("navigate forward " +driver.getTitle());
		
		
	}
}
