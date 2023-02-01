package myfirstpck;

import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Working\\chromedriver.exe");
		try {

			ChromeDriver driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
