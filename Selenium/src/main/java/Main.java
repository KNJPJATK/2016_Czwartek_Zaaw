import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rpi on 10.11.16.
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("http://www.google.pl");

        WebElement searchElement =
                webDriver.findElement(
                        By.xpath("//div/input[@name='q']"));

        searchElement.sendKeys("Kolo java pjatk");
        searchElement.submit();

        new WebDriverWait(webDriver, 10).until(
                new ExpectedCondition<Boolean>() {

                    public Boolean apply(WebDriver webDriver) {
                        return webDriver.getTitle()
                                .toLowerCase().contains("kolo java");
                    }
                });

        WebElement firstLinkElement =
                webDriver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a"));
        firstLinkElement.click();

        new WebDriverWait(webDriver, 10).until(
                new ExpectedCondition<Boolean>() {

                    public Boolean apply(WebDriver webDriver) {
                        return webDriver.findElement(By.xpath(
                                ".//*[@id='course_menu']/li[1]/a"
                        )) != null;
                    }
                }
        );

        webDriver.quit();

    }

    private static boolean isNegative(int number) {
        String s = Integer.toString(number);
        return s.startsWith("-");
    }

    private static boolean isNegative2(int number) {

        return -1 * number >  0;
    }

    private static boolean isNegative3(int number) {
        String s = Integer.toString(number);
        return s.charAt(0) == '-';
    }

    private static boolean isEven(int number) {
        return ((number & 1) == 0);// ?  false :  true;
    }

}
