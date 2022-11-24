package framwork.pageLoadStrategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class PageLoadStrategy {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
        WebDriver driver = new ChromeDriver(chromeOptions);
        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
            driver.quit();
        }
    }
}
