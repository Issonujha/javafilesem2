package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GU_ICloud_Automate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Working\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();

		driver.get("https://gu.icloudems.com/corecampus/index.php");

		driver.findElement(By.id("useriid")).sendKeys("21scse2030005");

		driver.findElement(By.id("actlpass")).sendKeys("Sonujha123@");

		driver.findElement(By.xpath("//*[@id=\"psslogin\"]")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[20]/a/img")).click();

	}

}
