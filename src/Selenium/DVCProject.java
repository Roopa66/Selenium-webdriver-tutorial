package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DVCProject {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");//setting the Chromedriver location
		WebDriver driver= new ChromeDriver(); //creating object
		driver.get("https://stage.dvc-ubi.wdprapps.disney.com/home/636170744803/");//open the Url
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.id("login-username")).sendKeys("test121@disney.com");
		driver.findElement(By.id("login-next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-password")).sendKeys("Mickeyminnie123");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(10000);
		String query = "return document.querySelector('#childProduct').shadowRoot.querySelector('#inputContainer > i')";
	    WebElement dropdown=(WebElement)((JavascriptExecutor) driver).executeScript(query);
	    dropdown.click();
	    Thread.sleep(5000);
	    String query1="return document.querySelector('#childProduct').shadowRoot.querySelector('#b370647010 > div')";
	    WebElement aulani=(WebElement)((JavascriptExecutor) driver).executeScript(query1);
	    aulani.click();
	    Thread.sleep(3000);
	    String query2="return document.querySelector('#arrival-date').shadowRoot.querySelector('#editable-input-container > wdpr-input').shadowRoot.querySelector('#OZT9u1')";
	    WebElement dth=(WebElement)((JavascriptExecutor) driver).executeScript(query2);
	    System.out.println(dth.toString());
	    dth.sendKeys("09/08/2022");
	    dth.clear();
	    Thread.sleep(2000);
	    dth.sendKeys("09/08/2022");
	    

	}

}
