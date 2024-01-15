import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //String s = new String ("привет");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String stri = s.nextLine();
        System.out.println("Вы ввели:"+stri);

        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите число");
        int number = s1.nextInt();
        System.out.println("Вы ввели:"+number);

    }
}
