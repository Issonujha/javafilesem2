package myfirstpck;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attendence_Automate {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Working\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://gu.icloudems.com/corecampus/index.php");
		Thread.sleep(200);
		driver.manage().window().maximize();

		driver.findElement(By.id("useriid")).sendKeys("21scse2030005");
		Thread.sleep(200);
		driver.findElement(By.id("actlpass")).sendKeys("Sonujha123@");
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"psslogin\"]")).click();
		Thread.sleep(200);
		System.out.println("Hello");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[4]/a/img")).click();
		Robot robot = new Robot();
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div[1]/h5"))
				.getText() == "Course Wise Attendance");
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div[1]/h5")).getText()
				.equals("Course Wise Attendance")) {
			driver.findElement(By.xpath("//*[@id=\"searchfrom\"]/div/div[1]/div/span/span[1]/span/span[2]")).click();

//			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_DOWN);
//			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("//*[@id=\"classid\"]")).click();
		} else {
			driver.findElement(By
					.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[2]/div[1]/span/span[1]/span/span[2]"))
					.click();

			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_ENTER);

			driver.findElement(By
					.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[2]/div[2]/span/span[1]/span/span[2]"))
					.click();
		}
		Date d = new Date();
		String s = (java.time.LocalDate.now()).toString();
		String str[] = s.split("-");
		int month = Integer.parseInt(str[1]);

		for (int i = 0; i < month; i++) {
			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		Thread.sleep(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div[1]/h5")).getText()
				.equals("Course Wise Attendance")) {
			driver.findElement(By.xpath("//*[@id=\"getattendance\"]")).click();
		}
		WebElement n = driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[2]/div[4]/table/tbody/tr[3]/td[13]"));
//		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
	}

}
