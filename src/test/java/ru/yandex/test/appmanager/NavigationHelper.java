package ru.yandex.test.appmanager;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Перейти в раздел ноутбуки")
    public void gotoNotebooks() {
        driver.get(driver.findElement(By.xpath("//div//a[child::span='" + /*cat*/"Компьютерная техника"  + "']")).getAttribute("href"));
        driver.get(driver.findElement(By.xpath("//a[.='" + /*type*/"Ноутбуки" + "']")).getAttribute("href"));
        ScreenshotHelper.makeScreenshot(driver);
    }

    @Step("Открыть страницу товара {product}")
    public void openSummary(WebElement product) {

        driver.get(product.findElement(By.xpath("./div[contains(@class, 'card2__part_type_center')]//a[contains(@class, 'link n-link')]")).getAttribute("href"));
        ScreenshotHelper.makeScreenshot(driver);

    }


    @Step("Перейти в раздел Характеристики")
    public void gotoPreferences(){
        driver.get(driver.findElement(By.xpath("//a[.='Характеристики']")).getAttribute("href"));
        ScreenshotHelper.makeScreenshot(driver);

    }

    @Step("Перейти на главную страницу")
    public void gotoMainPage() {
        driver.get("http://market.yandex.ru");
        ScreenshotHelper.makeScreenshot(driver);
    }
}
