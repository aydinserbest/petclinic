package org.example.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class NavigateActions extends UIInteractionSteps {
    @Step("Open the pet clinic application")
    public void toThePetClinicApplication() {
        getDriver().get("http://localhost:8080/petclinic/welcome");
    }
    @Step("Open the pet type page")
    public void toTheListOfPetTypes() {
        find(By.xpath("//span[.='Pet Types']")).click();
    }
}
