package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadusingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/sarathi/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"button\"]/a/img")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_companyName\"]")).sendKeys("TCS");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstName\"]")).sendKeys("Preethi");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_lastName\"]")).sendKeys("Elangovan");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("9443527035");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		
		

	}

}
