package com.example.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationLocators {



//    public  WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
//    public WebElement lastname = driver.findElement(By.xpath("//input[@name='lName']"));
//    public WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//    public WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//    public WebElement password = driver.findElement(By.xpath("//input[@name='password']"));


    public  By firstname = By.xpath("//input[@name='firstName']");
    public By lastname = By.xpath("//input[@name='lName']");
    public By email = By.xpath("//input[@name='email']");
    public By username = By.xpath("//input[@name='username']");
    public By password = By.xpath("//input[@name='password']");
}
