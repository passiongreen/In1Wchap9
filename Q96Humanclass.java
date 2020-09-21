class Main {
  public static void main(String[] args) {
    Human gildong = new Human("길동", 170, 60);
    Human chulsu = new Human("철수", 166, 70);   

    System.out.println("gildong = " + gildong);
    System.out.println("chulsu = " + chulsu);
  }
}

public class Human {

  private String name;
  private int height;
  private int weight;


  // 생성자 // constructor
  // 1. 이름이 클래스와 같다
  // 2. 반환형이 없다.

  public Human(String name, int height, int weight){
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public String getName() { return name;}
  public int getHeight() { return height;}
  public int getWeight() { return weight;}


  void gainWeight(int w) { weight += w;} //몸무게 증가
  void reduceWeight(int w) {weight -= w ;} // 몸무게 감소


  public String toString() {
    return "{" + name + ":" + height + "cm " + weight + "kg" + "출생}";
  }


}

