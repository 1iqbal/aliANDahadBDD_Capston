package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class SignInPage extends BaseSetup {

    public SignInPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "login__subtitle") public WebElement loginBtn;
    @FindBy(name = "email") public WebElement emailInput;
    @FindBy(name = "password") public WebElement passwordInput;
    @FindBy(id = "loginBtn") public WebElement signInBtn;
    @FindBy(className = "error") public WebElement errorMessage;
    @FindBy(id = "newAccountBtn") public WebElement newACbutton;


    }

