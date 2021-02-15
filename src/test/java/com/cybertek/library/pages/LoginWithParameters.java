package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithParameters {

    public LoginWithParameters() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(id = "inputEmail")
        public WebElement userInputName;


       @FindBy(id ="inputPassword")
       public WebElement passwordInput;


       @FindBy(xpath = "//button")
       public WebElement signUpBtn;

       @FindBy(xpath = "(//div)[2]")
       public WebElement allertMsg;

       @FindBy(xpath = "(//div//span)[1]")
       public WebElement dashboardTx;


        @FindBy(id = "user_count")
        public WebElement userNameNum;


    public void UsernamePasswordInputMethod(String loginFunct){
        String username = "";
        String password="";

        switch (loginFunct)
        {
            case "student" :
                username= ConfigurationReader.getProperty("student11");
                password= ConfigurationReader.getProperty("password11");
                System.out.println("Yo ure logged in as a STUDENT");
                break;
            case "librarian":
                username = ConfigurationReader.getProperty("librarian59");
                password = ConfigurationReader.getProperty("password59");
                System.out.println("You re logged in as LIBRARIAN");
                break;
            case "librarian11":
                username =ConfigurationReader.getProperty("librarian11");
                password = ConfigurationReader.getProperty("passwordd11");
                System.out.println("You re logged in as Libraraian11 ");
                break;
            case "librarian12":
                username=ConfigurationReader.getProperty("librarian12");
                password=ConfigurationReader.getProperty("password12");
                System.out.println("Ypu re logged in as Librarian12");
                break;
            case "librarian62":
                username = ConfigurationReader.getProperty("librarian62");
                password = ConfigurationReader.getProperty("password62");
                System.out.println("Ypu re logged in as Librarian62");
                break;
            default:
                System.out.println("Invalid User");

        }



        userInputName.sendKeys(username);
        passwordInput.sendKeys(password);
        signUpBtn.click();

    }
    public void clickButton(){
        signUpBtn.click();
    }






}