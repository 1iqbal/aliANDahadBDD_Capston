package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class AccountPage extends BaseSetup{

	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(className = "account__personal-title") public WebElement loginBtn;
	@FindBy(className = "account__information-email") public WebElement emailInput;
	@FindBy(xpath = "//div[@class='Toastify']") public WebElement passwordInput;
	@FindBy(className = "account__information-username") public WebElement signInBtn;


}
