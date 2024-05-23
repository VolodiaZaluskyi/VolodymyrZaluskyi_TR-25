public class Task3 {
    public static void showArray() {
        int[] array = Array.makeArray();

        System.out.print("Елементи масиву: ");
        for (int i = 0; i < array.length; i++) {
            if(array.length-1 == i){
                System.out.print(array[i]);
                return;
            }
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
