package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Primero 

public class LoginPage {

    private WebDriver driver;

    private String userNameInput = "//*[@id=\"username\"]";
    private String passWordInput = "//*[@id=\"password\"]";
    private String continueButton = "/html/body/section/div/div/div/form/div[2]/button";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    

    public void enterUserName(String username){

        driver.findElement(By.xpath(userNameInput)).sendKeys(username);
    }

    public void enterPassWord(String passWord){
        driver.findElement(By.xpath(passWordInput)).sendKeys(passWord);
    }

    public void ClickContinue(){
        driver.findElement(By.xpath(continueButton)).click();
    }


}
