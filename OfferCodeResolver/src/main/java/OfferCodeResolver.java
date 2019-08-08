import java.util.Scanner;

public class OfferCodeResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfferCodeAnalyzer offer = new OfferCodeAnalyzer();

        System.out.println("Enter offercode to resolve: ");
        offer.setOfferCode(scanner.nextLine());
        offer.offerCodeAnalyzer();
    }
}