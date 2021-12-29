public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 83;  // масса в кг.
        double height = 1.75;  // рост в метрах
        double bmi = service.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
