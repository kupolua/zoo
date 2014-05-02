package ua.in.kupol.zoo.model.employees;

import ua.in.kupol.zoo.model.animals.Animal;

import java.util.List;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Worker extends Employee{

    public Worker(String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createEmployee(standartFields);
    }
    /**public Worker(
            Integer id,
            Integer salary,
            String firstName,
            String position
    ){
            setId(id);
            setSalary(salary);
            setFirstName(firstName);
            setPosition(position);
    }
    */
    @Override
    void myFeature() {
        System.out.printf("Я Работаю: " + getClothes());
    }

    public void feedAnimal(Animal l){
        aboutEmployee();
        System.out.printf("\nПокормил: " + l.getNickName());
    }

    public void feedAnimal(List listFeedAnimals) {
        List<Animal> needFeedAnimals = listFeedAnimals;

        for (Animal l : needFeedAnimals) {
            if (!l.isHungry()){
                System.out.printf("Покормил! " + l.getNickName());
            }
        }
    }

}
