package Week3.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithSeleniumAjio {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		String totalcount = driver.findElement(By.className("length")).getText();
		System.out.println("Total NO of items:" + totalcount);

		List<WebElement> brandlist = driver.findElements(By.className("brand"));

		int size = brandlist.size();

		System.out.println("Total NO of brandList:" + size);

		for (WebElement bl : brandlist) {

			String text = bl.getText();

			System.out.println(text);

		}

		List<WebElement> brandname = driver.findElements(By.className("nameCls"));

		int bname = brandname.size();

		System.out.println(bname);

		for (WebElement bn : brandname) {

			String bnam = bn.getText();

			System.out.println(bnam);

		}
		
		
		

	}

}
