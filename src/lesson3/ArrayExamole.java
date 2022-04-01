package lesson3;

import java.util.Arrays;

public class ArrayExamole {

    public static void main(String[] args) {

        boolean[] boolArray = new boolean[12];
        int intsArray[] = new int[12];
        String stringArray[] = new String[12];

        boolArray[2] = true;

        System.out.println(Arrays.toString(boolArray));
        System.out.println(Arrays.toString(intsArray));
       System.out.println(Arrays.toString(stringArray));

        boolArray = new boolean[]{true, true};
        intsArray = new int[]{1, 2, 3, 4, 5, 66, 1000};
        stringArray = new String[]{"hello", "world", "!"};

        System.out.println(boolArray);
        System.out.println(Arrays.toString(intsArray));
        System.out.println(Arrays.toString(stringArray));

        String[][] twoDimensionArr = new String[][]{{"hello", "world", "!"}, {"Glory to Ukraine", "!"}};

        System.out.println(Arrays.deepToString(twoDimensionArr));


        for ( String s :stringArray) {
            System.out.println(s);
        }
    }
}
