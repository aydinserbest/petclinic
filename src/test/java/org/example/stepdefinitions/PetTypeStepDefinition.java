package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.example.actions.NavigateActions;

import java.util.List;

public class PetTypeStepDefinition {
    @Steps  //serenity-core dependency
    NavigateActions navigate;
    @Given("Carrie is a pet clinic customer")
    public void carrie_is_a_pet_clinic_customer() {
        navigate.toThePetClinicApplication();

    }
    @When("she views the different types of pets that can be treated")
    public void she_views_the_different_types_of_pets_that_can_be_treated() {
        navigate.toTheListOfPetTypes();

    }
    @Then("she should see t least following:")
    public void she_should_see_t_least_following(List<String> petTypes) {

    }
}
