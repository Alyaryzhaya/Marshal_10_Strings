import java.sql.SQLOutput;

public class Stort {

    public static void main(String[] args) {

        String str1 = new String("hello");

        String str2 = "Hello";

        //String str3 = str2.toUpperCase(); // перевести в заглавные
        // String str3 = str2.toLowerCase(); // перевести в маленькие
        int str3 = str2.length(); // колиество символов в строке

        System.out.println("4. " + str3);



        // неизменяемый тип данных
       // String str4 = str2; //  в str4 и в str2  сейас лежит одна и та же ссылка на "Hello"


        // метод Substring

        String str4 = str2.substring(0,3); // передает сюда символы из переменной str2
                                           // от нулевого индекса до третьего (невклюительно)
        System.out.println("1. " + str4);


        // Сравнение (метод Equals)

       //System.out.println(str1 == str2); // так сравнивать не верно
        System.out.println("2. " + str1.equals(str2)); // эквивалентны
        System.out.println("3. " + str1.equalsIgnoreCase(str2)); // не смотрит на регистр


        // Массив строк

        String[] str5 = {"hello", "world", "people"};
        System.out.println("5. " + str5[2]); // вызываем элемент с индексом два
        System.out.println("6. " + args[0] + " " + args[1]); // ерез терминал передавали в переменную аrgs два элемента hi [0], и usV [1]



    }
}
