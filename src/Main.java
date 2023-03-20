public class Main{

        public static void main(String[]args){

        int length=15;

        int[]array=ArrayGenerator.fillArray(length);
        System.out.println("Arraywithrandom"+length+"numbers");
        ArrayGenerator.sortAsc(length,array);
        System.out.println("SortedarrayAsc:");
        ArrayGenerator.showArray(length,array);
        ArrayGenerator.sortDesc(length,array);
        System.out.println("SortedarrayDesc:");
        ArrayGenerator.showArray(length,array);

        }
}