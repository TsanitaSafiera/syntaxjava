package Class22;

public class Array {
    // create a method to get the average of numbers from an array
    // create a method that will Count the how many times the number
    // is appearing in an array
    int sum = 0;

    public int average(int[] array) {
        for (int i : array) {
            sum += i;
        }
        return sum / (array.length);
    }

    public int getCount(int[] array, int number) {
        int count = 0;
        for (int i : array) {
            if (i == number) {
                count++;
            }
        }
        return count;
    }

}


