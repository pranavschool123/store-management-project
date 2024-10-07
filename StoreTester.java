import java.util.Scanner;


/**
 * The StoreTester class is run to create a program where users can
 * input information regarding the device that they want to buy.
  */
public class StoreTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Best Buy!");


    /**
     * This is used to print out the initial question, asking users whether they
     * want to purchase and input information for a phone or tablet.
      */
    System.out.print("Would you like to purchase a Phone or Tablet? (Enter 'P' for Phone and 'T' for Tablet): ");
    char choice = scanner.next().charAt(0);


    /**
     * This is to input/output the rest of the information. It first makes sure that the users can either capitalize or not capitalize and get the same result.
     * It then asks inputs the details for either the phone or tablet depending on the user input. It then outputs the final answers.
      */
    if (choice == 'P' || choice == 'p') {
      Phone phone = new Phone();
      phone.inputPhoneDetails();
      System.out.println("\nHere is your new Device!:");
      System.out.println(phone);
    } else if (choice == 'T' || choice == 't') {
      Tablet tablet = new Tablet();
      tablet.inputTabletDetails();
      System.out.println("\nHere is your new Device!:");
      System.out.println(tablet);
    } else {
      System.out.println("Invalid input. Please run the program again.");
    }
  }




}