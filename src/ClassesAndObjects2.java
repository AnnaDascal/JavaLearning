
public class ClassesAndObjects2 {
        public static void main(String[] args){
            Personsa persons1a = new Personsa();
            persons1a.namea= "Роман";
            persons1a.agea=50;
            persons1a.speaka();
            Personsa persons2a = new Personsa();
            persons2a.namea= "Владимир";
            persons2a.agea=20;
            persons2a.speaka();
            persons1a.sayHelloa();
            int year1a=persons1a.calculateYearsToRetiromenta();
            int year2a= persons2a.calculateYearsToRetiromenta();

            System.out.println("Количество лет до пенсии"+year1a+"лет");
            System.out.println("Количество лет до пенсии"+year2a+"лет");

        }
    }

    class Personsa{
        String namea;
        int agea;

        public int calculateYearsToRetiromenta(){ //результатом будет вывод целочисленного значения
            int yearsa =65-agea;
            return yearsa; //прерывет метод
        }
        public void speaka(){
            for (int i=0; i<3;i++) {
                System.out.println("меня зовут " + namea + ", мне " + agea + " лет");
            }
        }
        public void sayHelloa(){
            System.out.println("Hello");
        }
    }

