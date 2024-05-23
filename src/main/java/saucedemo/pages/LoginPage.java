package saucedemo.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import saucedemo.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	//locators of login page
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement loginBtn;
	@FindBy(id="login_button_container")WebElement ErrorMessage;
	@FindBy(id="filter_button")WebElement filterbutton;
	@FindBy(id="SideMenubar")WebElement sidemenubar;
	@FindBy(id="btn_primary btn_inventory")WebElement SuccesMessage;
	//functions

    public void enterUsername(String us) {
        username.sendKeys(us);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
    	loginBtn.click();
    }

    public String getErrorMessage() {
        return ErrorMessage.getText();
    }

	public void clickSideMenuBar() {
		// TODO Auto-generated method stub
		
	}

	public boolean isSideMenuBarDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clickCloseSideMenuBarButton() {
		// TODO Auto-generated method stub
		
	}

	public void waitForFilterDropdownToAppear() {
		// TODO Auto-generated method stub
		
	}

	public void clickFilterButton() {
		// TODO Auto-generated method stub
		
	}
   		

	
	

}





