package qa.nhs.com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.nhs.com.driver.DriverFactory;

public class SearchPageObject extends DriverFactory {
    @FindBy(id = "next-button")
    private WebElement startBtn;

    @FindBy(linkText = "Check if you can get help with health costs")
    private WebElement footer;

    @FindBy(css = "#label-wales")
    private WebElement countryRadioBtn;

    @FindBy(id = "next-button")
    private WebElement nxtBtn;

    @FindBy(id = "dob-day")
    private WebElement dayChkBox;

    @FindBy(id = "dob-month")
    private WebElement monthChkBox;

    @FindBy(id = "dob-year")
    private WebElement yearChkBox;

    @FindBy(id = "label-yes")
    private WebElement yesBtn;

    @FindBy(id = "label-no")
    private WebElement noBtn;

    @FindBy(id ="result-heading")
    private WebElement resultHeader;


    public void setSearchMethod() {
        startBtn.click();
        footer.click();
        startBtn.click();
        //Which country do you live in?
        countryRadioBtn.click();
        nxtBtn.click();

    }

    //What is your date of birth?
    public void enterDOB() {
        dayChkBox.sendKeys("02");
        monthChkBox.sendKeys("03");
        yearChkBox.sendKeys("1983");
        nxtBtn.click();
    }

    //Do you live with a partner?
    public void liveWithPartner() {
        yesBtn.click();
        nxtBtn.click();
    }

    //Do you or your partner claim any benefits or tax credits?
    public void partnerClaimAnyBenefits() {
        noBtn.click();
        nxtBtn.click();
    }

    //Are you pregnant or have you given birth in the last 12 months?
    public void givenBirthInLast12Mounts() {
        noBtn.click();
        nxtBtn.click();
    }

    //Do you have an injury or illness caused by serving in the armed forces?
    public void injuryOrIllness() {
        noBtn.click();
        nxtBtn.click();
    }

    //Do you have diabetes?
    public void diabetes() {
        noBtn.click();
        nxtBtn.click();
    }

    //Do you have glaucoma?
    public void glacoma() {
        noBtn.click();
        nxtBtn.click();
    }

    //Do you or your partner live permanently in a care home?
    public void partnerLivePermanentlyInCareHome() {
        noBtn.click();
        nxtBtn.click();
    }

    //Do you and your partner have more than £16,000 in savings, investments or property?
    public void partnerHaveMoreThan£16000() {
        noBtn.click();
        nxtBtn.click();
    }

    //Validating the end result
    public String setResultHeader()
    {
        return resultHeader.getText();
    }



}
