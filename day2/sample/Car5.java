// Car5.java
class Car5 {
    String color;
    int speed;
    
    // コンストラクタ
    Car5(String carColor, int carSpeed) {
        color = carColor;
        speed = carSpeed;
    }

    // 車の情報を表示するメソッド
    void carInfo() {
        System.out.println("車の色: " + color);
        System.out.println("速度: " + speed + " km/h");
    }
}