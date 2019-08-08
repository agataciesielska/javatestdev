import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie pierwsze");
        Status status = Status.SUCCESS;
        System.out.println(status);
        status = Status.ERROR;
        System.out.println(status);
        System.out.println(Status.values().length);
        System.out.println("Zadanie drugie:");
        System.out.println(StringUtils.capitalize("maven"));
    }
}


/*
OUTPUT:
        To jest komunikat dla statusu SUCCESS
        Dla statusu ERROR komunikat jest inny
        2*/