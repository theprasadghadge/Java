import java.util.*;
public class arrayAsendingOrder {

    public static void order(int array[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
            
        }
    }

public static void main(String[] args) {
            int n;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter No (n) : ");
            n = scanner.nextInt();

            int array[] = new int[n + 5];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Array element" + i + ":");
                array[i] = scanner.nextInt();
            }
                order(array,n);
            }
}


