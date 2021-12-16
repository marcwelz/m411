/**
 * @author marcwelz
 * @version 31.08.2021
 */

public class Application {

    public static void main(String[] args) {

        int[] numbers = {6, 7, 8, 9, 10, 2, 3, 5, 4, 1};
        print(numbers);

        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        Bubblesort bubblesort = new Bubblesort();

        selectionSort.print(selectionSort.sort(numbers));
        insertionSort.print(insertionSort.sort(numbers));
        bubblesort.print(bubblesort.sort(numbers));
    }

    public static void print(int[] sortedNumbers) {
        String text = "";
        for(int i = 0; i < sortedNumbers.length; i++) {
            text += sortedNumbers[i] + " ";
        }
        System.out.println("Unsorted " + text);
    }
}
