import java.util.Scanner;

class CashBox {
    double money;

    public CashBox(double startingMoney) {                  
        this.money = startingMoney;
    }

    public double checkMoney() {
        return money;
    }

    public boolean takeOut(double cash) {
        if (cash > 0 && cash <= money) {
            money -= cash;
            return true;
        }
        return false;
    }

    public void addMoney(double cash) {
        if (cash > 0) {
            money += cash;
        }
    }
}

class CashMachine {
    private CashBox box;
    private Scanner input;

    public CashMachine(CashBox box) {
        this.box = box;
        this.input = new Scanner(System.in);
    }

    public void showOptions() {
        while (true) {
            System.out.println("\nCash Machine");
            System.out.println("1. Take Cash");
            System.out.println("2. Add Cash");
            System.out.println("3. See Money");
            System.out.println("4. Quit");
            System.out.print("Pick one: ");

            int pick = input.nextInt();
            if (pick == 1) {
                doTakeOut();
            } else if (pick == 2) {
                doAddMoney();
            } else if (pick == 3) {
                System.out.println("Your Money: $" + box.checkMoney());
            } else if (pick == 4) {
                System.out.println("Goodbye!");
                return;
            } else {
                System.out.println("Wrong choice. Try again.");
            }
        }
    }

    private void doTakeOut() {
        System.out.print("How much to take? ");
        double cash = input.nextDouble();
        if (box.takeOut(cash)) {
            System.out.println("Cash taken out!");
        } else {3
            System.out.println("Not enough money or bad amount.");
        }
    }

    private void doAddMoney() {
        System.out.print("How much to add? ");
        double cash = input.nextDouble();
        if (cash > 0) {
            box.addMoney(cash);
            System.out.println("Money added!");
        } else {
            System.out.println("Can’t add that amount.");
        }
    }
}

public class SimpleCash {
    public static void main(String[] args) {
        CashBox myBox = new CashBox(1000.0);
        CashMachine machine = new CashMachine(myBox);
        machine.showOptions();
    }
}
