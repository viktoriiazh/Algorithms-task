package demo;

import utils.Constants;

import java.util.Scanner;

public class PriceAverage {
    static double avgPrice;
    static Scanner scan;
    static double number;

    static double[] priceArr = new double[5];


    public static void main(String[] args) {

        double[] arr;
        arr=doInputs(priceArr);
        avgPrice = Average(arr);
        ShowResult(avgPrice);
    }


    //Метод введення даних в масив
    static public double[] doInputs(double[] priceArr) {

        scan = new Scanner(System.in);
        System.out.println(Constants.PRICE_MSG);

        for (int i = 0; i < 5; i++) {

            System.out.print(i + 1 + ". ");
            number = scan.nextDouble();
            priceArr[i] = number;

        }
        scan.close();
        return priceArr;
    }

    //Метод обчислення середньої суми
    static private double Average(double[] priceArr) {
        double sum = 0;

        for (double v : priceArr) {

            sum += v;
        }
        avgPrice = sum / priceArr.length;
        return avgPrice;
    }

    //Метод виводу
    static private void ShowResult(double avgPrice) {
        System.out.printf(Constants.AVG_MSG, avgPrice);
    }
}
