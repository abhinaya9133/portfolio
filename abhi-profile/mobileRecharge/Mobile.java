package mobileRecharge;

public class Mobile {
    public void printPattern() {
        int n = 5;
	System.out.println();
	System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || (j == i && j <= 2) || j == 5 || (j == 6 - i && j > 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j > 1 && j < n) || (i == n && j > 1 && j < n) ||
                        (j == 1 && i > 1 && i < n) || (j == n && i > 1 && i < n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if ((j == 1) || (i == 1 && j <5) || (i == 3 && j < 5) || (i == 5 && j < 5) ||
                        (j == 5 && i > 1 && i < 3) || (j == 5 && i > 3 && i < 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("       ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || (i == 1 && j < n ) || (i == 3 && j < n ) || (j == n && i > 1 && i < 3) || (i > n / 2 && i - j == n / 2 - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j > 1) || (j == 1 && i > 1 && i < 5) || (i == 5 && j > 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 5 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {
                if ((j == 1 || j == n) && i != 1 || (i == 1 && j > 1 && j < n ) || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

           for (int j = 1; j <= n; j++) {
                if (j == 1 || (i == 1 && j < n ) || (i == 3 && j < n ) || (j == n && i > 1 && i < 3) || (i > n / 2 && i - j == n / 2 - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == 5 || (j == 5 && i >= 3) || (i == 3 && j >= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	System.out.println();
	System.out.println();
    }
}