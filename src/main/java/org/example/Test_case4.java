package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

//Тест-кейс 4. Удаление товара из корзины.

public class Test_case4 {
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.trxtraining.ru/");

        driver.findElement(By.cssSelector("a > i.fa.fa-user-circle")).click();
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).sendKeys("dmitry.yand2.mail@yandex.ru");
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys("TRXtest1");
        driver.findElement(By.xpath(".//*[@id='login_form']/div/input[@name='commit']")).click();
        driver.findElement(By.cssSelector(".mini-cart > a")).click();
        try {
            driver.findElement(By.cssSelector(".remove-cart-item-text")).click();
        }catch (NoSuchElementException e){
            System.out.println("Что бы удалить товар из корзины, необходимо его сначала туда добавить!\n"+
                    "Выполни тест-кейс № 3!");
        }
        driver.quit();

    }
}
