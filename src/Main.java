/**
 * The task is
 * Створити програму
 *
 * Об’явити 2 змінні типу Integer та показати в консолі результати:
 * Додавання
 * Віднімання
 * Ділення
 * Множення
 */

public class Main {

    public static void main(String[] args){

        int car_place = 5 ;
        int guests = 18 ;
        int car = 3 ;
        int driver = 1 ;

        int a = guests + ( 3 * driver ) ;
        int m = car_place * car - car * driver ;
        int s = a - m ;
        int d = s / car_place ;
        int g = s % car_place;

        System.out.println("Total amount of person to drive is " + a);
        System.out.println("Free places for pasangers is " + m + ", if noone of guests drives");
        System.out.println(s + " guests need find commute alone");
        System.out.println("Or reserve at least " + d + " more car");
        System.out.println("ANd still " + g + "people need take taxi");


    }
}


