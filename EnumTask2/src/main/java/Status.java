public class Status {
    String message;
    public static final Status SUCCESS = new Status("To jest komunikat dla statusu SUCCESS");
    public static final Status ERROR = new Status("Dla statusu ERROR komunikat jest inny");

    public Status(String message) {
        this.message = message;
    }

    public static String[] values() {
        return new String[] {SUCCESS.message, ERROR.message};
    }

    public String toString() {
        return message;
    }

}
