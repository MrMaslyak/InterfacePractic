package bonusTask2;
import Interface.Trainable;
public  abstract class Employee implements Trainable{
    protected String name;
    protected String surname;
    protected int age;
    protected double salary;
    protected double bonus;
    protected boolean isTrained;

    public Employee(String name, String surname, int age, double salary, double bonus, boolean isTrained) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    abstract double calculateSalaryYear();
    abstract double calculateSalaryWthBonus();
    abstract void printInfo();
    public String toString() {
        return String.format("%s %s, Age: %d, Salary: %.2f, Bonus: %.2f", name, surname, age, salary, bonus);
    }
}
