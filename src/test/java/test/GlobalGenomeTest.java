package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ParticipantCreatePage;
import utils.Wait;

public class GlobalGenomeTest extends TestBase{

    @Test
    public void callHomepage() throws InterruptedException
    {
        ParticipantCreatePage participantCreatePage = PageFactory.initElements(driver, ParticipantCreatePage.class);
     //   Wait.untilPageLoadComplete(driver, 20L);
        Thread.sleep(5000);
        participantCreatePage.homePage();

        // participant's firstname
        participantCreatePage.setFirstNameField("Shruti");


        // participant's lastname
        participantCreatePage.setLastNameField("Dixit");

        // participant's mobile number
        participantCreatePage.setMobileField("");

        // participant's Email
        participantCreatePage.setEmailField();

        // participant's DOB
        participantCreatePage.setDateOfBirthSelectionField();

        // participant's gender
        participantCreatePage.setGenderSelectionField();

        // participant's native city
        participantCreatePage.setNativeCityField();

        // participant's mother tongue
        participantCreatePage.setMotherTongueField();

        // participant's select diseases
        participantCreatePage.selectDiseases();
    }

}
