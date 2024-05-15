package Main;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.6;
        int weight = 60;
        double index = service.calculate(height, weight);
        System.out.println("индекс массы тела: " + index);
    }
}
