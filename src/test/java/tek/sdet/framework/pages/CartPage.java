package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class CartPage extends BaseSetup {

    public CartPage(){
        PageFactory.initElements(getDriver(), this);


    }
}
