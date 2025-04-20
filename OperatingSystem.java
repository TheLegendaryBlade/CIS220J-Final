//Colton Owen
//Final Project

public class OperatingSystem {
    
    //Private Variables
    private String id;  //Identification for operating system
	private String name;    //Name of operating system
	private String version; //Version number of operating system
    private String hardware;    //Hardware used by operating system
    private String releaseDate; //Release date of operating system
	
	//Default constructor
	public OperatingSystem() {
	    this.id = "N/A";
	    this.name = "N/A";
	    this.version = "N/A";
        this.hardware = "N/A";
        this.releaseDate = "N/A";
	}
	
	//Constructor with given values
	public OperatingSystem(String id, String name, String version, String hardware, String releaseDate) {
	    this.id = id;
	    this.name = name;
	    this.version = version;
        this.hardware = hardware;
        this.releaseDate = releaseDate;
	}
	
	//Getters
    public String getID() {
    return id;
    }
    
    public String getName() {
    return name;
    }
    
    public String getVersion() {
    return version;
    }

    public String getHardware() {
    return hardware;
    }

    public String getReleaseDate() {
    return releaseDate;
    }
	
	//Setters
    public void setID(String id) {
    this.id = id;
    }

    public void setName(String name) {
    this.name = name;
    }

    public void setVersion(String version) {
    this.version = version;
    }

    public void setHardware(String hardware) {
    this.hardware = hardware;
    }

    public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    }
}