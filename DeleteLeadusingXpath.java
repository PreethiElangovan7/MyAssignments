package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadusingXpath {

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
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//Enter phone number
		driver.findElement(By.xpath("//*[@id=\"ext-gen270\"]")).sendKeys("9443527035");
		//driver.findElement(By.xpath("//input[contains(text(),'phoneNumber')]")).sendKeys("9443527035");
		//Click find leads button
		driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Capture lead ID of First Resulting lead
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		String LeadID = null;
		//LeadID = driver.findElement(By.xpath("//*[@id=\"ext-gen935\"]")).getText();
		LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		System.out.println("LeadId");
		//Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Enter captured lead ID
		//driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		driver.findElement(By.xpath("//*[@id=\"ext-gen246\"]")).sendKeys(LeadID);
		//*[@id="ext-gen246"]
		//Click find leads button
		driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String expectedmessage = "No records to display";
		String actualmessage = driver.findElement(By.xpath("//*[@id=\"ext-gen437\"]")).getText();
		if(actualmessage.equals(expectedmessage)) {
			System.out.println("The record is deleted successfully");
		}
			else {
				System.out.println("The record is not deleted");
			}			
		


		//Close the browser (Do not log out)
         driver.close();
	}
	

}

