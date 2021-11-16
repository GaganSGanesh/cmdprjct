package SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Jio_Saavan {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiosaavn.com/");
		driver.manage().window().maximize();
		List<WebElement> songs = driver.findElements(By.xpath("//a[@event_item='[object Object]']"));
		System.out.println("number of links presents are :"+songs.size());
//		Iterator<WebElement> it = songs.iterator();
//		if(it.hasNext()){
//			System.out.println(it.next().getText());
//		}
		
		for(WebElement w:songs) {
			System.out.println(w.getText());
		}
		driver.close();
		
	}


}
