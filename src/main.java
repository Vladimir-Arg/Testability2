public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int bmi = (int) service.calculate(weight, height);
        System.out.println(bmi);
    }
}
