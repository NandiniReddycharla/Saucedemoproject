package saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ViewCart extends Cart {
	public ViewCart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@class='shopping_cart_container']") WebElement clickoncart;
	public void clickOnCart() throws InterruptedException {
		clickoncart.click();
		Thread.sleep(3000);
	}
}
