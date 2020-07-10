package omg.July;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fourthtest extends base {
	
	
	
	@Test
	public void dropdown() throws IOException {
		driver=startDriver();
		
		driver.get("https://www.spicejet.com/");
		FirstObject j=new FirstObject(driver);
		j.Afrom().click();
		j.AAjmer().click();
		j.Amumbai().click();
		driver.findElement(By.linkText("20")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(3);
		driver.close();
		
		
		
	}
	@Parameters({"url","url2"})
	@Test
	
	public void showw(String a,String b) {
		System.out.println(a);
		System.out.println(b);
		
		
	}
	

}
