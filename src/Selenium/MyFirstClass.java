package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");//setting the Chromedriver location
		WebDriver driver= new ChromeDriver(); //creating object
		driver.get("https://practicetestautomation.com/practice-test-login/");//open the Url
		driver.manage().window().maximize();//maximize the window

		driver.findElement(By.id("username")).sendKeys("student");// send keys--input
		Thread.sleep(4000);// 4sec time stop at username
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[2]/input")).sendKeys("Password123");
		Thread.sleep(2000);
		String st= driver.getTitle();
		String text=driver.findElement(By.xpath("/html/body/div/div/section/section/h2")).getText();
		System.out.println(text);
		driver.findElement(By.id("submit")).click();
		String actual=driver.getTitle();
		String exp_title ="Logged In Successfully | Practice Test Automation";
		System.out.println(st);
		System.out.println(actual);
		//driver.close();
		driver.quit();
		// //if(actual.equals(exp_title)==true) {
		// System.out.println("Automation pass");
		// }
		// else {
		// System.out.println("Automation fail");
		// }

		}



		}

