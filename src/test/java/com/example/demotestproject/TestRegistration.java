package com.example.demotestproject;

import com.example.base.Base;
import com.example.pageobjects.Registration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestRegistration extends Base {

    WebDriver driver = super.getDriver();
    Registration registrationPage = new Registration(driver);

    @Test
    public void testRegistration() throws InterruptedException {
        driver.get("http://localhost:8080/registration");
        registrationPage.checkRegistrationPage();
        driver.quit();
    }

//    @AfterEach
//    public void deleteSession(){
//        driver.quit();
//    }


}
