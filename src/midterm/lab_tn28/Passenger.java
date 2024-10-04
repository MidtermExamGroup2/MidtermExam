/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 * @author Group2-TN28
 * This class represents a Passenger on a plane.
 * Stores necessary information such as first name, last name, and age, ticket type and booking status.
 * 
 * Provides methods to reserve and cancel seat bookings
 * 
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
    
    //Constructor
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
    
    //Display Passenger Details
    public void displayDetails(){
        System.out.println("-------------------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Booking Status: " + isBooked);
        if(isBooked){
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Seat: Row " + (++seatRow) + " Column " + (++seatColumn));
        }
        System.out.println("-------------------");
    }
    
    //Reserving a seat
    public void reserveSeat(int userRow, int userColumn, String userTicketType, Airplane airplane){
        this.seatRow = userRow;
        this.seatColumn = userColumn;
        airplane.setSeatStatus(userRow, userColumn, 1);
        
        if(userTicketType.equals("Business"))
        this.ticketPrice = 500;

        if(userTicketType.equals("Economy"))
        this.ticketPrice = 200;
        
        this.isBooked = true;
        this.ticketType = userTicketType;
        
    }
    
    //Cancelling a booking
    public void cancelBooking(){
        if(ticketType.equals("N/A")){
            System.out.println("This person is not booked");
        }else{
        this.seatRow = -1;
        this.seatColumn = -1;
        this.ticketPrice = 0;
        this.ticketType = "N/A";
        this.isBooked = false;
        System.out.println("Booking Cancelled.");
        }
    }
    
    /**
     * Setter
     */
    
    //Setter for firstName
    public void setFirstName(String userFirstName){
        this.firstName = userFirstName;
    }
    
    //Setter for lastName
    public void setLastName(String userLastName){
        this.lastName = userLastName;
    }
    
    //Setter for setAge
    public void setAge(int userAge){
        this.age = userAge;
    }
    
    //setter for seatRow
    public void setRow(int userRow){
        seatRow = userRow;
    }
    
    //setter for seatColumn
    public void setColumn(int userColumn){
        seatColumn = userColumn;
    }
    
    //getter for firstName
    public String getFirstName(){
        return firstName;
    }
    
    
    
    //getter for lastName
    public String getLastName(){
        return lastName;
    }
    
    //getter for age
    public int getAge(){
        return age;
    }
    
    /**
     * Getter
     */
    
    //getter for seatRow
    public int getRow(){
        return seatRow;
    }
    
    //getter for seatColumn
    public int getColumn(){
        return seatColumn;
    }
    
}
