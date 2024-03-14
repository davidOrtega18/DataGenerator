package ExperimentDataGenerator;

public class ExperimentData implements ExperimentDataInterface {

    private int _inputArraySize;
    private Integer[] _random_data;
    private Integer[] _ordered_data;
    private Integer[] _reverse_ordered_data;
    private Integer[] _fifty_percent_ordered_data;
    private Integer[] _seventyfive_percent_ordered_data;

    public ExperimentData(int inputArraySize) {
        _inputArraySize = inputArraySize;
        _random_data = DataGenerator.generateRandomDataSet(_inputArraySize);
        _ordered_data = DataGenerator.generateOrderedDataSet(_inputArraySize);
        _reverse_ordered_data = DataGenerator.generateReverseOrderedDataSet(_inputArraySize);
        _fifty_percent_ordered_data = DataGenerator.generate50PercentOrderedDataSet(_inputArraySize);
        _seventyfive_percent_ordered_data = DataGenerator.generate75PercentOrderedDataSet(_inputArraySize);
    }

    public int getInputArraySize() {
        return _inputArraySize;
    }

    public Integer[] getRandomDataSet() {
        return _random_data;
    }

    public Integer[] getOrderedDataSet() {
        return _ordered_data;
    }

    public Integer[] getReverseOrderedDataSet() {
        return _reverse_ordered_data;
    }

    public Integer[] get50PercentOrderedDataSet() {
        return _fifty_percent_ordered_data;
    }

    public Integer[] get75PercentOrderedDataSet() {
        return _seventyfive_percent_ordered_data;
    }

}
