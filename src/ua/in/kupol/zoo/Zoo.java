package ua.in.kupol.zoo;

import ua.in.kupol.zoo.logic.ZooCreator;
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

        ZooCreator zooCreator = new ZooCreator();

        List listAnimals = zooCreator.createAnimals();
        Map listEmployees = zooCreator.createEmployees();
        checkAnimals(listAnimals, listEmployees);

    }

    public static void checkAnimals(List<Animal> listAnimals, Map<String, Employee> listEmployees){
        System.out.printf("\n============================ Зоопарк! ===========================+");
        for (Animal l : listAnimals) {
            l.aboutAnimal(); //Report about Animal
            if (!l.isHealth()) {
                Doctor doctor = (Doctor) listEmployees.get(String.valueOf(l.getDoctorID()));
                doctor.treatAnimal(l);
            }
            if (!l.isHungry()) {
                Worker worker = (Worker) listEmployees.get(String.valueOf(l.getWorkerID()));
                worker.feedAnimal(l);
            }
            System.out.printf("\n\n----------------------------------------------------------------+");
        }
    }
}
