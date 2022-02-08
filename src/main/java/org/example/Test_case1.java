package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

//Тест-кейс 1. Проверка пагинации в разделе новостей.

public class Test_case1
{
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

        WebElement webElement = driver.findElement(By.cssSelector("div.mainmenu-content > ul > li > a[href='/publikacii/'] > span > span "));
        webElement.click();
        driver.findElement(By.cssSelector("div.mainmenu-content > ul > li> ul > li> a[href = '/publikacii/novosti/']")).click();
        driver.findElement(By.cssSelector("#postlist > div.pagination.pagination__posts > ul > li.next > a")).click();
        driver.findElement(By.xpath("//*[@id='postlist']/div/ul/li/a[.='6']")).click();
        driver.findElement(By.xpath("//*[@id='postlist']/div/ul/li/a[.='←']")).click();
        driver.quit();

    }
}
