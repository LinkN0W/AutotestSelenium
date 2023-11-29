import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailMainPage {

    private WebDriver driver;
    public MailMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "#app-canvas > div > div.application-mail > div.application-mail__overlay.js-promo-id_new-toolbar > div > div.application-mail__layout.application-mail__layout_main > span > div.layout__column.layout__column_left > div.layout__column-wrapper > div > div > div > div:nth-child(1) > div > div > a")
    private WebElement buttonWriteMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")
    private WebElement inputReceiver;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div[1]/div[2]/div/input")
    private WebElement inputTopic;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div/div[2]/div[1]")
    private WebElement inputMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div/button")
    private WebElement buttonSend;

    void clickButtonWriteMessage(){
        buttonWriteMessage.click();
    }

    void inputReceiver(String receiver){
        inputReceiver.sendKeys(receiver);
    }

    void inputTopic(String topic){
        inputTopic.sendKeys(topic);
    }

    void inputMessage(String message){
        inputMessage.sendKeys(message);
    }

    void clickButtonSend(){
        buttonSend.click();
    }
}
