package ua.in.kupol.zoo.logic;

import ua.in.kupol.zoo.model.animals.*;
import ua.in.kupol.zoo.model.employees.Doctor;
import ua.in.kupol.zoo.model.employees.Employee;
import ua.in.kupol.zoo.model.employees.Worker;

import java.util.*;

/**
 * Created by pavelkulakovsky on 29.04.14.
 */
public class ZooCreator { // to-do ZooCreator
    public List createAnimals() {
        List<Animal> listAnimals = new ArrayList<Animal>();

        String [][] fieldsCow = {
                {"3.67", "90.5", "Рыжка", "Гуляю", "Му-Му", "Трава", "Шерсть", "true", "false", "100", "200"},
                {}
        };
        listAnimals.add(new Cow(fieldsCow));

        String [][] fieldsLion = {
                {"17.3", "130.9", "Царь", "Гуляю", "Р-Р-Р-Р-Р-Р", "Мясо", "Шерсть", "false", "false", "100", "200"},
                {}
        };
        listAnimals.add(new Cow(fieldsLion));

        String [][] fieldsDuck = {
                {"3.3", "90.6", "Рыжка", "Гуляю", "Му-Му", "Трава", "Шерсть", "true", "false", "101", "201"},
                {"Черный"}
        };
        listAnimals.add(new Duck(fieldsDuck));

        String [][] fieldsDuck1 = {
                {"2.1", "1.1", "Кряк-Дак", "Плаваю", "Крю-Крю", "Водоросли", "Перья", "false", "false", "101", "201"},
                {"Серый"}
        };
        listAnimals.add(new Duck(fieldsDuck1));

        String [][] fieldsCrucian = {
                {"2.4", "1.9", "Обжора", "Плаваю", "Молчание", "Червячки", "Чешуя", "true", "false", "101", "201"},
                {}
        } ;
        listAnimals.add(new Crucian(fieldsCrucian));

        String [][] fieldsMonkey = {
                {"7.4", "30.1", "Кривляка", "Лазаю по деревьям", "Урри - Урри", "Бананы", "Шерсть", "false", "false", "100", "200"},
                {"Хвост"}
        };
        listAnimals.add(new Monkey(fieldsMonkey));

        String [][] fieldsPiranha = {
                {"0.34", "1.6", "Кусака", "Ищу добычу", "", "Мясо", "Чешуя", "false", "false", "101", "201"},
                {"Я кусаюсь!"}
        };
        listAnimals.add(new Piranha(fieldsPiranha));

        String [][] fieldsSparrow = {
                {"0.56", "1.3", "ПрыгСкокОбычный", "Ищу зернышко", "", "Зерно", "Перья", "true", "true", "100", "200"},
                {"Я хочу улететь!"}
        };
        listAnimals.add(new Sparrow(fieldsSparrow));


        return listAnimals;
    }
    public Map createEmployees() {
        Map<String, Employee> listEmployees = new HashMap<String, Employee>();

        String[][] fieldsWorker = {
                {"100", "400.5", "КормлюМлекопитающих", "Рабочий", "Комбинезон"},
                {}
        };
        listEmployees.put("100", new Worker(fieldsWorker));

        String[][] fieldsWorker1 = {
                {"101", "400.9", "КормлюВодоплавающих", "Рабочий", "Скафандр"},
                {}
        };
        listEmployees.put("101", new Worker(fieldsWorker1));

        String[][] fieldsDoctor = {
                {"200", "800.3", "ЛечуМлекопитающих", "Доктор", "Белый Халат"},
                {}
        };
        listEmployees.put("200", new Doctor(fieldsDoctor));

        String[][] fieldsDoctor1 = {
                {"201", "800.7", "ЛечуВодоплавающих", "Доктор", "Скафандр"},
                {}
        };
        listEmployees.put("201", new Doctor(fieldsDoctor1));

        return listEmployees;
    }
}
