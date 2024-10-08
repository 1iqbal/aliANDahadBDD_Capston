package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class HomePage extends BaseSetup{

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
		@FindBy(xpath = "//a[text()='TEKSCHOOL']") public WebElement homePageTitleTEKSCHOOL;
		@FindBy(xpath = "//select[@id='search']") public WebElement allDepartmentsDropDownBtn;
		@FindBy(xpath = "//input[@id='searchInput']") public WebElement allDepartmentsSearchInput;
		@FindBy(xpath = "//button[@id='searchBtn']") public WebElement allDepartmentsSearchButton;
		@FindBy(linkText = "Sign in") public WebElement signInBtnHomepage;
		@FindBy(xpath = "") public WebElement all;

	}
	

	
	

