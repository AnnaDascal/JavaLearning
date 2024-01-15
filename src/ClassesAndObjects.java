public class ClassesAndObjects {
    public static void main(String[] args){
        Persons persons1 = new Persons();
        persons1.name= "Роман";
        persons1.age=50;
        persons1.speak();
        Persons persons2 = new Persons();
        persons2.name= "Владимир";
        persons2.age=20;
        persons2.speak();
        persons1.sayHello();
        int year1=persons1.calculateYearsToRetiroment();
        int year2= persons2.calculateYearsToRetiroment();

        System.out.println("Количество лет до пенсии"+year1+"лет");
        System.out.println("Количество лет до пенсии"+year2+"лет");

    }
}

class Persons{
    String name;
    int age;

    int calculateYearsToRetiroment(){ //результатом будет вывод целочисленного значения
        int years =65-age;
        return years; //прерывет метод
    }
    void speak(){
        for (int i=0; i<3;i++) {
            System.out.println("меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
