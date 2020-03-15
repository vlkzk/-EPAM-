package BringItOn.Entity;

public class FillingOrder {
    private String code;
    private String pasteName;
    private String bash;

    public FillingOrder(String code, String pasteName, String bash) {
        this.code = code;
        this.pasteName = pasteName;
        this.bash = bash;
    }

    public String getBash() {
        return bash;
    }

    public String getCode() {
        return code;
    }

    public String getPasteName() {
        return pasteName;
    }
}
