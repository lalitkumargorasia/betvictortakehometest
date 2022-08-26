package com.betvictor.pages;

import com.betvictor.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookies;

    @FindBy(xpath = "//label[@for='account_gender_male']")
    WebElement gender;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(name = "day")
    WebElement dayField;

    @FindBy(name = "month")
    WebElement monthField;

    @FindBy(name = "year")
    WebElement yearField;

    @FindBy(id = "phone_number")
    WebElement phoneField;

    @FindBy(xpath = "//span[@class='bvs-icon is-arrow-right  ']")
    WebElement rightArrowField;

    @FindBy(id ="account_country")
    WebElement countryField;

    @FindBy(xpath = "//span[@class='bvs-button-card cta__btn']")
    WebElement manualAddress;

    @FindBy(id = "address1")
    WebElement firstLineOfAddress;

    @FindBy(id = "address2")
    WebElement secondLineOfAddress;

    @FindBy(id = "address3")
    WebElement thirdLineOfAddress;

    @FindBy(id="postcode")
    WebElement postCode;

    @FindBy(id = "regpath_form_email_input")
    WebElement emailField;

    @FindBy(id ="password")
    WebElement passwordField;

   // @FindBy(id = "terms_privacy_policy")
   // @FindBy(xpath = "//button[@class='account-form__submit-button']")
    @FindBy(xpath = "//label[@class='account-form__checkbox'][@for='terms_privacy_policy']")
    WebElement termsAndConditionField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement createAccountField;

    @FindBy(xpath = "//span[@class='modal_title']")
    WebElement accountCreatedField;

    @FindBy(xpath = "//p[@class='offers-welcome-message']")
    WebElement welcomeField;




    public void clickOnCookies() {
        clickOnElement(acceptCookies);
        log.info("Getting text from : " + acceptCookies.toString());
    }

    public void clickOnGender(){
        clickOnElement(gender);
        log.info("Clicking on Gender : " + gender.toString());
    }

    public void clickOnFirstName(){
        sendTextToElement(firstName,"Lalit");
        log.info("Enter First Name : " + firstName.toString());
    }

    public void clickOnLastName(){
        sendTextToElement(lastName,"Patel");
        log.info("Enter Last Name : " + lastName.toString());
    }

    public void clickOnDay(){
        selectByVisibleTextFromDropDown(dayField,"15");
        log.info("Fill the Day Field : " + dayField.toString());
    }

    public void clickOnMonth(){
        selectByVisibleTextFromDropDown(monthField,"May");
        log.info("Fill the Month Field : " + monthField.toString());
    }

    public void clickOnyear(){
        selectByVisibleTextFromDropDown(yearField,"1988");
        log.info("Fill the year field : " + yearField.toString());
    }

    public void clickOnPhoneField(){
        sendTextToElement(phoneField,"07463878876");
        log.info("Fill the phone field : " + phoneField.toString());
    }

    public void clickOnRightArrow(){
        clickOnElement(rightArrowField);
        log.info("click on right arrow : " + rightArrowField.toString());
    }

    public void clickOnCountry(){
        selectByVisibleTextFromDropDown(countryField,"United Kingdom");
        log.info("Fill the country field : " + countryField.toString());
    }

    public void clickOnAddressSearch(){
        clickOnElement(manualAddress);
        log.info("click on Manual address : " + manualAddress.toString());
    }

    public void clickOnFirstLineAddress(){
        sendTextToElement(firstLineOfAddress,"12, Royal Cresent");
        log.info("Fill 1st line of address : " + firstLineOfAddress.toString());
    }

    public void clickOnSecondLineOfAddress(){
        sendTextToElement(secondLineOfAddress,"Harrow");
        log.info("Fill 2nd line of address : " + secondLineOfAddress.toString());
    }
    public void clickOnThirdLineOfAddress() {
        sendTextToElement(thirdLineOfAddress, "London");
        log.info("Fill 3rd line of address : " + thirdLineOfAddress.toString());
    }

    public void clickOnPostCode(){
        sendTextToElement(postCode,"HA29JK");
        log.info("Fill the post code: " + postCode.toString());
    }

    public void clickOnEmail(){
        sendTextToElement(emailField,"abcdo@gmail.com");
        log.info("Fill the email field : " + emailField.toString());
    }

    public void clickOnPassword(){
        sendTextToElement(passwordField,"Xyx_1234");
        log.info("Fill the password field : " + passwordField.toString());
    }

    public void clickOnTermsAndCondition(){
       // mouseHoverToElement(termsAndConditionField);
       clickOnElement(termsAndConditionField);
        log.info("Agree terms and condition : " + termsAndConditionField.toString());
    }

    public void clickOnCreateAccount() throws InterruptedException {
        clickOnElement(createAccountField);
        Thread.sleep(5000);
        log.info("Click on Create account : " + createAccountField.toString());
    }
    public String clickOnAccountCreated(){
        return getTextFromElement(accountCreatedField);
    }

    public String clickOnWelcomeMessage(){
        return getTextFromElement(welcomeField);
    }





}
