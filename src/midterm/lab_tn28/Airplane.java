/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author Group2-TN28
 */
public class Airplane {
    //  2D Array which represents the seats on the plane.
    //  0 means the seat is available. 1 if the seat is already booked.
  private int[][] seats; 
  
  
  //COnstructor to initialize the number of seats in the airplane.
  Airplane(int rows, int columns){
      this.seats = new int[rows][columns];
  }
  
  
  //Displays the seat layout of the airplane.
  //0 means the seat is available.
  //X means the seat is booked
  public void displaySeats(){
      System.out.println("Seat Layout: ");
      System.out.println("Rows: " + seats.length);
      System.out.println("Columns: "+ seats[0].length);
      System.out.println("   ");
      System.out.println(); // Move to the next line
      

      // Print column headers/number
    System.out.print("   "); // Initial space for row labels
    for (int j = 0; j < seats[0].length; j++) {
        System.out.print(" " + (j + 1) + "  "); // Print column header/number starting from 1
    }
    System.out.println(); // Move to the next line
    
    
    // Print seat rows together with the availability status.
    for (int i = 0; i < seats.length; i++) {
        System.out.print((i + 1) + " |"); // Print row number with separator
        for (int j = 0; j < seats[0].length; j++) {
            if (seats[i][j] == 0) {
                System.out.print(" O |"); // Available seat
            } else {
                System.out.print(" X |"); // Reserved seat
            }
        }
        System.out.println(); // Move to next line after printing the row
    }
  }
  
  
  //Check if the given seat is available
  public boolean isSeatAvailable(int seatRow, int seatColumn){
      if(seats[seatRow][seatColumn] == 0){
          return true;
      }
      else
          return false;
  }
  
  //Setter for seats.  1 for reserved, 0 for not.
  public void setSeatStatus(int seatRow, int seatColumn, int status){
      this.seats[seatRow][seatColumn] = status;
  }
}
  
