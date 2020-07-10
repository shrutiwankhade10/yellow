package omg.July;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ThirdTest extends base {
	
	@Test
	public void linktest() throws IOException {
		driver=startDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.close();
		
	} 

	@Test(groups= {"shruti"})
	
	public void framehandle() throws IOException {
		driver=startDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.close();
		
		
	}
	
	@Test
	public void actioui() throws IOException {
		driver=startDriver();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,15);
		
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("shruti").build().perform();
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("shruti").doubleClick().build().perform();
		driver.close();
	}
	
	@Test
	public void fan() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("shruti");
		Assert.assertEquals("shrutii", driver.findElement(By.id("name")));
		driver.close();	
		
		
	} 
	
	@Test
	public void tom() throws IOException {
		driver=startDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		driver.close();
	}
	

}
