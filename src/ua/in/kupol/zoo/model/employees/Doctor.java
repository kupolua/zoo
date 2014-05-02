package ua.in.kupol.zoo.model.employees;

import ua.in.kupol.zoo.model.animals.Animal;

import java.util.List;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Doctor extends Employee {

    public Doctor(String[][] fieldsList) {
        String[] standartFields = fieldsList[0];
        super.createEmployee(standartFields);
    }
    /**public Doctor(
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
        System.out.printf("Я Работаю в: " + getClothes());
    }

    public void treatAnimal(Animal l){
        aboutEmployee();
        System.out.printf("\nПолечил: " + l.getNickName());//todo - Storage
    }

    public void treatAnimal(List listTreatAnimals) {
        List<Animal> needTreatAnimals = listTreatAnimals;
        aboutEmployee();

        for (Animal l : needTreatAnimals) {
            if (!l.isHealth()){
                System.out.printf("Полечил! " + l.getNickName());
            }
        }
    }
}
