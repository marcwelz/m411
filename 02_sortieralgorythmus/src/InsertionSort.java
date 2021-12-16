public class InsertionSort {

    public InsertionSort() {}

    public int[] sort(int[] numbers) {
        int[] result = numbers;
        for (int i = 1; i < result.length; ++i) {
            int key = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j = j - 1;
            }
            result[j + 1] = key;
        }
        return result;
    }

    public void print(int[] sortedNumbers) {
        String text = "";
        for(int i = 0; i < sortedNumbers.length; i++) {
            text += sortedNumbers[i] + " ";
        }
        System.out.println("InsertionSort " + text);
    }
}
