import java.util.Random;

public class TheBoilingEarthEraA {

    public static void main(String[] args) {
        double[][] temperatures = new double[10][31];
        double averageTemperature = 29.0;
        Random random = new Random();

        // Generate temperature data for each year
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 31; j++) {
                temperatures[i][j] = Math.round((averageTemperature + (random.nextDouble() * 10 - 5)) * 10) / 10.0;
            }
            averageTemperature += 0.3;
        }

        // Output the temperatures for July 2025
        for (int i = 0; i < 31; i++) {
            System.out.println("2025年7月" + (i + 1) + "日: " + temperatures[9][i] + "℃");
        }
    }
}
