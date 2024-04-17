package org.example.pettypes;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayedPetTypesList extends UIInteractionSteps {
    public List<String> thatAreVisible(){
         return findAll(By.name("pettype_name")).stream()
                .map(element -> element.getAttribute("value"))
                .collect(Collectors.toList());


        //return $$(By.name("pettype_name")).texts();
        //return findAll(By.name("pettype_name")).texts();
    }
}
