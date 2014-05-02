package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Monkey extends Animal {

    private String tail;
    public Monkey (String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
        setTail(fieldsList[1][0]);
    }

    @Override
    void myFeature() {
        System.out.printf("\nУ меня есть: " + getTail());
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
