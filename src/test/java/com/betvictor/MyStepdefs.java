package com.betvictor;

import com.betvictor.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepdefs {
    @Given("^I am on the sign-up Homepage$")
    public void iAmOnTheSignUpHomepage() {
        new HomePage().clickOnCookies();
    }


    @When("^I complete personal details and click next$")
    public void iCompletePersonalDetailsAndClickNext() {
        new HomePage().clickOnGender();
        new HomePage().clickOnFirstName();
        new HomePage().clickOnLastName();
        new HomePage().clickOnDay();
        new HomePage().clickOnMonth();
        new HomePage().clickOnyear();
        new HomePage().clickOnPhoneField();
        new HomePage().clickOnRightArrow();

    }

    @And("^I complete address details and click next$")
    public void iCompleteAddressDetailsAndClickNext() {
        new HomePage().clickOnCountry();
        new HomePage().clickOnAddressSearch();
        new HomePage().clickOnFirstLineAddress();
        new HomePage().clickOnSecondLineOfAddress();
        new HomePage().clickOnThirdLineOfAddress();
        new HomePage().clickOnPostCode();
        new HomePage().clickOnRightArrow();
    }

    @And("^I complete details on account section and click on create account$")
    public void iCompleteDetailsOnAccountSectionAndClickOnCreateAccount() throws InterruptedException {
        new HomePage().clickOnEmail();
        new HomePage().clickOnPassword();
        new HomePage().clickOnTermsAndCondition();
        new HomePage().clickOnCreateAccount();
    }

    @Then("^I should see \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeAnd(String expected1, String expected2){
        String actualAccountCreated= new HomePage().clickOnAccountCreated();
        Assert.assertEquals(actualAccountCreated,expected1);

        String actualWelcomeMessageWithName = new HomePage().clickOnWelcomeMessage();
        String actualMessage = actualWelcomeMessageWithName.substring(0,32);
        System.out.println(actualMessage);
        Assert.assertEquals(expected2,actualMessage);

    }
}
