public class BmiService {
    public int calculate(double weightKg, double heightM) {

        double heightS = heightM * heightM;

        return (int) ((int) weightKg / heightS);
    }
}