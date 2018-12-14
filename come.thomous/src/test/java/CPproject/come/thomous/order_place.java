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
		
		
		driver.get("http://dev.4seating.com");
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
	    qtyselect.selectByVisibleText("1");
	  
	    
	    
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
	    dropdown4.selectByVisibleText("United States");
	    driver.findElement(By.id("billing:telephone")).sendKeys("1234567899");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button")).click();
	  
        Thread.sleep(2000);
	    //select payment method  
         WebElement cbutton = driver.findElement(By.id("p_method_authorizenet"));
         cbutton.click();
        driver.findElement(By.xpath("//*[@id=\"authorizenet_cc_number\"]")).sendKeys("4111111111111111");
        Select card_month = new Select(driver.findElement(By.id("authorizenet_expiration")));
        card_month.selectByVisibleText("01 - January");
        
        Select card_year = new Select (driver.findElement(By.id("authorizenet_expiration_yr")));
        card_year.selectByVisibleText("2028");
        
        
        driver.findElement(By.id("authorizenet_cc_cid")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button/span/span")).click();
	      
        
        //add comment to the check out page  
        
        Thread.sleep(10000);
        driver.findElement(By.id("ordercomment-comment")).sendKeys("CP TEST PLEASE DO NOT PROCESS 1");
        driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button/span/span")).click();
        
	     //driver.quit();
	    
	    
	    
	    
	    
	  
	    
	    

	}

}
