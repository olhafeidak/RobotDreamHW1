
    /*Створити програму для виведення чисел від 1 до 10

            Показати всі парні числа в діапазоні від 1 до 100

            Знайти факторіал числа 7

            Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)*/


    import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {

        //Створити програму для виведення чисел від 1 до 10
        System.out.println("Number line is from 1 to 10 is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Показати всі парні числа в діапазоні від 1 до 100
        int b = 0;
        System.out.println();
        System.out.println("Even numbers up to 100 are: ");
        while (b <= 100) {
            if (b % 2 == 0) {
                System.out.print((b + " "));
            }
            b++;
        }
        System.out.println();

        //Знайти факторіал числа 7
        int i, fact = 1;
        int number = 7;

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println();
        System.out.println("Factorial of " + number + " is: " + fact);

        // Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)

        System.out.println();
        System.out.println("Fibonacci task ");

        int f1 = 0;
        int f2 = 1;
        int f = 0;
        while (f < 100) {
            System.out.print(f + " ");
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        System.out.println();

    }
}
