public class DateTest {
  public static void main(String[] args) {
    Date data1 = new Date(9, 1, 2012);
    Date data2 = new Date(07, 02, 1994);
    Date data3 = new Date(12, 31, 2022);

    System.out.printf("Data 1: %s%n", data1.displayDate());
    System.out.printf("Data 2: %s%n", data2.displayDate());
    System.out.printf("Data 3: %s%n", data3.displayDate());
  }
}
