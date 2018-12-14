package CPproject.come.thomous;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.select;
public class order_place {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://4seating.com");
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a/span")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"test256\"]/li[2]/div[2]/a/img")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"iframeProductCart\"]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]/a/span/img")).click();
	    
	    
	    
	        
	    Thread.sleep(2000);
	    
	    // select drop down 
	    
	   Select dropdown1 = new Select (driver.findElement(By.id("select_12214")));
	    dropdown1.selectByVisibleText("2 Corner Wedge +$1,498.00");
	    
	    Thread.sleep(2000);
	    Select dropdown2 = new Select (driver.findElement(By.id("select_13089")));
	    dropdown2.selectByVisibleText("2 Armless Chair +$998.00");
	    
	    
	    Select dropdown3 = new Select(driver.findElement(By.id("select_12221")));
	    dropdown3.selectByVisibleText("3 Ottoman +$1,497.00");
	    
	  
	    
	    
	    
	 // select  QTY
	    Select qtyselect = new Select(driver.findElement(By.xpath("//*[@id=\"qty\"]")));
	    qtyselect.selectByVisibleText("4");
	  
	    
	    
	    // Add to cart 
	    Thread.sleep(2000);
	  // driver.findElement(By.linkText("Add to Cart")).click();
	     driver.findElement(By.xpath("//*[@id=\"iframeProductCart\"]/div/div[4]/div/div/div[2]/button")).click();
	      
	      
	      
	     
	     
	   // Proceed to check out  
	   driver.findElement(By.xpath("html/body/div[1]/div/div[8]/div/div[2]/div[2]/div[1]/ul/li[2]/button")).click();
	  
	  ///html/body/div[1]/div/div[8]/div/div[2]/div[2]/div[1]/ul/li[2]/button/span
	   
	   //Add billing information
	   driver.findElement(By.id("billing:firstname")).sendKeys("Cp test");
	   driver.findElement(By.id("billing:lastname")).sendKeys("please do not Process");
	   driver.findElement(By.id("billing:email")).sendKeys("sumit@commercepundit.com");
	   driver.findElement(By.id("billing:street1")).sendKeys("USA");
	   driver.findElement(By.id("billing:postcode")).sendKeys("10001");
	  
	   Thread.sleep(2000);
	   Select dropdown4 = new Select(driver.findElement(By.id("billing:country_id")));
	    dropdown3.selectByVisibleText("United States");
	    
	  
	    //driver.findElement(By.id("shipping:telephone")).sendKeys("1234567899");
	    // driver.findElement(By.xpath("//*[@id='shipping:telephone']")).sendKeys("1234567899");
	    // driver.findElement(By.cssSelector("input-text  required-entry")).sendKeys("1234567899");
	    
	    
	    
	    
	    
	    
	    
	   driver.findElement(By.cssSelector("input[id=billing:telephone]")).sendKeys("1234567899");
	   
	   WebElement e=driver.findElement(By.xpath("//*[@id=\"billing:telephone\"]"));
		WebDriverWait wait= new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
	   
	  
	   // driver.findElement(By.xpath("//*[@id='billing-buttons-container']/button")).click();
	   driver.findElement(By.id("shipping:telephone")).sendKeys("1234567899");
	    
	    
	   
	    // Hello this testing  
	    //select payment  method  
	    //  p_method_authorizenet
	    //input-text  required-entry
	   
	    
	   
	      
	   //   driver.quit();
	    
	    
	    
	    
	    
	  
	    
	    

	}

}
