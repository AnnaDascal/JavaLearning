public class Array {
    public static void main(String[] args){
        int number = 10; // примитивный тип данных и ссылочный тип данных
        int[]numbers = new int[5];//массив -> ссылочный тип данных
        for (int i =0; i<numbers.length;i++){
            numbers[i]=i*10;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int [] numbers1 ={1,2,3,4,5};
        for(int i = 0 ;i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }

        int[] numb = new int[5];
        numb[0]= 10;
        String [] strings = new String[3];
        strings[0]= "Привет";
        strings[1]= "пока";
        strings[2]= "Джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i=0; i<strings.length;i++){
            System.out.println(strings[i]);// вывел все данные массива по очереди
        }
        for (String string:strings){
            System.out.println(string); // вывел все данные массива по очереди тоже но пишется по-другому
        }

        int[] numb3 ={1,2,3};
        int sum =0;
        for (int x: numb3){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
