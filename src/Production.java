import java.lang.String;

public class Production {
    public static int IceCreamYN(int YN) {
        int res = 0;
        if(YN == 1) {
            res = 1;
        }
        else if(YN == 2) {
            res = 2;
        }
        else { res = 0;}
        return res;
    }

    public static String IceCreamChoice(int numberHere) {
        String iceCream = "";
        switch(numberHere) {
            case 1:
                iceCream = "You have chosen chocolate flavor.";
                break;
            case 2:
                iceCream = "You have chosen vanilla flavor";
                break;
            case 3:
                iceCream = "You have chosen strawberry flavor";
                break;
            default:
                iceCream = "Error.";

        }
        return iceCream;
    }
}


