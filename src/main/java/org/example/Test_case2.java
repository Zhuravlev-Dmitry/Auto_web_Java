package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

//Тест-кейс 2. Вывод сообщения о дубликате при повторной регистрации.

public class Test_case2 {

    public static void main( String[] args ) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.trxtraining.ru/");

        driver.findElement(By.cssSelector(".fa-user-circle")).click();
        driver.findElement(By.id("field_lname")).click();
        driver.findElement(By.id("field_lname")).sendKeys("Лутохин");
        driver.findElement(By.id("field_fname")).click();
        driver.findElement(By.id("field_fname")).sendKeys("Дмитрий");
        driver.findElement(By.id("field_father_name")).click();
        driver.findElement(By.id("field_father_name")).sendKeys("Анатольевич");
        driver.findElement(By.xpath("//input[@id='field_phone']")).click();
        driver.findElement(By.xpath("//input[@id='field_phone']")).sendKeys("+7 (910) 234-93-75");
        driver.findElement(By.cssSelector("input#email")).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("dmitry.yand2.mail@yandex.ru");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("TRXtest1");
        driver.findElement(By.id("password_confirm")).click();
        driver.findElement(By.id("password_confirm")).sendKeys("TRXtest1");
        driver.findElement(By.cssSelector(".sign-up-submit > .btn")).click();

        List<WebElement> massage = driver.findElements(By.xpath("//*[@id='registrate_form']/div/div/div/ul/li[2]"));
        massage.isEmpty();
        driver.quit();

    }
}
