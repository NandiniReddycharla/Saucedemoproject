package saucedemo.pages;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RemoveCartItem extends ViewCart {
	public RemoveCartItem() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =".//button[@class='btn_secondary cart_button']") WebElement removeitem;
	public void RemoveFromCart() throws InterruptedException {
		removeitem.click();
		Thread.sleep(3000);		
	}
}
