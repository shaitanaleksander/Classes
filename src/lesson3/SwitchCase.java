package lesson3;

public class SwitchCase {


    public static void main(String[] args) {

        int number = 10;


        switch (number){

            case 3: System.out.println("it is 3");

            case 10: {
                System.out.println("it is 10");
            }
            case 11: {
                System.out.println("it is 11");
                break;
            }
            case 12: {
                System.out.println("it is 12");
            }

        }

        for (int i = 0; i < 12; i++) {

            System.out.println("i = "+ i);

            System.out.println(1+2);

        }


    }
}
