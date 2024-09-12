package com.example.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationLocators {
    
    public  By firstname = By.xpath("//input[@name='firstName']");
    public By lastname = By.xpath("//input[@name='lname']");
    public By email = By.xpath("//input[@name='email']");
    public By username = By.xpath("//input[@name='uname']");
    public By password = By.xpath("//input[@name='password']");
}
