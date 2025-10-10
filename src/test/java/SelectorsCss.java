import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {

    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        System.out.println(btnAbout.getText());
        WebElement btnLogin = driver.findElement(
                By.cssSelector("div[id='root'] a:last-child"));
        btnLogin.click();
        //======================================
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("dmytro.podoprygora95@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("*[placeholder='Password']"));
        inputPassword.sendKeys("qweRTY123$");
        WebElement btnLoginForm = driver.findElement(By.cssSelector("form>button[name='login']"));
        btnLoginForm.click();
        pause(3);
        driver.quit();
    }

    @Test
    public void iLcarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");

        WebElement btnLogin = driver.findElement(By.cssSelector("a[href*='login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.cssSelector("input[id='email']"));
        inputEmail.sendKeys("dima.podoprigora5@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[type='password']"));
        inputPassword.sendKeys("Qwerty123!");
        WebElement btnLoginForm = driver.findElement(By.cssSelector("button[type='submit']"));
        btnLoginForm.click();
        pause(5);
        driver.quit();
    }

    static void pause(int time){
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
