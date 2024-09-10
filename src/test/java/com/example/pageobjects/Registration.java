package com.example.pageobjects;

import com.example.locator.RegistrationLocators;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Registration {

    WebDriver driver;

    RegistrationLocators registrationLocator;

    public Registration(WebDriver driver){
        this.driver = driver;
        registrationLocator = new RegistrationLocators();
    }

    public void checkRegistrationPage() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Verifying the registration page");
        Assert.assertTrue(driver.findElement(registrationLocator.firstname).isDisplayed());
        Assert.assertTrue(driver.findElement(registrationLocator.lastname).isDisplayed());
        Assert.assertTrue(driver.findElement(registrationLocator.email).isDisplayed());
        Assert.assertTrue(driver.findElement(registrationLocator.username).isDisplayed());
        Assert.assertTrue(driver.findElement(registrationLocator.password).isDisplayed());
        System.out.println("Registration page verified");
        Thread.sleep(2000);
    }

}
