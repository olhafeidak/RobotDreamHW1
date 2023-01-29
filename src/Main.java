
/*Створити 3 програми:

        1 : програму для знаходження більшого з двох чисел

        2 : програму для знаходження меншого з двох чисел

        3 : програму для перевірка заданого числа на парність*/

public class Main {

    public static void main(String[] args) {

        // програму для знаходження більшого з двох чисел

        System.out.println(" -- > #1 out of 3 ");

        var n = 5;
        var m = 14.5;
        boolean a = n < m ;


        if (a){
            System.out.println("Between " + m + " and " + n + " number " + m + " is bigger");
        }
            else
                System.out.println("Between " + m + " and " + n + " number "  + n + " is bigger");

        // програму для знаходження меншого з двох чисел

        System.out.println(" -- > #2 out of 3 ");

        var k = 5.115;
        var w = 100004.5;
        boolean b = k > w ;


        if (b){
            System.out.println("Between " + k + " and " + w + " Number " + w + " is smaller");
        }
        else
            System.out.println("Between " + k + " and " + w + " Number " + k + " is smaller");

        // програму для перевірка заданого числа на парність

        System.out.println(" -- > task#3 out of 3");
        System.out.println("By last day on current month seems " );

        var l = "Leap year! ";
        var m30 = "It is probably April, June, September or November";
        var f = "It is February";
        var m31 = "It is January, March, May, July, August, October or December";

        int number = 31;

        if (number % 2 == 0 && number == 28 ) {
            System.out.println(f);
        } else if (number % 2 == 0 && number == 30) {
            System.out.println(m30);
        } else if (number % 2 == 1 && number == 31 ) {
            System.out.println(m31);
        } else if (number % 2 == 1 && number == 29)
            System.out.println(l);

    }
}
