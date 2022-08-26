package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("\nHow many positions will your list have? = ");
        int list_Length = sc.nextInt();

        for (int i = 0; i < list_Length; i++) {
            int randomNumber = (int) (Math.random() * (100 + 1));
            list.add(randomNumber);
        }

        System.out.print("What position in the list do you want to know the value of? = ");
        int search = sc.nextInt();

        int value = list.get(search);
        System.out.println("\nPosition " + search + " have the value = " + value);

        int first_position = list.indexOf(value);
        int last_position = list.lastIndexOf(value);

        System.out.println("\nFirst appearance of Value " + value + " is at position = " + first_position);
        if (last_position != first_position) {
            System.out.println("Last appearance of Value " + value + " is at position = " + last_position);
        } else {
            System.out.println("The Value " + value + " appears only one time");
        }

        int quantity = 0;
        for (Integer integer : list) {
            if (integer == value) {
                quantity++;
            }
        }
        System.out.println("\nNumber of times the value " + value + " appears = " + quantity);

    }
}
