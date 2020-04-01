import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

    }

    public void print(String message) {
        System.out.println(message);
    }

    private void run() {
        // User details
        String name = "Jerry";
        String account = "BO10006789";
        BankAccount bankAccount = new BankAccount(name, account);
        // Welcome to the BankApp
        wellcome(name, account);
        // Main Menu
        showMenu();
        // Press a key to select an option
        readOption(bankAccount);
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

    private void readOption(BankAccount bankAccount) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean isRunning = true;
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.nextLine().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'A':
                        showMenu();
                        break;
                    case 'B':
                        print("My balance: " + bankAccount.getBalance());
                        break;
                    case 'E':
                        print("Exit...");
                        isRunning = false;
                        break;
                    case 'W':
                        withdraw(bankAccount);
                        break;
                    default:
                        print(option + " is an invalid option");
                        break;
                }
                print(System.lineSeparator());
                if (isRunning) {
                    print("(A) Show All options");
                }
            } while (option != 'E');
        }
    }

    private void wellcome(String name, String account) {
        print("Welcome " + name);
        print("Your current account is " + account);
    }

//    public char readFirstChar() {
//        return (char) scanner.nextLine().trim().toUpperCase().charAt(0);
//    }

    private void withdraw(BankAccount bankAccount) {
        double retiro;
        Scanner scanner = new Scanner(System.in);
        print("Cuanto desea retirar: ");
        retiro = (double) scanner.nextDouble();

        if (retiro < bankAccount.getBalance()) {

            print("Usted desea sacar: " + retiro);

            bankAccount.withdraw(retiro);
        } else {
            print("Su cuenta no tienen suficientes fondos para realizar este retiro");
        }
    }

}
