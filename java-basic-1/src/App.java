public class App {
    public static void main(String[] args) {
        // "Hello, World!"の文字コード
        int[] charCodes = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};

        // 文字コードからStringを構築
        StringBuilder sb = new StringBuilder();
        for (int charCode : charCodes) {
            sb.append((char) charCode);
        }

        // Stringを表示
        System.out.println(sb.toString());
    }
}
