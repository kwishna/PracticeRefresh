package Tools;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Selenium {

    /**
     * Wait For All The Images To Get Loaded. Validated Using JavaScript By
     * Calculating Length And Width Of Each Image.
     *
     * @param driver
     *            {@link WebDriver} Instance
     */
    public static void waitUntilAllTheImagesCompletelyLoaded(WebDriver driver, long timeOutInSeconds) {

        System.out.println(":: Waiting For All the Images To Load Completely!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));

        List<WebElement> allImages = driver.findElements(By.tagName("img"));

        for (WebElement e : allImages) {

            try {
                wait.until(d -> ((JavascriptExecutor) d).executeScript(
                        "return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0",
                        e));

            } catch (Exception e1) {

                System.err.println(":: Timout While Waiting For All Images To Loads In 30 Seconds");
            }
        }
    }


    /**
     * Get {@link WebElement} From Xpath Or Css Locator
     *
     * @param driver
     *            {@link WebDriver} Driver Instance
     * @param locator
     *            {@link String} Xpath Or Css
     */
    public static WebElement getWebElement(WebDriver driver, String locator) {

        locator = getValidLocator(locator);

        WebElement element = null;

        if (thisIsCss(locator)) {

            element = driver.findElement(By.cssSelector(locator));

        } else {

            element = driver.findElement(By.xpath(locator));
        }

        return element;
    }

    /**
     *
     * @param driver
     * @param locator
     * @return By
     */
    public static By getWebElementBy(WebDriver driver, String locator) {

        locator = getValidLocator(locator);

        By by = null;

        if (thisIsCss(locator)) {

            by = By.cssSelector(locator);

        } else {

            by = By.xpath(locator);
        }

        return by;
    }

    /**
     * For Internal Use Only in Util. To Remove suffix in Locator.
     *
     * @param locator
     *            {@link String} cssSelector Or Xpath
     * @return Valid Css Or Xpath (Removing css: And xpath:)
     */
    public static String getValidLocator(String locator) {

        if (locator.startsWith("css:")) {

            locator = locator.replace("css:", "");
        }

        else if (locator.startsWith("xpath:")) {

            locator = locator.replace("xpath:", "");
        }

        else {

        }

        return locator;
    }

    /**
     * Checks If It Is Xpath Or A Css
     *
     * @param locator
     *            {@link String} Xpath Or CSS Locator
     * @return {@link Boolean} Returns True If Syntax Matches With Xpath Else
     *         Returns False.
     */
    private static boolean thisIsCss(String locator) {

        locator = getValidLocator(locator);

        if (locator.substring(0, 2).contains("//") || locator.substring(0, 2).contains("/")) {

            return false;

        } else {

            return true;
        }
    }

    /** ------------------ Add Custom Text To Report For A Step --------------- */

    public static void addTextInReport(String message, String... title) {

        if (title.length > 0 && title[0] != "") {

            Serenity.recordReportData().withTitle(title[0] + "_" + getTimeStamp()).andContents(message);

        } else {

            Serenity.recordReportData().withTitle("Error_" + getTimeStamp()).andContents(message);
        }
    }


    /**
     * String Time-stamp In Format dd_MM_yyyy_HH_mm_ss_SSS
     *
     * @return {@link String} dd_MM_yyyy_HH_mm_ss_SSS format
     */
    public static String getTimeStamp() {

        return "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss_SSS"));
    }
}
