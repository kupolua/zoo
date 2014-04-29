package ua.in.kupol.zoo.model.employees;

import ua.in.kupol.zoo.model.animals.Animal;

import java.util.List;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Worker extends Employee{

    public Worker(
            Integer aSalary,
            String aFirstName,
            String sPosition
    ){
            setSalary(aSalary);
            setFirstName(aFirstName);
            setPosition(sPosition);
    }

    @Override
    void myFeature() {
        System.out.printf(" Я Работаю в комбинезоне!");
    }

    public void feedAnimal(Animal l){
        aboutEmployee();
        System.out.printf("\nпокормил: " + l.getNickName());
    }

    public void feedAnimal(List listFeedAnimals) {
        List<Animal> needFeedAnimals = listFeedAnimals;

        for (Animal l : needFeedAnimals) {
            if (!l.getIsHungry()){
                System.out.printf("Покормил! " + l.getNickName());
            }
        }
    }

}
