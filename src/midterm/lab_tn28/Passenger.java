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
    
    //Reserve a seat
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
    
    public void setFirstName(String userFirstName){
        this.firstName = userFirstName;
    }
    
    public void setLastName(String userLastName){
        this.lastName = userLastName;
    }
    
    public void setAge(int userAge){
        this.age = userAge;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setRow(int userRow){
        seatRow = userRow;
    }
    
    public void setColumn(int userColumn){
        seatColumn = userColumn;
    }
    
    public int getRow(){
        return seatRow;
    }
    
    public int getColumn(){
        return seatColumn;
    }
    
}
