package Java2;


public class Level5_Цикл_1_for { /** Циклы нужны чтобы выполнять код несколько раз, и можем указать количество раз выполнения кода самостоятельно */
    public static void main(String[] args) {
        for(float i = 100; i > 10; i/=2) { /** указываем сам цикл "for" а в () указываем все условия, создали переменную "i" придали значение, и выполняться цикл будет до тех пор пока "i" по 2-му условию будет больше 10 */
            System.out.println("Элемент: " + i); /** и 3-е условие - это каким образом наша переменная будет изменяться, так как если переменная "i" всегда будет равна = 100, то цикл будет неверным и работать бесконечно */
        }                                       /** поэтому 3-м условием указываем увеличение переменной "i" каждый раз на "1", написав операцию i/=2 */
                                                /** и цикл удобен тем, что можно перебирать допустим несколько записей и проверять в программе */
    }
}                                           








