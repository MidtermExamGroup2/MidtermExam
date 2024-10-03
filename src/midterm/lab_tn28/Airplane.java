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
    private int numRows;
    private int numCols;
    
    public Airplane(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.seats = new int [numRows][numRows];
    }
}
