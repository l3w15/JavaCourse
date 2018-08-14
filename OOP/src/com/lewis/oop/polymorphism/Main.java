package com.lewis.oop.polymorphism;

class Car {
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engine;
    private int currentSpeed;
    private boolean engineIsOn;



    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.currentSpeed = 0;
        this.engineIsOn = false;
    }

    public String getName() {
        return this.name;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String ignitionOnOff() {
        engineIsOn = !engineIsOn;
        if (engineIsOn) {
            return "Engine is on";
        } 
        return "Engine is off";
    }

    public String accelerateTo(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            this.currentSpeed = desiredSpeed;
            return "Accelerated to " + this.currentSpeed + "mph";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else {
            return "Cannot accelerate to a lower speed. Current speed is " + this.currentSpeed + "mph";
        }
    }

    public String brakeUntil(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            return "Cannot increase speed by braking. Current speed is " + this.currentSpeed + "mph";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else if (desiredSpeed == 0) {
            this.currentSpeed = desiredSpeed;
            return"You have stopped";
        } else {
            this.currentSpeed = desiredSpeed;
            return "Braking successful. Current speed is " + this.currentSpeed + "mph";
        }
    }
}

class CamperVan extends Car {
    private int currentSpeed;

    public CamperVan(int cylinders) {
        super(cylinders, "Camper");
        this.currentSpeed = 0;
    }

    @Override
    public String ignitionOnOff() {
        return super.ignitionOnOff();
    }

    @Override
    public String accelerateTo(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            this.currentSpeed = desiredSpeed;
            return "Eventually reached " + this.currentSpeed + "mph, but you are carrying a house!";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else {
            return "Cannot accelerate to a lower speed. Current speed is " + this.currentSpeed + "mph";
        }
    }

    @Override
    public String brakeUntil(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            return "Cannot increase speed by braking. Current speed is " + this.currentSpeed + "mph";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else if (desiredSpeed == 0) {
            this.currentSpeed = desiredSpeed;
            return"We have stopped. Are we camping here?";
        } else {
            this.currentSpeed = desiredSpeed;
            return "Braking successful. Current speed is " + this.currentSpeed + "mph";
        }
    }
}

class Lamborghini extends Car {
    private int currentSpeed;
    private boolean engineIsOn;

    public Lamborghini(int cylinders) {
        super(cylinders, "Lambo");
    }

    @Override
    public String ignitionOnOff() {
        engineIsOn = !engineIsOn;
        if (engineIsOn) {
            return "Engine is purring like a drug-crazed lion";
        } else {
            return "Engine is off";
        }
    }

    @Override
    public String accelerateTo(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            this.currentSpeed = desiredSpeed;
            return "Screamed up to " + this.currentSpeed + "mph with face melting speed";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else {
            return "Cannot accellerate to a lower speed. Current speed is " + this.currentSpeed + "mph";
        }
    }

    @Override
    public String brakeUntil(int desiredSpeed) {
        if (desiredSpeed > this.currentSpeed) {
            return "Cannot increase speed by braking. Current speed is " + this.currentSpeed + "mph";
        } else if (desiredSpeed == this.currentSpeed) {
            return "Already travelling at " + this.currentSpeed + "mph";
        } else if (desiredSpeed == 0) {
            this.currentSpeed = desiredSpeed;
            return "Car has schreeched to a halt in a cloud of burning rubber";
        } else {
            this.currentSpeed = desiredSpeed;
            return "Braking successful. Current speed is " + this.currentSpeed + "mph";
        }
    }
}

class OldBanger extends Car {
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engine;
    private int currentSpeed;
    private boolean engineIsOn;

    public OldBanger(int cylinders) {
        super(cylinders, "Fast Old Banger");
    }

    @Override
    public String ignitionOnOff() {
        engineIsOn = !engineIsOn;
        if (engineIsOn) {
            return "Engine eventually spluttered back to life";
        } else {
            return "Engine is off";
        }

    }
}

public class Main {
    public static void main(String[] args) {
        int num =  10;
        while (num > 0) {
            Car car = randomCar();
            System.out.println("Chosen car is " + car.getName() + "\n" +
                    car.ignitionOnOff() + "\n" +
                    car.accelerateTo(100) + "\n" +
                    car.brakeUntil(0) + "\n" +
                    car.getName() + " has " + car.getWheels() + " wheels." + "\n" +
                    " ");
            num--;
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        if(randomNumber == 1) {
            return new Lamborghini(12);
        } else if (randomNumber == 2){
            return new CamperVan(4);
        } else {
            return new OldBanger(6);
        }
    }
}
