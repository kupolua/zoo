package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Sparrow extends Animal {

    private String dangerous;
    public Sparrow (String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
        setDangerous(fieldsList[1][0]);
    }

    @Override
    void myFeature() {
        System.out.printf("\nОСТОРОЖНО: " + getDangerous());
    }

    public String getDangerous() {
        return dangerous;
    }

    public void setDangerous(String dangerous) {
        this.dangerous = dangerous;
    }
}