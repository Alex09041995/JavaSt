package Java2;


public class Level8_Функции_4_Возвращают_Практика {  /** Функции - это как небольшие подпрограммы, которые содержат набор кода, и при необходимости мы можем на него ссылаться, чтобы выполнить нужны нам функционал по названию функции и нужный нам код будет выполнен*/
    /** по своей сути "Функции" и "Методы" похожи, но только функции записываются за пределами класса, а методы записываются внутри тела класса, если функцию записать внутри тела класса, то она становится методом, но все классы в JAVA - являются отдельным файлом, поэтому все функции также как и методы буду писаться внутри тела класса */
    public static void main(String[] args) { /** public static void main(String[] args) - это один метод (функция) например у нас есть программа, в которой нам нужно регулярно пользоваться кодами, и здесь нам пригодятся "Функции", чтобы не пришлось повторять снова код */
        
        byte[] numbers1 = new byte[] {5, 6, 8}; /** создали массив данных и присвоили им значения */
        int summ1 = summaArray(numbers1); /** вызываем ф-ию "summaArray" и создали переменную "summa1", чтобы затем выводить её */
        System.out.println("Сумма 1: " + summ1);

        byte[] numbers2 = new byte[] {5, 7, 3, 7, 6, 8}; /** создали массив данных и присвоили им значения */
        int summ2 = summaArray(numbers2); /** вызываем ф-ию "summaArray" и создали переменную "summa2", чтобы затем выводить её */
        System.out.println("Сумма 2: " + summ2);
    }                               

    public static int summaArray(byte[] array) { /** принимаем параметр - это массив типа "byte" с переменной "array"  */
        int summa = 0; /** создали переменную, чтобы в неё записывать позже наши значения */
        for(byte i = 0; i < array.length; i++) {
            summa += array[i]; /** в переменную "summa" добавляем к текущему значению наш элемент */

        }
        return summa;
    }
}
