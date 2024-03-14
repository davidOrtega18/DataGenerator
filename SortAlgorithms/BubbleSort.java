package SortAlgorithms;

public class BubbleSort implements SortAlgorithmInterface {



    public void bubbleSort(int[] arrayInt){
        int length = arrayInt.length;
        int temp = 0;

        for(int i = 0; i < length; i++){
            for(int j = 1; j < (length - i); j++){
                if(arrayInt[j-1] > arrayInt[j]){
                    temp = arrayInt[j-1];
                    arrayInt[j-1] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }

        }
    }

    @Override
    public Integer[] Sort() {
        return new Integer[0];
    }

    @Override
    public Integer timedSort() {
        return null;
    }


}
