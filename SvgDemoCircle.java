package svgexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgDemoCircle
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver","E:\\AutomationWorkspace\\Advance_selenium\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/user/Desktop/svgdemo.html");
	int count=0,count1=0,c1=0;
	List<WebElement>allelements=driver.findElements(By.xpath("//*"));
	for(WebElement circle:allelements)
	{
		String tname=circle.getTagName();
		if(tname.equals("circle"))
		{
			count++;
			
				String att=circle.getCssValue("fill-opacity");
				System.out.println(att);
				System.out.println("========================");
				if(att.equals("0.5"))
				{
					count1++;
				}
				else
				{
					c1++;
				}
		}
	}
	System.out.println("no of circles:"+count);
	System.out.println("no of greencircles:"+count1);
	System.out.println("no of red circles:"+c1++);
	driver.close();
	}

}

