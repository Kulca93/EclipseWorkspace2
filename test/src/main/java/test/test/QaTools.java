package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class QaTools {

	WebDriver driver = new ChromeDriver();
	ExtentReports report;
	ExtentTest test;
	Actions builder = new Actions(driver);

	@BeforeTest
	public void openChrome() throws InterruptedException {

		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\javaTesting\\QA_Tools\\Result\\Open_Chrome.html", true);
		test = report.startTest("Open Website In Chrome");

		System.setProperty("webdriver.chrome.driver", "C:\\Developo\\Web_driver\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("http://demoqa.com");
		Thread.sleep(2000);

		String title = driver.getTitle();

		System.out.println(title);

		if (title.equals("Demoqa | Just another WordPress site")) {
			// report the test as a pass
			test.log(LogStatus.PASS, "Open Website In Chrome");
		} else {
			test.log(LogStatus.FAIL, "Open Website In Chrome");
		}

	}

	@Test(priority = 1, enabled = true)
	public void draggable() throws InterruptedException {

		WebElement draggableNav = driver.findElement(By.cssSelector("#menu-item-140"));
		draggableNav.click();
		
		Thread.sleep(2000);

		WebElement draggableBox = driver.findElement(By.cssSelector("#draggable"));

		builder.dragAndDropBy(draggableBox, 100, 100).perform();
		
		Thread.sleep(2000);

	}

	@Test(priority = 2, enabled = true)
	public void droppabe() throws InterruptedException {
		WebElement droppableNav = driver.findElement(By.cssSelector("#menu-item-141"));

		droppableNav.click();
		
		Thread.sleep(2000);
		
		WebElement draggableBox = driver.findElement(By.cssSelector("#draggableview"));
		WebElement dropBox = driver.findElement(By.cssSelector("#droppableview"));

	

		builder.dragAndDrop(draggableBox, dropBox).perform();
		
		Thread.sleep(2000);
		
		if (dropBox.findText.equals("Dropped!")) {
			// report the test as a pass
			test.log(LogStatus.PASS, "Box dragged On To Area");
		} else {
			test.log(LogStatus.FAIL, "Box dragged On To Area");
		}


	}

	@Test(priority = 3, enabled = true)
	public void resizable() throws InterruptedException {
		WebElement resizableNav = driver.findElement(By.cssSelector("#menu-item-143"));

		resizableNav.click();
		
		Thread.sleep(2000);

		WebElement resizableBox = driver.findElement(By.cssSelector(
				"#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));

		builder.dragAndDropBy(resizableBox, 100, 100).perform();
		
		Thread.sleep(2000);

	}

	@Test(priority = 4, enabled = true)
	public void selectable() throws InterruptedException {
		
		WebElement selectableNav = driver.findElement(By.cssSelector("#menu-item-142"));

		selectableNav.click();
		
		Thread.sleep(2000);
		
		WebElement selectorBox = driver.findElement(By.cssSelector(
				"#selectable > li:nth-child(1)"));

		selectorBox.click();
		
		builder.dragAndDropBy(selectorBox, 0, 500).perform();
		
		Thread.sleep(2000);
	}

	@Test(priority = 5, enabled = true)
	public void sortable() throws InterruptedException {
		WebElement sortableNav = driver.findElement(By.cssSelector("#menu-item-151"));

		sortableNav.click();
		
		Thread.sleep(2000);
		
		WebElement boxOne = driver.findElement(By.cssSelector("#sortable > li:nth-child(1)"));
		WebElement boxTwo = driver.findElement(By.cssSelector("#sortable > li:nth-child(2)"));
		WebElement boxThree = driver.findElement(By.cssSelector("#sortable > li:nth-child(3)"));
		WebElement boxFour = driver.findElement(By.cssSelector("#sortable > li:nth-child(4)"));
		WebElement boxFive = driver.findElement(By.cssSelector("#sortable > li:nth-child(5)"));
		WebElement boxSix = driver.findElement(By.cssSelector("#sortable > li:nth-child(6)"));
		WebElement boxSeven = driver.findElement(By.cssSelector("#sortable > li:nth-child(7)"));
		
		builder.dragAndDrop(boxSeven, boxOne).perform();
		Thread.sleep(500);
		builder.dragAndDrop(boxSix, boxOne).perform();
		Thread.sleep(500);
		builder.dragAndDrop(boxFive, boxOne).perform();
		Thread.sleep(500);
		builder.dragAndDrop(boxFour, boxOne).perform();
		Thread.sleep(500);
		builder.dragAndDrop(boxThree, boxOne).perform();
		Thread.sleep(500);
		builder.dragAndDrop(boxTwo, boxOne).perform();
		Thread.sleep(2000);
		
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}