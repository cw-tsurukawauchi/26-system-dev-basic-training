//Sample2.java
public class Sample2 {
    public static void main(String[] args) {
        // Carクラスを元にしたオブジェクトを作成
        Car2 myCar = new Car2();   // これがインスタンス化（オブジェクトの生成）

        // myCarというオブジェクトに値を設定
        myCar.color = "赤";
        myCar.speed = 60;
        myCar.fuel = 80;

        // 作成した走る・止まるメソッドの呼び出し
        myCar.run();
        myCar.stop();
    }
}
