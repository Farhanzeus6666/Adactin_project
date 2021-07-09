package com.adactin.baseclass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassa {
	public static WebDriver driver;

	public static WebDriver browserlanch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + ("\\Driver\\edgedriver.exe"));
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}

	// 33.SLEEP---------------------------------------------------------------------
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	// 8.GET-------------------------------------------------------------------------
	public static void url(String value) {
		driver.get(value);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// 9.ALERT---------------------------------------------------------------------------

	public static void alertok() {
		driver.switchTo().alert().accept();
	}

	public static void alertno() {
		driver.switchTo().alert().dismiss();
		;
	}

	public static void promptalert(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}

	// 2.CLOSE------------------------------------------------------------------------
	public static void close() {
		driver.close();
	}

	// 2.QUIT------------------------------------------------------------------------

	public static void quit() {
		driver.quit();
	}

	// 4.NAVIGATE-TO-----------------------------------------------------------------

	public static void navigateto(String value) {
		driver.navigate().to(value);
	}

	// 5.NAVIGATE-BACK-----------------------------------------------------------------

	public static void navigateback() {
		driver.navigate().back();
	}

	// 6.NAVIGATE-FORWARD-----------------------------------------------------------------

	public static void navigateforward() {
		driver.navigate().forward();
	}

	// 7.NAVIGATE-REFRESH-----------------------------------------------------------------
	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// 27.SENDKEYS--------------------------------------------------------------------
	public static void inputofElement(WebElement element, String value) {
		// WebElement findElement = driver.findElement(By.id(""));
		element.sendKeys(value);
	}

	// 31.CLICK-------------------------------------------------------------------------

	public static void clickonElement(WebElement element) {
		element.click();
	}

	// 32.CLEAR

	public static void clearofelement(WebElement element) {
		element.clear();
	}

	// 10.ACTIONS---------------------------------------------------------------------------------------

	public static void action(WebElement element, String option, WebElement drop) {
		Actions ac = new Actions(driver);

		try {
			if (option.equalsIgnoreCase("movetoelement")) {
				ac.moveToElement(element).build().perform();
			} else if (option.equalsIgnoreCase("draganddrop")) {
				ac.dragAndDrop(element, drop).build().perform();
			} else if (option.equalsIgnoreCase("rightclick")) {
				ac.contextClick(element).build().perform();
			} else if (option.equalsIgnoreCase("click")) {
				ac.click().build().perform();
			} else {
				System.out.println("Invalid Mouse Action");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 12.ROBOT--------------------------------------------------------------------------

	public static void robot(String option) throws AWTException {
		Robot r = new Robot();

		try {
			if (option.equalsIgnoreCase("down")) {
				r.keyPress(KeyEvent.VK_DOWN);
			} else if (option.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else {
				System.out.println("Invalid Key Action");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 14.DROP-DOWN----------------------------------------------------------------------

	public static void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);

		try {
			if (option.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			} else if (option.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("byvisibletext")) {
				s.selectByVisibleText(value);
			} else {
				System.out.println("Invalid selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	// 25.TAKESCREENSHOT---------------------------------------------------------------------------

	public static void screenshot(String pic) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File("" + pic + ".png");
		try {
			FileUtils.copyFile(srcfile, desfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Pic taken");
	}

	// 26.JAVA-SCRIPT-EXECUTER-scroll-------------------------------------------------------------
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	// 23.GETATTRIBUTE------------------------------------------------------------------------------
	
	public static void getattribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		
	}
	
	// 16.IS-ENABLE----------------------------------------------------------------------------------
	
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.err.println(enabled);
	}
	
	// 17.IS-DISPLAYED---------------------------------------------------------------------------------

	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	// 18.IS-SELECTED----------------------------------------------------------------------------------
	
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	// 20.GETTITLE----------------------------------------------------------------------------------

	
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	// 21.GETCURRENT-URL----------------------------------------------------------------------------------

	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	
	// 22.GETTEXT-----------------------------------------------------------------------------------------
	
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

}



