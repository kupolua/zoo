package ua.in.kupol.zoo.model.employees;

import ua.in.kupol.zoo.model.animals.Animal;

import java.util.List;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Doctor extends Employee {

    public Doctor(
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
        System.out.printf(" Я Работаю в белом халате!");
    }

    public void treatAnimal(Animal l){
        aboutEmployee();
        System.out.printf("\nполечил: " + l.getNickName());
    }

    public void treatAnimal(List listTreatAnimals) {
        List<Animal> needTreatAnimals = listTreatAnimals;
        aboutEmployee();

        for (Animal l : needTreatAnimals) {
            if (!l.getIsHealth()){
                System.out.printf("Полечил! " + l.getNickName());
            }
        }
    }
}
