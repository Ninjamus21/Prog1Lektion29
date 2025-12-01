// java
package opgave03;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave03Main {
    public static void main(String[] args) {
        int[] intArray1 = {2, 4, 6, 8, 10, 12, 14};
        int[] intArray2 = {1, 2, 4, 5, 6, 9, 12, 17};

        long start = System.nanoTime();
        int[] result = fletArrays(intArray1, intArray2);
        int[] fælles = fællestal(result);
        ArrayList<Integer> nichtfælles = nichtFælles(result);
        long end = System.nanoTime();

        double elapsedMs = (end - start) / 1_000_000.0;
        System.out.printf("Elapsed: %.3f ms%n", elapsedMs);
        System.out.println("Merged: " + Arrays.toString(result));
        System.out.println("Common: " + Arrays.toString(fælles));
        System.out.println("Not common: " + nichtfælles);
    }

    public static int[] fletArrays(int[] intArray1, int[] intArray2) {
        int[] result = new int[intArray1.length + intArray2.length];
        int i1 = 0;
        int i2 = 0;

        while (i1 < intArray1.length && i2 < intArray2.length) {
            if (intArray1[i1] <= intArray2[i2]) {
                result[i1 + i2] = intArray1[i1];
                i1++;
            } else {
                result[i1 + i2] = intArray2[i2];
                i2++;
            }
        }
        while (i1 < intArray1.length) {
            result[i1 + i2] = intArray1[i1];
            i1++;
        }
        while (i2 < intArray2.length) {
            result[i1 + i2] = intArray2[i2];
            i2++;
        }
        return result;
    }

    public static int[] fællestal(int[] result) {
        ArrayList<Integer> commons = new ArrayList<>();
        for (int i = 1; i < result.length; i++) {
            if (result[i] == result[i - 1]) {
                if (commons.isEmpty() || commons.get(commons.size() - 1) != result[i]) {
                    commons.add(result[i]);
                }
            }
        }
        int[] out = new int[commons.size()];
        for (int i = 0; i < commons.size(); i++) out[i] = commons.get(i);
        return out;
    }

    public static ArrayList<Integer> nichtFælles(int[] result) {
        ArrayList<Integer> resultat = new ArrayList<>();
        int n = result.length;
        if (n == 0) return resultat;
        if (n == 1) {
            resultat.add(result[0]);
            return resultat;
        }
        if (result[0] != result[1]) resultat.add(result[0]);
        for (int i = 1; i < n - 1; i++) {
            if (result[i] != result[i - 1] && result[i] != result[i + 1]) {
                resultat.add(result[i]);
            }
        }
        if (result[n - 1] != result[n - 2]) resultat.add(result[n - 1]);
        return resultat;
    }
}
