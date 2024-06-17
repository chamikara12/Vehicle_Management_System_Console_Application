package vehicle.park.management.system;

import com.sun.jdi.event.StepEvent;

public class Vehicle {

    //Create private fields
    private String vehivleId;
    private String color;
    private String type;
    private int numberOfSeats;
    private Driver driver;



    //Create public constructer to initialized value
    public Vehicle(
            String vehivleId,
            String color,
            String type,
            int numberOfSeats,
            Driver driver
    ) {
        this.vehivleId = vehivleId;
        this.color = color;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
        this.driver = driver;
    }

    //Create getters for color ,number of seats and driver
    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public void setType(String type) {
        this.type = type;
    }


    //Create  method for display details for vehicles

    public void display() {
        System.out.println("Vehicle ID :" + vehivleId);
        System.out.println("Color :" + color);
        System.out.println("Type :" + type);
        System.out.println("Number Of Seats :" + numberOfSeats);
        System.out.println("Driver Details :");
        driver.display();

    }
}