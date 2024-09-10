package com.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    WebDriver driver = new ChromeDriver();

    public  WebDriver getDriver(){
        return driver;
    }
}
