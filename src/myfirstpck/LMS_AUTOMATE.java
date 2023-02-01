package myfirstpck;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_AUTOMATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();

		System.setProperty("webdriver.chrome.driver", "D:\\Working\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lms.galgotiasuniversity.edu.in/login/index.php");

		// find username

		WebElement txtbx_username = driver.findElement(By.id("username"));

		txtbx_username.sendKeys("21scse2030005");

		// Password is set
		driver.findElement(By.id("password")).sendKeys("Sonu123@");

		// by id click
		driver.findElement(By.id("loginbtn")).click();
//		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/nav/div/button")).click();
		// by xpath click
		driver.findElement(By.xpath("//*[@id=\"nav-drawer\"]/nav/ul/li[3]/a")).click();

		String s = (java.time.LocalDate.now()).toString();

		String arr[] = s.split("-");
		String dateString = arr[arr.length - 1];
		int date = 0;
		date = Integer.parseInt(dateString);
		date += 1;
		dateString = date + "";
		driver.findElement(By.linkText(dateString)).click();
	}

}
