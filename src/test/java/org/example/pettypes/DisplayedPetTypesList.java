package org.example.pettypes;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayedPetTypesList extends UIInteractionSteps {
    public List<String> thatAreVisible(){
        return $$(By.name("pettype_name").map(field -> field.getValue())
//         return findAll(By.name("pettype_name")).stream()
//                .map(element -> element.getAttribute("value"))
//                .collect(Collectors.toList());

        //there is no visible text in the html so this is not working, we need to use value-getAttribute like above
        //return $$(By.name("pettype_name")).texts();
        //return findAll(By.name("pettype_name")).texts();
    }
}
