public class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public class DataSet {
        // ... your existing code ...

        public static void main(String[] args) {
            DataSet ds = new DataSet();
            ds.add(10);
            ds.add(20);
            ds.add(30);

            System.out.println("Average: " + ds.getAverage());
            System.out.println("Standard Deviation: " + ds.getStandardDeviation());
        }
    }
    public void add(double value) {
        if (dataSize == data.length) {
            System.out.println("DataSet is full.");
            return;
        }
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        return dataSize == 0 ? 0 : sum / dataSize;
    }

    public double getStandardDeviation() {
        if (dataSize == 0) {
            return 0;
        }
        double mean = getAverage();
        double sumOfSquares = 0;
        for (int i = 0; i < dataSize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff;
        }
        return Math.sqrt(sumOfSquares / dataSize);
    }

// Example of a static helper method
