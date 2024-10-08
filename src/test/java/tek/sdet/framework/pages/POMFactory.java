package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private AccountPage accountPage;
	private HomePage homePage;
	private CartPage cartPage;
	private ProductPage productPage;
	private SignInPage signInPage;
	private SignUpPage signUpPage;
	
	public POMFactory() {
		this.accountPage = new AccountPage();
		this.homePage = new HomePage();
		this.cartPage = new CartPage();
		this.productPage = new ProductPage();
		this.signInPage = new SignInPage();
		this.signUpPage = new SignUpPage();
	}
	
	
	public AccountPage accountPage() {
		return this.accountPage;
	}
	public HomePage homePage() { return this.homePage; }
	public CartPage cartPage() { return this.cartPage; }
	public ProductPage productPage() { return this.productPage; }
	public SignInPage signInPage(){ return this.signInPage; }
	public SignUpPage signUpPage(){ return this.signUpPage; }

	
}
