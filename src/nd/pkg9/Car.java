package nd.pkg9;

public class Car {

    private String carName;
    protected int maxSpeed;
    protected double currentSpeed = 0;
    private int distance = 0;
    protected boolean hasSpoiler;

    public Car(String name, int maxSpeed) {
        this.carName = name;
        this.maxSpeed = maxSpeed;
    }

    public void greeting() {
        System.out.println("Car " + this.carName + ", milage - " + this.distance + ", max speed - " + this.maxSpeed + ", has spoiler - " + this.hasSpoiler + ".");
    }

    public void accelerate(int value) {
        if (this.currentSpeed + value > this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        } else {
            this.currentSpeed += value;
        }
    }

    public void slowDown(int value) {
        if (this.currentSpeed - value <= 0) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed -= value;
        }
    }

    public void drive() {
        this.distance += this.currentSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isHasSpoiler() {
        return hasSpoiler;
    }
}
