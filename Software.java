//Colton Owen
//Final Project

public class Software {
    
    //Private Variables
    private String id;  //Identification for software
    private String name;    //Name of software
    private String version; //Version number of software
    private String releaseDate; //Release date of software
    private String softwareType; //Type of software
	
	//Default constructor
    public Software() {
	this.id = "N/A";
	this.name = "N/A";
	this.version = "N/A";
        this.releaseDate = "N/A";
	}
	public Software(String id, String name, String version, String releaseDate, String softwareType) {
	this.id = id;
	this.name = name;
	this.version = version;
        this.releaseDate = releaseDate;
	this.softwareType = softwareType;
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

    public String getSoftwareType() {
    return softwareType;
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

    public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
    }
}
