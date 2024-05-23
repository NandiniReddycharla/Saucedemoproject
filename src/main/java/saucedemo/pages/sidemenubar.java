package saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sidemenubar {
	public void clickSideMenuBar() {
		// TODO Auto-generated method stub
		sidemenubar.click();
	}

	static void click() {
		// TODO Auto-generated method stub
		
	}
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement loginBtn;
	@FindBy(id="SideMenubar")WebElement sidemenubar;
	public boolean isSideMenuBarDisplayed() {
		// TODO Auto-generated method stub
		return true;

}
}
