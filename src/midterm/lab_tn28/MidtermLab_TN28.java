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
        int passengerIndex = 0;
        int passengerCount = 100;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many rows of seats: ");
        rows = scanner.nextInt();
        System.out.print("Enter how many columns of seats: ");
        columns = scanner.nextInt();
        
        
        Airplane airplane = new Airplane(rows, columns);
        Passenger passenger[] = new Passenger[passengerCount];
        
        
        
        while(true){
            System.out.println();
            System.out.println("[1] View Airplane Seats");
            System.out.println("[2] Check if seat is available");
            System.out.println("[3] Create new Passenger");
            System.out.println("[4]Create new VIP Passenger");
            System.out.println("[5] Passenger Menu");
            System.out.println("[6] Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            switch(choice){
                case 1://View Airplane Seats
                    airplane.displaySeats();
                    System.out.println();
                    System.out.println("Press Enter to Continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;  
                
                case 2://Check if seat is available
                    int userRow;
                    int userColumn;
                    String userFirstName;
                    String userLastName;
                    int userAge;
                            
                    System.out.print("Enter seat row: ");
                    userRow = scanner.nextInt();
                    System.out.print("Enter seat column: ");
                    userColumn = scanner.nextInt();
                    
                    if(airplane.isSeatAvailable(--userRow, --userColumn)){
                        System.out.println("Seat is Available.");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                        scanner.nextLine();
                                }
                        else{
                        System.out.println("Seat not available.");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                        scanner.nextLine();
                                }
                    break;
                    
                case 3://Create new Passenger
                    scanner.nextLine(); // Consume the newline left-over
                    System.out.print("Enter First Name: ");
                    userFirstName = scanner.nextLine(); //  read the first name

                    System.out.print("Enter Last Name: ");
                    userLastName = scanner.nextLine(); //  read the last name

                    System.out.print("Enter Age: ");
                    userAge = scanner.nextInt();

                    // Create a new Passenger and set attributes
                    Passenger newPassenger = new Passenger();
                    newPassenger.setFirstName(userFirstName);
                    newPassenger.setLastName(userLastName);
                    newPassenger.setAge(userAge);

                    passenger[passengerIndex] = newPassenger; // Store the passenger
                    passengerIndex++;
                    System.out.println("Passenger created...");
                    break;
                case 4:
                    scanner.nextLine(); // Consume the newline left-over
                    System.out.print("Enter First Name: ");
                    userFirstName = scanner.nextLine(); //  read the first name

                    System.out.print("Enter Last Name: ");
                    userLastName = scanner.nextLine(); //  read the last name

                    System.out.print("Enter Age: ");
                    userAge = scanner.nextInt();

                    // Create a new Passenger and set details
                    Vip_Passenger newVipPassenger = new Vip_Passenger();
                    newVipPassenger.setFirstName(userFirstName);
                    newVipPassenger.setLastName(userLastName);
                    newVipPassenger.setAge(userAge);

                    passenger[passengerIndex] = newVipPassenger; // Store the passenger
                    passengerIndex++;
                    System.out.println("Passenger created...");
                    break;
                case 5: 
                    int foundUserIndex = -1;
                    boolean isPassengerFound = false;
                    scanner.nextLine();
                    System.out.print("Enter Last Name of existing Passenger: ");
                    userLastName = scanner.nextLine();
                    
                    for(int i = 0; i < passengerCount; i++){
                        if(passenger[i] != null && passenger[i].getLastName().equalsIgnoreCase(userLastName)){
                            isPassengerFound = true;
                            foundUserIndex = i;
                            System.out.println("Passenger Found");
                            break;
                        }
                    }
                    if(isPassengerFound){
                    while(true){
                    System.out.println("-------------------");
                    System.out.println("[1] Display Passenger Details");
                    System.out.println("[2] Reserve Booking");
                    System.out.println("[3] Cancel Booking");
                    System.out.println("[4] Exit");
                    System.out.println("-------------------");
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    
                    switch(choice){
                        case 1: //Display Passenger Details
                            passenger[foundUserIndex].displayDetails();
                            break;
                            
                        case 2: //Reserve Seat
                            String userTicketType;
                            
                            System.out.print("Enter seat row: ");
                            userRow = scanner.nextInt();
                            if(userRow>rows){
                                System.out.println("Out of Bounds");
                                break;
                            }
                                
                            
                            System.out.print("Enter Seat Column: ");
                            userColumn = scanner.nextInt();
                            if(userColumn>columns){
                                System.out.println("Out of Bounds");
                                break;
                            }
                            
                            if(!airplane.isSeatAvailable(--userRow, --userColumn)){
                                System.out.println("Seat not available");
                                System.out.println("Press enter to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            }
                                
                            
                            System.out.println("[1] Business");
                            System.out.println("[2] Economy");
                            System.out.print("Choice: ");
                            choice = scanner.nextInt();
                            switch(choice){
                                case 1: 
                                    userTicketType = "Business";
                                    break;
                                    
                                case 2:
                                    userTicketType = "Economy";
                                    break;
                                    
                                default:
                                    userTicketType = "Default";
                                    break;
                            }
                            if(userTicketType.equals("Default")){
                                break;
                            }
                            passenger[foundUserIndex].reserveSeat(userRow, userColumn, userTicketType, airplane);
                            
                            System.out.println("Reserved Seat Successfully.");
                            break;
                            
                        case 3://Cancel Booking
                            userRow = passenger[foundUserIndex].getRow();
                            userColumn = passenger[foundUserIndex].getColumn();
                            airplane.setSeatStatus(userRow, userColumn, 0);
                            passenger[foundUserIndex].setRow(-1);
                            passenger[foundUserIndex].setColumn(-1);
                            break;
                       
                        case 4: 
                            break;
                        }
                    if(choice==4)//If choice = 4 then exit out of the infinite loop
                    break;
                    }    
                }
                  break;
                  
                case 6://If choice = 6 then exit out of the switch
                    break;

            }
            if(choice==6){//If choice = 6 then exit out of the infinite loop
                break;
            }
        }
    }
    
}
