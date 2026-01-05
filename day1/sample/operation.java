public class operation {
    public static void main(String[] args) {
        // 算術演算子の例
        int a = 10;
        int b = 5;
        System.out.println("算術演算子の例:");
        System.out.println("a + b = " + (a + b)); // 加算
        System.out.println("a - b = " + (a - b)); // 減算
        System.out.println("a * b = " + (a * b)); // 乗算
        System.out.println("a / b = " + (a / b)); // 除算
        System.out.println("a % b = " + (a % b)); // 余り

        // インクリメント・デクリメント演算子の例
        int c = 1;
        System.out.println("\nインクリメント・デクリメント演算子の例:");
        System.out.println("c++ = " + c++); // cを出力してからインクリメント
        System.out.println("++c = " + ++c); // cをインクリメントしてから出力
        System.out.println("c-- = " + c--); // cを出力してからデクリメント
        System.out.println("--c = " + --c); // cをデクリメントしてから出力

        // 関係演算子の例
        System.out.println("\n関係演算子の例:");
        System.out.println("a < b = " + (a < b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 論理演算子の例
        boolean x = true;
        boolean y = false;
        System.out.println("\n論理演算子の例:");
        System.out.println("x && y = " + (x && y)); // 論理積
        System.out.println("x || y = " + (x || y)); // 論理和
        System.out.println("!x = " + (!x)); // 否定
    }
}
