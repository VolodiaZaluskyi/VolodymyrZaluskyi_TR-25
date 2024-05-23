public class Task4 {
    public static int maxArrNumber() {
        int[] array = Array.makeArray();

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) max = array[i];
            }
        }

        return max;
    }
}
