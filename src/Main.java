public class Main {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちわ");
    if (isHungry == 0) {
      System.out.println("おなかがいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそう様でした");
  }
}