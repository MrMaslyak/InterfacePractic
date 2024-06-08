package bonusTask;

abstract class Vehicle implements Info{
    protected int avarageSpeed;

    public Vehicle(int avarageSpeed) {
        if (avarageSpeed < 0) {
            throw new IllegalArgumentException("Avarage speed cannot be negative");
        }
        this.avarageSpeed = avarageSpeed;
    }

    public int getAvarageSpeed() {
        return avarageSpeed;
    }

    public void setAvarageSpeed(int avarageSpeed) {
        this.avarageSpeed = avarageSpeed;
    }
    abstract double calculateMaxSpeed();

}
