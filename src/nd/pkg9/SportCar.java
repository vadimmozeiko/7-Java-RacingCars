
package nd.pkg9;


public class SportCar extends Car {
    
   private boolean spoilerIsUp = false;
    
    public SportCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        boolean hasSpoiler = true;
    }
    
    public void accelerate(int value){
        super.accelerate(value);
        
        if (!spoilerIsUp){
            this.currentSpeed += (value * 1.5);
        }
    }
    
    public void slowDown(int value){
        super.slowDown(value);
        
        if (spoilerIsUp){
           this.currentSpeed -= (value * 2); 
        }
    }
    
    
    
    
    
}

