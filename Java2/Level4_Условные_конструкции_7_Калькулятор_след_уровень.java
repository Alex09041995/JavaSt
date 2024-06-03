package Java2;

import java.util.Scanner;

public class Level4_Условные_конструкции_7_Калькулятор_след_уровень { /** оператор "switch-case" позволяет взять одну переменную и проверить её на множество различных значений */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        int result; /** указываем переменную "result" чтобы резульат сложения прописывать в первом кейсе */
        System.out.print("Укажите математическое действие: ");
        String action = scan.nextLine();
        action = scan.nextLine(); /** нужно указать для введения матеметического допустим действия указать снова переменную и указать оператора "scan.nextLine" снова, чтобы пользователь ввёл данные */
        switch (action) {         /** это является такой особенностью JAVA, так как за последнее действие JAVA принимает второе число, а часть кода с мат.действием не срабатывает */
            case "+": result = num1 + num2;
            System.out.print("Результат сложения чисел: " + result);
            break;
            case "-": result = num1 - num2;
            System.out.print("Результат после вычитания числа: " + result);
            break;
            case "*": result = num1 * num2;
            System.out.print("Результат умножения чисел: " + result);
            break;
            case "/":
                if(num2 == 0)
                    System.out.println("Ошибка деления, так как на 0 делить нельзя"); 
                    else {result = num1 / num2;
                    System.out.print("Результат деления чисел: " + result);
                }
            break;
        default: System.out.println("Вы ввели не верное значение!");
        }
        }          
    }             








