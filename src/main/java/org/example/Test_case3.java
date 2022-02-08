package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

//Тест-кейс 3. Добавление товара в корзину.

public class Test_case3 {
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.trxtraining.ru/");

        driver.findElement(By.cssSelector("a > i.fa.fa-user-circle")).click();
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).sendKeys("dmitry.yand2.mail@yandex.ru");
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys("TRXtest1");
        driver.findElement(By.xpath(".//*[@id='login_form']/div/input[@name='commit']")).click();
        driver.findElement(By.cssSelector("div.mainmenu-content > ul > li > a[href='/shop/'] > span > span ")).click();
        driver.findElement(By.cssSelector("div.mainmenu-content > ul > li> ul > li> a[href = '/shop/aksessuary/']")).click();
        driver.findElement(By.xpath(".//div[@data-sorting='1TRX Шейкер']/div/div[@class='prod-img compare']/a/img")).click();
        driver.findElement(By.xpath("//*[@id='pdp-carousel-indicators']/div/div/li[@aria-describedby='slick-slide11']/img")).click();
        driver.findElement(By.id("add-to-cart")).click();
        driver.findElement(By.cssSelector(".okay")).click();
        driver.findElement(By.cssSelector("div.subelement.menu-rightsection.mini-cart > a")).click();
        driver.quit();

    }
}
