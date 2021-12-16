/**
 * @author marcwelz
 * @version 31.08.2021
 */

public class SelectionSort {

    public SelectionSort() {}

    public int[] sort(int[] numbers) {
        int[] result = numbers;

        for (int i = 0; i < result.length-1; i++) {
            // smallest value in the array
            int min_idx = i;
            for (int j = i+1; j < result.length; j++) {
                // checks if no result is higher
                if (result[j] < result[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = result[min_idx];
            result[min_idx] = result[i];
            result[i] = temp;
        }

        return result;
    }

    public void print(int[] sortedNumbers) {
        String text = "";
        for(int i = 0; i < sortedNumbers.length; i++) {
            text += sortedNumbers[i] + " ";
        }
        System.out.println("SelectionSort " + text);
    }
}
