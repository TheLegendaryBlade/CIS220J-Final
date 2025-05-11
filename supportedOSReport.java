public static void supportedOSReport(Product[] products, OperatingSystem[] osList) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Supported Operating Systems Report ===");

    // Display all products
    for (int i = 0; i < products.length; i++) {
        System.out.println((i + 1) + ". " + products[i].getName() + " (ID: " + products[i].getID() + ")");
    }

    // Let user choose a product
    System.out.print("Select a product by number: ");
    int choice = Integer.parseInt(scanner.nextLine());

    if (choice < 1 || choice > products.length) {
        System.out.println("Invalid selection.");
        return;
    }

    Product selectedProduct = products[choice - 1];
    String[] supportedIDs = selectedProduct.getsupportedOS().split(";");

    // Separate lists for Windows and Linux
    List<String> windowsOS = new ArrayList<>();
    List<String> linuxOS = new ArrayList<>();

    // Classify supported OS by systemType
    for (OperatingSystem os : osList) {
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
        System.out.println("\n--- Windows Operating Systems ---");
        for (String os : windowsOS) {
            System.out.println("- " + os);
        }
    }

    if (!linuxOS.isEmpty()) {
        System.out.println("\n--- Linux Operating Systems ---");
        for (String os : linuxOS) {
            System.out.println("- " + os);
        }
    }
}