/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm.lab_tn28;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class MidtermLab_TN28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many rows of seats: ");
        rows = scanner.nextInt();
        System.out.print("Enter how many columns of seats: ");
        columns = scanner.nextInt();
        
        
        Airplane airplane = new Airplane(rows, columns);
        
    }
    
}
