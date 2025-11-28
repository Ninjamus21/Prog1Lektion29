package opgave03;

import opgave01.models.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave03Main {
    public static void main(String[] args) {
        int[] intArray1 = {2, 4, 6, 8, 10, 12, 14};
        int[] intArray2 = {1, 2, 4, 5, 6, 9, 12, 17};


        long start = System.nanoTime();
        fællestal(intArray1,intArray2);
        long end = System.nanoTime();

        double elapsedMs = (end - start) / 1_000_000.0;
        System.out.printf("Elapsed: %.3f ms%n", elapsedMs);
        System.out.println(Arrays.toString(fællestal(intArray1,intArray2)));
    }
    public static int[] fællestal(int[] intArray1, int[] intArray2){
        int[] result = new int[intArray1.length + intArray2.length];
        int i1 = 0;
        int i2 = 0;

        while(i1 < intArray1.length && i2 < intArray2.length){
            if (intArray1[i1] <= intArray2[i2]){
                result[i1 + i2] = intArray1[i1];
                i1++;
                } else {
                result[i1 + i2] = intArray2[i2];
                i2++;
            }
        }
        while (i1 < intArray1.length){
            result[i1 + i2] = intArray1[i1];
            i1++;
        }
        while (i2 < intArray2.length){
            result[i1 + i2] = intArray2[i2];
            i2++;
        }

        int[] resultFælles = new int[result.length];
        for (int i = 1; i < result.length; i++) {
            if (result[i] == result[i - 1]){
                resultFælles[i] = result[i];
            }
        }
        return resultFælles;
    }
}
