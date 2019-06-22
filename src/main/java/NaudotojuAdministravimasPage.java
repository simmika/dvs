import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NaudotojuAdministravimasPage extends AbstractPage {
    public NaudotojuAdministravimasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "fa-users")
    private WebElement iconNaudotojai;
    @FindBy(xpath = "//button[@class='btn btn-outline-info my--2 my-sm-0 buttonXL1 button1']")
    private WebElement registruotiNaujaNaudotojaButton;
    @FindBy(xpath = "//div[@id='newUserModal']//input[@name=\"firstname\"]")
    private WebElement vardasField;
    @FindBy(xpath = "//div[@id='newUserModal']//input[@name=\"lastname\"]")
    private WebElement pavardeField;
    @FindBy(xpath = "//div[@id='newUserModal']//input[@name=\"username\"]")
    private WebElement naudotojoVardasField;
    @FindBy(xpath = "//div[@id='newUserModal']//input[@name=\"password\"]")
    private WebElement slaptazodisField;
    @FindBy(xpath = "//div[@id='newUserModal']//div[@class='modal-content']//div[@class='modal-body']//div//button[@class='btn button1 my-4'][contains(text(),'Išsaugoti')]")
    private WebElement issaugotiButton;
    @FindBy(xpath = "//div[@id=\'userListTable\']//td[contains(text(),\'qw\')][1]")
    private WebElement usernameFromTable;
    @FindBy(xpath = "//div[@id=\'userListTable\']//td[2]")
    private WebElement VardasFromTable;
    @FindBy(xpath = "//button[contains(text(),'Grup')]")
    WebElement grupesButton;
    @FindBy(xpath = "//tr[2]//td[2]//button[1]")
    private WebElement grupesElementNepriklauso;
    @FindBy(xpath = "//tr[2]//td[1]")
    private WebElement grupesElementPriklauso;
    @FindBy(xpath = "//tr[2]//td[3]")
     WebElement groupName;
    @FindBy(xpath = "//div[@id='editUserGroupsModal']//button[@class='close'][contains(text(),'×')]")
    private WebElement closePopupButton;
    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement naudotojoGrupesField;

    private String randomUsername = "userNumber" + Math.round(Math.random() * 1000);
    private String groupNameText;

    public void clickIconNaudotojai() {
        iconNaudotojai.click();
    }

    public void clickRegistruotiNaujaNaudotojaButton() {
        registruotiNaujaNaudotojaButton.click();
    }

    public void fillVardasField() {
        vardasField.sendKeys("ThisIsName");
    }

    public void fillPavardeField() {
        pavardeField.sendKeys("pavarde");
    }

    public void fillNaudotojoVardasField() {
        naudotojoVardasField.sendKeys(randomUsername);
    }

    public void fillSlaptazodisField() {
        slaptazodisField.sendKeys("password");
    }

    public void clickIssaugotiButton() {
        issaugotiButton.click();
    }

    public String checkOrRegistered() {
        return VardasFromTable.getText();
    }

    public void clickGrupesButton() {
        grupesButton.click();
    }

    public void copyGroupName() {
        groupNameText = groupName.getText();
    }

    public String pasteGroupName() {
        return groupNameText;
    }

    public void clickGrupesElement() {
        grupesElementNepriklauso.click();
    }

    public void closePopup() {
        closePopupButton.click();
    }

    public String getNaudotojoGrupesFieldText() {
        return naudotojoGrupesField.getText();
    }

}
