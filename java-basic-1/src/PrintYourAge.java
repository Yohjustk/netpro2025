import java.util.Scanner;

public class PrintYourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("現在の年齢を入力してください (qまたはeで終了):");
            String input = scanner.nextLine();

            if (input.equals("q") || input.equals("e")) {
                System.out.println("プログラムを終了します。");
                break;
            }

            try {
                int age = Integer.parseInt(input);

                if (age <= 0 || age >= 120) {
                    System.out.println("年齢は0〜119歳の間で入力してください。");
                    continue;
                }

                int ageIn2030 = age + (2030 - 2025); // Current year is 2025
                System.out.println("2030年の年齢: " + ageIn2030 + "歳");

                int birthYear = 2025 - age;
                String era = determineEra(birthYear);
                System.out.println("生まれた年（元号）: " + era);

            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。数値を入力してください。");
            }
        }
        scanner.close();
    }

    public static String determineEra(int year) {
        if (year >= 2019) {
            return "令和" + (year - 2018) + "年";
        } else if (year >= 1989) {
            return "平成" + (year - 1988) + "年";
        } else if (year >= 1926) {
            return "昭和" + (year - 1925) + "年";
        } else if (year >= 1912) {
            return "大正" + (year - 1911) + "年";
        } else if (year >= 1868) {
            return "明治" + (year - 1867) + "年";
        } else {
            return "明治以前";
        }
    }
}
