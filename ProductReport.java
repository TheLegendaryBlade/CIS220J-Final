import java.io.*;
import java.util.*;

public class ProductReport {
    //Global variables
    static OperatingSystem[] operatingSystemList = new OperatingSystem[16];
    static Software[] softwareList = new Software[15];
    static Hypervisor[] hypervisorList = new Hypervisor[5];
    static Product[] productList = new Product[10];
	
    public static void main(String[] args) {
        //Reads data for operating systems and fills global array
        fillOSList();
        //Reads data for software and fills global array
        fillSoftwareList();
        //Reads data for hypervisors and fills global array
        fillHypervisorList();
        //Reads data for products and fills global array
        fillProductList();
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
		allOsReport();

                goodInput = true;
                break;
            case "2":
                //Show list of all software
		allSoftwareReport();
                goodInput = true;
                break;
            case "3":
                //Show list of all hypervisors
		allHypervisorReport();
                goodInput = true;
                break;
            case "4":
                //Show list of all products
                allProductsReport();
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
                supportedOSReport();
            goodInput2 = true;
            break;
            case "2":
                //Show list of all software
		supportedSoftwareReport();
            goodInput2 = true;
            break;
            case "3":
                //Show list of all hypervisors
	        supportedHypervisorReport();
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
    
    public static void fillOSList() {
        operatingSystemList = new OperatingSystem[16]; //Creates array using global array
        try {
            File sysFile = new File("OperatingSystemList.txt"); //Opens the file
            Scanner fileReader = new Scanner(sysFile);
            for (int i = 0; i < 16; i++) {
                String [] strings = fileReader.nextLine().split(";"); //Splits line into array of strings
                operatingSystemList[i] = new OperatingSystem(); //Creates empty operating system object
                operatingSystemList[i].setID(strings[0]); //Sets ID for current operating system
                operatingSystemList[i].setName(strings[1]); //Sets name for current operating system
                operatingSystemList[i].setVersion(strings[2]); //Sets version number for current operating system
                operatingSystemList[i].setHardware(strings[3]); //Sets hardware for current operating system
                operatingSystemList[i].setReleaseDate(strings[4]); //Sets release date for current operating system
		operatingSystemList[i].setSystemType(strings[5]); //Sets system type for current operating system
            }
        fileReader.close(); //Closes the file
        } catch (FileNotFoundException e) { //Checks if file not found and prints error message
        System.out.println("An error occurred while opening the operating system file.");
        }
    }

    public static void fillSoftwareList() {
        softwareList = new Software[15]; //Creates array using global array
        try {
            File sysFile = new File("SoftwareList.txt"); //Opens the file
            Scanner fileReader = new Scanner(sysFile);
            for (int i = 0; i < 15; i++) {
                String [] strings = fileReader.nextLine().split(";"); //Splits line into array of strings
                softwareList[i] = new Software(); //Creates empty software object
                softwareList[i].setID(strings[0]); //Sets ID for current software
                softwareList[i].setName(strings[1]); //Sets name for current software
                softwareList[i].setVersion(strings[2]); //Sets version number for current software
                softwareList[i].setReleaseDate(strings[3]); //Sets release date for current software
		softwareList[i].setSoftwareType(strings[4]); //Sets release date for current software
            }
        fileReader.close(); //Closes the file
        } catch (FileNotFoundException e) { //Checks if file not found and prints error message
        System.out.println("An error occurred while opening the software file.");
        }
    }

    public static void fillHypervisorList() {
        hypervisorList = new Hypervisor[5]; //Creates array using global array
        try {
            File sysFile = new File("HypervisorList.txt"); //Opens the file
            Scanner fileReader = new Scanner(sysFile);
            for (int i = 0; i < 5; i++) {
                String [] strings = fileReader.nextLine().split(";"); //Splits line into array of strings
                hypervisorList[i] = new Hypervisor(); //Creates empty hypervisor object
                hypervisorList[i].setID(strings[0]); //Sets ID for current hypervisor
                hypervisorList[i].setName(strings[1]); //Sets name for current hypervisor
                hypervisorList[i].setVersion(strings[2]); //Sets version number for current hypervisor
                hypervisorList[i].setReleaseDate(strings[3]); //Sets release date for current hypervisor
            }
        fileReader.close(); //Closes the file
        } catch (FileNotFoundException e) { //Checks if file not found and prints error message
        System.out.println("An error occurred while opening the hypervisor file.");
        }
    }

    public static void fillProductList() {
        productList = new Product[10]; //Creates array using global array
        try {
            File sysFile = new File("ProductList.txt"); //Opens the file
            Scanner fileReader = new Scanner(sysFile);
            for (int i = 0; i < 10; i++) {
                String [] strings = fileReader.nextLine().split(";"); //Splits line into array of strings
                productList[i] = new Product(); //Creates empty product object
                productList[i].setID(strings[0]); //Sets ID for current product
                productList[i].setName(strings[1]); //Sets name for current product
                productList[i].setVersion(strings[2]); //Sets version for current product
                productList[i].setSupportedOS(strings[3]); //Sets list of supported operating systems for current product
                productList[i].setSupportedSoftware(strings[4]); //Sets list of supported software for current product
                productList[i].setSupportedHypervisors(strings[5]); //Sets list of supported hypervisors for current product
            }
        fileReader.close(); //Closes the file
        } catch (FileNotFoundException e) { //Checks if file not found and prints error message
        System.out.println("An error occurred while opening the operating system file.");
        }
    }
	
	public static void allOsReport() {
		System.out.println("List of All Operating Systems\n");
		System.out.println("Windows Operating Systems:");
        	for (OperatingSystem os : operatingSystemList) {
            		if (os.getSystemType().equalsIgnoreCase("Windows")) {
                		System.out.println(" - " + os.getID() + "  " + os.getName() + " " + os.getVersion() + " " + os.getHardware() + " " + os.getReleaseDate());
            		}
        	}

		System.out.println("\nLinux Operating Systems:");
        	for (OperatingSystem os : operatingSystemList) {
            		if (os.getSystemType().equalsIgnoreCase("Linux")) {
                		System.out.println(" - " + os.getID() + "  " + os.getName() + " " + os.getVersion() + " " + os.getHardware() + " " + os.getReleaseDate());
	        	}
        	}
	}
	
    // This method displays the all products report (case 4)
	public static void allProductsReport() {
		System.out.println("All Products");
		System.out.printf("%-48s %-10s\n", "Name", "Version"); // The '%' begins a column | the '-' left aligns the text (remove it to right align) | the 48s and 10s gives the column a width of that many characters  
		
		for (int i = 0; i < productList.length; i++) {
			Product p = productList[i]; // get product list
			System.out.printf("%-48s %-10s\n", p.getName(), p.getVersion());
		}
	}
    
     // This method displays the supported operating systems for a selected product
    public static void supportedOSReport() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Supported Operating Systems Report ===");

    // Display all products
    for (int i = 0; i < productList.length; i++) {
        System.out.println((i + 1) + ". " + productList[i].getName() + " (ID: " + productList[i].getID() + ")");
    }

    // Let user choose a product
    System.out.print("Select a product by number: ");
    int choice = Integer.parseInt(scanner.nextLine());

    if (choice < 1 || choice > productList.length) {
        System.out.println("Invalid selection.");
        return;
    }

    Product selectedProduct = productList[choice - 1];
    String[] supportedIDs = selectedProduct.getsupportedOS().split(",");

    // Separate lists for Windows and Linux
    List<String> windowsOS = new ArrayList<>();
    List<String> linuxOS = new ArrayList<>();

    // Classify supported OS by systemType
    for (OperatingSystem os : operatingSystemList) {
        for (String id : supportedIDs) {
            if (os.getID().trim().equalsIgnoreCase(id.trim())) {
                String osInfo = os.getName() + " " + os.getVersion() + " (" + os.getHardware() + ", Released: " + os.getReleaseDate() + ")";
                if (os.getSystemType().equalsIgnoreCase("Windows")) {
                    windowsOS.add(osInfo);
                } else if (os.getSystemType().equalsIgnoreCase("Linux")) {
                    linuxOS.add(osInfo);
                }
                break;
            }
        }
    }

    System.out.println("\nSupported Operating Systems for " + selectedProduct.getName() + ":");

    if (linuxOS.isEmpty() && windowsOS.isEmpty()) {
        System.out.println("No supported operating systems found for this product.");
        return;
    }

    if (!windowsOS.isEmpty()) {
        System.out.println("\n=== Windows Operating Systems ===");
        for (String os : windowsOS) {
            System.out.println("- " + os);
        }
    }

    if (!linuxOS.isEmpty()) {
        System.out.println("\n=== Linux Operating Systems ===");
        for (String os : linuxOS) {
            System.out.println("- " + os);
        }
    }
}
	
    public static void allSoftwareReport() {
	//Print the report title and the headers
        System.out.println("All Related Software Report");
	System.out.printf("%10s%-30s %-10s %-15s\n", "", "Name", "Version", "Release Date");
	
	//Define software categories and their labels
	String[] categories = { "Cloud", "Data", "LDAP", "Web" };
    	String[] headers = { "Cloud Platform", "Databases", "Ldap Servers", "Web Servers" };

	//Loop through each category and print a black line before every group
    	for (int i = 0; i < categories.length; i++) {
    	    if (i != 0) {
      	      System.out.println();
      	  } 
		
	  //Print the group header 
      	  System.out.println(headers[i]);
		
	  // Loop through each software item	
          for (Software sw : softwareList) { 
		   // If the software type matches the current category, print its details
         	   if (sw.getSoftwareType().equalsIgnoreCase(categories[i])) {
          	      System.out.printf("%10s%-30s %-10s %-15s\n", "", sw.getName(), sw.getVersion(), sw.getReleaseDate());
		   }
		}
    	}    
    }	    
    public static void allHypervisorReport() {//start of hypervisor report class
	    System.out.println(); // move to next line 
	    System.out.printf("All Hypervisors\n"); //print 
	    System.out.printf( "%14s %29s %22s","Name" , "Version" , "Release Date\n"); //will print info in proper format
		
		for(Hypervisor hv : hypervisorList) { // will iterate thorugh array for hypervisor list  
            System.out.printf("%10s%-26s %-15s  %6s\n"," ", hv.getName(), hv.getVersion(), hv.getReleaseDate()); // will print and format when reading file 		
        }
    }//end of allHypervisorReport class	
    
public static void supportedSoftwareReport() {
    Scanner input = new Scanner(System.in);
    System.out.println("Product Names:\n");
    // Show a numbered list of all available products
    for (int i = 0; i < productList.length; i++) {
        if (productList[i] != null) {
            String productName = productList[i].getName();
            String productVersion = productList[i].getVersion();
            System.out.printf("%2d. %s %s\n", i + 1, productName, productVersion);
        }
    }

    int index = -1;

    while (true) {
        System.out.print("\nEnter a number to choose a product: ");
        String userInput = input.nextLine();

        // Check if input is a number
        if (!userInput.matches("\\d+")) {
            System.out.println("Please enter a valid number.");
            continue;
        }

        index = Integer.parseInt(userInput) - 1;

        // Check if number is in valid range
        if (index < 0 || index >= productList.length || productList[index] == null) {
            System.out.println("That number is not a valid product.");
            continue;
        }

        // Valid input, exit loop
        break;
    }

    // Report Output Section
    Product selected = productList[index];
    String name = selected.getName();
    String version = selected.getVersion();

    // Print the product title
    System.out.println();
    System.out.println(name + " " + version + " - Supported Related Software");

    // Get the supported software ID list
    String raw = selected.getsupportedSoftware();
    if (raw == null || raw.equalsIgnoreCase("None") || raw.trim().isEmpty()) {
        System.out.println();
        System.out.println("None Supported");
        return;
    }

    // Match Software to Product
    String[] supportedIDs = raw.split(",");
    List<Software> matched = new ArrayList<>();

    // Go through each supported ID and match it with software list
    for (String id : supportedIDs) {
        id = id.trim(); // Clean up spaces
        for (Software sw : softwareList) {
            if (sw != null && sw.getID().equalsIgnoreCase(id)) {
                matched.add(sw); // Add if match found
                break;
            }
        }
    }

    // If nothing matched, let the user know
    if (matched.isEmpty()) {
        System.out.println();
        System.out.println("None Supported");
        return;
    }

    // Display Matched Software
    String[] categories = { "Cloud", "Data", "LDAP", "Web" };
    String[] headers = { "Cloud Platform", "Databases", "LDAP Servers", "Web Servers" };

    // Print column headers
    System.out.printf("%10s%-44s %-10s\n", "", "Name", "Version");

    // Go through each category and print matching software
    for (int i = 0; i < categories.length; i++) {
        boolean printedHeader = false;

        for (Software sw : matched) {
            if (sw.getSoftwareType().equalsIgnoreCase(categories[i])) {
                if (!printedHeader) {
                    System.out.println(headers[i]); // Print category name
                    printedHeader = true;
                }

                // Print software name and version
                System.out.printf("%10s%-44s %-10s\n", "", sw.getName(), sw.getVersion());
            }
        }
    }

    // Extra space after report
    System.out.println();
} 
       public static void supportedHypervisorReport() {
	    int index = 1; //intialize index for number list 
	    System.out.println(); //space 
	    System.out.println("===Supported Hypervisor Product Report==="); // beginning of hypervisor prod report 
	    
	    	for (Product prod : productList) { // will iterate through product list 
			System.out.println( (index++)  + "."+ prod.getName() + " " + prod.getVersion()); //list number 1-10 with product and version
		}
		System.out.println();
	    
	    Scanner prodinput = new Scanner(System.in);  //input 
            
		
		boolean number = true;
		int input = 0;
		
		while (number) {
	    System.out.println("Enter a number 1-10 to generate a Supported Hypervisor Product report:"); 
	    
        try {
            input = Integer.parseInt(prodinput.nextLine()); //convert str into int

            if (input >= 1 && input <= productList.length) {  //
                break;  //  will exit loop
            } else {
				System.out.println();
                System.out.println("Invalid number. Please try again:"); //invalid num out of range will ask user to nput number again 
            }
        } catch (NumberFormatException e) {
			System.out.println();
            System.out.println("Invalid input-- Please try again:"); //
        }
    }
		
		
	    Product select = productList[input - 1];
	    String[] supportedIDs = select.getsupportedHypervisors().split(",");
	    
  	    // these lines will print name and version for hypervisor report 
	    System.out.println();
	    System.out.println("Report:");
            System.out.println(select.getName() + " " + select.getVersion() + " - " + "Supported Hypervisors"); 

            boolean bool = true;
	    
	    for (Hypervisor hypervisor: hypervisorList) {
		    for (String id : supportedIDs) {
			    if (hypervisor.getID().trim().equalsIgnoreCase(id.trim())) {
				    if (bool) {
					    // will format name and version to desired format
					    System.out.printf("%10s%-24s %-10s\n", " ", "Name", "Version");
					    bool = false;
				    } 
				    System.out.printf("%10s%-24s %-10s\n", " ", hypervisor.getName(), hypervisor.getVersion()); // print name and version of hypervisor 
				    break;
			    }
		    }
	    }
	    if (bool) { // print none supproted for product 
		    System.out.println();
		    System.out.println("None Supported");
	    }
    }
}
