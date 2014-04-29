package ua.in.kupol.zoo;

import ua.in.kupol.zoo.logic.CreateZoo;
import ua.in.kupol.zoo.model.animals.Animal;
import ua.in.kupol.zoo.model.employees.Doctor;
import ua.in.kupol.zoo.model.employees.Employee;
import ua.in.kupol.zoo.model.employees.Worker;

import java.util.*;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Zoo {
    public static void main(String[] args) {

        CreateZoo createZoo = new CreateZoo();

        List<Animal> listAnimals = createZoo.createAnimals();
        Map<String, Employee> listEmployees = createZoo.createEmployees();
        checkAnimals(listAnimals, listEmployees);

    }

    public static void checkAnimals(List<Animal> listAnimals, Map<String, Employee> listEmployees){
        for (Animal l : listAnimals) {
//            l.aboutAnimal(); //Report about Animal
            if (!l.getIsHealth()) {
                Doctor doctor = (Doctor) listEmployees.get("Doctor");
                doctor.treatAnimal(l);

            }
            if (!l.getIsHungry()) {
                Worker worker = (Worker) listEmployees.get("Worker");
//                worker.feedAnimal(l);
            }
        }
    }
}
