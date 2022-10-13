package carpackage;

// this class is a blueprint / factory defining the parameters for something - a car in this case
// with the use of this class we can create as many cars as we want
// +++ extends declares the CarFactory class as a sub class of the CarSuperClass parent class +++
public class CarFactory {
    private String producer;
    private String model;
    CarSuperClass genericCar = new CarSuperClass();
       // genericCar.key();
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    private int age;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            throw new IllegalArgumentException();
        }
        this.power = power;
    }

    private int power;
    String engine;

    // beep is a method and can be used to execute the commands in the curly brackets
    void beep() {
        System.out.println("This horn of this " + model + " is working: BEEP!");
    }
}
