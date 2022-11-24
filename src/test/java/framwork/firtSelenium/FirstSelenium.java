package framwork.firtSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class FirstSelenium {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();//session'ı başlat
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");//bir web sayfasına git
        String title= driver.getTitle();//tarayıcıdaki başlığı getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//Bekleme
        WebElement texbox= driver.findElement(By.name("my-text"));//tekbox'ın html kodundaki name elemtini kullan
        WebElement submitButton=driver.findElement(By.cssSelector("button"));
        texbox.sendKeys("Selenium");//deneme yap "Selenium"yaz
        submitButton.click();//gönder butonunu da test et
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//Bekleme
        WebElement message= driver.findElement(By.cssSelector("message"));//gödere tıkla diğer sayfaya geç mesajı göster
        String value= message.getText();//mesajı getir
        driver.quit();//sessionu sonlandır

    }

}
