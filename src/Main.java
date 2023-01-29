/*Створити програму для обробки символьних рядків

        Створити зміну типу String

        Показати цю зміну у верхньому та нижньому регістрах

        Показати першу та останню літери*/
public class Main {

    public static void main(String[] args) {

        System.out.println("-- > 1st type of declaration");
        String str = new String("Краще стрічка і стрічки або рядок чи рядки");
        int length_1 = str.length();
        int l_s_1 = length_1 - 1;
        char last_letter = str.charAt(l_s_1);

        System.out.println(str.toUpperCase() + " and " + str.toLowerCase());
        System.out.println("First and last symbols are " + str.charAt(0) + " and " + last_letter);

//        why next line behaved differently for three different declarations? different result returned
//        char last_symbol_1 = (char) (str.length() -1 );
//        System.out.println(last_symbol_1);
//        System.out.println(str.length());

        System.out.println("-- > 2nd type of declaration");
        String str1 = "Краще стрічка і стрічки або рядок чи рядки";
        int length_2 = str.length();
        int l_s_2 = length_2 - 1;
        char last_letter_2 = str.charAt(l_s_2);
        String a = str1.toUpperCase();
        String b = str1.toLowerCase();

        System.out.println("Upper case of this string is ' " + a + "' and Lower case is ' " + b + " '" );
        System.out.println(str.charAt(0));
        System.out.println(last_letter_2);

        System.out.println("-- > 3rd type of declaration");
        var str2 = "Краще стрічка і стрічки або рядок чи рядки";
        int length_3 = str.length();
        int last_symbol_3 = length_3 - 1;
        char last_letter_3 = str.charAt(last_symbol_3);

        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println("If concat first and last symbols of this line it will = " + str2.charAt(0)  +  last_letter_3);

        // Type of declaration o not affect the functions
        // length - 1 is required as there is no index with symbol there
    }
}
