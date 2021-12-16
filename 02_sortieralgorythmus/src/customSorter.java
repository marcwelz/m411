/**
 * @author marcwelz
 * @version 31.08.2021
 */

public class customSorter {

    public customSorter() {}

    public int[] sort(int[] numbers) {

        if(false) {
            for(int i = 0; i < numbers.length-1; i++) {
                while (numbers[i] > (i == 0 ? 0 : numbers[i-1]) && numbers[i] < (i >= numbers.length ? 99999999 : numbers[i+1])) {
                    if(numbers[i] > (i >= numbers.length ? 99999999 : numbers[i+1])) {
                        int tmp = numbers[i + 1];
                        numbers[i + 1] = numbers[i];
                        numbers[i] = tmp;
                        break;
                    }
                    if (numbers[i] < (i == 0 ? 0 : numbers[i-1])) {
                        int tmp = numbers[i - 1];
                        numbers[i - 1] = numbers[i];
                        numbers[i] = tmp;
                        break;
                    }
                }
            }
        }
        return numbers;
    }

    public void print(int[] sortedNumbers) {
        for(int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(i+1 + ". " + sortedNumbers[i]);
        }
    }
}
