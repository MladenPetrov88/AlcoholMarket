import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());
        double rakiaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiaPrice - (0.4 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.8 * rakiaPrice);
        double rakiaAmount = rakia * rakiaPrice;
        double wineAmount = wine * winePrice;
        double beerAmount = beer * beerPrice;
        double whiskeyAmount = whiskey * whiskeyPrice;
        double totalCost = rakiaAmount + wineAmount + beerAmount + whiskeyAmount;
        System.out.printf("%.2f", totalCost);
    }
}
