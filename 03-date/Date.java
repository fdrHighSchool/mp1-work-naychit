
/**
 * Write a description of class Userinput here.
 *
 * @Naychi
 * @09/28/2022
 */

import java.util.Scanner;
public class Date
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String date= s.nextLine();

        
        System.out.print("Enter the month:");
        String month = s.nextLine(); 
        
        System.out.print("Enter the year:");
        String year = s.nextLine();
        
        System.out.print("Enter the number of the day: ");
        String day = s.nextLine(); 
        
        System.out.println("American Format: "+date+", "+month+" "+day+", "+year);
        System.out.println("European Format: "+date+", "+month+" "+day+", "+year);
        
    } //end of main method 
    
} // end of class
