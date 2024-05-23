package saucedemo.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import saucedemo.base.BaseClass;
import saucedemo.pages.Cart;
import saucedemo.pages.LoginPage;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class CartTests extends LoginPageTests{
	WebDriver driver;
	Cart c;
	public CartTests() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
