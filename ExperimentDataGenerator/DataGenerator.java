package ExperimentDataGenerator;

import java.util.Arrays;
import java.util.Random;

public class DataGenerator {
    private static Random _random = new Random();
    private static int _MAX_VALUE = 40;
//    private static int _MAX_VALUE = 40000;

    public static Integer[] generateRandomDataSet(int inputArraySize) {
        return getRandomArrayList(inputArraySize);
    }

    public static Integer[] generateOrderedDataSet(int inputArraySize) {
        var dataList = getRandomArrayList(inputArraySize);
        Arrays.sort(dataList);
        return dataList;
    }

    public static Integer[] generateReverseOrderedDataSet(int inputArraySize) {
        var dataList = getRandomArrayList(inputArraySize);
        Arrays.sort(dataList);
        reverseArray(dataList);
        return dataList;
    }

    public static Integer[] generate50PercentOrderedDataSet(int inputArraySize) {
        int halfSize = inputArraySize / 2;
        var halfList = generateRandomDataSet(inputArraySize);
        Arrays.sort(halfList);
        getPartiallyRandomArrayList(halfSize, halfList);
        return halfList;
    }

    public static Integer[] generate75PercentOrderedDataSet(int inputArraySize) {
        int quarterSize = inputArraySize / 4;
        var threeQuartersList = generateRandomDataSet(inputArraySize);
        Arrays.sort(threeQuartersList);
        getPartiallyRandomArrayList(quarterSize * 3, threeQuartersList);
        return threeQuartersList;
    }

    private static Integer[] getRandomArrayList(int size) {
        _random.setSeed(512);
        var dataList = new Integer[size];
        for (int k = 0; k < size; k++) {
            dataList[k] = _random.nextInt(_MAX_VALUE);
        }
        return dataList;
    }

    private static void getPartiallyRandomArrayList(int startingIndex, Integer[] currentList) {
        for (int k = startingIndex; k < currentList.length; k++) {
            currentList[k] = _random.nextInt(_MAX_VALUE);
        }
    }

    private static void reverseArray(Integer[] array) {
        var len = array.length;
        for (int k = 0; k < len / 2; k++) {
            var temp = array[k];
            array[k] = array[len - 1 - k];
            array[len - 1 - k] = temp;
        }
    }


}
