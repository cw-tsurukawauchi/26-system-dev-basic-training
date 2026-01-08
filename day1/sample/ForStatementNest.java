public class ForStatementNest {
    public static void main(String[] args) {
        for (int day = 1; day <= 3; day++) {
          System.out.println(day + "日目");

          for (int task = 1; task <= 4; task++) {
            System.out.println("  " + task + "つ目の作業");
          }
        }
    }
}
