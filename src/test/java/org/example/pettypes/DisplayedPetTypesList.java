package org.example.pettypes;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import java.util.List;

public class DisplayedPetTypesList extends UIInteractionSteps {
    public List<String> thatAreVisible(){
        return $$(By.name("pettype_name")).map(petTypeField -> petTypeField.getValue());
//         return findAll(By.name("pettype_name")).stream()
//                .map(element -> element.getAttribute("value"))
//                .collect(Collectors.toList());

        //there is no visible text in the html so this is not working, we need to use value-getAttribute like above
        //return $$(By.name("pettype_name")).texts();
        //return findAll(By.name("pettype_name")).texts();
    }
}
