import java.io.*;
import java.util.*;

public class ProductReport {
    static OperatingSystem[] operatingSystemList = new OperatingSystem[16];
    public static void main(String[] args) {
        //Reads data for operating systems and fills global array
        FillOSList();
        for (int i = 1; i < 16; i++) {
                System.out.println(operatingSystemList[i].getID())
            }
        //Reads data for software and fills global array

        //Reads data for hypervisors and fills global array

        //Reads data for products and fills global array

        //Prints menu
        printMenu();
        
    }

    public static void printMenu() {
        //Prints text for menu
        System.out.println("========== Main Menu ==========");
        System.out.println("1. Show all operating systems");
        System.out.println("2. Show all related software");
        System.out.println("3. Show all hypervisors");
        System.out.println("4. Show all products");
        System.out.println("5. Generate a report for a product");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        Scanner inputScan = new Scanner(System.in);
        String input = inputScan.nextLine(); //Takes input from user
        boolean goodInput = false; //Used to check if input is acceptable for the main menu
        while(goodInput == false){
            switch(input) {
            case "1":
                //Show list of all operating systems

                goodInput = true;
                break;
            case "2":
                //Show list of all software

                goodInput = true;
                break;
            case "3":
                //Show list of all hypervisors

                goodInput = true;
                break;
            case "4":
                //Show list of all products

                goodInput = true;
                break;
            case "5":
                //Show menu for report generation

                printReportMenu();
                goodInput = true;
                return;
            case "6":
                //Exit the menu and close the program

                System.exit(0);
            default:
                System.out.println("Please select an option from 1 to 6.");
                goodInput = false;
                printMenu();
                input = inputScan.nextLine(); //Takes input from user
            }
        }
        
    }

    public static void printReportMenu() {
        //Prints text for menu
        System.out.println("========== Product Report Menu ==========");
        System.out.println("1. Operating Systems report");
        System.out.println("2. Related Software report");
        System.out.println("3. Hypervisor report");
        System.out.println("4. Return to Main Menu");
        System.out.print("Enter your choice: ");
        
        Scanner scnr2 = new Scanner(System.in);
        String input2 = scnr2.nextLine(); //Takes input from user
        boolean goodInput2 = false; //Used to check if input is acceptable for the product report menu
        while(goodInput2 == false){
            switch(input2) {
            case "1":
                //Show list of all operating systems

            goodInput2 = true;
            break;
            case "2":
                //Show list of all software

            goodInput2 = true;
            break;
            case "3":
                //Show list of all hypervisors

            goodInput2 = true;
            break;
            case "4":
                //Return to original menu
                goodInput2 = true;
                printMenu();
            return;
            default:
            System.out.println("Please select an option from 1 to 4.");
            goodInput2 = false;
            printReportMenu();
            input2 = scnr2.nextLine(); //Takes input from user
            }
        }
    }
    
    public static void FillOSList() {
        operatingSystemList = new OperatingSystem[16]; //Creates array using global array
        try {
            File sysFile = new File("OperatingSystemList.txt"); //Opens the file
            Scanner fileReader = new Scanner(sysFile);
            for (int i = 1; i < 16; i++) {
                String [] strings = fileReader.nextLine().split(";"); //Splits line into array of strings
                operatingSystemList[i] = new OperatingSystem(); //Creates empty operating system object
                operatingSystemList[i].setID(strings[0]); //Sets ID for current operating system
                operatingSystemList[i].setName(strings[1]); //Sets name for current operating system
                operatingSystemList[i].setVersion(strings[2]); //Sets version number for current operating system
                operatingSystemList[i].setHardware(strings[3]); //Sets hardware for current operating system
                operatingSystemList[i].setReleaseDate(strings[4]); //Sets release date for current operating system
            }
        fileReader.close(); //Closes the file
        } catch (FileNotFoundException e) { //Checks if file not found and prints error message
        System.out.println("An error occurred while opening the operating system file.");
        }
    }
}
