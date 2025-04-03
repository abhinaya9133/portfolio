package mobileRecharge;

import java.util.Scanner;

public class MainMenu {

    private static double balance = 2500;

    public static double getBalance() {
        return balance;
    }

    public static void updateBalance(double amount) {
        balance -= amount;
    }

    public static void showOptions() {
	System.out.println();
        System.out.println("\nMAIN MENU:");
	System.out.println();
        System.out.println("1. Mobile Recharge");
	System.out.println();
        System.out.println("2. View Balance");
	System.out.println();
        System.out.println("3. Exit");
	System.out.println();
        System.out.print("Choose an option: \n");
	System.out.println();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                MobileRecharge.startRecharge();
                break;
            case 2:
                System.out.println("\n Current Balance: " + balance);
                showOptions();
                break;
            case 3:
                System.out.println("\n Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Returning to Main Menu...");
                showOptions();
        }
    }

    public static void main(String[] args) {
	System.out.println();
        System.out.println("Welcome to Mobile Recharge System! \n");
        showOptions();
    }
}
