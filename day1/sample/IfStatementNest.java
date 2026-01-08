public class IfStatementNest {
    public static void main(String[] args) {
        int bookPrice = 1000;
        int payment = 1000; // 会計で支払ったお金

        if (payment >= bookPrice) {
          if (payment > bookPrice) {
            int change = payment - bookPrice;
            System.out.println("おつりは" + change + "円です。");
          }
          System.out.println("お買い上げありがとうございました。");
        } else if (bookPrice < payment) {
            int shortage = bookPrice - payment;
            System.out.println(shortage + "円足りません。");
        } else {
            System.out.println("会計ができません。");
        }
    }
}
