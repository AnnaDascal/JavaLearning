package Homeworks;

public class NamingConversation3 {
    public static void main(String[] args) {
        int[] ex2 ={1,2,3,4,2};
        System.out.println(countOfOccurrencesInArray(ex2,2));
    }

    public static int countOfOccurrencesInArray( int[] a, int sarchedValue){
            int countStored = 0; // число pear
            for (int variableToIterateOverEachElementOfTheArray : a) { //
                if (variableToIterateOverEachElementOfTheArray == sarchedValue) {
                    countStored ++; // за каждый apple прибавляет 1
                }
            }
            return countStored ; //подсчитывает колличество элиментов в массиве котороые равны apple
        }

}