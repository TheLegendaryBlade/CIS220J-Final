//Colton Owen
//Final Project

public class Hypervisor {
    
    //Private Variables
    private String id;  //Identification for hypervisor
	private String name;    //Name of hypervisor
	private String version; //Version number of hypervisor
    private String releaseDate; //Release date of hypervisor
	
	//Default constructor
    public Hypervisor() {
	    this.id = "N/A";
	    this.name = "N/A";
	    this.version = "N/A";
        this.releaseDate = "N/A";
	}

    //Constructor for predetermined variables
	public Hypervisor(String id, String name, String version, String releaseDate) {
	    this.id = id;
	    this.name = name;
	    this.version = version;
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

    public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    }
}
