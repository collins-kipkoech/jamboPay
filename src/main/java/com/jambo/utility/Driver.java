package com.jambo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {

    private static WebDriver obj ;

    private Driver(){ }


    public static WebDriver getDriver(){

        String browserName = ConfigReader.read("browser") ;

        if(obj == null){


            switch (browserName ){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                // other browsers omitted
                default:
                    obj = null ;
                    System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
            }
            return obj ;



        }else{
//
            return obj ;

        }

    }


    public static void closeBrowser(){


        if(obj != null ){
            obj.quit();

            obj = null ;
        }

    }

}
