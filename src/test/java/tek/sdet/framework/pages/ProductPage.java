package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class ProductPage extends BaseSetup {

    public ProductPage(){
        PageFactory.initElements(getDriver(), this);
    }
}
