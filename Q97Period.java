class Main {
  public static void main(String[] args) {
    Perid taejo = new Period(new Day(1392,8,5), new Day(1398,10,14));
    Perid jeongjong = new Period(new Day(1398,10,14), new Day(1400,11,28));
    Perid taejong = new Period(new Day(1400,11,28), new Day(1418,09,09));

    System.out.println(taejo);
    System.out.println(jeongjong);
    System.out.println(taejong);
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
