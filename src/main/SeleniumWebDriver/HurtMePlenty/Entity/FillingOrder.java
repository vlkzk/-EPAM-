package HurtMePlenty.Entity;

public class FillingOrder {
    private String countInstance;
    private String classVM;
    private String TypeInstance;
    private String localSSD;
    private String region;
    private String committedUsage;

    public FillingOrder(String countInstance, String classVM, String typeInstance, String localSSD, String region, String committedUsage) {
        this.countInstance = countInstance;
        this.classVM = classVM;
        TypeInstance = typeInstance;
        this.localSSD = localSSD;
        this.region = region;
        this.committedUsage = committedUsage;
    }

    public String getCountInstance() {
        return countInstance;
    }

    public void setCountInstance(String countInstance) {
        this.countInstance = countInstance;
    }

    public String getClassVM() {
        return classVM;
    }

    public void setClassVM(String classVM) {
        this.classVM = classVM;
    }

    public String getTypeInstance() {
        return TypeInstance;
    }

    public void setTypeInstance(String typeInstance) {
        TypeInstance = typeInstance;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }
}
