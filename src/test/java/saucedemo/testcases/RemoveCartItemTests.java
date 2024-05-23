package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import saucedemo.base.BaseClass;
import saucedemo.pages.Cart;
import saucedemo.pages.LoginPage;
import saucedemo.pages.RemoveCartItem;
import saucedemo.pages.ViewCart;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
public class RemoveCartItemTests extends ViewCartTests {
	WebDriver driver;
	RemoveCartItem r;
	public RemoveCartItemTests() throws IOException {
		super();
	}
	
	
	
}