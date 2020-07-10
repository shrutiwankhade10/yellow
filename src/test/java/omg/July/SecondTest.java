package omg.July;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SecondTest extends base{
	
	@Test
	public void nolink() throws IOException {
	driver=startDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    System.out.println(	driver.findElements(By.tagName("a")).size());
	
	WebElement table=driver.findElement(By.id("gf-BIG"));
	System.out.println(table.findElements(By.tagName("a")).size());
	
	WebElement column=table.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
	System.out.println(column.findElements(By.tagName("a")).size());
	
	int count=column.findElements(By.tagName("a")).size();
	
	for(int i=0;i<count;i++) {
		String text=Keys.chord(Keys.CONTROL,Keys.ENTER);
		column.findElements(By.tagName("a")).get(i).sendKeys(text);
	}
	
	Set<String> ab=driver.getWindowHandles();
	Iterator<String> it=ab.iterator();
	
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	driver.close();
	
	
	
			
		
	}

}
