public enum Status {
    SUCCESS("To jest komunikat dla statusu SUCCESS"),
    ERROR("Dla statusu ERROR komunikat jest inny");

    private  final String statusText;

    Status(String newStatusText) {
        this.statusText = newStatusText;
    }

    public String toString() {
        return statusText;
    }

}