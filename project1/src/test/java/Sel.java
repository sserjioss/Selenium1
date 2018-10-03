import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.className("gsfi"));
        element.sendKeys("qalight");
        element.submit();
        element.click();
        //element.sendKeys(Keys.ENTER);

    }
}
