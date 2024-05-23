package saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Cart extends LoginPage {
	public Cart() {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]")WebElement addcart;
	public void addToCart() {
		addcart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}

