//Colton Owen
//Final Project

public class Software {
    
    //Private Variables
    private String id;  //Identification for software
	private String name;    //Name of software
	private String version; //Version number of software
    private String releaseDate; //Release date of software
	
	//Default constructor
    public Software() {
	    this.id = "N/A";
	    this.name = "N/A";
	    this.version = "N/A";
        this.releaseDate = "N/A";
	}
	public Software(String id, String name, String version, String releaseDate) {
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