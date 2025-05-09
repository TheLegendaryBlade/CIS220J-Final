//Colton Owen
//Final Project

public class Product {
    
    //Private Variables
    private String id; //Identification for product
	private String name; //Name of product
	private String version; //Version number of product
    private String supportedOS; //Operating systems supported by product
    private String supportedSoftware; //Software supported by product
    private String supportedHypervisors; //Hypervisors supported by product
	
	//Default constructor
    public Product() {
	    this.id = "N/A";
	    this.name = "N/A";
        this.version = "N/A";
	    this.supportedOS = "N/A";
        this.supportedSoftware = "N/A";
        this.supportedHypervisors = "N/A";
	}
	
	public Product(String id, String name, String supportedOS, String supportedSoftware, String supportedHypervisors, String releaseDate) {
	    this.id = id;
	    this.name = name;
        this.version = version;
	    this.supportedOS = supportedOS;
        this.supportedSoftware = supportedSoftware;
        this.supportedHypervisors = supportedHypervisors;
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
    
    public String getsupportedOS() {
    return supportedOS;
    }

    public String getsupportedSoftware() {
    return supportedSoftware;
    }

    public String getsupportedHypervisors() {
    return supportedHypervisors;
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

    public void setSupportedOS(String supportedOS) {
    this.supportedOS = supportedOS;
    }

    public void setSupportedSoftware(String supportedSoftware) {
    this.supportedSoftware = supportedSoftware;
    }

    public void setSupportedHypervisors(String supportedHypervisors) {
    this.supportedHypervisors = supportedHypervisors;
    }
}
