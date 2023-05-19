public class BmiService {
    public double calculate(double weight, double height) {
        double boodyMassIndex = (weight / (height * height));
        return boodyMassIndex;
    }

    ;

    /* todo:
    формула индекса массы тела
    i = m / (h*h)
    приведение дробного числа к целому
    int b = (int) a;
     */
}
