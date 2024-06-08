package bonusTask;

public class Boat extends Vehicle{
protected int enginePower;

    public Boat(int avarageSpeed, int enginePower) {
        super(avarageSpeed);
        if (enginePower < 50) {
            throw new IllegalArgumentException("Engine power speed cannot be negative or be < 50");
        }
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    double calculateMaxSpeed() {
    return enginePower * 1.5;
    }

    @Override
   public void describe() {
        System.out.println("Engine power count this car: " + enginePower);
        System.out.println("Max Speed this car: " + calculateMaxSpeed());
        System.out.println("Average Speed this car: " + avarageSpeed);
        System.out.println("-----------------------------------------");

    }
}
