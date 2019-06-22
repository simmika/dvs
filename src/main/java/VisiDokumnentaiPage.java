import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisiDokumnentaiPage extends AbstractPage {
    public VisiDokumnentaiPage(WebDriver driver) {
        super(driver);
    }

    private String lastDocumentTitleString;

    @FindBy(xpath = "//a[contains(text(),'Sukurti dokumentai')]")
    private WebElement sukurtiDokumnetaiButton;
    @FindBy(xpath = "//li[@class='next']//preceding::li[1]")
    private WebElement lastDocumentTittle;
    @FindBy(xpath = "//a[contains(text(),'Pateikti dokumentai')]")
    private WebElement pateiktiDokumentaiButton;
    @FindBy(xpath = "//tr[1]//a[1]")
    private WebElement detaliauButton;
    @FindBy(xpath = "//button[@class='btn mr-4 button1']")
    private WebElement pateiktiButton;
    @FindBy(xpath = "//i[@class='fa fw fa-home']")
    private WebElement homeIcon;
    @FindBy(xpath = "//a[contains(text(),'Dokumentai tvirtinimui')]")
    private WebElement dokumentaiTvirtinimuiButton;
    @FindBy(xpath = "//button[@class='btn button1 mr-5']")
    private WebElement patvirtintiButton;
    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement exitButton;
    @FindBy(xpath = "//a[contains(text(),'Patvirtinti dokumentai')]")
    private WebElement patvirtintiDokumentaiButton;
    @FindBy(xpath = "//button[@class='btn btn-danger buttonReject mr-5']")
    private WebElement atmestiButton;
    @FindBy(xpath = "//a[contains(text(),'Atmesti dokumentai')]")
    private WebElement atmestiDokumentaiButton;

    public void clickSukurtiDokumentai() {
        sukurtiDokumnetaiButton.click();
    }

    public void copyLastDocumentTitle() {
        lastDocumentTitleString = lastDocumentTittle.getText();
    }

    public void clickDetaliau() {
        detaliauButton.click();
    }

    public void clickPateikti() {
        pateiktiButton.click();
    }

    public void clickPateiktiDokumentai() {
        pateiktiDokumentaiButton.click();
    }

    public void clickHomeIcon() {
        homeIcon.click();
    }

    public WebElement getLastDocumentTittle() {
        return lastDocumentTittle;
    }

    public String pasteLastDocumentTittle() {
        return lastDocumentTitleString;
    }

    public void clickDokumentaiTvirtinimui() {
        dokumentaiTvirtinimuiButton.click();
    }

    public void clickPatvirtinti() {
        patvirtintiButton.click();
    }

    public void clickExit() {
        exitButton.click();
    }

    public void clickPatvirtintiDokumentai() {
        patvirtintiDokumentaiButton.click();
    }

    public void clickAtmesti() {
        atmestiButton.click();
    }
public void clickAtmestiDokumentai() {
        atmestiDokumentaiButton.click();
}
}
// info: //tr[1]//preceding-sibling::td