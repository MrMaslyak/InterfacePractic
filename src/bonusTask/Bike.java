package bonusTask;

public class Bike extends Vehicle {
    protected int gearCount;

    public Bike(int avarageSpeed, int gearCount) {
        super(avarageSpeed);
        if (gearCount < 3) {
            throw new IllegalArgumentException("Gear count speed power speed cannot be negative or be < 3");
        }
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    double calculateMaxSpeed() {
        return gearCount * 3;
    }

    @Override
    public void describe() {
        System.out.println("Gear count this car: " + gearCount);
        System.out.println("Max Speed this car: " + calculateMaxSpeed());
        System.out.println("Average Speed this car: " + avarageSpeed);
        System.out.println("-----------------------------------------");

    }
}
