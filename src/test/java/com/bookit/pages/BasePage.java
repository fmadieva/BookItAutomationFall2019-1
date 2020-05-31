package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class should be used as a parent class for every page class
 */
public abstract class BasePage {



    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
