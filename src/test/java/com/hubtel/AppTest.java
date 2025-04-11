package com.hubtel;


import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws URISyntaxException 
     * @throws MalformedURLException 
     */
    @Test
    public void shouldAnswerWithTrue() throws MalformedURLException, URISyntaxException
    {
        UiAutomator2Options options = new UiAutomator2Options();
    //.setApp("/Users/lenovo/Downloads/Hubtel.apk");
AndroidDriver driver = new AndroidDriver(
    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
    new URI("http://127.0.0.1:4723/wd/hub").toURL(), options
);
try {
    String text1 = driver.findElement(AppiumBy.id("new UiSelector().description(\\\"AGREE AND CONTINUE\\\")")).getText();
    assertEquals(text1, "AGREE AND CONTINUE ");
} finally {
    driver.quit();
}
    }
}
