import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverTask2 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("webinar.test@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        Thread.sleep(3000);

        List <WebElement> menuElements = driver.findElements(By.className("maintab"));

        for (WebElement element: menuElements) {
            element.click();
            Thread.sleep(3000);
            System.out.println("Page title is: " + driver.getTitle());
            driver.navigate().refresh();
            Thread.sleep(3000);
            System.out.println("Page title is: " + driver.getTitle());

        }

        Thread.sleep(3000);

        driver.quit();
    }

    // Driver initializer
    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources/chromedriver");
        return new ChromeDriver();
    }


}
