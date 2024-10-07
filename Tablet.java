import java.util.Scanner;


/**
 * The Tablet class is used to extend the Device superclass. The Tablet class also represents the Tablet
 * option when running the program, providing details for the tablet device.
  */
public class Tablet extends Device {
  private double screenSize;


  /**
   * Sets the screenSize to 0.0.
    */
  public Tablet() {
    super();
    this.screenSize = 0.0;
  }


  /**
   * Sets the name to the specified name, the price to the specified price, the brand to
   * the specified brand, and the screenSize to the specified screen size.
    */
  public Tablet(String name, double price, String brand, double screenSize) {
    super(name, price, brand);
    this.screenSize = screenSize;
  }


  /**
   * Returns the screen size when getScreenSize is used.
    */
  public double getScreenSize() {
    return screenSize;
  }


  /**
   * Sets the screenSize to the specified screen size.
    */
  public void setScreenSize(double screenSize) {
    this.screenSize = screenSize;
  }


  /**
   * Returns the number of inches of the screenSize.
    */
  public String toString() {
    return super.toString() + ", Screen Size: " + screenSize + " inches";
  }


  /**
   * Gives the code when inputTabletDetails is used. This prints out 'Enter tablet name', 'Enter tablet price',
   * 'enter tablet brand', and 'enter tablet screen size'.
    */
  public void inputTabletDetails() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter tablet name: ");
    setName(scanner.nextLine());
    System.out.print("Enter tablet price: ");
    setPrice(scanner.nextDouble());
    scanner.nextLine();
    System.out.print("Enter tablet brand: ");
    setBrand(scanner.nextLine());
    System.out.print("Enter tablet screen size: ");
    setScreenSize(scanner.nextDouble());
  }


 
}