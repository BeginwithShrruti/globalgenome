package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ParticipantCreatePage {

    WebDriver driver;
    public ParticipantCreatePage(WebDriver driver)
    {
        this.driver = driver;
        this.driver.get("https://test.globalgenome.com/participant/create");
    }


    @FindBy(how = How.ID, using="first_name")
    WebElement firstNameField;

    @FindBy(how = How.ID, using="last_name")
    WebElement lastNameField;

    @FindBy(how = How.ID, using="mobile")
    WebElement mobileField;

    @FindBy(how = How.ID, using="email")
    WebElement emailField;

    @FindBy(how = How.XPATH, using="//input[@type='text' and @name='dateofbirth']")
    WebElement dateOfBirthSelectionField;

    @FindBy(how = How.XPATH, using="//span[@class='select2-selection select2-selection--single' and @aria-labelledby='select2-gender-container']")
    WebElement genderSelectionField;

    @FindBy(how = How.XPATH, using="//input[@type='text' and @name='native_city']")
    WebElement nativeCityField;

    @FindBy(how = How.XPATH, using="//span[@class='select2-selection select2-selection--single' and @aria-labelledby='select2-mother_tongue-container']")
    WebElement motherTongueField;

    @FindBy(how = How.XPATH, using="//span[@id='recaptcha-anchor' and @role='checkbox']")
    WebElement captchaCheckbox;

    @FindBy(how = How.XPATH, using="//button[@type='submit' and @value='Submit']")
    WebElement submitButton;


    // Error validation for the field using webElement
    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='diseases-box-custom-error' and @style='display: block;']")
    WebElement diseaseErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='native_city-error' and @style='display: block;']")
    WebElement nativeCityErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='first_name-error' and @style='display: block;']")
    WebElement firstNameErrorFieldVisible;
    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='last_name-error' and @style='display: block;']")
    WebElement lastNameErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='mobile-error' and @style='display: block;']")
    WebElement mobileErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='email-error' and @style='display: block;']")
    WebElement emailErrorFieldVisible;
    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='dateofbirth-error' and @style='display: block;']")
    WebElement dobErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='gender-error' and @style='display: block;']")
    WebElement genderErrorFieldVisible;

    @FindBy(how = How.XPATH, using="//div[ @class='error' and @id='mother_tongue-error' and @style='display: block;']")
    WebElement motherTongueErrorFieldVisible;

    public void selectDiseases(List<String> diseaseNames)
    {
        for(String diseaseName : diseaseNames)
        {
           driver.findElement(By.xpath("//li[@class='select2-results__option' and text()='"+diseaseName+"']")).click();
        }
    }

    public void setFirstNameField(String firstName)
    {
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName)
    {
        lastNameField.sendKeys(lastName);
    }

    public void setMobileField(String phoneNumber)
    {
        mobileField.sendKeys(phoneNumber);
    }

    public void setEmailField(String emailID)
    {
        emailField.sendKeys(emailID);
    }

    public void setGenderSelectionField(String gender)
    {
        genderSelectionField.click();
        driver.findElement(By.xpath("//ul[ @id='select2-gender-results' and @role='listbox']/li[text()='"+ gender + "']")).click();
    }

    public void setNativeCityField(String nativeCity)
    {
        nativeCityField.sendKeys(nativeCity);
        driver.findElements(By.xpath("//ul[@class='typeahead dropdown-menu']/li/a")).get(0).click();
    }

    public void setMotherTongueField(String language)
    {
        motherTongueField.click();
        driver.findElement(By.xpath("//ul[ @id='select2-mother_tongue-results' and @role='listbox']/li[text()='"+ language + "']")).click();
    }

    public void setCaptchaCheckbox()
    {
        captchaCheckbox.click();
    }

    public void submitForm()
    {
        submitButton.click();
    }

    public void dateSelect(String year, String month, String day){
        dateOfBirthSelectionField.click();
        driver.findElement(By.xpath("//span[@class='year' and text()='" + year +"']")).click();

        driver.findElement(By.xpath("//span[@class='month' and text()='" + month +"']")).click();

        driver.findElement(By.xpath("//td[@class='day' and text()='" + day +"']")).click();
    }



    // Error field get value
    public WebElement getDiseaseErrorFieldVisible()
    {
        return diseaseErrorFieldVisible;
    }

    public WebElement getNativeCityErrorFieldVisible()
    {
        return nativeCityErrorFieldVisible;
    }

    public WebElement getFirstNameErrorFieldVisible()
    {
        return firstNameErrorFieldVisible;
    }

    public WebElement getLastNameErrorFieldVisible()
    {
        return lastNameErrorFieldVisible;
    }
    public WebElement getMobileErrorFieldVisible()
    {
        return mobileErrorFieldVisible;
    }

    public WebElement getEmailErrorFieldVisible()
    {
        return emailErrorFieldVisible;
    }

    public WebElement getDobErrorFieldVisible()
    {
        return dobErrorFieldVisible;
    }

    public WebElement getGenderErrorFieldVisible()
    {
        return genderErrorFieldVisible;
    }

    public WebElement getMotherTongueErrorFieldVisible()
    {
        return motherTongueErrorFieldVisible;
    }



}
