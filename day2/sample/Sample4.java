//Sample4.java
public class Sample4 {
    public static void main(String[] args) {
        // Carクラスのオブジェクトを作成
        Car4 myCar = new Car4();

        // calculateTotalDistanceメソッドを呼び出し、戻り値を受け取る
        int totalDistance;
        totalDistance = myCar.calculateTotalDistance(120, 31);  // 120 * 31 を計算
        System.out.println("合計は: " + totalDistance);  // 結果を表示
    }
}
