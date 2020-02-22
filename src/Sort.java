import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    void goBubble(ArrayList<Integer> numbers) {
        int swap;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size() - 1; j++) {
                if(numbers.get(j - 1).compareTo(numbers.get(j)) > 0) {
                    swap = numbers.get(j - 1);
                    numbers.set(j - 1, numbers.get(j));
                    numbers.set(j, swap);
                }
            }
        }
    }

    void printArrayAscending(ArrayList<Integer> numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    void printArrayDescending(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Sort obj = new Sort();
        Scanner input = new Scanner(System.in);

        obj.goBubble(numbers);
        obj.printArrayAscending(numbers);
        obj.printArrayDescending(numbers);
    }
}
