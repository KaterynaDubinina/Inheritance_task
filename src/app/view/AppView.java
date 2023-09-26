package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.US);
        System.out.print("Enter your name:");
        String name = scanner.nextLine().trim();
        System.out.print("Enter the bet amount, EUR:");
        String betAmount = scanner.nextLine().trim();
        scanner.close();
        return new String[]{name, betAmount};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
