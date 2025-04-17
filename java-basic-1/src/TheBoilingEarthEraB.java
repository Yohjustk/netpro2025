import java.util.Random;

public class TheBoilingEarthEraB {

    public static void main(String[] args) {
        double[][] temperatures = new double[10][31];
        Random random = new Random();

        // Generate temperature data for each year
        for (int i = 0; i < 10; i++) {
            double averageTemperature = 29.0 + (i * 0.3);
            for (int j = 0; j < 31; j++) {
                temperatures[i][j] = Math.round((averageTemperature + (random.nextDouble() * 10 - 5)) * 10) / 10.0;
            }
        }

        // Analyze for consecutive 真夏日 in 2025
        System.out.println("真夏日連続ペア:");
        for (int i = 0; i < 30; i++) {
            if (temperatures[9][i] >= 30.0 && temperatures[9][i + 1] >= 30.0) {
                System.out.printf("2025年7月%d日    %.1f℃ と        2025年7月%d日    %.1f℃%n",
                        i + 1, temperatures[9][i], i + 2, temperatures[9][i + 1]);
            }
        }
    }
}
