package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
abstract public class Animal {


    private double requiredAmountFood;
    private double foodCost;
    private double animalWeight; //todo подключить генератор случайных чисел
    private double medicineAmount;
    private double medicineCost;

    private int workerID;
    private int doctorID;

    private String nickName;
    private String state;
    private String voice;
    private String foodType;
    private String medicineType;
    private String integument;

    private Boolean isHealth;
    private Boolean isHungry;

    abstract void myFeature();

    public void createAnimal(String[] fieldsList) {
        animalWeight = Double.parseDouble(fieldsList[0]);
        nickName = fieldsList[1];
        state = fieldsList[2];
        voice = fieldsList[3];
        foodType = fieldsList[4];
        requiredAmountFood = Double.parseDouble(fieldsList[5]);
        foodCost = Double.parseDouble(fieldsList[6]);
        integument = fieldsList[7];
        isHealth = Boolean.valueOf(fieldsList[8]);
        isHungry = Boolean.valueOf(fieldsList[9]);
        workerID = Integer.parseInt(fieldsList[10]);
        doctorID = Integer.parseInt(fieldsList[11]);
        medicineType = fieldsList[12];
        medicineAmount = Double.parseDouble(fieldsList[13]);
        medicineCost = Double.parseDouble(fieldsList[14]);
    }
    public void aboutAnimal(){
        System.out.printf("\n\nЯ " + getClass().getSimpleName() + " Меня зовут: " + getNickName());
        System.out.printf("\nМой вес: " + getAnimalWeight());
        System.out.printf("\nВес моего корма: " + getRequiredAmountFood());
        System.out.printf("\nСтоимость моего корма: " + getFoodCost());

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

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public double getMedicineAmount() {
        return medicineAmount;
    }

    public void setMedicineAmount(double medicineAmount) {
        this.medicineAmount = medicineAmount;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }
}
