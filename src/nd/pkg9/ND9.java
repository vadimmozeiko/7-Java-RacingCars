package nd.pkg9;

public class ND9 {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda", 185);
        Car car2 = new Car("Honda", 199);

        System.out.println("-------------");

        car1.accelerate(10);
        car2.accelerate(15);

        System.out.println(car1.currentSpeed);
        System.out.println(car2.currentSpeed);

        car1.slowDown(5);
        car2.slowDown(7);

        System.out.println(car1.currentSpeed);
        System.out.println(car2.currentSpeed);

        car1.drive();
        car2.drive();

        car2.accelerate(300);
        car2.drive();

        car2.drive();

        car2.slowDown(91);
         car2.drive();

        car2.slowDown(120);
         car2.drive();

    }

}
