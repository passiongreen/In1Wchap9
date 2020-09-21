import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("좌표 p를 입력하세요.");
    System.out.print("X좌표 : ");double x = stdIn.nextDouble();
    System.out.print("y좌표 : ");double y = stdIn.nextDouble();

    Coordinate p = new Coordinate(x,y);
    System.out.println("p = (" + p.getX() + ", "+p.getY()+ ")");

    Coordinate q = p;
    q.set(9.9,9.9);

    System.out.println("p=(" + p.getX() + ", " + p.getY()+")");
    System.out.println("q=(" + q.getX() + ", " + q.getY()+")");
  }
}

class Coordinate {

  
   private double x = 0.0;
   private double y = 0.0;


  // //생성자 public -> 접근성 변경
  // public 없음 : 해당 클래스는 통일 패키지 내에서만 사용
  // public 있음 : 해당 클래스는 어디에서든 사용
  // 정단 대부분의 경우 public


  public Coordinate() { }
  public Coordinate(double x, double y) { set(x,y);}

  public Coordinate(Coordinate c) {
    this(c.x, c.y)
    }




  public double getX() { return x;}
  public double getY() { return y;}

  public void setX(double x) { return x;}
  public void setY(double y) { return y;}




  // private double x;
  // private double y;

  // //생성자
  // Coordinate(double x, double y) {
  //   this.x = x;
  //   this.y = y;
  // }

  // double getX() {return x;}
  // double getY() {return y;}

  // void setX(double x) {this.x = x;}
  // void sety(double y) {this.y = y;}

  // void set(double x, double y) { this.x = x; this.y = y;}
}
