import java.util.Scanner;

class Main {

  static void printHumanArray(Human[] a) {
    for (int i = 0 ; i < a.length; i++)
      System.out.printf("No.%d %s %d %d\n", i, a[i].getName(),a[i].getHeight(), a[i].getWeight());
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n;

    // 1차원 배열
    Human[] p = {
      new Human("철수",170,70),
      new Human("길동",160,59)
    };

    System.out.print("배열 q의 요소 수:"); n = stdIn.nextInt();

    Human[] q = new Human[n];

    for (int i = 0 ; i < q.length ; i++) {
      System.out.println("q["+ i + "]");
      System.out.print("이름 : "); String name = stdIn.next();
      System.out.print("신장 : "); int height = stdIn.nextInt();
      System.out.print("체중 : "); int weight = stdIn.nextInt();
      q[i] = new Human(name,height,weight);
    }

    // 2차원 배열

    // Human[][] x {
    //   { new Human("김철수",175,52), new Human("김영희",169,60)},
    //   { new Human()}


    // }





System.out.println("1. 배열 p");
printHumanArray(p);


System.out.println("2. 배열 q");
printHumanArray(q);







  }
}

class Human {

  private String name;
  private int height;
  private int weight;

  // 생성자 // constructor
  // 1. 이름이 클래스와 같다
  // 2. 반환형이 없다.

  Human(String n, int h, int w){
    name = n; 
    height = h;
    weight=w;
  }



  String getName() { return name;}
  int getHeight() { return height;}
  int getWeight() { return weight;}
  

  void gainWeight(int w) { weight += w;} //몸무게 증가
  void reduceWeight(int w) {weight -= w ;} // 몸무게 감소

}

