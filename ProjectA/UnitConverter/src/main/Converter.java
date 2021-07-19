package main;
import java.util.Scanner;

public class Converter {

	   
	   private static double collectQuantity(String unit1, String unit2, Scanner in) {
	      
	       double amount;
	       System.out.print("Enter the amount " + unit1 + " you would like to convert to " + unit2);
	       amount = in.nextDouble();
	      
	       return amount;
	   }
	  
	 
	   private static double convertCupsToTeaspoons(double cups) {
	      
	       return (cups * 48);
	   }
	  
	  
	   private static double convertMilesToKilometers(double miles) {
	   
	       return(miles * 1.60934);
	   }
	  
	   
	   private static double convertUSGallonsToImperialGallons(double gallons) {
	   
	       return(gallons * 0.832674);
	   }
	  
	   public static void main(String[] args) {
	      
	       int menuSelection = -1;
	       double amountA, amountB;
	       Scanner in = new Scanner(System.in);
	      
	       while(menuSelection != 4) {
	       
	           
	           System.out.println("Please select an option:");
	           
	           System.out.println("1. Cups to Teaspoons");
	           
	           System.out.println("2. Miles to Kilometers");
	           
	           System.out.println("3. US Gallons to Imperial Gallons");
	           
	           System.out.println("4. Quit");

	           
	          
	           menuSelection = in.nextInt();
	          
	           
	           switch(menuSelection) {
	           
	           case 1:
	               amountA = collectQuantity("cups","teaspoons", in);
	               amountB = convertCupsToTeaspoons(amountA);
	               System.out.println(amountA+" cups = "+amountB+" teaspoons.");
	               break;
	           case 2:
	               amountA = collectQuantity("miles","kilometers", in);
	               amountB = convertMilesToKilometers(amountA);
	               System.out.println(amountA+" miles = "+amountB+" kilometers.");
	               break;
	           case 3:
	               amountA = collectQuantity("U.S gallons","Imperial gallons", in);
	               amountB = convertUSGallonsToImperialGallons(amountA);
	               System.out.println(amountA+" US gallons = "+amountB+" Imperial gallons.");
	               break;
	           case 4:
	               System.out.println("SEE YA!");
	               break;
	           default:
	               System.out.println("THAT WASNT AN OPTION");
	           }
	          
	       }
	      

	   }

	}
