import java.util.Scanner;

public class PrintYourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("何歳ですか？(qまたはeで終了)");
            String input = scanner.nextLine();

            if (input.equals("q") || input.equals("e")) { // 終了コマンド
                break;
            }

            try {
                int age = Integer.parseInt(input);

                // マイナス・120以上かチェック
				if (age < 0 || age >= 120) {
                    System.out.println("年齢は0〜119歳の間で入力してください。");
                    continue;
                }

                System.out.println("あなたは" + age + "歳ですね。");
				int ageIn2030 = age + 5;
                System.out.println("2030年には" + ageIn2030 + "歳ですね。"); 

                int birthYear = 2025 - age;
				System.out.println("生まれた年(西暦)は" + birthYear + "年ですね。");
                String era = determineEra(birthYear);
                System.out.println("生まれた年(元号)は" + era + "ですね。");

            } catch (NumberFormatException e) { // 数値以外の入力の例外
                System.out.println("数値で年齢を入力してください。");
            }
        }
        scanner.close();
    }

    // 西暦→元号変換用メソッド
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
