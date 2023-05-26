package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    MutableCapabilities sauceOptions = new MutableCapabilities();
    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    public boolean SAUCE_LAB =false;
    //public boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("sauce"));
    String browserName = loadProp.getProperty("browser");
    //String browserName = System.getProperty("browser");

    public void openBrowser(){
        if (SAUCE_LAB) {
            //it will run in sauce lab
            System.out.println("Running in SauceLab......with browser " + browserName);
            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("FireFox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
            else if (browserName.equalsIgnoreCase("Edge")) {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }else{    //Running localy
            if (browserName.equalsIgnoreCase("Chrome")) {   //open Chrome browser
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {   //open Fire fox browser
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {  //open Edge browser
                driver = new EdgeDriver();
            } else {
                System.out.println("Your browser name is wrong or not implemented :" + browserName);
            }
        }

        //open URL
        driver.get(loadProp.getProperty("url"));
        //maximize the window
        driver.manage().window().maximize();
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.close();
    }

}


