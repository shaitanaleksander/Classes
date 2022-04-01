package lesson3;

public class SwitchCase {


    public static void main(String[] args) {

        int number = 10;


//        switch (number){
//
//            case 3: System.out.println("it is 3");
//
//            case 10: {
//                System.out.println("it is 10");
//            }
//            case 11: {
//                System.out.println("it is 11");
//                break;
//            }
//            case 1: {
//                System.out.println("it is 12");
//            }
//
//        }

        for (int i = 0; i < 12; i++) {


            if (i == 6) continue;
            System.out.println(i);

        }
        System.out.println("hello");

    }
}
