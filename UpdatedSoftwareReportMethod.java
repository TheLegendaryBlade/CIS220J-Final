public static void supportedSoftwareReport(Product[] products, Software[] softwareList) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Supported Software Report ===");

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
    String[] supportedIDs = selectedProduct.getsupportedSoftware().split(";");

    System.out.println("\nSupported Software for " + selectedProduct.getName() + ":");

    boolean found = false;
    for (Software sw : softwareList) {
        for (String id : supportedIDs) {
            if (sw.getID().trim().equalsIgnoreCase(id.trim())) {
                System.out.println("- " + sw.getName() + " " + sw.getVersion() +
                        " [" + sw.getSoftwareType() + "] (Released: " + sw.getReleaseDate() + ")");
                found = true;
                break;
            }
        }
    }

    if (!found) {
        System.out.println("No supported software found for this product.");
    }
}