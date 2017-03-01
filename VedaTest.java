package vedatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class VedaTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		VedaTest vt=new VedaTest();
		//vt.testGoogleSearch();
		
		vt.testAffiliate();
		vt.testVedaPartner();
	}
	
	@Test
	public void testVedaPartner() throws InterruptedException{
		// Optional, if not specified, WebDriver will search your path for
		System.setProperty("webdriver.chrome.driver",
				"D:/your path/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://partner.vedanetwork.com/");
		Thread.sleep(1000); // Let the user actually see something!
		WebElement emailBox = driver.findElement(By.name("data[User][email]"));
		emailBox.sendKeys("abc@abc.com");
		WebElement passwordBox = driver.findElement(By.name("data[User][password]"));
		passwordBox.sendKeys("12345678");
		passwordBox.submit();
		//Thread.sleep(1000); // Let the user actually see something!
		//driver.quit();
	}
	
	@Test
	public void testAffiliate() throws InterruptedException{
		// Optional, if not specified, WebDriver will search your path for
		System.setProperty("webdriver.chrome.driver",
				"D:/your path/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://partner.vedanetwork.com/signup/");
		Thread.sleep(1000); // Let the user actually see something!
		WebElement companyBox = driver.findElement(By.name("data[Affiliate][company]"));
		companyBox.sendKeys("ABC");
		WebElement address1Box = driver.findElement(By.name("data[Affiliate][address1]"));
		address1Box.sendKeys("123");
		WebElement address2Box = driver.findElement(By.name("data[Affiliate][address2]"));
		address2Box.sendKeys("123");
		WebElement cityBox = driver.findElement(By.name("data[Affiliate][city]"));
		cityBox.sendKeys("ABC city");
		String country= "thailand";
		Select countryDropDownList = new Select(driver.findElement(By.id("AccountCreateCountry")));   
		countryDropDownList.selectByVisibleText(country);
		if(country=="united states"){
			Select stateDropDownList = new Select(driver.findElement(By.id("AccountCreateState")));   
			stateDropDownList.selectByVisibleText("alabama");
		}else{
			WebElement regionBox = driver.findElement(By.name("data[Affiliate][region]"));
			regionBox.sendKeys("ABC state");
		}
		WebElement zipcodeBox = driver.findElement(By.name("data[Affiliate][zipcode]"));
		zipcodeBox.sendKeys("12345");
		WebElement phoneBox = driver.findElement(By.name("data[Affiliate][phone]"));
		phoneBox.sendKeys("0123456789");
		WebElement userEmailBox = driver.findElement(By.name("data[AffiliateUser][email]"));
		userEmailBox.sendKeys("abc@abc.com");
		WebElement passwordEmailBox = driver.findElement(By.name("data[AffiliateUser][password]"));
		passwordEmailBox.sendKeys("12345678");
		WebElement passwordConfirmEmailBox = driver.findElement(By.name("data[AffiliateUser][password_confirmation]"));
		passwordConfirmEmailBox.sendKeys("12345678");
		WebElement userFirstNameBox = driver.findElement(By.name("data[AffiliateUser][first_name]"));
		userFirstNameBox.sendKeys("Aaaa");
		WebElement userLastNameBox = driver.findElement(By.name("data[AffiliateUser][last_name]"));
		userLastNameBox.sendKeys("Bbbb");
		WebElement userTitleBox = driver.findElement(By.name("data[AffiliateUser][title]"));
		userTitleBox.sendKeys("Cccc");
		driver.findElement(By.id("AffiliateUserTermsAgreement")).click();
		//WebElement terms_agreementCheckBox = driver.findElement(By.name("data[AffiliateUser][terms_agreement]"));
		//terms_agreementCheckBox.click();
		userTitleBox.submit();
		//Thread.sleep(1000); // Let the user actually see something!
		//driver.quit();
	}
	
	@Test
	public void testGoogleSearch() throws InterruptedException{
		// Optional, if not specified, WebDriver will search your path for
		System.setProperty("webdriver.chrome.driver",
				"D:/your path/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}
