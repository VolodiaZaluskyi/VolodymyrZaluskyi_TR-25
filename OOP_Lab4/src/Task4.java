public class Task4 {
    public static void doTask4(double[] array){
        for(int i = 0; i < array.length; i++){
            if((array[i] % 2) != 0){
                array[i] = array[i] * -1;
            }
            System.out.println(array[i]);
        }
    }
}