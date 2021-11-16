package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver1=new FirefoxDriver();
	driver1.navigate().to("https://www.youtube.com/");
	Thread.sleep(5000);
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.close();
}
}
