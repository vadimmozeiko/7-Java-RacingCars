
package nd.pkg9;


public class SportCar extends Car {
    
   private boolean spoilerIsUp = false;
    
    public SportCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.hasSpoiler = true;
    }
    
    public void accelerate(int value){
        super.accelerate(value);
        
        if (!spoilerIsUp){
            this.currentSpeed += value * 0.5;
        }
        if (this.currentSpeed > this.maxSpeed){
            this.currentSpeed = this.maxSpeed;
        }
    }
    
    public void slowDown(int value){
        super.slowDown(value);
        
        if (spoilerIsUp){
           this.currentSpeed -= value; 
        } 
        if (this.currentSpeed < 0){
            this.currentSpeed = 0;
        }
    }

    public boolean isSpoilerIsUp() {
        return spoilerIsUp;
    }

    public void setSpoilerIsUp(boolean spoilerIsUp) {
        this.spoilerIsUp = spoilerIsUp;
    }


    
    
    
    
    
}

