package carpackage;

import java.util.Scanner;

public class CarWork {
    public static CarFactory userCar;
    public static CarFactory myCar;

    public static void carWorker() {

        CarFactory myCar = new CarFactory();
        myCar.setProducer("Dacia");
        myCar.setColor("comete grey");
        myCar.engine = "gasoline";
        myCar.setModel("Duster 2");
        myCar.setAge(2);
        myCar.setPower(96);

        CarFactory myOldCar = new CarFactory();
        myOldCar.setProducer("VW");
        myOldCar.setColor("red");
        myOldCar.engine = "gasoline";
        myOldCar.setAge(10);
        myOldCar.setModel("Golf 2");
        myOldCar.setPower(70);

        // The Scanner class has been imported -> see the beginning of the class
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your car producer: ");
        CarFactory userCar = new CarFactory();
        userCar.setProducer(userInput.nextLine());
        System.out.println("You have entered " + userCar.getProducer() + " as the producer of your car");

        System.out.print("Please enter your car model: ");
        userCar.setModel(userInput.nextLine());
        System.out.println("You have entered " + userCar.getModel() + " as the model of your car");

        System.out.print("Please enter the color of your car: ");
        userCar.setColor(userInput.nextLine());
        System.out.println("You have entered " + userCar.getColor() + " as the color of your car");

        System.out.print("Please enter the type of the engine of your car gasoline / diesel / electric: ");
        userCar.engine = userInput.nextLine();
        System.out.println("You have entered " + userCar.engine + " as the type of the engine of your car");

        System.out.print("Please enter the power of your car: ");
        userCar.setPower(userInput.nextInt());
        System.out.println("You have entered " + userCar.getPower() + " as the power of your car");

        System.out.print("Please enter the age of your car: ");
        userCar.setAge(userInput.nextInt());
        System.out.println("You have entered " + userCar.getAge() + " as the age of your car");

        System.out.println("We are checking now if your " + userCar.getModel() + " has more power than my " + myCar.getModel());
        if (userCar.getPower() > myCar.getPower()) {
            System.out.println("Your car has more power than my car!");
        } else {
            System.out.println("My car has more power than your car!");
        }
        int power0 = myCar.getPower();
        int power1 = myOldCar.getPower();
        int power2 = userCar.getPower();
        int totalPower = totalCarPower(power0, power2, power2);
        System.out.println("The total power of " + myCar.getModel() + " " + myOldCar.getModel() + " " + userCar.getModel() + " is: " + totalPower + " kilowatt.");

        // beep is a method (defined in the CarFactory class and the method is called like that
        userCar.beep();
        myCar.beep();
        myOldCar.beep();

// Abbreviation to create System.out.println(); is: sout + tab

    }
// Below is another method - A method must be created outside the main {} - this is why I am writing it here
// private (= access modifier) means, it can only be called from this same class
// static means (= it can be called in this class without creating an instance, object

    private static int totalCarPower(int power0, int power1, int power2) {
        return power0 + power1 + power2;
    }

}
