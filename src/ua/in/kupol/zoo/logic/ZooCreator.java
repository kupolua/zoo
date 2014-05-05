package ua.in.kupol.zoo.logic;

import ua.in.kupol.zoo.model.animals.*;
import ua.in.kupol.zoo.model.employees.Doctor;
import ua.in.kupol.zoo.model.employees.Employee;
import ua.in.kupol.zoo.model.employees.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pavelkulakovsky on 29.04.14.
 */
public class ZooCreator { // to-do ZooCreator
    public List createAnimals() {
        List<Animal> listAnimals = new ArrayList<Animal>();

        String [][] fieldsCow = {
                {"90.5", "Рыжка", "Гуляю", "Му-Му", "Трава", "3.67", "4.40", "Шерсть", "true", "false", "100", "200", "Тизин", "4.5", "3.5"},
                {}
        };
        listAnimals.add(new Cow(fieldsCow));

        String [][] fieldsLion = {
                {"130.9", "Царь", "Гуляю", "Р-Р-Р-Р-Р-Р", "Мясо", "17.3", "35.8", "Шерсть", "false", "false", "100", "200", "Стрепсилс", "2.5", "3.7"},
                {}
        };
        listAnimals.add(new Lion(fieldsLion));


        String [][] fieldsDuck = {
                {"90.6", "Рыжка", "Гуляю", "Му-Му", "Трава", "3.3", "4.40", "Шерсть", "true", "false", "101", "201", "АцетилПепсин", "4.8", "12.7"},
                {"Черный"}
        };
        listAnimals.add(new Duck(fieldsDuck));

        String [][] fieldsDuck1 = {
                {"1.1", "Кряк-Дак", "Плаваю", "Крю-Крю", "Водоросли", "2.1", "7.49", "Перья", "false", "false", "101", "201", "Стрептоцид", "3.55", "5.2"},
                {"Серый"}
        };
        listAnimals.add(new Duck(fieldsDuck1));

        String [][] fieldsCrucian = {
                {"1.9", "Обжора", "Плаваю", "", "Червячки", "2.4", "20.88", "Чешуя", "true", "false", "101", "201", "Ликоген", "0.56", "2.9"},
                {}
        } ;
        listAnimals.add(new Crucian(fieldsCrucian));

        String [][] fieldsMonkey = {
                {"30.1", "Кривляка", "Лазаю по деревьям", "Урри - Урри", "Бананы", "7.4", "12.99", "Шерсть", "false", "false", "100", "200", "Трависин", "2.9", "7.9"},
                {"Хвост"}
        };
        listAnimals.add(new Monkey(fieldsMonkey));

        String [][] fieldsPiranha = {
                {"1.6", "Кусака", "Ищу добычу", "", "Мясо", "0.34", "35.8", "Чешуя", "false", "false", "101", "201", "Спазмалгон", "1.7", "0.7"},
                {"Я кусаюсь!"}
        };
        listAnimals.add(new Piranha(fieldsPiranha));

        String [][] fieldsSparrow = {
                {"1.3", "ПрыгСкокОбычный", "Ищу зернышко", "Чик-Чирик", "Зерно", "0.56", "15.89", "Перья", "true", "true", "100", "200", "Назолван", "0.5", "3.8"},
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
