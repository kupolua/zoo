package ua.in.kupol.zoo;

import ua.in.kupol.zoo.logic.CreateZoo;
import ua.in.kupol.zoo.model.animals.Animal;

import java.util.*;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Zoo {
    public static void main(String[] args) {

        CreateZoo createZoo = new CreateZoo();
        List<Animal> listAnimals = createZoo.cerateAnimals();

        for (Animal l : listAnimals) {
            l.aboutMe(); //Report about Animal
//            if (l.getIsHealth()) {
//                System.out.printf("Здоров(а) " + l.getNickName() + "\n");
//            } else {
//                System.out.printf("Болею " + l.getNickName() + "\n");
//            }

        }
    }
}
