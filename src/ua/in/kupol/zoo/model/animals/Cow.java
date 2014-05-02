package ua.in.kupol.zoo.model.animals;

import java.util.List;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Cow extends Animal {

  /**
    public Cow(
            Integer aRequiredAmountFood, // to-do a убрать
            Integer aAnimalWeight,
            String aNickName,
            String aState,
            String aVoice,
            String aFoodType,
            String aIntegument,
            Boolean aIsHealth,
            Boolean aIsHungry
    ) {
        setRequiredAmountFood(aRequiredAmountFood); // to-do this.voice = voice без а
        setAnimalWeight(aAnimalWeight);
        setNickName(aNickName);
        setState(aState);
        setVoice(aVoice);
        setFoodType(aFoodType);
        setIntegument(aIntegument);
        setIsHealth(aIsHealth);
        setIsHungry(aIsHungry);
    }
    */


    public Cow (String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
    }

    @Override
    void myFeature() {}
}
