package Java2;

import java.util.Scanner;

public class Level4_Условные_конструкции_5_Программка_equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Введите роль: ");
        String role = scan.nextLine();
        System.out.print("Введите пароль: ");
        String password = scan.nextLine();
        if(role.equals("Admin") && password.equals("000")) { /** для проверки введённого значения нужно исп-ть метод: "equals" (ожидается что), то есть после точки вводим метод и обращаемся к искомой строке, в скобках (указываем проверямое значение) а не просто операцию == что не запустит код */
            System.out.println("Приветствую пользователь!"); 
        } else {
            System.out.println("Приветствую! Как Вас зовут?"); 
        }
    }                                          
}







