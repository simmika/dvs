import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@class='btn button1']")
    private WebElement prisijungtiButton;
    @FindBy(id = "appbarText")
    private WebElement logoText;

    public void fillUsernameFieldAsUser() {
        usernameField.sendKeys("petrauskas");
    }

    public void fillUsernameFieldAsAdmin() {
        usernameField.sendKeys("admin");
    }

    public void fillPasswordFieldAsUser() {
        passwordField.sendKeys("petrauskas");
    }

    public void fillPasswordFieldAsAdmin() {
        passwordField.sendKeys("admin");
    }

    public void clickPrisijungtiButton() {
        prisijungtiButton.click();
    }

    public String getLogoText() {
        return logoText.getText();
    }

    public void loginAsAdmin() {
        fillUsernameFieldAsAdmin();
        fillPasswordFieldAsAdmin();
        clickPrisijungtiButton();
    }

    public void loginAsUser() {

        fillUsernameFieldAsUser();
        fillPasswordFieldAsUser();
        clickPrisijungtiButton();
    }



}
// jej noresiu tikrint ar tikrai adminas: //nav[@id='mainnavbar']//*[text()[contains(.,'admin')]]