package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import saucedemo.base.BaseClass;
import saucedemo.pages.Cart;
import saucedemo.pages.LoginPage;
import saucedemo.pages.RemoveCartItem;
import saucedemo.pages.ViewCart;
import saucedemo.utils.TestUtils;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPageTests extends BaseClass {
    WebDriver driver;
    LoginPage lp;
    Cart c;
    ViewCart v;
    RemoveCartItem r;
    TestUtils utils;

    public LoginPageTests() throws IOException {
       super();
    }
   
    	@BeforeMethod
        public void setUp() {
            initialization();
            lp = new LoginPage();
            v = new ViewCart();
            r = new RemoveCartItem();
            utils= new TestUtils();
        }

        @Test(priority = 1)
        public void testUsernameCharacterLimitValidation() {
            String username = props.getProperty("username.invalid");
            lp.enterUsername(username);
            utils.screenshots("login id");
            Assert.assertEquals(lp.getErrorMessage(), "Username must be between 1 and 20 characters");
            
            
        }

        @Test(priority = 2)
        public void testWrongUsernameError() {
            String username = props.getProperty("username.invalid");
            String password = props.getProperty("password.valid");
            lp.enterUsername(username);
            lp.enterPassword(password);
            lp.clickLoginButton();
            utils.screenshots("Wrong login id");
            Assert.assertEquals(lp.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
            
        }

        @Test(priority = 3)
        public void testPasswordCharacterLimitValidation() {
            String username = props.getProperty("username.valid");
            String password = props.getProperty("password.invalid");
            lp.enterUsername(username);
            lp.enterPassword(password);
            lp.clickLoginButton();
            utils.screenshots("password");
            Assert.assertEquals(lp.getErrorMessage(), "Password must be between 1 and 20 characters");
            
        }

        @Test(priority = 4)
        public void testWrongPasswordError() {
            String username = props.getProperty("username.valid");
            String password = props.getProperty("password.invalid");
            lp.enterUsername(username);
            lp.enterPassword(password);
            lp.clickLoginButton();
            utils.screenshots("Wrong password");
            Assert.assertEquals(lp.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
           
        }
        @Test(priority = 5)
        public void testValidlogin() {
            String username = props.getProperty("username.valid");
            String password = props.getProperty("password.valid");
            lp.enterUsername(username);
            lp.enterPassword(password);
            lp.clickLoginButton();
            utils.screenshots("login page");
        }
        @Test(priority = 6)
        public void filter() {
            String username = props.getProperty("username.valid");
            String password = props.getProperty("password.valid");
            lp.enterUsername(username);
            lp.enterPassword(password);
            lp.clickLoginButton();
            lp.clickFilterButton();
            lp.waitForFilterDropdownToAppear();
            String expectedFilterDropdownTitle = "Name A to Z";
            String actualFilterDropdownTitle =  "Name A to Z";
            utils.screenshots("FilterDropdownToAppear");
            Assert.assertEquals(expectedFilterDropdownTitle, actualFilterDropdownTitle);
        
    }
        @Test(priority = 7)
        public void testSideMenuBar() {
        	 String username = props.getProperty("username.valid");
        	    String password = props.getProperty("password.valid");
        	    lp.enterUsername(username);
        	    lp.enterPassword(password);
        	    lp.clickLoginButton();
        	    lp.clickSideMenuBar();
        	    utils.screenshots("SideMenuBar");
        	    assertTrue(lp.isSideMenuBarDisplayed(), "Side menu bar is not  displayed after clicking.");
        }
        @Test(priority = 8)
        public void testCloseSideMenuBar() {
        	String username = props.getProperty("username.valid");
    	    String password = props.getProperty("password.valid");
    	    lp.enterUsername(username);
    	    lp.enterPassword(password);
    	    lp.clickLoginButton();
    	    lp.clickSideMenuBar();
    	    utils.screenshots("ClosesSideMenuBar");
            assertTrue(lp.isSideMenuBarDisplayed(), "Sidebar menu is not displayed");
            lp.clickCloseSideMenuBarButton(); 
            assertFalse(lp.isSideMenuBarDisplayed(), "Sidebar menu is still displayed after clicking the close button");
        }
        @Test (priority = 9)
    	public void addCart() {
        	String username = props.getProperty("username.valid");
    	    String password = props.getProperty("password.valid");
    	    lp.enterUsername(username);
    	    lp.enterPassword(password);
    	    lp.clickLoginButton();
    	    utils.screenshots("addCart");
    	    c.addToCart();
 
    		
    	}

		@Test(priority = 10)
    	public void viewcart() throws InterruptedException {
        	String username = props.getProperty("username.valid");
    	    String password = props.getProperty("password.valid");
    	    lp.enterUsername(username);
    	    lp.enterPassword(password);
    	    lp.clickLoginButton();
    	    v.clickOnCart();
    	    utils.screenshots("viewCart");
    		
    	}
        @Test(priority = 11)
    	public void removecart() throws InterruptedException{
        	String username = props.getProperty("username.valid");
    	    String password = props.getProperty("password.valid");
    	    lp.enterUsername(username);
    	    lp.enterPassword(password);
    	    lp.clickLoginButton();
    	    v.clickOnCart();
    	    utils.screenshots("removeCart");
    		r.RemoveFromCart();
    		
    	}

		
    }
       

    

    

    