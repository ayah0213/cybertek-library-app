package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShowRecordPages {

    public ShowRecordPages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement usersBtn;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecordBtn;

    public void usersBtnMethod(){
        usersBtn.click();
    }




}
