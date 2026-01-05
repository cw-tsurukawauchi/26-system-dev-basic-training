public class ifStatement {
    public static void main(String[] args) {
        int bookPrice = 1000;
        int payment = 1000; // 会計で支払ったお金

        if (payment < bookPrice) {
          int shortage = bookPrice - payment;
          System.out.println(shortage + "円足りません。");
        } else if (payment == bookPrice) {
          System.out.println("お買い上げありがとうございました。");
        } else if (payment > bookPrice) {
          int change = payment - bookPrice;
          System.out.println("おつりは" + change + "円です。");
          System.out.println("お買い上げありがとうございました。");
        } else {
          System.out.println("会計ができません。");
        }
    }
}
