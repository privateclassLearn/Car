package carpackage;

public class CarSuperClass {
    private String wheelType;
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public static void key() {
        System.out.println("COMES FROM SUPER CLASS -> All of our cars have an electronic key.");
    }
    public int showNumberOfDoors(int numberOfDoors) {
        System.out.println("Number of doors: " + this.numberOfDoors);
        return numberOfDoors;
    }
}
