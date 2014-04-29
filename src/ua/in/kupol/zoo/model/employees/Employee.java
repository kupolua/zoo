package ua.in.kupol.zoo.model.employees;

/**
 * Created by pavelkulakovsky on 29.04.14.
 */
abstract public class Employee {

    private int salary;

    private String firstName;
    private String position;

    abstract void myFeature();

    public void aboutEmployee(){
        System.out.printf("\n\nЯ " + getClass().getSimpleName() + " Меня зовут: " + getFirstName());
        myFeature();
    }

    public int getSalary() {
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
}
