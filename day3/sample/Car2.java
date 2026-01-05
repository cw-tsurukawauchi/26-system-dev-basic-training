//Car2.java
class Car2 {
    //フィールドの定義
    String color;   // 車の色
    int speed;      // 速度
    int fuel;       // 燃料

    // 走るメソッド
    void run() {
        System.out.println("車が走ります。現在の速度は" + speed + "km/hです。");
    }

    // 止まるメソッド
    void stop() {
        System.out.println("車が止まりました。");
    }
}
