package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Lion extends Animal {
    public Lion(
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


    @Override
    void myFeature() {}
}
