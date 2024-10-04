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
  private int[][] seats; //1 for reserved, 0 for not
  
  Airplane(int rows, int columns){
      this.seats = new int[rows][columns];
  }
  
  //Displaying the seats in a formatted manner
  public void displaySeats(){
      System.out.println("Seat Layout: ");
      System.out.println("Rows: " + seats.length);
      System.out.println("Columns: "+ seats[0].length);
      System.out.println("   ");
      System.out.println(); // Move to the next line
      // Print column headers
    System.out.print("   "); // Initial space for row labels
    for (int j = 0; j < seats[0].length; j++) { // Columns
        System.out.print(" " + (j + 1) + "  "); // Print column number
    }
    System.out.println(); // Move to the next line
    
    // Print seat layout
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
  
