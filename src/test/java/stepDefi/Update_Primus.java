package stepDefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Update_Primus {
WebDriver driver;
@When("^i open PrimusBank URL on chrome$")
public void i_open_PrimusBank_URL_on_chrome() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://primusbank.qedgetech.com/");
	    driver.manage().window().maximize();
}

@When("^i enter username and password$")
public void i_enter_username_and_password() throws Throwable {
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	 driver.findElement(By.name("txtPword")).sendKeys("Admin");
}

@When("^click on Login button$")
public void click_on_Login_button() throws Throwable {
	driver.findElement(By.name("login")).click();
    Thread.sleep(4000);
}

@Then("^I should see admin text in URL$")
public void i_should_see_admin_text_in_URL() throws Throwable {
	 if(driver.getCurrentUrl().contains("admin"))
	    {
	    	System.out.println("Login success"); 	
	    }
	    else
	    {
	    	System.out.println("Login failed");
	    }
}

@When("^click on brances and click on edit button$")
public void click_on_brances_and_click_on_edit_button() throws Throwable {
	   driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
       driver.findElement(By.xpath("//tr//tr[2]//td[7]//a[1]//img[1]")).click();
}

@When("^Update branch name and Adress(\\d+)$")
public void update_branch_name_and_Adress(int arg1) throws Throwable {
	driver.findElement(By.name("txtbnameU")).clear();
	driver.findElement(By.name("txtbnameU")).sendKeys("kukatpalli");
	driver.findElement(By.name("txtadd1u")).clear();
    driver.findElement(By.name("txtadd1u")).sendKeys("hyderad");   
    Thread.sleep(4000);
}

@When("^click on update and logout$")
public void click_on_update_and_logout() throws Throwable {
   driver.findElement(By.name("btnupdate")).click();
   driver.switchTo().alert().accept();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//td//td//td//td[3]//a[1]//img[1]")).click();
   Thread.sleep(3000);
   driver.close();
}


}
