import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

    }

    private void run() {
        // User details
        String name = "Jerry";
        String account = "BO10006789";
        // Welcome to the BankApp
        wellcome(name, account);
        // Main Menu
        showMenu();
        // Press a key to select an option
        readOption();
    }

    public void print(String message) {
        System.out.println(message);
    }

    private void showMenu() {
        // Main Menu
        print(System.lineSeparator());
        print("********************");
        print("(W) Withdraw");
        print("(D) Deposit");
        print("(B) My Balance");
        print("(T) My Transactions");
        print("(E) Exit");
        print("********************");
    }

    private void readOption() {
        try (Scanner scanner = new Scanner(System.in)) {
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.nextLine().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'E':
                        print("Exit...");
                        break;
                    default:
                        print(option + " is an invalid option");
                        break;
                }
                print(System.lineSeparator());
                print("(A) Show All options");
            } while (option != 'E');
        }
    }

    private void wellcome(String name, String account) {
        print("Welcome " + name);
        print("Your current account is " + account);
    }

}
