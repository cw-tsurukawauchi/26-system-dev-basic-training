public class ForIfStatement {
    public static void main(String[] args) {
        int total = 0; // 加算用の変数
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("現在の数: " + i);

            if (i % 2 != 0) {
                System.out.println("  → 奇数なのでスキップ");
                continue; // 奇数は処理をスキップ
            }

            total += i;
            System.out.println("  → 偶数なので加算、合計: " + total);

            if (total > 10) {
                System.out.println("  → 合計が10を超えたのでループ終了");
                break; // ループを終了
            }

            System.out.println("  → まだ続行します");
        }
        System.out.println("最終結果: " + total);
    }
}
