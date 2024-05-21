package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-5- ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser
 */
public class Programme05_ComUltimateqa {
    static WebDriver driver;
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser selected");
        }
        driver.manage().window().maximize();
        System.out.println("1- Browser setup.");
        driver.get(baseUrl);
        System.out.println("2- URL opened.");
        System.out.println("3- Title of the page: " + driver.getTitle());
        System.out.println("4- Current URL of the page: " + driver.getCurrentUrl());
        System.out.println("5- Page source: " + driver.getPageSource());
        driver.findElement(By.partialLinkText("Sign In")).click();
        System.out.println("6- Clicked on 'Sing-in' link.");
        System.out.println("7- Current URL of the page: " + driver.getCurrentUrl());
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");
        System.out.println("8- Email entered in the email field.");
        driver.findElement(By.id("user[password]")).sendKeys("prime123");
        System.out.println("9- Password entered in the password field.");
        driver.findElement(By.className("form__button-group")).click();
        System.out.println("10- User clicked on login button.");
        driver.navigate().to(baseUrl);
        System.out.println("11- Navigated to baseUrl.");
        System.out.println("12- Navigate forward to Homepage.");
        System.out.println("13- Navigate back to baseUrl.");
        driver.navigate().refresh();
        System.out.println("14- Page refreshed.");
        driver.quit();
        System.out.println("15- Browser closed.");
    }
}
