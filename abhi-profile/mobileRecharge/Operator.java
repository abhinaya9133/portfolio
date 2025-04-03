package mobileRecharge;

import java.util.Scanner;

public class Operator {
    public void idea() {
        System.out.println("\nWelcome to IDEA!");
        showPlans("IDEA");
    }

    public void jio() {
        System.out.println("\nWelcome to JIO!");
        showPlans("JIO");
    }

    public void vi() {
        System.out.println("\nWelcome to VI!");
        showPlans("VI");
    }

    public void airtel() {
        System.out.println("\nWelcome to AIRTEL!");
        showPlans("AIRTEL");
    }

    private void showPlans(String operator) {
        System.out.println("\nSelect a Plan for " + operator + ":\n");
        System.out.println("1. 1GB/day\n");
        System.out.println("2. 1.5GB/day\n");
        System.out.println("3. 2GB/day\n");
        System.out.println("4. Data Packs\n");
        System.out.println("Enter your choice: \n");

        Scanner scanner = new Scanner(System.in);
        int planChoice = scanner.nextInt();

        switch (planChoice) {
            case 1:
                show1GBPackOptions(operator);
                break;
            case 2:
                show1_5GBPackOptions(operator);
                break;
            case 3:
                show2GBPackOptions(operator);
                break;
            case 4:
                showDataPackOptions(operator);
                break;
            default:
                System.out.println("\nInvalid choice!\n");
	       showPlans(operator);
                return;
        }
    }

    private void show1GBPackOptions(String operator) {
        System.out.println("\n1GB/day Plan for " + operator + " - Choose Pack Duration:\n");
        System.out.println("1. 1 Month: 199 INR\n");
        System.out.println("2. 3 Months: 549 INR\n");
        System.out.println("3. 6 Months: 999 INR\n");
        System.out.println("4. 12 Months: 1799 INR\n");
        processPackSelection(operator, "1GB/day");
    }

    private void show1_5GBPackOptions(String operator) {
        System.out.println("\n1.5GB/day Plan for " + operator + " - Choose Pack Duration:\n");
        System.out.println("1. 1 Month: 249 INR\n");
        System.out.println("2. 3 Months: 699 INR\n");
        System.out.println("3. 6 Months: 1299 INR\n");
        System.out.println("4. 12 Months: 2299 INR\n");
        processPackSelection(operator, "1.5GB/day");
    }

    private void show2GBPackOptions(String operator) {
        System.out.println("\n2GB/day Plan for " + operator + " - Choose Pack Duration:\n");
        System.out.println("1. 1 Month: 299 INR\n");
        System.out.println("2. 3 Months: 849 INR\n");
        System.out.println("3. 6 Months: 1599 INR\n");
        System.out.println("4. 12 Months: 2799 INR\n");
        processPackSelection(operator, "2GB/day");
    }

    private void showDataPackOptions(String operator) {
        System.out.println("\nData Packs for " + operator + ":\n");
        System.out.println("1. 1GB Pack: 50 INR\n");
        System.out.println("2. 3GB Pack: 120 INR\n");
        System.out.println("3. 5GB Pack: 180 INR\n");
        processPackSelection(operator, "Data Pack");
    }

    private void processPackSelection(String operator, String plan) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pack choice: \n");
        int packChoice = scanner.nextInt();

        String packDuration = "";
        double price = 0;

        switch (plan) {
            case "1GB/day":
                switch (packChoice) {
                    case 1:
                        packDuration = "1 Month";
                        price = 199;
                        break;
                    case 2:
                        packDuration = "3 Months";
                        price = 549;
                        break;
                    case 3:
                        packDuration = "6 Months";
                        price = 999;
                        break;
                    case 4:
                        packDuration = "12 Months";
                        price = 1799;
                        break;
                    default:
                        System.out.println("\nInvalid choice!\n");
		     showPlans(operator);
                        return;
                }
                break;
            case "1.5GB/day":
                switch (packChoice) {
                    case 1:
                        packDuration = "1 Month";
                        price = 249;
                        break;
                    case 2:
                        packDuration = "3 Months";
                        price = 699;
                        break;
                    case 3:
                        packDuration = "6 Months";
                        price = 1299;
                        break;
                    case 4:
                        packDuration = "12 Months";
                        price = 2299;
                        break;
                    default:
                        System.out.println("\nInvalid choice!\n");
		     showPlans(operator);
                        return;
                }
                break;
            case "2GB/day":
                switch (packChoice) {
                    case 1:
                        packDuration = "1 Month";
                        price = 299;
                        break;
                    case 2:
                        packDuration = "3 Months";
                        price = 849;
                        break;
                    case 3:
                        packDuration = "6 Months";
                        price = 1599;
                        break;
                    case 4:
                        packDuration = "12 Months";
                        price = 2799;
                        break;
                    default:
                        System.out.println("\nInvalid choice!\n");
		     showPlans(operator);
                        return;
                }
                break;
            case "Data Pack":
                switch (packChoice) {
                    case 1:
                        packDuration = "1GB";
                        price = 50;
                        break;
                    case 2:
                        packDuration = "3GB";
                        price = 120;
                        break;
                    case 3:
                        packDuration = "5GB";
                        price = 180;
                        break;
                    default:
                        System.out.println("\nInvalid choice!\n");
		     showPlans(operator);
                        return;
                }
                break;
        }

        System.out.println("\nYou selected " + plan + " with " + packDuration + " for " + price + " INR.\n");
        confirmRecharge(operator, plan, packDuration, price);
    }

    private void confirmRecharge(String operator, String plan, String packDuration, double price) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Confirm Recharge?\n");
        System.out.println("1. Yes\n");
        System.out.println("2. No\n");
        System.out.println("Enter choice (1 for Yes, 2 for No): \n");
        int choice = scanner.nextInt();

        if (choice == 1) {
            if (MainMenu.getBalance() >= price) {
                MainMenu.updateBalance(price);
                System.out.println("\nRecharge successful! New balance: " + MainMenu.getBalance());
            } else {
                System.out.println("\nInsufficient balance! Recharge failed.");
            }
        } else if (choice == 2) {
            System.out.println("\nRecharge canceled.");
        } else {
            System.out.println("\nInvalid choice.");
	  confirmRecharge(operator,plan,packDuration,price);
        }

        MainMenu.showOptions();
    }
}
