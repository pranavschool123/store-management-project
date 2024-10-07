import java.util.Scanner;


/**
 * The Phone class is used to extend the Device superclass. The Phone class also represents the Phone
 * option when running the program, providing details for the phone device.
  */
public class Phone extends Device {
  private String operatingSystem;


  /**
   * Sets the operatingSystem to Unknown.
    */
  public Phone() {
    super();
    this.operatingSystem = "Unknown";
  }


  /**
   * Sets the name to the specified name, the price to the specified price, the brand to
   * the specified brand, and the operatingSystem to the specified operated system.
    */
  public Phone(String name, double price, String brand, String operatingSystem) {
    super(name, price, brand);
    this.operatingSystem = operatingSystem;
  }


  /**
   * Returns the operating system when getOperatingSystem is used.
    */
  public String getOperatingSystem() {
    return operatingSystem;
  }


  /**
   * Sets the operatingSystem to the specific operating system.
    */
  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  /**
   * Returns the name of the operating system.
    */
  public String toString() {
    return super.toString() + ", Operating System: " + operatingSystem;
  }


  /**
   * Gives the code when inputPhoneDetails is used. This prints out 'Enter phone name', 'Enter phone price',
   * 'enter phone brand', and 'enter phone operating system'.
    */
  public void inputPhoneDetails() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter phone name: ");
    setName(scanner.nextLine());
    System.out.print("Enter phone price: ");
    setPrice(scanner.nextDouble());
    scanner.nextLine();
    System.out.print("Enter phone brand: ");
    setBrand(scanner.nextLine());
    System.out.print("Enter phone operating system: ");
    setOperatingSystem(scanner.nextLine());
  }



  
}