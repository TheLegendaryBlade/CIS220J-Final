public static OperatingSystem[] loadOperatingSystems(String filename) throws IOException {
    List<OperatingSystem> osList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;

    while ((line = reader.readLine()) != null) {
        String[] parts = line.split(";");
        if (parts.length == 6) {
            osList.add(new OperatingSystem(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]));
        }
    }

    reader.close();
    return osList.toArray(new OperatingSystem[0]);
}

public static Software[] loadSoftware(String filename) throws IOException {
    List<Software> softwareList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;

    while ((line = reader.readLine()) != null) {
        String[] parts = line.split(";");
        if (parts.length == 5) {
            softwareList.add(new Software(parts[0], parts[1], parts[2], parts[3], parts[4]));
        }
    }

    reader.close();
    return softwareList.toArray(new Software[0]);
}
