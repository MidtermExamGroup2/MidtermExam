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
    
    public Passenger (String firstName, String lastName, int age) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void reserveSeat();
    public void cancelBooking();
    public void checkAvailability(boolean[][] seats, int row, int column) {
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (seats[i][j] != 0)
            }
        }
    }
    
}
