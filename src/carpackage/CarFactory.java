package carpackage;

// this class is a blueprint / factory defining the parameters for something - a car in this case
// with the use of this class we can create as many cars as we want
public class CarFactory {
    String producer;
    String model;
    String color;
    int power;
    String engine;
// beep is a method and can be used to execute the commands in the curly brackets
    void beep() {
        System.out.println("This horn of this " +model + " is working: BEEP!");
    }
}
