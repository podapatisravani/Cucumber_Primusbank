package stepDefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Delete_Branch {
WebDriver driver;
@When("^I open PrimusBank Url on chrome$")
public void i_open_PrimusBank_Url_on_chrome() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://primusbank.qedgetech.com/");
	    driver.manage().window().maximize();
}

@When("^I enter Username and password$")
public void i_enter_Username_and_password() throws Throwable {
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	 driver.findElement(By.name("txtPword")).sendKeys("Admin");
}

@When("^Click on Login button$")
public void click_on_Login_button() throws Throwable {
	driver.findElement(By.name("login")).click();
    Thread.sleep(4000);
}

@Then("^I should see admin text in Url$")
public void i_should_see_admin_text_in_Url() throws Throwable {
	if(driver.getCurrentUrl().contains("admin"))
    {
    	System.out.println("Login success"); 	
    }
    else
    {
    	System.out.println("Login failed");
    }
}

@When("^click on branches and click on delete button$")
public void click_on_branches_and_click_on_delete_button() throws Throwable {
	   driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
       driver.findElement(By.xpath("//tr//tr[2]//td[8]//a[1]//img[1]")).click();
}

@When("^confirm alert and confirm popup$")
public void confirm_alert_and_confirm_popup() throws Throwable {
    driver.switchTo().alert().accept();
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
    Thread.sleep(3000);
}

@When("^logout and close brower$")
public void logout_and_close_brower() throws Throwable {
	driver.findElement(By.xpath("//td//td//td//td[3]//a[1]//img[1]")).click();
	   Thread.sleep(3000);
	   driver.close();
}
}
