package ru.rest;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import ru.rest.controllers.RestCtrl;
import ru.rest.model.RestModel;

public class TestObjectStyle {
    @Test
    public void testAddNewPettoStore() {
        int idTestValue = RandomUtils.nextInt(0,9000);
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        RestModel testPet = new RestModel(idTestValue, null, testPetName, null, null, "AVAILABLE");
        RestModel pet = new RestCtrl().addnewPet(testPet);
        System.out.println(pet);

    }
}
