import java.util.Scanner;


/**
 * The Device class is the superclass that provides
 * support to the Phone and Tablet subclasses.
  */
public class Device {
  private String name;
  private double price;
  private String brand;


  /**
   * Sets name to Unknown, price to 0, and brand to Unknown.
    */
  public Device() {
    this.name = "Unknown";
    this.price = 0.0;
    this.brand = "Unknown";
  }


  /**
   * Sets name to name, price to price, and brand to brand.
    */
  public Device(String name, double price, String brand) {
    this.name = name;
    this.price = price;
    this.brand = brand;
  }


  /**
   * Returns name when getName is used.
    */
  public String getName() {
    return name;
  }


  /**
   * Returns price when getPrice is used.
    */
  public double getPrice() {
    return price;
  }


  /**
   * Returns brand when getBrand is used.
    */
  public String getBrand() {
    return brand;
  }


  /**
   * Sets the name to what is given.
    */
  public void setName(String name) {
    this.name = name;
  }
  

  /**
   * Sets the price to what is given.
    */
  public void setPrice(double price) {
    this.price = price;
  }


  /**
   * Sets the brand to what is given.
    */
  public void setBrand(String brand) {
    this.brand = brand;
  }
  

  /**
   * Returns the entire final product except for the Operating system. This method consists of the name of the device,
   * the price of the device, and the brand of the final product.
    */
  public String toString() {
    return "Device Name: " + name + ", Price: $" + price + ", Brand: " + brand;
  }


  
}