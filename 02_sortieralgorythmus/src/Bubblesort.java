public class Bubblesort {

    public Bubblesort() {}

    public int[] sort(int[] unsorted) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < unsorted.length - 1; i++) {
                if(unsorted[i] <= unsorted[i + 1]) {
                    continue;
                }
                isSorted = false;
                int tmp = unsorted[i];
                unsorted[i] = unsorted[i + 1];
                unsorted[i + 1] = tmp;
            }
        }

        return unsorted;
    }

    public void print(int[] sortedNumbers) {
        String text = "";
        for(int i = 0; i < sortedNumbers.length; i++) {
            text += sortedNumbers[i] + " ";
        }
        System.out.println("BubbleSort " + text);
    }
}
