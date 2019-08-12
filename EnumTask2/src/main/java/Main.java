import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie pierwsze");
        Status status = Status.SUCCESS;
        System.out.println(status);
        status = Status.ERROR;
        System.out.println(status);
        System.out.println(Status.values().length);
    }
}


/*
OUTPUT:
        To jest komunikat dla statusu SUCCESS
        Dla statusu ERROR komunikat jest inny
        2*/