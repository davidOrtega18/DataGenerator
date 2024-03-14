import ExperimentDataGenerator.ExperimentData;
import ExperimentDataGenerator.ExperimentDataInterface;

import TestArrayGenerator.TestArrayGenerator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var arrayGenerator = new TestArrayGenerator();
        var array = arrayGenerator.getInputSizes();

        for (int k = 0; k < array.size(); k++) {
            System.out.print(String.format("%d ", array.get(k)));
        }
        System.out.println();
        System.out.println("----------");
        var allData = new ArrayList<ExperimentDataInterface>();
        for (int sz : array) {
            allData.add(new ExperimentData(sz));
        }

        for (var expD : allData) {
            printArray(expD.getRandomDataSet());
            System.out.println();
            printArray(expD.getOrderedDataSet());
            System.out.println();
            printArray(expD.getReverseOrderedDataSet());
            System.out.println();
            printArray(expD.get50PercentOrderedDataSet());
            System.out.println();
            printArray(expD.get75PercentOrderedDataSet());
            System.out.println();

        }
    }

    public static void printArray(Integer[] arrList) {
        for (int n : arrList) {
            System.out.print(String.format("%d ", n));
        }
        System.out.println();
    }


    public static void bubbleSortAlg(){




    }


}
