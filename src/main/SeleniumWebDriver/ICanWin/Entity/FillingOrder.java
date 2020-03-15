package ICanWin.Entity;

public class FillingOrder {
    private String code;
    private String pasteName;

    public FillingOrder(String code, String pasteName) {
        this.code = code;
        this.pasteName = pasteName;
    }

    public String getCode() {
        return code;
    }

    public String getPasteName() {
        return pasteName;
    }
}
