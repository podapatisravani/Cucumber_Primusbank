package stepDefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
WebDriver driver;
@When("^I open PrimusBank URL on chrome$")
public void i_open_PrimusBank_URL_on_chrome() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://primusbank.qedgetech.com/");
    driver.manage().window().maximize();
}

@When("^I enter username and password$")
public void i_enter_username_and_password() throws Throwable {
 driver.findElement(By.name("txtuId")).sendKeys("Admin");
 driver.findElement(By.name("txtPword")).sendKeys("Admin");
 
 }

@When("^click Login button$")
public void click_Login_button() throws Throwable {
    driver.findElement(By.name("login")).click();
    Thread.sleep(4000);
}

@Then("^I should see admin text in url$")
public void i_should_see_admin_text_in_url() throws Throwable {
    if(driver.getCurrentUrl().contains("admin"))
    {
    	System.out.println("Login success"); 	
    }
    else
    {
    	System.out.println("Login failed");
    }
}

@When("^click on branches and click on new branch$")
public void click_on_branches_and_click_on_new_branch() throws Throwable {
   driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
   driver.findElement(By.name("BtnNewBR")).click();
   Thread.sleep(4000);
}
@When("^fill fields in new branch page$")
public void fill_fields_in_new_branch_page() throws Throwable {
   driver.findElement(By.name("txtbName")).sendKeys("sravani");
   driver.findElement(By.name("txtAdd1")).sendKeys("Hyd!23");
   driver.findElement(By.name("txtZip")).sendKeys("12345");
   driver.findElement(By.name("lst_counrtyU")).sendKeys("INDIA");
   driver.findElement(By.name("lst_stateI")).sendKeys("Andhra Pradesh");
   driver.findElement(By.name("lst_cityI")).sendKeys("Hyderabad");
}

@When("^click on submit$")
public void click_on_submit() throws Throwable {
	 driver.findElement(By.name("btn_insert")).click();
	   Thread.sleep(4000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//td//td//td//td[3]//a[1]//img[1]")).click();
	Thread.sleep(4000);
  driver.close();
}
}
