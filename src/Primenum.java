import java.util.*;

public class Primenum {

    public static boolean prime(int a) {
        if (a >= 1 && a < 4) {
            return true;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner vr = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int a = vr.nextInt();

        vr.close();
        
        boolean result = prime(a);
        System.out.println(" Prime number is " + result);
    }
}