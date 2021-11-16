package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		System.out.print("hello"+" ");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Options a = driver.manage();
		Window b = a.window();
//		b.fullscreen(); // F11 FULL SCREEN
		b.maximize();
		driver.findElement(By.className("-MzZI")).click();;
		driver.close();
		
	}
}
