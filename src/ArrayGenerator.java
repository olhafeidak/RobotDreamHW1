import java.util.Random;

public class ArrayGenerator {

        public static int[] fillArray (int length) {

        int[] rArr = new int[length];
        Random rClass = new Random();
        for (int i = 0; i < rArr.length; i++) {
            rArr[i] = rClass.nextInt();
        }
        return rArr;

}

        public static void showArray(int length, int[] rAarr){
            for (int i = 0; i < length; i++) {
                System.out.println(rAarr[i]);
            }
        }

        public static void sortAsc(int length, int[] rArr){
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < rArr.length; j++) {

                    int temp = 0;
                    if (rArr[j] < rArr[i]) {

                        temp = rArr[i];
                        rArr[i] = rArr[j];
                        rArr[j] = temp;
                    }
                }
            }
        }

        public static void sortDesc(int length, int[] rArr){
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < rArr.length; j++) {

                    int temp = 0;
                    if (rArr[j] > rArr[i]) {

                        temp = rArr[i];
                        rArr[i] = rArr[j];
                        rArr[j] = temp;
                    }
                }
            }
        }

    }