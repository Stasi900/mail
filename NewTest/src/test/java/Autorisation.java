import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Autorisation {

	WebDriver driver;
	@FindBy(id="mailbox__login")
	WebElement userName;
	
	@FindBy(id="mailbox__password")
	WebElement password;
	
	@FindBy(id="mailbox__auth__button")
	WebElement login;
	
	public Autorisation(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String strUserName){
		userName.sendKeys(strUserName);		
	}
	
	public void setPassword(String strPassword){
	password.sendKeys(strPassword);
	}
	
	public void clickLogin(){
			login.click();
	}

	public void Autorise(String strUserName,String strPasword){
		Assert.assertEquals(driver.getTitle(),"Mail.Ru: �����, ����� � ���������, �������, ����");
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();

	}
}
