/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author ASUS
 */

public class Passenger {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected boolean isBooked;
    protected int ticketPrice;
    protected String ticketType; //Economy or Business
    protected int seatRow;
    protected int seatColumn;
    
    Passenger(){
        this.firstName = "John";
        this.lastName =  "Doe";
        this.age = -1;
        this.isBooked = false;
        this.ticketPrice = 0;
        this.ticketType = "N/A";
        this.seatRow = -1;
        this.seatColumn = -1;
    }
    
    public void displayDetails(){
        System.out.println("-------------------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Booking Status: " + isBooked);
        if(isBooked){
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Seat: Row " + seatRow + " Column " + seatColumn);
        }
        System.out.println("-------------------");
    }
    
    
    
    
    
}
