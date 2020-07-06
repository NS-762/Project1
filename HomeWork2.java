import java.util.Scanner;

public class HomeWork2 {
    public static void main(String args[]){
        System.out.println(calculations(2, 3, 4, 0)); //задание 3
        System.out.println(test(5, 3)); //задание 4
        check(-10); //задание 5
        System.out.println(number(-20)); //задание 6
        System.out.print("Введите имя: "); //задание 7
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        name(name);
        System.out.print("Введите год: "); //задание 8
        Scanner scan_2 = new Scanner(System.in);
        int year = scan_2.nextInt();
        year(year);
    }

    static float calculations(float a, float b, float c, float d){ //задание 3
        float result = 0;
        if (d == 0){
            System.out.println("Нельзя делить на ноль");
        }
        else {
            result = a * (b + (c / d));
        }
        return result;
    }

    static boolean test(int a, int b){ //задание 4
        boolean result;
        if (10 <= (a+b) && (a+b) <= 20){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    static void check(int a){ //задание 5
        String c;
        c = (a >= 0) ? "Положительное" : "Отрицательное";
        System.out.println(c);
    }

    static boolean number(int a){ //задание 6
        boolean result;
        if(a < 0){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    static void name (String name){ //задание 7
        System.out.println("Привет, "+ name);
    }

    static void year(int year){ //задание 8
        if((year % 2 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Это високосный год");
        }
        else{
            System.out.println("Это невисокосный год");
        }
    }
}

