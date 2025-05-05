public static void supportedOSReport(Product[] products, OperatingSystem[] osList) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Supported Operating Systems Report ===");

    // Display all available products
    for (int i = 0; i < products.length; i++) {
        System.out.println((i + 1) + ". " + products[i].getName() + " (ID: " + products[i].getID() + ")");
    }

    System.out.print("Select a product by number: ");
    int choice = Integer.parseInt(scanner.nextLine());

    if (choice < 1 || choice > products.length) {
        System.out.println("Invalid selection.");
        return;
    }

    Product selectedProduct = products[choice - 1];
    String[] supportedIDs = selectedProduct.getsupportedOS().split(";");

    System.out.println("\nSupported Operating Systems for " + selectedProduct.getName() + ":");

    boolean found = false;
    for (OperatingSystem os : osList) {
        for (String id : supportedIDs) {
            if (os.getID().trim().equalsIgnoreCase(id.trim())) {
                // Print including system type (Windows/Linux)
                System.out.println("- " + os.getName() + " " + os.getVersion() +
                        " [" + os.getSystemType() + "] (" +
                        os.getHardware() + ", Released: " + os.getReleaseDate() + ")");
                found = true;
                break;
            }
        }
    }

    if (!found) {
        System.out.println("No supported operating systems found for this product.");
    }
}
