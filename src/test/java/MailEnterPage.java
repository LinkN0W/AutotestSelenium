import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailEnterPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
    private WebElement inputLogin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/form/div[2]/div[2]/div[3]/div/div/div[1]/button")
    private WebElement buttonLogin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div[2]/div/div/div/div/div/input")
    private WebElement inputPassword;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div[3]/div/div/div[1]/div/button")
    private WebElement buttonPassword;

    public MailEnterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void inputLogin(String login){
        inputLogin.sendKeys(login);
    }

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    public void inputPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void clickButtonPassword(){
        buttonPassword.click();
    }





}
