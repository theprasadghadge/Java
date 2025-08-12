
//                                 ------->>> Question <<---------
// A company is planning a big sale at which they will give their customers a special promotional discount. 
// Each customer that purchases a product from the company has a unique customerID numbered from 0 to N- 1. 
// Andy, the marketing head of the company, has selected bill amounts of the N customers for the promotional scheme. 
// The discount will be given to the customers whose bill amounts are perfect squares. 
// The customers may use this discount on a future purchase.

import java.util.*;

public class customer {

    int customerid;
    float billAmounts;

    public int setid(int id) {
        this.customerid = id;
        return customerid;
    }

    public float billamount(float amount) {
        this.billAmounts = amount;
        return billAmounts;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No.of Customer ( n ): ");
        int n = scanner.nextInt();

        int customerid[] = new int[n * 2];
        float billAmounts[] = new float[n * 2];
        customer cust[] = new customer[n * 2];

        for (int i = 1; i <= n; i++) {

            cust[i] = new customer();

            System.out.print("Enter id of Customer" + i + " : ");
            int id = scanner.nextInt();
            customerid[0] = cust[i].setid(0);

            if (id == 0) {
                System.out.println("Enter Uniqe Customer Id Entred Invalid Customer iD  !!");
                System.out.print("Enter id of Customer" + i + " : ");
                id = scanner.nextInt();
            } else if (id == customerid[i - 1]) {
                System.out.println("Enter Uniqe Customer Id Entred Customer iD is Exists Allredy !!");
                System.out.print("Enter id of Customer" + i + " : ");
                id = scanner.nextInt();

            } else {
                customerid[i] = cust[i].setid(id);
            }

            System.out.print("Enter of BillAmount Customer" + i + "  : ");
            float amount = scanner.nextFloat();
            billAmounts[i] = cust[i].billamount(amount);

        }
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Id of Customer" + i + " is : " + billAmounts[i]);
        // System.out.println("BillAmount of Customer" + i + "is : " + customerid[i]);
        // }
        // }
    }
}
// import java.util.Scanner;

// public class DiscountEligibility {

// // Method to check if a number is a perfect square
// private static boolean isPerfectSquare(int number) {
// if (number < 0) {
// return false;
// }
// int sqrt = (int) Math.sqrt(number);
// return sqrt * sqrt == number;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Read number of customers
// System.out.println("Enter the number of customers:");
// int N = scanner.nextInt();

// // Array to store bill amounts
// int[] billAmounts = new int[N];

// // Read bill amounts
// System.out.println("Enter the bill amounts for each customer:");
// for (int i = 0; i < N; i++) {
// billAmounts[i] = scanner.nextInt();
// }

// // Determine and print the IDs of customers eligible for discount
// System.out.println("Customer IDs eligible for discount:");
// for (int i = 0; i < N; i++) {
// if (isPerfectSquare(billAmounts[i])) {
// System.out.println(i);
// }
// }

// scanner.close();
// }
// }
