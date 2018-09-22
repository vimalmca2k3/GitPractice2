import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataTables {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver","C:\\util\\selenium\\geckodriver\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("http://the-internet.herokuapp.com/tables");
		
		WebElement table = driver.findElement(By.id("table1"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		List<WebElement> tableHeadings = table.findElements(By.tagName("th"));
		
		List<WebElement> tableData = table.findElements(By.tagName("td"));
		
		for (int i =0 ; i < tableHeadings.size() ; i++)
			
			{
				System.out.print(tableHeadings.get(i).getText());
				System.out.print("       ");
			}
		
		System.out.println("");
		
		int z = 0;
		for (int j =0 ; j  < (allRows.size()-1) ; j++ )
			
		{
			
		
				
				for (int k = 0 ; k < tableHeadings.size() ; k++)
				{
					
					System.out.print(tableData.get(z).getText());
					
					System.out.print("       ");
					
					z++;
				}
				
				System.out.println("");

		//System.out.println("No. of  data cells in the table :" + tableData.size());
		
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
