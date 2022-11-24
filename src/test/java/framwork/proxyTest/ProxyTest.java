package framwork.proxyTest;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();//kurumsal bir ortamda bir URL'e bağlanmıyorsa,proxy'e ihtiyaç vardır.
        proxy.setHttpProxy("<HOST:PORT>");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setCapability("proxy",proxy);
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();//pencereyi büyütüyor
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
       // driver.quit();
    }
}
