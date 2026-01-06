//Sample1.java
public class Sample1 {
    public static void main(String[] args) {
        // Carクラスを元にしたオブジェクトを作成
        Car1 myCar = new Car1();   // これがインスタンス化（オブジェクトの生成）

        // myCarというオブジェクトに値を設定
        myCar.color = "赤";
        myCar.speed = 60;
        myCar.fuel = 80;

        // 作成したオブジェクトの属性を表示
        System.out.println("車の色: " + myCar.color);
        System.out.println("車の速度: " + myCar.speed + "km/h");
        System.out.println("車の燃料: " + myCar.fuel + "リットル");
    }
}
