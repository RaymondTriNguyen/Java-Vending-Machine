import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(System.in);
        //C:\Users\nguye\IdeaProjects\Classes
        char buyMore = 'Y';
        int money = 10;
        int laysStock = 5;
        int cocaColaStock = 5;
        int miniOreosStock = 5;
        int pepsiStock = 5;
        int doritosStock = 5;
        {
do{
                System.out.println("* You encounter a vending machine.\n* Buy something? (Y/N)");
                char yesOrNo = sc.nextLine().charAt(0);
                switch (yesOrNo) {

                    case 'Y':
                        System.out.println("* Your options are:");
                        System.out.println("* 1. Lays Chips: $2 (" + laysStock + ")");
                        System.out.println("* 2. Coca-Cola: $1 (" + cocaColaStock + ")");
                        System.out.println("* 3. Mini-Oreos: $2 (" + miniOreosStock + ")");
                        System.out.println("* 4. Pepsi: $1 (" + pepsiStock + ")");
                        System.out.println("* 5. Doritos: $2 (" + doritosStock + ")");
                        System.out.println("* You have $" + money + ".");
                        System.out.println("* What should you buy? (1-5)");
                        int whatToBuy = sc.nextInt();
                        System.out.println("* How many would you like?");
                        int howMany = sc.nextInt();
                        switch (whatToBuy) {
                            case 1:
                            case 3:
                            case 5:
                                int price = 2 * howMany;
                                switch (whatToBuy) {

                                    case 1:
                                        if (howMany <= laysStock) {
                                            if (price <= money) {
                                                System.out.println("* You bought the Lays (" + howMany + ").");
                                                System.out.println("* Buy more? (Y/N)");
                                            } else {
                                                System.out.println("* Sorry, you can't afford that.");
                                            }
                                        } else {
                                            System.out.println("There isn't enough.");
                                        }
                                        laysStock = laysStock - howMany;
                                        break;
                                    case 3:
                                        if (howMany <= miniOreosStock) {
                                            if (price <= money) {
                                                System.out.println("* You bought the Mini-Oreos (" + howMany + ").");
                                                System.out.println("* Buy more? (Y/N)");
                                            } else {
                                                System.out.println("* Sorry, you can't afford that.");
                                            }
                                        } else {
                                            System.out.println("There isn't enough.");
                                        }
                                        miniOreosStock = miniOreosStock - howMany;
                                        break;
                                    case 5:
                                        if (howMany <= doritosStock) {
                                            if (price <= money) {
                                                System.out.println("* You bought the Doritos (" + howMany + ").");
                                                System.out.println("* Buy more? (Y/N)");
                                            } else {
                                                System.out.println("* Sorry, you can't afford that.");
                                            }
                                        } else {
                                            System.out.println("There isn't enough.");
                                        }
                                        doritosStock = doritosStock - howMany;
                                        break;
                                    default:
                                        System.out.println("WARNING: CRITICAL ERROR");
                                }
                                money = money - price;
                                break;

                            case 2:
                            case 4:
                                price = 1 * howMany;
                                switch (whatToBuy) {
                                    case 2:
                                        if (howMany <= cocaColaStock) {
                                            if (price <= money) {
                                                System.out.println("* You bought the Coca-Cola (" + howMany + ").");
                                                System.out.println("* Buy more? (Y/N)");
                                            } else {
                                                System.out.println("* Sorry, you can't afford that.");
                                            }
                                        } else {
                                            System.out.println("There isn't enough.");
                                        }
                                        cocaColaStock = cocaColaStock - howMany;
                                        break;
                                    case 4:
                                        if (howMany <= pepsiStock) {
                                            if (price <= money) {
                                                System.out.println("* You bought the Pepsi (" + howMany + ").");
                                                System.out.println("* Buy more? (Y/N)");
                                            } else {
                                                System.out.println("* Sorry, you can't afford that.");
                                            }
                                        } else {
                                            System.out.println("There isn't enough.");
                                        }
                                        pepsiStock = pepsiStock - howMany;
                                        break;
                                    default:
                                        System.out.println("WARNING: CRITICAL ERROR");
                                }
                                money = money - price;
                                break;
                        }
                        buyMore = sc.next().charAt(0);
                        break;
                    case 'N':
                        System.out.println("* You escaped the vending machine.");
                        buyMore='N';
                        break;
                    default:
                        System.out.println("ERROR: Invalid option, please try again.");
                }
            }
            while (buyMore == 'Y');
        }
    }
}