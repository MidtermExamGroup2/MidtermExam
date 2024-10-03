/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author ASUS
 */
public class Airplane {
  private int[][] seats;
  
  Airplane(int rows, int columns){
      this.seats = new int[rows][columns];
  }
  public void displaySeats(){
      System.out.println("Seat Layout: ");
      System.out.println("Rows: " + seats.length);
      System.out.println("Columns: "+ seats[0].length);
      System.out.println("   ");
      
      for(int i = 0; i<seats[0].length; i++){ //Columns
          System.out.println(" " + (i + 1) + " ");
      }
      System.out.println();
      
      for(int i = 0; i<seats.length; i++){
          System.out.println((i+1) + " |");
      for(int j = 0; j<seats[0].length; j++){
          if(seats[i][j] == 0){
              System.out.println(" O |");
          }
          else{
              System.out.println(" X |");
          }
        }
          System.out.println();
      }
      
  }
  public bool isSeatAvailable(int seatRow, int seatColumn){
      if(seats[seatRow][seatColumn] == 1){
          return true;
      }
      else
          return false;
  
}
