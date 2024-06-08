package bonusTask;

public class Car extends Vehicle {
    protected String brand;
    protected int hoursepower;

    public Car(String brand ,int avarageSpeed, int hoursepower) {
        super(avarageSpeed);
        if (hoursepower < 50) {
            throw new IllegalArgumentException("Hourse power speed cannot be negative or be < 50");
        }
        this.hoursepower = hoursepower;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHoursepower() {
        return hoursepower;
    }

    public void setHoursepower(int hoursepower) {
        this.hoursepower = hoursepower;
    }

    @Override
    double calculateMaxSpeed() {
        return hoursepower * 1.25;

    }

    @Override
    public void describe() {
        System.out.println("HousePower this car: " + hoursepower);
        System.out.println("Max Speed this car: " + calculateMaxSpeed());
        System.out.println("Average Speed this car: " + avarageSpeed);
        System.out.println("-----------------------------------------");
    }
}
