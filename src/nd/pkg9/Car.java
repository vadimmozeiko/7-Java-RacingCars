package nd.pkg9;

public class Car {
    private String carName;
    private int maxSpeed;
    protected double currentSpeed = 0;
    private int distance = 0;

    public Car(String name, int maxSpeed) {
        this.carName = name;
        this.maxSpeed = maxSpeed;
        this.greeting();
    }

    private void greeting() {
        System.out.println("Car " + this.carName + ", milage - " + this.distance + ", max speed - " + this.maxSpeed + ".");
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
//        System.out.println("Driving.. " + this.carName +" Current distance: " + this.distance + ", current speed: " + this.currentSpeed);
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
}
