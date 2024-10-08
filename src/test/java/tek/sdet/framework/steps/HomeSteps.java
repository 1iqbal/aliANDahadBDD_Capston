package tek.sdet.framework.steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

    private POMFactory factory = new POMFactory();

    @Given("User is on retail website")
    public void userIsOnRetailWebsite() {
        // String atualTitle = factory.homePage().tekSchoolLogo.getText();
        String atualTitle = getTitle();
        String expectedTitle = "React App";
        Assert.assertEquals(atualTitle, expectedTitle);
        Assert.assertTrue(isElementDisplayed(factory.homePage().homePageTitleTEKSCHOOL));
        logger.info("User is on Retail Website");
        logger.info("Atual Title " + atualTitle + " Equals " + " Expected Title " + expectedTitle);
    }}