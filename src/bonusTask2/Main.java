package bonusTask2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Developer valeryi = new Developer("Valeryi", "Ilovaisky", 27, 5000, 1000, true);
        Designer igor = new Designer("Igor", "Hrebetov", 30, 3000, 500, false);
        Manager victoria = new Manager("Victoria", "Parabina", 22, 4000, 300, true);
        company.addEmployee(valeryi);
        company.addEmployee(igor);
        company.addEmployee(victoria);
        company.printEmployees();
        company.removeEmployee("Victoria");
        valeryi.train(25);
        igor.train(50);
        company.printEmployees();
    }
}
