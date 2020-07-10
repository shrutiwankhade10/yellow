package omg.July;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends base {
	
	
@Test(groups= {"shruti"})
public void dateSelection() throws IOException  {
	driver=startDriver();
	driver.get("https://www.spicejet.com/");
	FirstObject j=new FirstObject(driver);
	j.Afrom().click();
	j.AAjmer().click();
	j.Amumbai().click();
	
	while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("October")) {
		
		driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	int count=driver.findElements(By.xpath("//a[@class='ui-state-default ui-state-hover']")).size();
	
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.xpath("//a[@class='ui-state-default ui-state-hover']")).get(i).getText();
	
		if(text.equalsIgnoreCase("12")) {
			driver.findElements(By.xpath("//a[@class='ui-state-default ui-state-hover']")).get(i).click();
			//break;
		}
		driver.close();
	}
				
		
	}
@Test
public void hello()
{
	System.out.println("wert");
}
@Test
public void hello1()
{
	System.out.println("wert");
}
@Test
public void hello2()
{
	System.out.println("wert");
}

}
