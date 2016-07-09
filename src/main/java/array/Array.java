package array;

import java.util.Random;

/**
 * Created by Victor Penkin on 09.07.2016.
 */
public class Array {
    public static void Random (int a, int b) {
        int[] mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            Random random = new Random();
            mass[i] = random.nextInt(b);
        }
        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i]+" ");
        }
    }
}
