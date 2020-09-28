import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want ice cream?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        Scanner input = new Scanner(System.in);
        int placeHolderName = Production.IceCreamYN(input.nextInt());
        if (placeHolderName == 1) {
            System.out.println("What flavor would you like?");
            System.out.println("[1] Chocolate");
            System.out.println("[2] Vanilla");
            System.out.println("[3] Strawberry");
            System.out.println(Production.IceCreamChoice(input.nextInt()));
        }
        else if(placeHolderName == 2) {
            System.out.println("Goodbye");
        }
        else {
            System.out.println("error");
        }

    }
}
