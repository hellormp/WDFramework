package driverConfiguration;

import org.testng.annotations.Test;

public class test extends driverConfiguration{
    @Test
    public void some(){
        startDriver();
        driver.get("dadsa");
        teerDown();
    }
}
