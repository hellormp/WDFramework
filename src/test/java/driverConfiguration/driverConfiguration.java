package driverConfiguration;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


abstract public class driverConfiguration {


    @BeforeTest
    public void startDriver(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
    }

    public void init(){
        startDriver();
    }

    @AfterTest
    public void teerDown(){
        Selenide.closeWebDriver();
    }

}
