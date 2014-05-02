package ua.in.kupol.zoo.model.animals;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Lion extends Animal {

    public Lion (String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createAnimal(standartFields);
    }

    @Override
    void myFeature() {}
}
