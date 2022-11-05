import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        do {
            userNumber = sc.nextInt();

            if (myNumber == userNumber){
                System.out.println("Wohoooooooooo, correct ans!");
                break;
            } else if (myNumber > userNumber) {
                System.out.println("It's less, try again");
            } else {
                System.out.println("It's more, try again");
            }
        }while(userNumber>=0);

        System.out.println("The Correct Number is :");
        System.out.println(myNumber);
    }
}
