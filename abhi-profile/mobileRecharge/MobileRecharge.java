package mobileRecharge;

import java.util.Scanner;

public class MobileRecharge {

    public static void startRecharge() {
        Scanner scanner = new Scanner(System.in);
	System.out.println();
        System.out.println("Enter your mobile number: \n");
        String mobileNumber = scanner.nextLine();

        if (mobileNumber.length() != 10 || !mobileNumber.matches("\\d+")) {
            System.out.println("\nInvalid mobile number. Please enter a valid 10-digit number. \n");
            startRecharge();
            return;
        }

        System.out.println("\nSelect your operator: \n");
        System.out.println("1. IDEA \n");
        System.out.println("2. JIO \n");
        System.out.println("3. VI \n");
        System.out.println("4. AIRTEL \n");
        System.out.println("Enter choice (1-4): \n");
        int operatorChoice = scanner.nextInt();

        Operator operator = new Operator();
        switch (operatorChoice) {
            case 1:
                operator.idea();
                break;
            case 2:
                operator.jio();
                break;
            case 3:
                operator.vi();
                break;
            case 4:
                operator.airtel();
                break;
            default:
                System.out.println("\nInvalid operator choice. \n");
                startRecharge();
        }
    }
}

