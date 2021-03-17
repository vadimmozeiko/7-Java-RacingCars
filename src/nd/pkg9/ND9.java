package nd.pkg9;

public class ND9 {

    public static void main(String[] args) {

        Car[] cars = {
            new Car("Mazda", 177),
            new Car("Honda", 189),
            new Car("Toyota", 161),
            new Car("Ford", 168),
            new Car("Audi", 207),
            new Car("BMW", 201),
            new Car("Volvo", 198),
            new Car("Volkswagen", 183)
        };
        System.out.println();
        System.out.println("RACE....");

        int distance = 0;
        int maxDistance = 1000;

        do {
            for (int i = 0; i < cars.length; i++) {
                if(Math.random() < 0.5){
                    cars[i].accelerate((int) (Math.random() * 5 + 1));
                    cars[i].drive();
                } else if (Math.random() > 0.5)
                    cars[i].slowDown((int) (Math.random() * 3 + 1));
                    cars[i].drive();
                
                if (distance < cars[i].distance) {
                    distance = cars[i].distance;
                }
            }
        } while (distance < maxDistance);

        System.out.println();
        System.out.println("-------- STATISTICS -------- ");
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].carName + " car distance is: " + cars[i].distance + " km");
            System.out.println();
        }

    }

}
