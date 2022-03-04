package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] drob =
                {1.1, -3.4, 8.3, 4.8, 3.2, -7.1, 9.3, -3.6, 7.3, -5.6, 9.9, 7.2, -1.1, 8.3, 9.9};
        System.out.println(Arrays.toString(drob));

        double sum = 0.0;
        double average = 0.0;
        boolean otricatelnoe = false;
        int polojitelnoe = 0;


        for (double element : drob)
            if (element < 0) {
                otricatelnoe = true;
            } else if (otricatelnoe && element > 1) {
                sum = sum + element;
                polojitelnoe++;
                System.out.println("Количество положительных =" + polojitelnoe);

            }
        average = sum / polojitelnoe;

        System.out.println("Сумма" + "=" + sum);
        System.out.println("Среднее Арифметическое =" + average);


        double[][] razdelenie = new double[][]{
                {-7.1,-5.6,-3.6,-3.4,-1.1},
                {1.1,  3.2, 4.8, 7.2, 7.3, 8.3, 8.3, 9.3, 9.9, 9.9}
        };
        for (int i = 0; i < razdelenie.length; i++) {
            for (int j = 0; j < razdelenie.length; j++) {

                System.out.println(Arrays.deepToString(razdelenie));

            }
        }
    }
}