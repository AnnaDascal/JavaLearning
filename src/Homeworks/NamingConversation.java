package Homeworks;

public class NamingConversation {
    public static void main(String[] args) {
        int[] ex ={1,2,3,4,5};
        System.out.println(ProductOfAllElementsInTheArray(ex));
    }

    // меняю banana на product of all elements in the array
    public static int ProductOfAllElementsInTheArray ( int[] a){
        int accumulativeValueOfTheProductOfAllElementsInTheArray = 1; // число киви равно 1. Переменная для аккумуляции результата
        int i = 0; // порядковый номер
        while (i < a.length) {//пока порядковый номер меньше длины массива  мы выполняем следующее
            accumulativeValueOfTheProductOfAllElementsInTheArray = accumulativeValueOfTheProductOfAllElementsInTheArray * a[i];/* каждое число массива а умножаем на 1 и проходимся так по каждому числу
                таким образом каждое следующее значение массива умножается на следующее число в массиве*/
            System.out.println("i ="+i+" kiwi ="+ accumulativeValueOfTheProductOfAllElementsInTheArray+ " a[i] = "+ a[i] + " a.length="+ a.length); // добавила строку отобразить процесс
            i++; // переходим к следующему числу массива

        }
        return accumulativeValueOfTheProductOfAllElementsInTheArray;

    }

}
