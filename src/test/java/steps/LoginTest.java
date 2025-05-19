package steps;

import java.time.Duration;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;


public class LoginTest {

    WebDriver web;
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        web = new ChromeDriver();// DriverManager.getDriver();
        web.manage().window().maximize();
        web.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        web.get("/Users/ibisdev/Development/JavaProyects/EjercicioQA-Login/src/main/resources/Login.html");
        loginPage = new LoginPage(web);
    }

    @Test
    public void testLoginWithValidCredentials() {
    
        loginPage.enterUserName("valid_user");
        loginPage.enterPassWord("Valid_pass");
        loginPage.ClickContinue();
    }

    @Test
    public void testInvalidCredentials(){

        loginPage.enterUserName("invalid_user");
        loginPage.enterPassWord("Invalid_pass");
        loginPage.ClickContinue();
    }

    @Test
    public void testEmptyFields(){
        loginPage.enterUserName("");
        loginPage.enterPassWord("");
        loginPage.ClickContinue();
        Assertions.assertTrue(web.getPageSource().contains("Completa los campos"));
    }

     @AfterEach
    void tearDown() {
        if (web != null) web.quit();
    }
}
