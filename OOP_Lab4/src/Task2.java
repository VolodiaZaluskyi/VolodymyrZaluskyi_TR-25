public class Task2 {
    int[] numbers = {2,17,13,6,22,31,45,66,100,-18};

    public void doTask21(){ //while
        System.out.println("While: ");
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
    }


    public void doTask22(){ //for
        System.out.println("\nFor: ");
        for(int i = 0; i < numbers.length; i++) System.out.println(numbers[i]);
    }

    public void doTask23() {//while with odd index
        System.out.println("While with odd index: ");
        int j = 0;
        while (j < numbers.length) {
            if ((j % 2) != 0) {
                System.out.println(numbers[j]);
            }
            j++;
        }
    }

    public void doTask24() {//for with even index
        System.out.println("\nFor with even index: ");
        for (int j = 0; j < numbers.length; j++) {
            if ((j % 2) == 0) {
                System.out.println(numbers[j]);
            }
        }
    }

    public void doTask25() { //display the array in reverse order
        for(int k = (numbers.length - 1); k >= 0; k--) System.out.println(numbers[k]);
    }
}