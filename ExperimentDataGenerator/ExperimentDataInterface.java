package ExperimentDataGenerator;

public interface ExperimentDataInterface {
    Integer[] getRandomDataSet();

    Integer[] getOrderedDataSet();

    Integer[] getReverseOrderedDataSet();

    Integer[] get50PercentOrderedDataSet();

    Integer[] get75PercentOrderedDataSet();
}
