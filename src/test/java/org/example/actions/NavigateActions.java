package org.example.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {
    @Step("Open the pet clinic application")
    public void toThePetClinicApplication() {
        getDriver().get("http://localhost:8080/petclinic/welcome");
    }
    @Step("Open the pet type page")
    public void toTheListOfPetTypes() {

        $(MenuBar.PET_TYPES_ENTER).click();
        //find(MenuBar.PET_TYPES_ENTER).click();
    }
}
