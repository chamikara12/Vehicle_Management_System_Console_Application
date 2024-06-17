package vehicle.park.management.system;

import java.util.Scanner;

public class Console {
    public Scanner scanner= new Scanner(System.in);
    AllDetails details = new AllDetails();
    public  void console(){
        System.out.println("==========Parking Mangement System==========");

            int choice;
            do {
                System.out.println();
                System.out.println("========================================");
                System.out.println("01. Drivers");
                System.out.println("02. Vehicles");
                System.out.println("03. Exit");
                System.out.print("Enter Your Choice (1/2/3) :");
                choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.println();
                        System.out.println("========================================");
                        System.out.println("01. Add New Driver");
                        System.out.println("02. View All Details");
                        System.out.println("03. Back/Exit");
                        System.out.print("Enter Your Choice : ");
                        int input = scanner.nextInt();
                        switch (input){
                            case 1 :
                                details.addDriver();
                                break;
                            case 2 :
                                details.driversDetails();
                                break;
                            case 3 :
                                System.out.println("Bye!");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        break;
                    case 2 :
                        System.out.println();
                        System.out.println("========================================");
                        System.out.println("01. Add New Vehicle");
                        System.out.println("02. View All Details");
                        System.out.println("03. Back/Exit");
                        System.out.print("Enter Your Choice : ");
                        int input1 = scanner.nextInt();
                        switch (input1){
                            case 1 :
                                details.addVehicles();
                                break;
                            case 2 :
                                details.vehiclesDetails();
                                break;
                            case 3 :
                                System.out.println("Bye!");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        break;
                    case 3 :
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }
            }while (choice!=3);
        }

    }

