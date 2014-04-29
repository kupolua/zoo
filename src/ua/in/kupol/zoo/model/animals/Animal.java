package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
abstract public class Animal {


    private int requiredAmountFood;
    private int animalWeight; //todo подключить генератор случайных чисел

    private String nickName;
    private String state;
    private String voice;
    private String foodType;
    private String integument;

    private Boolean isHealth;
    private Boolean isHungry;

    abstract void myFeature();
    public void aboutMe(){
        System.out.printf("\n\nЯ " + getClass().getSimpleName() + " Меня зовут: " + getNickName());
        eat();
        bag();
        beIll();
        myFeature();
    }

    public void eat() {
        System.out.printf("%s%s", "\n   Я сейчас: ", (getIsHungry()  ? "не хочу есть" : "голодный(ая)"));
    }

    public void bag() {
        System.out.printf("%s", (getIsHungry() ? "\n   Я не голоден(а)" : "\n   Покормите меня: " + getFoodType()));
    }

    public void beIll() {
        System.out.printf("%s%s", "\n   Я сейчас: ", (getIsHealth() ? "здоров(а)" : "болею"));
    }



    public int getRequiredAmountFood() {
        return requiredAmountFood;
    }

    public void setRequiredAmountFood(int requiredAmountFood) {
        this.requiredAmountFood = requiredAmountFood;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getIntegument() {
        return integument;
    }

    public void setIntegument(String integument) {
        this.integument = integument;
    }

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public Boolean getIsHungry() {
        return isHungry;
    }

    public void setIsHungry(Boolean isHungry) {
        this.isHungry = isHungry;
    }
}
