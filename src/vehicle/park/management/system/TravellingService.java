package vehicle.park.management.system;

public class TravellingService  {
    public static void main(String[] args) {

        Console obj = new Console();
        obj.console();



        }
    }

/**
 * package vehicle.park.management.system;
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * import java.util.Scanner;
 *
 * public class Deails {
 *     public void userInput(){
 *         //Create list for driver and insert data
 *         Scanner scanner = new Scanner(System.in);
 *         Driver[] drivers = new Driver[5];
 *         //Get the drivers information using user input
 *         int numberOfDrivers;
 *
 *             System.out.println("============Vehicle Parking Management System=========");
 *              System.out.print("Enter Number of drivers :");
 *             numberOfDrivers = scanner.nextInt();
 *             for (int i = 0; i < numberOfDrivers; i++) {
 *                 System.out.println("Enter details of Driver No " + (i + 1) + " : ");
 *                 System.out.print("Enter Your Name : ");
 *                 String name = scanner.nextLine();
 *                 scanner.nextLine();
 *                 System.out.print("Gender (M/F) : ");
 *                 char gender = scanner.next().charAt(0);
 *                 System.out.print("Enter Your Age : ");
 *                 int age = scanner.nextInt();
 *                 System.out.print("Enter your Driver Id : ");
 *                 String id = scanner.nextLine();
 *                 scanner.nextLine();
 *                 System.out.print("Enter salary : ");
 *                 double salary = scanner.nextDouble();
 *
 *                 drivers[i] = new Driver(name, gender, age, id, salary);
 *             }
 *
 *
 *         //Create Arraylist For vehicles
 *
 *         List<Vehicle> vehicles = new ArrayList<>();
 *         System.out.print("Enter Number of vehicles :");
 *         int numberVehicles = scanner.nextInt();
 *         for(int i=0; i<numberVehicles; i++){
 *             System.out.println("Enter details of vehivle No "+(i+1)+" : ");
 *             System.out.print("Eneter vehicle Id : ");
 *             String vehId = scanner.next();
 *             System.out.print("Enter vehicle color : ");
 *             String color = scanner.next();
 *             System.out.print("Enter Vehicle type : ");
 *             String type = scanner.nextLine();
 *             scanner.nextLine();
 *             System.out.print("Enter Number of seats : ");
 *             int seat = scanner.nextInt();
 *             System.out.print("Enter Driver Id : ");
 *             String driverId = scanner.next();
 *             scanner.nextLine();
 *             System.out.println();
 *             Driver diver=null;
 *             Driver driver = null;
 *             for (Driver d : drivers) {
 *                 if (driver==null  ||d.getDriverId().equals(driverId)) {
 *                     driver = d;
 *                     break;
 *                 }
 *             }
 *             if (driver != null) {
 *                 // Create Vehicle object and add to list
 *                 Vehicle vehicle = new Vehicle(vehId, color, type, seat, driver);
 *                 vehicles.add(vehicle);
 *             } else {
 *                 System.out.println("Driver with ID " + driverId + " not found. Vehicle creation failed.");
 *             }
 *         }
 *
 *         //Display vehicle details including driver details
 *         System.out.println("##################################################");
 *         System.out.println("The details of all vehicles including drivers details: ");
 *         for(Vehicle veh : vehicles){
 *             System.out.println(veh.display());
 *             System.out.println();
 *         }
 *
 *         //Display all vehicle which are the driven by female drivers
 *
 *         System.out.println("##################################################");
 *         System.out.println("The details of all vehicles which are the driven by female drivers: ");
 *         for(Vehicle veh : vehicles){
 *             if (veh.getDriver().getSex()=='F'){
 *                 System.out.println(veh.display());
 *                 System.out.println();
 *             }
 *         }
 *
 *         //Display all vehicle which are driven by youngest driver
 *         Vehicle youngestDriver=null;
 *         System.out.println("##################################################");
 *         System.out.println("The details of all vehicles which are the driven by youngest drivers: ");
 *         for(Vehicle veh : vehicles){
 *             if (youngestDriver==null ||youngestDriver.getDriver().getAge()> veh.getDriver().getAge()){
 *                 youngestDriver=veh;
 *             }
 *         }
 *         System.out.println(youngestDriver.display());
 *
 *         //Change the color of yellow vehicles are pink
 *
 *         for(Vehicle veh : vehicles){
 *             if (veh.getColor()=="Yellow"){
 *                 veh.setColor("Pink");
 *
 *             }
 *         }
 *
 *         //Change the seat 55 to greater than 50 seats vehice
 *         for(Vehicle veh : vehicles){
 *             if (veh.getNumberOfSeats()>50){
 *                 veh.setNumberOfSeats(55);
 *
 *             }
 *         }
 *
 *         System.out.println("##################################################");
 *         System.out.println("The details of all vehicles : ");
 *         for(Vehicle veh : vehicles){
 *             System.out.println(veh.display());
 *         }
 *
 *     }
 * }
 */