package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Crucian extends Animal {
    public Crucian(String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
    }
    /**
      public Crucian(
            Integer aRequiredAmountFood,
            Integer aAnimalWeight,
            String aNickName,
            String aState,
            String aVoice,
            String aFoodType,
            String aIntegument,
            Boolean aIsHealth,
            Boolean aIsHungry
    ) {
        setRequiredAmountFood(aRequiredAmountFood);
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
    @Override
    void myFeature() {}
}
