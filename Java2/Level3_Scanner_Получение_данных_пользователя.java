package Java2;

import java.util.Scanner; /** с помощью данной функции будем импортировать класс -Scanner */

public class Level3_Scanner_Получение_данных_пользователя {
    public static void main(String[] args) {  
        Scanner object = new Scanner(System.in);  /** чтобы исп-ть класс -Scanner (для получения каких-либо данных) то нам нужно его импортировать в файл, то есть в данный код, тип данных сам класс -Scanner*/
                                                 /** чтобы получать данные с помощью-Scanner - нужно его будет создать - объекты */
                                                 /** чтобы присвоить значение типу -Scanner- нужно выделить для него память-для этого пишем "new Scanner", то есть "new"- означает -выделяем память, а -Scanner -выдялем память для этого класса */
                                                  /** и указываем параметр - System.in, чтобы сказать системе что мы будем получать данные */
        System.out.print("Введите Ваше имя: "); /** пишем обращение к пользователю */
        String user_name = object.nextLine();  /** чтобы получить данные от пользователя - обращаемся к созданному объекту и через точку "." обращаемся к методу "nextLine" написав переменную-object.nextLine, и таким образом пользователь введёт своё имя */ 
        System.out.println("Привет, " + user_name + "!");
    }
}








