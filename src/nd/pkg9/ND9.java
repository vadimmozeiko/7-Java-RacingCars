package nd.pkg9;

public class ND9 {

    public static void main(String[] args) {
        
//        System.out.println("-------- Racing Game --------");
//        System.out.println();
//        System.out.println("OPPONENTS:");
//        System.out.println();
//        
//        Car[] cars = {
//            new Car("Mazda", 177),
//            new Car("Honda", 189),
//            new Car("Toyota", 161),
//            new Car("Ford", 168),
//            new Car("Audi", 207),
//            new Car("BMW", 201),
//            new Car("Volvo", 198),
//            new Car("Volkswagen", 183)
//        };
//        System.out.println();
//        System.out.println("RACE....");
//        System.out.println();
//
//        int distance = 0;
//        int maxDistance = 1000;
//        int checkpoint = 100;
//
//        do {
//            for (int i = 0; i < cars.length; i++) {
//                if (Math.random() < 0.5) {
//                    cars[i].accelerate((int) (Math.random() * 5 + 1));
//                    cars[i].drive();
//                } else if (Math.random() > 0.5) {
//                    cars[i].slowDown((int) (Math.random() * 3 + 1));
//                    cars[i].drive();
//                }
//                
//                if (cars[i].getDistance() >= checkpoint) {
//                    System.out.println(cars[i].getCarName() + " car is leading at: " + checkpoint + " km checkpoint");
//                    checkpoint+=100;
//                }
//
//                if (distance < cars[i].getDistance()) {
//                    distance = cars[i].getDistance();
//                }
//            }
//        } while (distance < maxDistance);
//
//        for (int i = 0; i < cars.length - 1; i++) {
//            for (int j = i + 1; j < cars.length; j++) {
//                if (cars[i].getDistance()< cars[j].getDistance()) {
//                    Car temp = cars[i];
//                    cars[i] = cars[j];
//                    cars[j] = temp;
//                }
//            }
//        }
//
//        System.out.println();
//        System.out.println("-------- STATISTICS -------- ");
//        System.out.println();
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println((i + 1) + " - " + cars[i].getCarName() + " car distance is: " + cars[i].getDistance() + " km");
//            System.out.println();
//        }


        SportCar sc1 = new SportCar("Buggatti", 350);
        
        System.out.println(sc1);
        
        sc1.setSpoilerIsUp(true);
        
        sc1.accelerate(600);
        
        System.out.println(sc1);
        
        sc1.slowDown(300);
        
        System.out.println(sc1);
    }

}
