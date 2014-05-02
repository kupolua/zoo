package ua.in.kupol.zoo.model.employees;

/**
 * Created by pavelkulakovsky on 29.04.14.
 */
abstract public class Employee {

    private double salary; //todo decimal
    private int id;

    private String firstName;
    private String position;
    private String clothes;

    abstract void myFeature();

    public void createEmployee(String[] fieldsList) {
        id = Integer.parseInt(fieldsList[0]);
        salary = Double.parseDouble(fieldsList[1]);
        firstName = fieldsList[2];
        position = fieldsList[3];
        clothes = fieldsList[4];
    }
    public void aboutEmployee(){
        System.out.printf("\n\nЯ " + getClass().getSimpleName() + " Меня зовут: " + getFirstName());
        System.out.printf("\nСумма зарплаты: " + getSalary() + "\n");
        myFeature();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
