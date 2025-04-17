import java.util.Random;

public class TheBoilingEarthEraC {

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

        // Analyze for consecutive 猛暑日 in all years
        System.out.println("猛暑日連続ペア:");
        for (int year = 0; year < 10; year++) {
            for (int day = 0; day < 30; day++) {
                if (temperatures[year][day] >= 35.0 && temperatures[year][day + 1] >= 35.0) {
                    System.out.printf("%d年7月%d日   %.1f℃ と        %d年7月%d日   %.1f℃%n",
                            year + 2016, day + 1, temperatures[year][day], year + 2016, day + 2, temperatures[year][day + 1]);
                }
            }
        }
    }
}
