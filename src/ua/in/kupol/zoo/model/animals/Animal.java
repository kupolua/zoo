package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
abstract public class Animal {


    private double requiredAmountFood;
    private double animalWeight; //todo подключить генератор случайных чисел
    private int workerID;
    private int doctorID;

    private String nickName;
    private String state;
    private String voice;
    private String foodType;
    private String integument;

    private Boolean isHealth;
    private Boolean isHungry;

    abstract void myFeature();

    public void createAnimal(String[] fieldsList) {
        requiredAmountFood = Double.parseDouble(fieldsList[0]);
        animalWeight = Double.parseDouble(fieldsList[1]);
        nickName = fieldsList[2];
        state = fieldsList[3];
        voice = fieldsList[4];
        foodType = fieldsList[5];
        integument = fieldsList[6];
        isHealth = Boolean.valueOf(fieldsList[7]);
        isHungry = Boolean.valueOf(fieldsList[8]);
        workerID = Integer.parseInt(fieldsList[9]);
        doctorID = Integer.parseInt(fieldsList[10]);
    }
    public void aboutAnimal(){
        System.out.printf("\n\nЯ " + getClass().getSimpleName() + " Меня зовут: " + getNickName());
        System.out.printf("\nМой вес: " + getAnimalWeight());
        System.out.printf("\nВес моего корма: " + getRequiredAmountFood());

        eat();
        bag();
        beIll();
        myFeature();
    }

    public void eat() {
        System.out.printf("%s%s", "\n   Я сейчас: ", (isHungry()  ? "не хочу есть" : "голодный(ая)"));
    }

    public void bag() {
        System.out.printf("%s", (isHungry() ? "\n   Я не голоден(а)" : "\n   Покормите меня: " + getFoodType()));
    }

    public void beIll() {
        System.out.printf("%s%s", "\n   Я сейчас: ", (isHealth() ? "здоров(а)" : "болею"));
    }



    public double getRequiredAmountFood() {
        return requiredAmountFood;
    }

    public void setRequiredAmountFood(int requiredAmountFood) {
        this.requiredAmountFood = requiredAmountFood;
    }

    public double getAnimalWeight() {
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

    public Boolean isHealth() {
        return isHealth;
    } //to-do get del

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public Boolean isHungry() {
        return isHungry;
    }

    public void setIsHungry(Boolean isHungry) {
        this.isHungry = isHungry;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
}
