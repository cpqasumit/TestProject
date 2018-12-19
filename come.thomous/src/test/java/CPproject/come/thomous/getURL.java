package CPproject.come.thomous;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class getURL {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
    driver.get("http://beta.4seating.com/seatcraft-theater-seating/tray-tables.htm");
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("Total links found: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			
			String url=links.get(i).getAttribute("href");
			System.out.println(url + "->  ok");
    
	    }
		
	// Write  excel sheet  
		
	
		

	}
	}
