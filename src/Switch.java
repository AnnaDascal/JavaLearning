import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scan.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил в школу");
                break;
            default:
                System.out.println("Ни один из вариантов");
        }
    }
}
