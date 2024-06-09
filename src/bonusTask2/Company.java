package bonusTask2;
import java.util.ArrayList;

public class Company {
    protected ArrayList <Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }
    public void removeEmployee(String nameEmployee){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(nameEmployee)){
                employees.remove(i);
                System.out.println("Employee removed: " + nameEmployee);
            }
        }
    }
    public void printEmployees(){
        System.out.println("----------");
        System.out.println("Employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("----------");
    }
}
