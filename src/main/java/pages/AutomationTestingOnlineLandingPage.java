package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTestingOnlineLandingPage {

    WebDriver driver;

    By letMeHackButton = By.xpath("(//button[contains(text(),'hack')])");

    public AutomationTestingOnlineLandingPage(WebDriver driver){
        this.driver = driver;
    }
    
    //Click on Let Me Hack button
    public void clickLetMeHackButton() {
            driver.findElement(letMeHackButton).click();
    }
}
