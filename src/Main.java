import java.util.Arrays;
import java.util.Scanner;

// Sorting Elements in an Array
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your array (n): ");
        int num = input.nextInt();
        int[] array = new int[num];
        int value;

        System.out.println("Enter the elements of your array: ");

        // Inputting elements into the array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            value = input.nextInt();
            array[i] = value;
        }
        System.out.println("------------------------------");
        System.out.println("Original array: ");
        // Printing the original array
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");
        System.out.println("Sorting: ");
        // Sorting the array in ascending order
        Arrays.sort(array);
        // Printing the sorted array
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");
    }
}
