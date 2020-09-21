import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("day1을 입력하자.");
    System.out.print("년:"); int y = stdIn.nextInt();
    System.out.print("월:"); int m = stdIn.nextInt();
    System.out.print("일:"); int d = stdIn.nextInt();

    Day day1 = new Day(y,m,d);




  }
}

class Car {

private String name;
private String number;
private int width;
private int height;
private int length;

private double x; //현재 위치 x
private double y; //현재 위치 y
private double tankage; //탱크 용량
private double fuel;  // 남은 연료
private double sfc; //연비

// 생성자 //

Car(String name, 
    String number, 
    int width, 
    int height,
    int length, 
    double x, 
    double y, 
    double tankage,
    double fuel, 
    double sfc) {
    this.name = name; 
    this.number = number;
    this.width = width;
    this.height = height;
    this.length = length;
    this.x = x; //현재 위치 x 좌표
    this.y = y; // 현재 위치 y 좌표
    this.tankage = tankage;
    this.fuel = (fuel <= tankage) ? fuel : tankage;
    this.sfc = sfc;
    x = y = 0.0;
    }

double getX() { return x;}
double getY() { return y;}
double getFuel() { return fuel;}

void putSpec() {
  System.out.println("이름:" + name);
  System.out.println("번호:" + number);
  System.out.println("전폭:" + width);
  System.out.println("전고:" + height);
  System.out.println("전장:" + length);
  System.out.println("탱크:" + tankage);
  System.out.println("연비:" + fuel);
}
//이동 x방향 y방향

  boolean move(double dx, double dy) {
    double dist = Math.sqrt(dx * dx + dy * dy);
    double f = dist / sfc;

    if (f > fuel)
      return false;
    else {
      fuel -= f;
      x += dx;
      y += dy;
      return true;
    }
  }
  // 급유 
  void refuel(double df) {
    if (df > 0) {
      fuel += df;
      if (fuel > tankage)
        fuel = tankage;
    }
  }
}

public class Day {

  private int year = 1;
  private int month = 1;
  private int date = 1;

  public Day() {}
  public Day(int year) { this.year = year;}
  public Day(int year, int month) {this(year); this.month = month;}
  public Day(int year, int month, int date) {this(year,month); this.date = date;}
  public Day(Day d) {this(d.year, d.month, d.date);}

  public int getYear() { return year;}
  public int getMonth() { return month;}
  public int getDate() { return date;}

  public void setYear(int year) {this.year = year;}
  public void setMonth(int month) {this.month = month;}
  public void setdate(int date) {this.date = date;}

  public void set(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

}
