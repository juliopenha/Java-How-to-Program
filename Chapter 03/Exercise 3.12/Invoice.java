public class Invoice {
  private String number;
  private String description;
  private int quantity;
  private double price;

  public Invoice(String number, String description, int quantity, double price) {
    this.number = number;
    this.description = description;
    if (quantity > 0) {
      this.quantity = quantity;
    } else {
      this.quantity = 0;
    }
    if (price > 0.0) {
      this.price = price;
    } else {
      this.price = 0.0;
    }
  }

  public double getInvoiceAmount() {
    return price * quantity;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNumber() {
    return this.number;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public void setQuantity(int quantity) {
    if (quantity > 0) {
      this.quantity = quantity;
    } else {
      this.quantity = 0;
    }
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setPrice(double price) {
    if (price > 0.0) {
      this.price = price;
    } else {
      this.price = 0.0;
    }
  }

  public double getPrice() {
    return this.price;
  }
}
