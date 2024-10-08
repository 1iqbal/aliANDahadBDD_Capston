package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class SignUpPage extends BaseSetup {

    public SignUpPage(){
        PageFactory.initElements(getDriver(), this);
    }
}
