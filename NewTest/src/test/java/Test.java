import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) {
        MainPageMail mainPageMail;
        WebDriver driver;
        Autorisation autorisation;
        SentMessage sentMessage;
        mainPageMail=new MainPageMail();
        driver = new ChromeDriver();
        autorisation = new Autorisation(driver);
        sentMessage= new SentMessage(driver);
        driver.get(mainPageMail.OpenMainPage());
        autorisation.Autorise("test_selenium_work2","test4815162342");
        sentMessage.clickWrite("sss@mail.ru","Тема","Необходимо ввести текст сообщения");

    }
}