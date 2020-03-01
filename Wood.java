//Created by: Adam Guettit
//Created on: Mar.1
// Unit 1-07
// Mr. O'hara (ICS4U)

// This program tells you the measurment of your missing side.

import java.util.Scanner;  // Import the Scanner class

class Wood {
  
  public static void main(String[] args) {

    // Variables
    double firstD;
    double secondD;
    double ans;

    // asks for which dimension
    Scanner Dim = new Scanner(System.in); 
    System.out.println("Enter the dimension you are looking for (height - lenght - width)");

    String dimension = Dim.nextLine();
    
    // asks for the first measurment
    Scanner first = new Scanner(System.in);
    System.out.println("Enter the first dimension of your object");
    firstD = first.nextDouble();

    // asks for the first measurment
    Scanner second = new Scanner(System.in);
    System.out.println("Enter the second dimension of your object");
    secondD = second.nextDouble();

    ans = 144 / ( firstD * secondD );

   System.out.println("The dimension of : " + dimension + " is " + ans);  // Output user input
  }
}