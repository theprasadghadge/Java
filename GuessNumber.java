import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = (int) (Math.random() * 100);
            System.out.println(a);
            int number = 0;

            do
            {
                System.out.print("Gess the Number : ");
                number = sc.nextInt();
                if (number==a){
                    System.out.println("yheee ! Your Guess is Correct");
                }
                else if (number > a ){
                    System.out.println("No It is Small");
                }
                else{
                    System.out.println("No It is Big ");
                }

            } while(number != a);

        }
    }
