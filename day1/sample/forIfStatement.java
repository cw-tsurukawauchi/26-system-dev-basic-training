public class forIfStatement {
    public static void main(String[] args) {
        int total = 0; // 加算用の変数
        for (int i = 1; i <= 10; i++) {
          if (i % 2 == 0) {
            total += i;
          }
          if (total > 10) {
            break;
          } else {
            System.out.println("続行中");
            continue;
          }
        }
        System.out.println("最終結果:" + total);
    }
}
