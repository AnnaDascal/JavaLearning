package Homeworks;

public class NamingConversation2 {
    public static void main(String[] args) {
        int[] ex1 = {1, 2, 3, 4, 5};
        System.out.println(theIndexOfTheFirstOccurrenceOfSpecifiedValueInTheArray(ex1, 2));
    }
    public static int theIndexOfTheFirstOccurrenceOfSpecifiedValueInTheArray ( int[] a, int specifiedValue){ // grapefruit ->theIndexOfTheFirstOccurrenceOfElementInTheArray
        for (int i = 0; i < a.length; i++) { // grape ->specifiedValue
            if (a[i] == specifiedValue) {
                return i; // ищет порядковый номер элемента grape в массиве
            }
        }
        return -1; // если он не нашел присулствует то выдет -1
    }
}
