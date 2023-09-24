public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j + " "); //掛け算結果
      }
      System.out.println(""); //段ごとに改行する
    }
  }
}