import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTask1 {

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

        WebElement employeeInfos = driver.findElement(By.id("employee_infos"));
        employeeInfos.click();

        Thread.sleep(3000);
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();

        Thread.sleep(3000);

        driver.quit();
    }

    // Driver initializer
    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources/chromedriver");
        return new ChromeDriver();
    }
}
