package vehicle.park.management.system;

import javax.xml.namespace.QName;
import java.sql.DataTruncation;

public class Driver extends Person {
    //Create private field

    Person per = new Person();

    private String driverId;
    private double salary;

    //Create constructor initialized attributes and super class attributes

    public Driver(
            String name,
            char sex,
            int age,
            String driverId,
            double salary
    ){
        super(name,sex,age);
        this.driverId=driverId;
        this.salary=salary;
    }

    //Create getter and setter for salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    //Public method to display details
    public String getDriverId() {
        return driverId;
    }
    public void display(){
        System.out.println("Driver Id :"+driverId);
        System.out.println("Salary :"+salary);
        System.out.println(details());

    }
}
