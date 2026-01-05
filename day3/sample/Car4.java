//Car4.java
class Car4 {
    String color;
    int speed;
    int fuel;

    // 走行距離計算メソッド：走行した距離と日数を引数で受け取る
    int calculateTotalDistance(int distance, int totalDays) {
        return distance * totalDays;
    }
}
