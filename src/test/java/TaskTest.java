import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TaskTest {

    static MailEnterPage mailEnterPage;
    static MailMainPage mailMainPage;

    static String login;
    static String password;


    static String topic;
    static String message;

    static String receiver;

    @BeforeAll
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver", ConfigurationTest.getProperty("chrome_driver"));
        WebDriver driver = new ChromeDriver();

        mailEnterPage = new MailEnterPage(driver);
        mailMainPage = new MailMainPage(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationTest.getProperty("mailEnterPage"));

        login = "test_zhigarev";

        password = "zverva50Zovodskay";

        receiver = "dokuchaev_av@tkbbank.ru";

        topic = "Тестовое задание Жигарев";

        message = "Добрый день \n"+
                "Жигарев Никита Сергеевич\n" +
                "Автотест готов";
    }


    @Test
    public void loginTest(){
        mailEnterPage.clickButtonLogin();
        mailEnterPage.inputLogin(login);
        mailEnterPage.clickButtonLogin();
        mailEnterPage.inputPassword(password);
        mailEnterPage.clickButtonPassword();
    }

    @Test
    public void messageTest(){
        mailMainPage.clickButtonWriteMessage();
        mailMainPage.inputTopic(topic);
        mailMainPage.inputReceiver(receiver);
        mailMainPage.inputMessage(message);
        mailMainPage.clickButtonSend();
    }
}
