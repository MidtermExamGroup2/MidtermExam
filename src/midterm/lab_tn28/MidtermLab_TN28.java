package midterm.lab_tn28;

/**
 * @author Group2-TN28
 * The Main Class for the Airplane Seat Reservation System.
 * 
 * Allows users to view seats, check availability, and manage passenger seat reservations.
 * 
 * Features:
 * View Airplane Seats
 * Check if a seat is available
 * Create new Passenger(Regular or VIP)
 * Access Passenger Menu for booking and cancellation
 * 
 */
import java.util.Scanner;
public class MidtermLab_TN28 {
    
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
        
        
        //Loop for the Main Menu
        while(true){
            System.out.println();
            System.out.println("[1] View Airplane Seats");
            System.out.println("[2] Check if seat is available");
            System.out.println("[3] Create new Passenger");
            System.out.println("[4] Create new VIP Passenger");
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
                    userAge = scanner.nextInt(); //read age

                    // Create a new Passenger and set attributes
                    Passenger newPassenger = new Passenger();
                    newPassenger.setFirstName(userFirstName);
                    newPassenger.setLastName(userLastName);
                    newPassenger.setAge(userAge);

                    // Store the newPassenger object to the passenger array with respect to the passengerIndex.
                    //Increment passengerIndex after.
                    passenger[passengerIndex] = newPassenger; 
                    passengerIndex++;
                    System.out.println("Passenger created...");
                    break;
                    
                case 4: // Create new VIP-Passenger
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

                    // Store the newVipPassenger object to the passenger array with respect to the passengerIndex.
                    //Increment passengerIndex after.
                    passenger[passengerIndex] = newVipPassenger;
                    passengerIndex++;
                    System.out.println("Passenger created...");
                    break;
                    
                case 5: //Passenger Menu
                    int foundUserIndex = -1;
                    boolean isPassengerFound = false;
                    scanner.nextLine();
                    System.out.print("Enter Last Name of existing Passenger: ");
                    userLastName = scanner.nextLine();
                    
                    for(int i = 0; i < passengerCount; i++){
                        //Condition only runs if the object has been instantiated and if the inputted last name exists.
                        //Sets isPassengerFound to true and sets the foundUserIndex to the index of the found user.
                        if(passenger[i] != null && passenger[i].getLastName().equalsIgnoreCase(userLastName)){
                            isPassengerFound = true;
                            foundUserIndex = i;
                            System.out.println("Passenger Found");
                            break;
                        }
                    }
                    if(isPassengerFound){ //Only runs if Passenger is Found
                    while(true){ //Loop for the Passenger Menu
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
                            if(userRow>rows || userRow<=0){
                                System.out.println("Out of Bounds");
                                break;
                            }
                            System.out.print("Enter Seat Column: ");
                            userColumn = scanner.nextInt();
                            if(userColumn>columns || userRow<=0){
                                System.out.println("Out of Bounds");
                                break;
                            }
                            //Displays if seat is not available
                            if(!airplane.isSeatAvailable(--userRow, --userColumn)){
                                System.out.println("Seat not available");
                                System.out.println("Press enter to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            }
                            //Displays the types of ticket a Passenger can book
                            System.out.println("[1] Business");
                            System.out.println("[2] Economy");
                            System.out.print("Choice: ");
                            choice = scanner.nextInt();
                            //Sets the userTicketType string to the correct value based on the user's choice
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
                            //Calls reserveSeat function of Passenger instance while passing the given arguments
                            passenger[foundUserIndex].reserveSeat(userRow, userColumn, userTicketType, airplane);
                            
                            System.out.println("Reserved Seat Successfully.");
                            break;
                            
                        case 3://Cancel Booking
                            userRow = passenger[foundUserIndex].getRow();
                            userColumn = passenger[foundUserIndex].getColumn();

                            passenger[foundUserIndex].cancelBooking();
                            airplane.setSeatStatus(userRow, userColumn, 0);
                            break;
                       
                        case 4:  //Exit out of the Passenger Menu switch
                            break;
                        }
                    if(choice==4)//If choice = 4 then exit out of the Passenger Menu Loop
                    break;
                    }    
                }
                  break;
                  
                case 6://If choice = 6 then exit out of the Main Menu Switch
                    break;

            }
            if(choice==6){//If choice = 6 then exit out of the Main Menu loop
                break;
            }
        }
    }
}
