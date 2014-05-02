package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Duck extends Animal {
    private String myColor;
    /**
    public Duck (
            Integer aRequiredAmountFood,
            Integer aAnimalWeight,
            String aNickName,
            String aState,
            String aVoice,
            String aFoodType,
            String aIntegument,
            Boolean aIsHealth,
            Boolean aIsHungry,
            String myColor
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
        setMyColor(myColor);
    }
    */

    public Duck (String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
        setMyColor(fieldsList[1][0]);
    }
    @Override
    void myFeature() {
        System.out.printf("\n   Мой цвет: " + getMyColor());
    }

    public String getMyColor() {
        return myColor;
    }

    public void setMyColor(String myColor) {
        this.myColor = myColor;
    }
}
