import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFrames {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver","C:\\util\\selenium\\geckodriver\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		List<WebElement> allFrames = driver.findElements(By.tagName("frame"));
		
		System.out.println("Total Frames : " + allFrames.size());
		
		for (int i=0 ; i< allFrames.size() ; i++)
			
			{
				System.out.println(allFrames.toArray()[i].toString());
			
			}
	}

}
