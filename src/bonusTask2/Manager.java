package bonusTask2;

public class Manager extends  Employee{
    public Manager(String name, String surname, int age, double salary, double bonus, boolean isTrained) {
        super(name, surname, age, salary, bonus, isTrained);
    }

    @Override
    double calculateSalaryYear() {
        double salaryYear = this.getSalary()*12;
        System.out.println("Salary year: " + salaryYear);
        return salaryYear ;
    }

    @Override
    double calculateSalaryWthBonus() {
        double salaryWthBonus = this.getSalary() + this.getBonus();
        System.out.println("Salary with bonus: " + salaryWthBonus);
        return salaryWthBonus;
    }

    @Override
    void printInfo() {
        System.out.println(this);
        System.out.println("Yearly Salary: " + calculateSalaryYear());
        System.out.println("Salary with Bonus: " + calculateSalaryWthBonus());
    }

    @Override
    public void train() {
        if (isTrained){
            setSalary(getSalary() + 100);
            System.out.println("Manager is training");
        }

    }

    @Override
    public void train(int hours) {
        if (isTrained && hours > 20){
            setSalary(getSalary() + 300);
            System.out.println("Manager is training " + hours + " hours");
        }else if (isTrained){
            setSalary(getSalary() + 100);
            System.out.println("Manager is training " + hours + " hours");
        }

    }
}
