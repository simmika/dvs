import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NaujoDokumentoKurimasPage extends AbstractPage {
    public NaujoDokumentoKurimasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fa-cloud-upload-alt")
    private WebElement iconIkelti;
    @FindBy(id = "titleInput")
    private WebElement pavadinimasField;
    @FindBy(id = "typeInput")
    private WebElement dokmentoTipasSelect;
    @FindBy(id = "descInput")
    private WebElement aprasymasField;
    @FindBy(xpath = "//div[@class='form-group col-md-9 mt-4']//input")
    private WebElement pasirinktiFailusButton;
    @FindBy(xpath = "//button[@class='btn button1 my-4']")
    private WebElement issaugotiButton;
    @FindBy(xpath = "//h4[contains(text(),'Dokumentas sukurtas sėkmingai')]")
    private WebElement confirmMessage;


    public void clickIconIkelti() {
        iconIkelti.click();
    }

    public void typePavadinimas() {
        pavadinimasField.sendKeys(generateRandomString());
    }

    public void selectTestDocType() {
        Select dokmentoTipasSelect = new Select(this.dokmentoTipasSelect);
        dokmentoTipasSelect.selectByValue("test");
    }

    public void typeAprasymas() {
        aprasymasField.sendKeys("This is aprasymas of dokumentas");
    }

    public void uploadFile() {
        pasirinktiFailusButton.sendKeys("/Users/mt/Google Drive/AkademijaIT/AutoTest/EclipseIDE/Project/files/a.pdf");
    }

    public void clickIssaugoti() {
        issaugotiButton.click();
    }

    public boolean IsConfirmMessageDisplayed() {
        return confirmMessage.isDisplayed();
    }

    public String generateRandomString() {
        return "pav-" + RandomStringUtils.randomAlphabetic(5);
    }
}
