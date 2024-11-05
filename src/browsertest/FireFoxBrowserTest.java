package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-4- ProjectName: com-saucedemo
 *  BaseUrl = https://www.saucedemo.com/
 *  1. Set up Chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current URL.
 *  5. Print the page source.
 *  6. Enter the email in the email field.
 *  7. Enter the password in the password field.
 *  8. Click on the Login Button.
 *  9. Print the current URL.
 *  10. Navigate to baseUrl
 *  11. Refresh the page.
 *  12. Close the browser.
 */

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        //baseurl
        String baseurl = "https://www.saucedemo.com/";

        //1.Set up  browser.
        WebDriver driver = new FirefoxDriver();

        //2. Open URL.
        driver.get(baseurl);

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4 Print the current URL.
        String currenturl = driver.getCurrentUrl();
        System.out.println("the current url ;" + currenturl);

        //5.Print the page source
        System.out.println("the page source is " + driver.getPageSource());

        //6.Enter the email in the email field
        WebElement emailId = driver.findElement(By.name("user-name"));
        emailId.sendKeys("mann@gmail.com");

        //7.Enter the password in the password field.
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("mannkaur");

        //8.Click on the Login Button.
        WebElement login = driver.findElement(By.name("login-button"));
        login.click();

        // 9. Print the current URL.
        System.out.println("get the current url;" + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.get(baseurl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.close();

    }
}
