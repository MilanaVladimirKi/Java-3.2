package Main;

public class BmiService {
    public double calculate(double height, int weight) {
        return weight / Math.pow(height, 2);
    }
}
