package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ParticipantCreatePage;

import java.util.ArrayList;
import java.util.List;

public class GlobalGenomeTest extends TestBase{

    ParticipantCreatePage participantCreatePage ;
    @BeforeTest
    public void callParticipantPage()
    {
      participantCreatePage = PageFactory.initElements(driver, ParticipantCreatePage.class);
    }

    @Test
    public void formInputTest() throws InterruptedException
    {

        participantCreatePage.setFirstNameField("Shruti");

        participantCreatePage.setLastNameField("Dixit");

        participantCreatePage.setMobileField("9654900585");

        participantCreatePage.setEmailField("lang4shruti@gmail.com");

        participantCreatePage.dateSelect("2000", "Jan", "5");

        participantCreatePage.setGenderSelectionField("Female");

        participantCreatePage.setNativeCityField("Kanpur");

        participantCreatePage.setMotherTongueField("Hindi");

        List<String> diseaseList = new ArrayList<>();
        diseaseList.add("Hypertension");
        diseaseList.add("Diabetes mellitus");
        diseaseList.add("Tuberculosis");
        diseaseList.add("Hypothyroidism");
        participantCreatePage.selectDiseases(diseaseList);

        participantCreatePage.setCaptchaCheckbox();

    }

    @Test
    public void verifyErrorMessageTest()
    {
        participantCreatePage.submitForm();
        Assert.assertEquals("Please enter your First Name", participantCreatePage.getFirstNameErrorFieldVisible().getText());

        Assert.assertEquals("Please enter your Last Name or Family Name", participantCreatePage.getLastNameErrorFieldVisible().getText());

        Assert.assertEquals("Please enter your Mobile Number", participantCreatePage.getMobileErrorFieldVisible().getText());

        Assert.assertEquals("Please enter a valid Email Address", participantCreatePage.getEmailErrorFieldVisible().getText());

        Assert.assertEquals("Please enter your Date of Birth", participantCreatePage.getDobErrorFieldVisible().getText());

        Assert.assertEquals("Please select your Gender", participantCreatePage.getGenderErrorFieldVisible().getText());

        Assert.assertEquals("Please enter your Native City", participantCreatePage.getNativeCityErrorFieldVisible().getText());

        Assert.assertEquals("Please enter your Mother Tongue", participantCreatePage.getMotherTongueErrorFieldVisible().getText());

        Assert.assertEquals("Please enter at least any one option for Disease, or, if you’ve never had any health issues, choose ‘I am healthy’.",
                participantCreatePage.getDiseaseErrorFieldVisible().getText());

    }


}
