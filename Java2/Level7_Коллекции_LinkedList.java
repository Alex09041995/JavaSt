package Java2;

import java.util.LinkedList;

public class Level7_Коллекции_LinkedList {  /** Коллекции позволяют создавать что-то типа массива данных но для более широкого масштаба используя встроенные в JAVA интерфейсы */
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>(); /** отличие LinkedList<> от ArrayList<> в том, что он привязывает элементы внутри этого массива к друг другу, и например нужно часто удалять или добавлять элементы, то лучше исп-ть этот класс, то есть принцип переиндексирования и будет делать добавление и удаление быстрее  */
        numbers.add(7.8f); /** и также можем через "add" - добавить элемент */
        numbers.add(4.58f);
        numbers.add(2.345f);
        numbers.add(0, 4.001f);

        for(Float element : numbers) { /** создадим цикл "for" с типом данных "Float" и переменной "element" укажем ":" и переменную, которую нужно перебрать - в нашем случае "numbers" */
            System.out.println("Элемент массива-коллекции: " + element); /** чтобы вывести все элементы на экран */
        } /** принцип работы с "LinkedList" такой же как и с "ArrayList<>" */
    }
}





