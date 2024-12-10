package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float earnedAmount = 0;
        float bubblegum = 202;
        float toffe = 118;
        float iceCream = 2250;
        float milkChocolate = 1680;
        float doughnout = 1075;
        float pancake = 80;

        float staffExpenses = 0;
        float otherExpenses = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffe);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnout);
        System.out.println("Pancake: $" + pancake);

        earnedAmount +=  bubblegum + toffe + iceCream + milkChocolate + doughnout + pancake;
        System.out.println("Income: $" + earnedAmount);

        System.out.println("Staff expenses:");
        staffExpenses = scanner.nextFloat();

        System.out.println("Other expenses:");
        otherExpenses = scanner.nextFloat();

        System.out.println("Net income:  $" + (earnedAmount - staffExpenses - otherExpenses));
    }
}