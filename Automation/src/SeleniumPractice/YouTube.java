package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("chura liya hai tumne jo dil ko "+Keys.ENTER);;
		List<WebElement> videos = driver.findElements(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
		
		System.out.println("number of songs presents are :"+videos.size());
		
		for(WebElement w:videos) {
			System.out.println(w.getText());
		}
		
	    driver.findElement(By.xpath("(//*[@id=\"video-title\"]/yt-formatted-string)[1]")).click();
		
		driver.close();
		
}
}
