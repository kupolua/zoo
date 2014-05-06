package ua.in.kupol.zoo.storage;

/**
 * Created by pavelkulakovsky on 28.04.14.
 */
public class Storage {

    private int id;
    private double food;
    private double foodCost;


    // Второй вариант. Создать поле на каждый вид корма
    private double foodBanana;
    private double foodBananaCost;

    private double foodMeat;
    private double foodMeatCost;







    private double medicine;
    private double medicineCost;

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getMedicine() {
        return medicine;
    }

    public void setMedicine(double medicine) {
        this.medicine = medicine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
