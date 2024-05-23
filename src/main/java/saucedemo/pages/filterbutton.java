package saucedemo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class filterbutton {

	public void waitForFilterDropdownToAppear() {
		// TODO Auto-generated method stub
		filterbutton.click();
	}

     static void click() {
		// TODO Auto-generated method stub
		
	}
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement loginBtn;	
	@FindBy(id="filter_button")WebElement filterbutton;
	public void clickFilterButton() {
		// TODO Auto-generated method stub
		filterbutton.click();
	}
}