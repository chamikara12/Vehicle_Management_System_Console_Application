package vehicle.park.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDetails {
    public Scanner scanner = new Scanner(System.in);

    List<Driver> drivers = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();

    Driver dri = null;
    public void addDriver(){

        //Get the drivers information using user input
        int numberOfDrivers;

        System.out.println("========================================");
        System.out.print("Enter Number of drivers :");
        numberOfDrivers = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.println("Enter details of Driver No " + (i + 1) + " : ");
            System.out.print("Enter Your Name : ");
            String name = scanner.nextLine();
            System.out.print("Gender (M/F) : ");
            char gender = scanner.next().charAt(0);
            System.out.print("Enter Your Age : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your Driver Id : ");
            String id = scanner.nextLine();
            System.out.print("Enter salary : ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            drivers.add(new Driver("Chaidwsd",'M',23,"hff",25000));
            dri = new Driver(name,gender,age,id,salary);
            drivers.add(dri);
        }

    }
    public void addVehicles(){

        System.out.print("Enter Number of vehicles :");
        int numberVehicles = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<numberVehicles; i++){
            System.out.println("Enter details of vehivle No "+(i+1)+" : ");
            System.out.print("Eneter vehicle Id : ");
            String vehId = scanner.next();
            System.out.print("Enter vehicle color : ");
            String color = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter Vehicle type : ");
            String type = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter Number of seats : ");
            int seat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Driver Id : ");
            String driverId = scanner.nextLine();
            System.out.println();

            Driver diver=null;
            Driver driver = null;
            for (Driver d : drivers) {
                if (driver==null  ||d.getDriverId().equals(driverId)) {
                    driver = d;
                    break;
                }
            }
            if (driver != null) {
                // Create Vehicle object and add to list
                Vehicle vehicle = new Vehicle(vehId, color, type, seat, driver);
                vehicles.add(vehicle);
            } else {
                System.out.println("Driver with ID " + driverId + " not found. Vehicle creation failed.");
            }
        }
    }

    public void vehiclesDetails(){
        //Display vehicle details including driver details
        System.out.println("========================================");
        System.out.println("The details of all vehicles including drivers details: ");

        for(Vehicle veh : vehicles){
            veh.display();
            System.out.println();
        }
    }

    public void driversDetails(){
        //Display Drivers details
        System.out.println("========================================");
        System.out.println("The details of all Drivers ");
        for(Driver driv :drivers){
            driv.display();
            System.out.println();
        }

    }
}
