import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void nav(ArrayList<Integer> numbers) {
        Sort obj = new Sort();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            String input = scanner.nextLine();

            if (input.equals("s") && numbers.size() >= 2) {
                System.out.println("SORT ASCENDING - type 'a'");
                System.out.println("SORT DESCENDING - type 'd'");
                input = scanner.nextLine();

                if (input.equals("a")) {
                    obj.goBubble(numbers);
                    System.out.println("ARRAY ASCENDING ->");
                    obj.printArrayAscending(numbers);
                    break;
                } else if (input.equals("d")) {
                    obj.goBubble(numbers);
                    System.out.println("ARRAY DESCENDING ->");
                    obj.printArrayDescending(numbers);
                    break;
                } else {
                    System.out.println("Wrong command!\nType number to sort...");
                    nav(numbers);
                }
            } else if (input.equals("s") && numbers.size() < 2) {
                System.out.println("Enter at least two numbers!");
                nav(numbers);
            } else {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                    System.out.println("\nCurrent numbers:");
                    obj.printArrayAscending(numbers);
                    System.out.println("\nType next number\n\t  OR");
                    System.out.println("Type 's' to SORT");
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number, try again");
                    nav(numbers);
                }
            }
        }
    }

    void goBubble(ArrayList<Integer> numbers) {
        int swap;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(j - 1).compareTo(numbers.get(j)) > 0) {
                    swap = numbers.get(j - 1);
                    numbers.set(j - 1, numbers.get(j));
                    numbers.set(j, swap);
                }
            }
        }
    }

    void printArrayAscending(ArrayList<Integer> numbers) {
        for (int i : numbers) {
            System.out.print((i) + ", ");
        }
        System.out.println(" ");
    }

    void printArrayDescending(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("\n================ BUBBLE SORT ================");
        System.out.println("Type numbers to sort: ");
        nav(numbers);
    }
}