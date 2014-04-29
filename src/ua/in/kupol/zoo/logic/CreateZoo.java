package ua.in.kupol.zoo.logic;

import ua.in.kupol.zoo.model.animals.*;
import ua.in.kupol.zoo.model.employees.Doctor;
import ua.in.kupol.zoo.model.employees.Employee;
import ua.in.kupol.zoo.model.employees.Worker;

import java.util.*;

/**
 * Created by pavelkulakovsky on 29.04.14.
 */
public class CreateZoo {
    public List createAnimals() {
        List<Animal> listAnimals = new ArrayList<Animal>();

        listAnimals.add(new Cow(2, 78, "Петрушка", "Сплю", "Му-Му-муууу", "Трава", "Шерсть", true, false));
        listAnimals.add(new Cow(3, 90, "Рыжка", "Гуляю", "Му-Му", "Трава", "Шерсть", true, false));
        listAnimals.add(new Lion(17, 130, "Царь", "Гуляю", "Р-Р-Р-Р-Р-Р", "Мясо", "Шерсть", false, false));
        listAnimals.add(new Duck(2, 1, "Мак-Дак", "Плаваю", "Кря-Кря", "Водоросли", "Перья", true, true, "Черный"));
        listAnimals.add(new Duck(2, 1, "Кряк-Дак", "Плаваю", "Крю-Крю", "Водоросли", "Перья", false, false, "Серый"));
        listAnimals.add(new Crucian(2, 1, "Обжора", "Плаваю", "Молчание", "Червячки", "Чешуя", true, false));

        return listAnimals;
    }
    public Map createEmployees() {
        Map<String, Employee> listEmployees = new HashMap<String, Employee>();

        listEmployees.put("Worker", new Worker(400, "Кормильщиков", "Рабочий"));
        listEmployees.put("Doctor", new Doctor(800, "Лечебников", "Доктор"));

        return listEmployees;
    }
}