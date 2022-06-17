public class InvoiceTest {
  public static void main(String[] args) {
    Invoice invoice1 = new Invoice("123", "Laptops", 3, 5000.00);
    Invoice invoice2 = new Invoice("124", "Monitors", 6, 1300.00);

    System.out.printf("Invoice number: %s %n", invoice1.getNumber());
    System.out.printf("Purchase of %s %n", invoice1.getDescription());
    System.out.printf("Quantity: %d - ", invoice1.getQuantity());
    System.out.printf("Price  $%.2f %n", invoice1.getPrice());
    System.out.printf("Total Invoice Amount: $%.2f %n", invoice1.getInvoiceAmount());
    System.out.println("--------------------------------------------");

    System.out.printf("Invoice number: %s %n", invoice2.getNumber());
    System.out.printf("Purchase of %s %n", invoice2.getDescription());
    System.out.printf("Quantity: %d - ", invoice2.getQuantity());
    System.out.printf("Price  $%.2f %n", invoice2.getPrice());
    System.out.printf("Total Invoice Amount: $%.2f %n", invoice2.getInvoiceAmount());

  }
}
