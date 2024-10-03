/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author ASUS
 */
public class Economy extends Passenger {
    protected double seatPrice;
    
    public Economy (String firstName, String lastName, int age, double seatPrice) {
        super(firstName, lastName, age);
        this.seatPrice = seatPrice;
    }
}
