import sun.awt.geom.AreaOp;

import java.util.Arrays;
import java.util.Random;

public class RugbyAge {
    public static void main(String[] args) {

        Random random = new Random();

        int[] group1 = new int[25];

        for (int index = 0; index < group1.length; index++){
            group1[index] = random.nextInt(22)+18;


        }
        int[] group2 = new int[25];

        for (int index = 0; index < group2.length; index++){
            group2[index] = random.nextInt(22)+18;


        }
        System.out.println(Arrays.toString(group1) + " Age of group A");
        System.out.println(Arrays.toString(group2) + " Age of group B");

        double mAge1 =0.0;
        int tot1 = 0;
        for (int i = 0; i < group1.length; i++) {
            tot1+= group1[i];


        }
            double mAge2 =0.0;
            int tot2 = 0;
            for (int j = 0; j < group2.length; j++) {
                tot2 += group2[j];
            }
        mAge1 = (double) tot1 / group1.length;
        System.out.println("average age of group players A " + mAge1 + " year");

            mAge2 = (double) tot2 / group2.length;
            System.out.println("average age of group players B " + mAge2 + " year");

        }

    }


