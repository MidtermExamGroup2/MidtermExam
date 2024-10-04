/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author joloos
 */
public class Vip_Passenger extends Passenger{
    private int vipCharge;
    Vip_Passenger(){
        super();
        vipCharge = 0;
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
        System.out.println("Vip Charge: "+ vipCharge);
        }
        System.out.println("-------------------");
    }
}
