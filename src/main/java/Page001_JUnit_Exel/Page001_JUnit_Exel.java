package Page001_JUnit_Exel;

import ExcelUtils.ExcelUtil;
import dev.failsafe.internal.util.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page001_JUnit_Exel {
    private WebDriver driver = null;

    @Before
    public void usersNavigatesToPage() {
        System.setProperty("WebDriver.firefox.driver", "C:\\Users\\admin\\Testing 101\\Selenium\\Gecko Drivers\\geckodriver.exe\"");
        driver= new FirefoxDriver();
        driver.get("https://autotest.intelliscient.co.za/P-001.php");
    }

    @Test
    public void allFieldsAreEntered() {
        driver.findElement(By.name("first_name")).sendKeys("Goldstain");
        driver.findElement(By.name("phno")).sendKeys("0671152255");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/form/label[3]/input")).click();

        String output = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/p")).getText();
        System.out.println(output);
        org.junit.Assert.assertEquals("Registered", output);

    }

    @Test
    public void userEntersOnlyPhoneNumber() {
        driver.findElement(By.name("phno")).sendKeys("0671152255");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/form/label[3]/input")).click();

        String output = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/p")).getText();
        System.out.println(output);
        org.junit.Assert.assertEquals("Not Registered", output);
    }

    @Test
    public void userKeepsTheNameFieldBlank() {
        driver.findElement(By.name("first_name")).sendKeys(" ");

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/form/label[3]/input")).click();

        String output = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/p")).getText();
        System.out.println(output);
        org.junit.Assert.assertEquals("Not Registered", output);
    }

    @Test
    public void userKeepsThePhoneNumberFieldBlank() {
        driver.findElement(By.name("first_name")).sendKeys("Goldstain");
        driver.findElement(By.name("phno")).sendKeys(" ");

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/form/label[3]/input")).click();

        String output = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/p")).getText();
        System.out.println(output);
        org.junit.Assert.assertEquals("Not Registered", output);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
