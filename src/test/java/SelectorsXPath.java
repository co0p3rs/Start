import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorsXPath {

    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
        SelectorsCss.pause(3);
        btnAbout.click();
        System.out.println(btnAbout.getText());
        System.out.println(btnAbout.getTagName());
        System.out.println(btnAbout.isEnabled());
        System.out.println(btnAbout.isDisplayed());
        WebElement btnLoginHeader = driver.findElement(By.xpath("//*[text() = 'LOGIN']"));
        btnLoginHeader.click();
        WebElement inputEmail = driver.findElement(By.xpath("//form/input[contains(@name, 'em')]"));
        int i = new Random().nextInt(1000); // 0 - 999
        String email = "new_bobs_email"+i+"@mail.com"; // new_bobs_email123@mail.com
        inputEmail.sendKeys(email);
        WebElement inputPassword = driver.findElement(By.xpath("//form/input[last()]"));
        inputPassword.sendKeys("Password123!");
        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(0).getText());
        System.out.println(buttons.get(1).getText());
        SelectorsCss.pause(3);
        buttons.get(1).click();
        SelectorsCss.pause(5);
        WebElement btnSignOut = driver.findElement(By.xpath("//*[contains(text(),'Out')]"));
        SelectorsCss.pause(3);
        btnSignOut.click();
        SelectorsCss.pause(3);
        driver.close(); // close window
        // driver.quit(); // close browser
    }

    @Test
    public void iLcarroTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        SelectorsCss.pause(5);
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login?url=%2Fsearch']"));
        btnLogin.click();
        SelectorsCss.pause(5);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@type='email']"));
        inputEmail.sendKeys("tetest@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("Qwerty123!");
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();
        SelectorsCss.pause(5);
        WebElement btnOk = driver.findElement(By.xpath("//button[@class='positive-button ng-star-inserted']"));
        btnOk.click();
        SelectorsCss.pause(5);
        driver.quit();
    }
}